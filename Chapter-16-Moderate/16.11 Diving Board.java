/**
 * Recursive Solution:
 * 
 * Takes O(2^k) time, since there are two choices at each recursive call and we recurse to a depth of k;
 * 
 */


/**
 * Memoization Solution:
 * If seen (total, plank count) pair before then stop this recursive path.
 * Using a HashSet with a key of (total, plank count);
 * 
 */
 

/**
 * Optimal Solution:
 * 
 * Just go through all unique sets of K planks(sets, not orders);
 * 
 */
 
HashSet<Integer> allLengths(int k, int shorter, int longer) {
    HashSet<Integer> lengths = new HashSet<Integer>();
    for (int nShorter = 0; nShorter <= k; nShorter++) {
        int nLonger = k - nShorter;
        int length = nShorter * shorter + nLonger * longer;
        lengths.add(length);
    }
    return lengths;
}
