//  Assume at most one magic index;

/**
 *  Brute Force
 */

int findMagic(int[] nums) {
    for(int i = 0; i < nums.length; i++)
        if(nums[i] == i)
            return i;
    return -1;
}

/**
 *  Binary Search
 */
 
 List<Integer> findMagic(int[] nums) {
    int left = 0, right = nums.length - 1;
    while(left <= right) {
        int mid = (left + right) / 2;
        if (nums[mid] == mid)
            return mid;
        else if (nums[mid] > mid)
            right = mid - 1;
        else
            left = left + 1;
    }
    return -1;
}


 
