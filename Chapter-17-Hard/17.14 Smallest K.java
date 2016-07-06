/**
 * Modified Binary Search;
 * 
 */
 
/* Pseudo-code. */
int returnSmallestK(List<> nums, int k) {
    int pivot = nums.get(0);
    for rest elment i of nums,
        if (i < pivot)
            put i in leftList;
        else
            put i in rightList;
            
    if (leftList<>.size == k - 1)
        return pivot;
    else if (leftList<>.size < k - 1)
        return returnSmallestK(rightList, k - leftList<>.size - 1);
    else
        return returnSmallestK(leftList, k); 
}

/**
 * Other solution #1:
 * 
 * Sorting;
 * 
 */
 
/**
 * Other solution #2:
 * 
 * Max Heap;
 * 
 */
