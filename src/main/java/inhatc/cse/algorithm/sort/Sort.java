package inhatc.cse.algorithm.sort;

public class Sort {
    public static int[] selectionSort(int[] arr) {
        int min, insertElement;
        for (int i = 0; i < arr.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            insertElement = arr[min];
            arr[min] = arr[i];
            arr[i] = insertElement;

        }
        return arr;
    }

    public static int[] insertionSort(int[] A) {
        for (int i = 1; i < A.length; i++) {
            int insertElement = A[i];
            int j = i - 1;
            while (j >= 0 && A[j] > insertElement) {
                A[j + 1] = A[j];
                j=j-1;
            }
            A[j+1] = insertElement;
        }
        return A;
    }


    public static int[] heapSort(int[] arr) {

        int eh = arr.length-1;

        buildHeap(arr,eh);

        while (eh > 1) {
            int temp = arr[1];
            arr[1] = arr[eh];
            arr[eh] = temp;
        }

        eh--;
        pushDown(arr,1,eh/2,eh);

        return arr;
    }

    private static void pushDown(int[] arr, int x, int bh, int eh) {

    }


    private static void buildHeap(int[] arr, int eh) {


    }
}
