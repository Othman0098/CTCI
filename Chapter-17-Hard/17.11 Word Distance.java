/**
 * Naive Thought;
 * 
 * Using merge sort;
 * 
 */
 
Hashtable<String, LinkedList<Integer>> dict;

void preDict(String[] text) {
    
    dict = new Hashtable<>();

    for (int i = 0; i < text.length; i++) {
        if (dict.containsKey(text[i])) {
            LinkedList<Integer> tmp = dict.get(text[i]);
            tmp.add(i);
        } else {
            LinkedList<Integer> tmp = new LinkedList<>();
            tmp.add(i);
            dict.put(text[i], tmp);
        }
    }
}

int wordDistance(String word1, String word2) {
    
    LinkedList<Integer> list1 = dict.get(word1);
    LinkedList<Integer> list2 = dict.get(word2);
    
    int res = Integer.MAX_VALUE;
    int idx1 = 0, idx2 = 0;
    
    while(idx1 < list1.size() && idx2 < list2.size()) {
        res = Math.min(Math.abs(list1.get(idx1) - list2.get(idx2)), res);
        if (list1.get(idx1) > list2.get(idx2))
            idx2++;
        else
            idx1++;
    }
    
    return res;
}
