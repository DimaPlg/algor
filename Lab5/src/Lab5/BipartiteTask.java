package Lab5;

public class BipartiteTask {
    private int[] colours;
    private int[][] matrix;

    public BipartiteTask(int[][] matrix) {
        this.matrix = matrix;
        this.colours = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            this.colours[i] = 0;
        }
    }

    public void DfsMethod(int v, int counter) {
        this.colours[v] = counter;
        for (int i = 0; i < this.matrix.length; i++) {
            if (this.matrix[v][i] == 1 && this.colours[i] == 0) {
                counter++;
                DfsMethod(i, counter);
            }
            else if (this.matrix[v][i] == 1 && this.colours[i] % 2 == counter % 2 && v != i){
                break;
            }
        }
    }

    public String IsBilobed(int v){
        DfsMethod(v, 1);
        for (int i = 0; i < this.matrix.length; i++) {
            if (this.colours[i] == 0) {
                DfsMethod(i, 1);
            }
        }
        for(int i = 0; i < this.matrix.length - 1; i++){
            if(this.colours[i] % 2 == this.colours[i + 1] % 2){
                return "Graph isn't bilobed.";
            }
        }
        return "Graph is bilobed.";
    }
}
