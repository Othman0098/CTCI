/**
 * Leetcode;
 * 
 * Major Element I II;
 * 
 * 相同的元素，计数++;
 * 不同的相消，计数--;
 * 
 */

int majorityElement(int[] nums) {
    
    int len = nums.length;
  
    int candi = 0;
    int times = 0;
    
    for (int i = 0; i < len; i++) {
        if (times == 0) {
            candi = nums[i];
            times++;
        } else if (candi == nums[i])
            times++;
        else
            times--;
    }
    
    int count = 0;
    for (int i = 0; i < len; i++)
        if (nums[i] == candi)
            count++;
    
    return (count > (len / 2)) ? count : -1;
}
