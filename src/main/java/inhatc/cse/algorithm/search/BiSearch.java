package inhatc.cse.algorithm.search;

public class BiSearch {

    public static void main(String[] args) {

        int[] arr = {28, 40, 56, 63, 74, 87, 95};

        // binarySearch(배열, 시작 인덱스, 끝 인덱스, 찾을 값)
        int position = binarySearch(arr, 0, arr.length-1, 87);

        // 결과 출력
        System.out.println("검색 결과 위치는: " + position);
    }

    //x값을 찾이위한 BinarySearch 함수
    public static int binarySearch(int[] arr, int first, int last, int x) {

        if(first > last){
            return -1;
        }

        int mid = (first + last) / 2;

        if (arr[mid] == x) {
            return mid;
        }
        else if (arr[mid] < x) {
            return binarySearch(arr, mid + 1, last, x);
        }
        else {
            return binarySearch(arr, first, mid - 1, x);
        }
    }
}
