package inhatc.cse.algorithm.dynamic;

import java.util.Arrays;

public class RodCutting {

    private int cutRod_DP(int[] priceArray, int n) {
        int[] maxSell = new int[n + 1];
        maxSell[0] = 0;

        for (int j = 1; j <= n; j++) {
            int maxVal = 0;

            for (int k = 1; k <= j; k++) {
                maxVal = Math.max(maxVal, priceArray[k - 1] + maxSell[j - k]);
            }
            maxSell[j] = maxVal;
            Arrays.stream(maxSell).forEach(i -> System.out.print(i + " "));
            System.out.println();
        }

        return maxSell[n];
    }

    public static void main(String[] args) {
        RodCutting rodCutting = new RodCutting();
        int[] priceArray = {2, 5, 9, 10}; // 각 길이에 대한 가격
        int n = 4; // 막대의 전체 길이

        int maxProfit = rodCutting.cutRod_DP(priceArray, n);
        System.out.println("최대 수익: " + maxProfit);
    }
}
