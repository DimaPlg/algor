//Плешко Д.М. 2 гр
//лаб.1


package by.algorithms.main;
import by.algorithms.sortings.Sortings;

public class MainClass {
    public static void main(String[] args) {
        //массив чисел 2^8
        int mass_256[] = new int[256];
        for(int i = 0; i < 256; i++){
            mass_256[i] = (int)(Math.random()*256);
        }
        //массив чисел 2^17
        int mass_131072[] = new int[131072];
        for(int i = 0; i < 131072; i++){
            mass_131072[i] = (int)(Math.random()*131072);
        }
        //почти упорядоченный массив 2^17
        int almostSortedMass_131072[] = new int[131072];
        for (int i = 0; i < 1000; i++){
            almostSortedMass_131072[i] = i;
        }
        for(int i = 1000; i < 131072; i++){
            almostSortedMass_131072[i] = (int)(Math.random()*131072);
        }
        //массив с малым размахом выборки(от 0 до 100)
        int smallScopedMass_256[] = new int[256];
        for(int i = 0; i < 256; i++){
            smallScopedMass_256[i] = (int)(Math.random()*101);
        }
        int sortedMass_256[];
        int sortedMass_131072[];

        //сортировка и вычисление времени сортировки массива 2^8
        double start = System.nanoTime();
        sortedMass_256 = Sortings.BubbleSorting(mass_256);
        double finish = System.nanoTime();
        double timeConsumedMillis = finish - start;
        System.out.println("Time of sorting massive of 256 elements using Bubble Sort: " + timeConsumedMillis/1000000 + " ms.");

        start = System.nanoTime();
        sortedMass_256 = Sortings.InsertSorting(mass_256);
        finish = System.nanoTime();
        timeConsumedMillis = finish - start;
        System.out.println("Time of sorting massive of 256 elements using Insertion Sort: " + timeConsumedMillis/1000000 + " ms.");

        start = System.nanoTime();
        sortedMass_256 = Sortings.MergeSort(mass_256, 0, mass_256.length - 1);
        finish = System.nanoTime();
        timeConsumedMillis = finish - start;
        System.out.println("Time of sorting massive of 256 elements using Merge Sort: " + timeConsumedMillis/1000000 + " ms.");

        start = System.nanoTime();
        sortedMass_256 = Sortings.HybridSort(mass_256, 0, mass_256.length - 1);
        finish = System.nanoTime();
        timeConsumedMillis = finish - start;
        System.out.println("Time of sorting massive of 256 elements using Hybrid Sort: " + timeConsumedMillis/1000000 + " ms.");

        start = System.nanoTime();
        sortedMass_256 = Sortings.CountSort(mass_256);
        finish = System.nanoTime();
        timeConsumedMillis = finish - start;
        System.out.println("Time of sorting massive of 256 elements using Count Sort: " + timeConsumedMillis/1000000 + " ms.");

        start = System.nanoTime();
        sortedMass_256 = Sortings.QuickSort(mass_256, 0, mass_256.length - 1);
        finish = System.nanoTime();
        timeConsumedMillis = finish - start;
        System.out.println("Time of sorting massive of 256 elements using Quick Sort: " + timeConsumedMillis/1000000 + " ms.");
        System.out.println();

        //Сортировка и вычисление времени сортировки массива 2^17 элементов
        start = System.nanoTime();
        sortedMass_131072 = Sortings.BubbleSorting(mass_131072);
        finish = System.nanoTime();
        timeConsumedMillis = finish - start;
        System.out.println("Time of sorting massive of 131072 elements using Bubble Sort: " + timeConsumedMillis/1000000 + " ms.");

        start = System.nanoTime();
        sortedMass_131072 = Sortings.InsertSorting(mass_131072);
        finish = System.nanoTime();
        timeConsumedMillis = finish - start;
        System.out.println("Time of sorting massive of 131072 elements using Insertion Sort: " + timeConsumedMillis/1000000 + " ms.");

        start = System.nanoTime();
        sortedMass_131072 = Sortings.MergeSort(mass_131072, 0, mass_131072.length - 1);
        finish = System.nanoTime();
        timeConsumedMillis = finish - start;
        System.out.println("Time of sorting massive of 131072 elements using Merge Sort: " + timeConsumedMillis/1000000 + " ms.");

        start = System.nanoTime();
        sortedMass_131072 = Sortings.HybridSort(mass_131072, 0, mass_131072.length - 1);
        finish = System.nanoTime();
        timeConsumedMillis = finish - start;
        System.out.println("Time of sorting massive of 131072 elements using Hybrid Sort: " + timeConsumedMillis/1000000 + " ms.");

        start = System.nanoTime();
        sortedMass_131072 = Sortings.CountSort(mass_131072);
        finish = System.nanoTime();
        timeConsumedMillis = finish - start;
        System.out.println("Time of sorting massive of 131072 elements using Count Sort: " + timeConsumedMillis/1000000 + " ms.");

        start = System.nanoTime();
        sortedMass_131072 = Sortings.QuickSort(mass_131072, 0, mass_131072.length - 1);
        finish = System.nanoTime();
        timeConsumedMillis = finish - start;
        System.out.println("Time of sorting massive of 131072 elements using Quick Sort: " + timeConsumedMillis/1000000 + " ms.");
        System.out.println();

        //Сортировка и вычисление времени сортировки массива почти упорядоченных 2^17 элементов
        start = System.nanoTime();
        sortedMass_131072 = Sortings.BubbleSorting(almostSortedMass_131072);
        finish = System.nanoTime();
        timeConsumedMillis = finish - start;
        System.out.println("Time of sorting almost sorted massive of 131072 elements using Bubble Sort: " + timeConsumedMillis/1000000 + " ms.");

        start = System.nanoTime();
        sortedMass_131072 = Sortings.InsertSorting(almostSortedMass_131072);
        finish = System.nanoTime();
        timeConsumedMillis = finish - start;
        System.out.println("Time of sorting almost sorted massive of 131072 elements using Insertion Sort: " + timeConsumedMillis/1000000 + " ms.");

        start = System.nanoTime();
        sortedMass_131072 = Sortings.MergeSort(almostSortedMass_131072, 0, almostSortedMass_131072.length - 1);
        finish = System.nanoTime();
        timeConsumedMillis = finish - start;
        System.out.println("Time of sorting almost sorted massive of 131072 elements using Merge Sort: " + timeConsumedMillis/1000000 + " ms.");

        start = System.nanoTime();
        sortedMass_131072 = Sortings.HybridSort(almostSortedMass_131072, 0, almostSortedMass_131072.length - 1);
        finish = System.nanoTime();
        timeConsumedMillis = finish - start;
        System.out.println("Time of sorting almost sorted massive of 131072 elements using Hybrid Sort: " + timeConsumedMillis/1000000 + " ms.");

        start = System.nanoTime();
        sortedMass_131072 = Sortings.CountSort(almostSortedMass_131072);
        finish = System.nanoTime();
        timeConsumedMillis = finish - start;
        System.out.println("Time of sorting almost sorted massive of 131072 elements using Count Sort: " + timeConsumedMillis/1000000 + " ms.");

        start = System.nanoTime();
        sortedMass_131072 = Sortings.QuickSort(almostSortedMass_131072, 0, almostSortedMass_131072.length - 1);
        finish = System.nanoTime();
        timeConsumedMillis = finish - start;
        System.out.println("Time of sorting almost sorted massive of 131072 elements using Quick Sort: " + timeConsumedMillis/1000000 + " ms.");
        System.out.println();

        //Сортировка и вычисление времени сортировки массива с малым размахом выборки 256 элеметов
        start = System.nanoTime();
        sortedMass_256 = Sortings.BubbleSorting(smallScopedMass_256);
        finish = System.nanoTime();
        timeConsumedMillis = finish - start;
        System.out.println("Time of sorting small scoped massive of 256 elements using Bubble Sort: " + timeConsumedMillis/1000000 + " ms.");

        start = System.nanoTime();
        sortedMass_256 = Sortings.InsertSorting(smallScopedMass_256);
        finish = System.nanoTime();
        timeConsumedMillis = finish - start;
        System.out.println("Time of sorting small scoped massive of 256 elements using Insertion Sort: " + timeConsumedMillis/1000000 + " ms.");

        start = System.nanoTime();
        sortedMass_256 = Sortings.MergeSort(smallScopedMass_256, 0, smallScopedMass_256.length - 1);
        finish = System.nanoTime();
        timeConsumedMillis = finish - start;
        System.out.println("Time of sorting small scoped massive of 256 elements using Merge Sort: " + timeConsumedMillis/1000000 + " ms.");

        start = System.nanoTime();
        sortedMass_256 = Sortings.HybridSort(smallScopedMass_256, 0, smallScopedMass_256.length - 1);
        finish = System.nanoTime();
        timeConsumedMillis = finish - start;
        System.out.println("Time of sorting small scoped massive of 256 elements using Hybrid Sort: " + timeConsumedMillis/1000000 + " ms.");

        start = System.nanoTime();
        sortedMass_256 = Sortings.CountSort(smallScopedMass_256);
        finish = System.nanoTime();
        timeConsumedMillis = finish - start;
        System.out.println("Time of sorting small scoped massive of 256 elements using Count Sort: " + timeConsumedMillis/1000000 + " ms.");

        start = System.nanoTime();
        sortedMass_256 = Sortings.QuickSort(smallScopedMass_256, 0, smallScopedMass_256.length - 1);
        finish = System.nanoTime();
        timeConsumedMillis = finish - start;
        System.out.println("Time of sorting small scoped massive of 256 elements using Quick Sort: " + timeConsumedMillis/1000000 + " ms.");
    }
}
