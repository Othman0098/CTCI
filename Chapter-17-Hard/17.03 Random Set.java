/**
 *  Same as 17.02;
 *  Swap-Method to generate random set;
 *
 */

int[] pickMRecursively(int[] original, int m, int i) {
    if (i + 1 == m) {
        // Base case
        /* return first m elements of original */
    } else if (i + 1 > m) {
        int[] subset = pickMRecursively(original, m, i - 1);
        int k = random value between 0 and i, inclusive
        if (k < m) {
            subset[k] = original[i];
        }
        return subset;
    }
    return null;
}
