public class MaxSumSubArrayOfSizeK {
  public int findMaxSumSubArray(int k, int[] arr) {

    int windowSum = 0;
    int windowStart = 0;
    int windowEnd = 0;
    int max = 0;

    for (windowEnd = 0; windowEnd < arr.length; windowEnd++) {
      windowSum = windowSum + arr[windowEnd];
      if (windowEnd >= k - 1) {
        if (windowSum > max) {
          max = windowSum;

        }
        windowSum = windowSum - arr[windowStart];
        windowStart++;

      }
    }
    return max;
  }

}