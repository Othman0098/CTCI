/* Modification of Merge Sort */

int smallestDiff(int[] array1, int[] array2) {
    int diff = Integer.MAX_VALUE;
    
    Arrays.sort(array1);
    Arrays.sort(array2);
    
    int pointer1 = 0, pointer2 = 0;
    
    while (pointer1 < array1.length && pointer2 < array2.length) {
        diff = Math.min(diff, Math.abs(array1[pointer1] - array2[pointer2]));
        if (array1[pointer1] > array2[pointer2])
            pointer2++;
        else
            pointer1++;
    }
    
    return diff;
}
