/**
 * Brute Force;
 * 
 */

int longestLNsub(char[] array) {
    
    int[] numbers = new int[array.length];
    int[] letters = new int[array.length];
    
    if (char[0].isNumber()) {
        numbers[0] = 1;
    } else 
        letters[0] = 1;
    
    for (int i = 1; i < array.length; i++) {
        if (char[i].isNumber()) {
            numbers[i] = numbers[i - 1] + 1;
            letters[i] = letters[i - 1];
        } else {
            numbers[i] = numbers[i - 1];
            letters[i] = letters[i - 1] + 1;
        }
    }
    
    int res = 0;
    
    for (int i = 0; i < array.length; i++)
        if (numbers[i] == letters[i])
            res = Math.max(res, numbers[i]);
    
    for (int i = 0; i < array.length; i++)
        for (int j = i + 1; j < array.length; j++)
            if (numbers[j] - numbers[i] == letters[j] - letters[i])
                res = Math.max(res, numbers[j] - numbers[i])s;
    
    return res;
}


/**
 * Optimal:
 * 
 * Using a HashTable to store the first time we see a particular difference.
 * Then, each time we see the same difference, we see if this subarray (from first occurrence of this index to current index) is 
 * bigger than the current max. If so, we update the max.
 * 
 * This will lead to a O(N) solution;
 * 
 */
