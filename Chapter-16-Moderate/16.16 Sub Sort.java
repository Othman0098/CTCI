/**
 * Solution 1:
 * 
 * Sort then Compare;
 * 
 */
 
void subSort(int[] nums) {
    int[] sorted = new int[nums.length];
    System.arraycopy(nums, 0, sorted, 0, nums.length); 
    Arrays.sort(sorted);
    
    int n, m;
    for (m = 0; m < nums.length; m++)
        if (sorted[m] != nums[m])
            break;
    for (n = nums.length - 1; n >= 0; n--)
        if (sorted[n] != nums[n])
            break;
    
    System.out.println("m: " + m);
    System.out.println("n: " + n);
}

/**
 * Solution 2:
 * 
 * Divide the array into three parts: LEFT, MIDDLE, RIGHT;
 * The condition that being able to sort MIDDLE and have the whole array becomes sorted, you need:
 *      MAX(LEFT) <= MIN(MIDDLE and RIGHT)      and      MAX(LEFT and MIDDLE) <= MIN(RIGHT);
 * 
 * Need two shrink: shrink_left and shrink_right;
 * 
 */
