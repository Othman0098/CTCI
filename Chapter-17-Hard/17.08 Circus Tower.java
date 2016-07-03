/**
 * Dynamic Programming;
 * 
 * 导弹打飞机;
 * Longest Increasing Sequence;
 * ...
 * 
 * 
 * Solution:
 * 
 * Sorting based on Height;
 * Then iterate through all person from shortest to tallest;
 * Decide if one can stand on another depends on theirs weights;
 * 
 */

 
/* Standard Solution. */
ArrayList<HtWt> longestIncreasingSeq(ArrayList<HtWt> array) {
    Collections.sort(array);
    
    ArrayList<ArrayList<HtWt>> solutions = new ArrayList<ArrayList<HtWt>>();
    ArrayList<HtWt> bestSequence = null;
    
    /* Find the longest subsequene that terminates with each element. Track the longest overall subsequence as we go. */
    for (int i = 0; i < array.size(); i++) {
        ArrayList<HtWt> longestAtIndex = bestSeqAtIndex(array, solutions, i);
        solutions.add(i, longestAtIndex);
        bestSequence = max(bestSequence, longestAtIndex);
    } 
    
    return bestSequence;
}

/* Find the longest subsequnce which terminates with this element. */
ArrayList<HtWt> bestSeqAtIndex(ArrayList<HtWt> array, ArrayList<ArrayList<HtWt>> solutions, int index) {
    HtWt value = array.get(index);
    
    ArrayList<HtWt> bestSequence = new ArrayList<HtWt>();
    
    /* Find the longest subsequence that we can append this element to. */
    for (int i = 0; i < index; i++) {
        ArrayList<HtWt> solution = solutions.get(i);
        if (canAppend(solution, value)) {
            bestSequence = max(solution, bestSequence);
        }
    }
    
    /* Append element. */
    ArrayList<HtWt> best = (ArrayList<HtWt>) bestSequence.clone();
    best.add(value);
    
    return best;
}
