package inhatc.cse.algorithm.sort;

import java.util.Arrays;

public class SortMain {
    public static void main(String[] args) {
        Sort sort = new Sort();
        int[]arr={72,60,83,47,89,95};

//        int[]sortedArr=Sort.selectionSort(arr);
//        Arrays.stream(sortedArr).forEach(i->System.out.print(i+" "));
//        System.out.println();


        int[]insertionSortedArr=Sort.heapSort(arr);
        Arrays.stream(insertionSortedArr).forEach(i->System.out.print(i+" "));
        System.out.println();

    }

}
