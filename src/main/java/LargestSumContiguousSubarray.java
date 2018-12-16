
/**
 * Retrieves max sum ofsub-array from an array
 *
 * @author praveenkamath
 **/
public class LargestSumContiguousSubarray {

    /**
     * Uses Kadane's algorithm to retrieve max sum of sub-array from an array
     *
     * @param arr given array
     * @return max value
     */
    public static int getMaxSum(int[] arr) {
        int currentMax    =   arr[0];
        int currentSumMax =   0;
        int overallSumMax =   0;
        for(int num: arr) {
            currentMax = Math.max(num, currentMax);
            currentSumMax = currentSumMax + num;
            if(currentSumMax < 0) {
                currentSumMax = 0;
            }
            if(overallSumMax < currentSumMax) {
                overallSumMax = currentSumMax;
            }
        } return overallSumMax == 0 ? currentMax : overallSumMax;
    }
}
