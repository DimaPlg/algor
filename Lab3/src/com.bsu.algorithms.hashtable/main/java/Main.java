public class Main {
    public static void main(String[] args) {
        ProbingHashT<Integer, Integer> table2 = new ProbingHashT<>(11);

        for(int i = 0; i < 16; i++){
            table2.Insert(i, i*100);
        }

        for(int i = 0; i < 16; i++){
            System.out.println(table2.Search(i).getValue());
        }
    }
}
