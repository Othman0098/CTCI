/**
 *
 */

List<String> groupAnagrams(String[] src) {
    
    List<String> res = new LinkedList<>();
    
    boolean[] checked = new boolean[src.length];
    
    for (int i = 0; i < src.length; i++)
        if (!checked[i]) {
            String curr = src[i];
            checked[i] = true;
            res.add(curr);
            
            for (int j = i + 1; j < src.length; j++)
                if (!checked[j] && isAnagrams(curr, src[j])) {
                    checked[j] = true;
                    res.add(src[j]);
                }
        }
    
    return res;
}
