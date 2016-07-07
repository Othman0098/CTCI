/**
 * Dynamic Programming;
 * 
 */

int contSeqLargestSum(int[] nums) {
   int max = 0;
   int tmp = 0;
   
   for (int i = 0; i < nums.length; i++) {
        tmp += nums[i];
        max = Math.max(max, tmp);
        if (tmp < 0)
            tmp = 0;
   }
   
   return max;
}
