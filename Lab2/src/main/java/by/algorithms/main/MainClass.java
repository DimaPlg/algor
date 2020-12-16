//Pleshko D.M. 2 гр
//lab.2



package by.algorithms.main;
import by.algorithms.sortings.Searches;

public class MainClass {
    public static void main(String[] args) {

        //Массив 2^20
        int mass_1048576[] = new int[1048576];
        for(int i = 0; i < 256; i++){
            mass_1048576[i] = (int)(Math.random()*1048575);
        }

        int numToFind = (int)(Math.random()*1048575);

        System.out.println("Number we need to find:" + numToFind);

        //Расчет времени поиска в массиве 2^20 эл. с помощью Линейного поиска :
        double start = System.nanoTime();
        int ind = Searches.LinSearch(mass_1048576, numToFind);
        double finish = System.nanoTime();
        double timeConsumedMillis = finish - start;
        System.out.println("Time of search using Linear Search: " + timeConsumedMillis/1000000 + " ms.");

        //Расчет времени поиска в массиве 2^20 эл. с помощью Бинарного Поиска:
        start = System.nanoTime();
        ind = Searches.BinSearch(mass_1048576, numToFind);
        finish = System.nanoTime();
        timeConsumedMillis = finish - start;
        System.out.println("Time of search using Binary Search: " + timeConsumedMillis/1000000 + " ms.");

        //Расчет времени поиска в массиве 2^20 эл. с помощью Интерполяционного Поиска:
        start = System.nanoTime();
        ind = Searches.InterSearch(mass_1048576, numToFind);
        finish = System.nanoTime();
        timeConsumedMillis = finish - start;
        System.out.println("Time of search using Interpolation Search: " + timeConsumedMillis/1000000 + " ms.");

    }
}
