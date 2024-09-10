package inhatc.cse.algorithm.search;

public class FREQCUME {
    public static int[] findCume(int[] FREQ, int[] CUME) {
        if (FREQ.length == 0) return CUME;

        CUME[0] = FREQ[0];
        for (int i = 1; i < FREQ.length; i++) {
            CUME[i] = CUME[i - 1] + FREQ[i];
        }
        return CUME;
    }



}
