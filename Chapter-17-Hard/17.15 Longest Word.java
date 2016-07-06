/**
 * Iterate through the list, from the longest word to the shortest word;
 * 
 * For each word, spilt in any position, see if left side is in the array and right side can be built from other elements in the list;
 * 
 * Using memoization to optimize;
 * 
 */
 
 String printLongestWord(String arr[]) {
    HashMap<String, Boolean> map = new HashMap<String, Boolean>();
    for (String str : arr) {
        map.put(str, true);
    }
    Arrays.sort(arr, new LengthComparator());
    for (String s : arr) {
        if (canBuildWord(s, true, map)) {
            System.out.println(s);
            return s;
        }
    }
    return "";
 }
 
 boolean canBuildWord(String str, boolean isOriginalWord, HashMap<String, Boolean> map) {
     if (map.containsKey(str) && !isOriginalWord) {
         return map.get(str);
     }
     
     for (int i = 1; i < str.length(); i++) {
         String left = str.substring(0, i);
         String right = str.substring(i);
         if (map.containsKey(left) && map.get(left) == true && canBuildWord(right, false, map)) {
             return true;
         }
     }
     
     map.put(str, false);
     return false;
 }
