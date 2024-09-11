package inhatc.cse.algorithm.sort;

public class Sort {
    public static int[] selectionSort(int[] arr) {
        int min, temp;
        for (int i = 0; i < arr.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;

        }
        return arr;
    }}
