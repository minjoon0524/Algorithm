package inhatc.cse.algorithm.search;

public class Main {
    public static void main(String[] args) {
        int[]arr={72,60,83,47,89,95};

        int result = FindMax.FindMaximum(arr);

        System.out.println("최대값은 : "+ result);

        int[] FREQ={1,0,7,5,4,3};
        int[] CUME={0,0,0,0,0,0};
        int[] result2=FREQCUME.findCume(FREQ,CUME);
        System.out.println(result2);
    }
}
