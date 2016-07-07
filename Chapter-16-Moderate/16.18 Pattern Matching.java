/**
 * Solution 1;
 * 
 * The relative order does not matter;
 * for example pattern = aabab;
 * 1: Find all possible three 'a' pattern;
 * 2: Delete all 'a' pattern, thus forming a new string;
 * 3. Decide if the new string contains two 'b' pattern;
 * 4. Try all possible splits;
 * 
 */
 
/**
 * Standard answer similar to Solution 1;
 * 
 */
 
boolean doesMatch(String pattern, String value) {
    if (pattern.length() == 0) 
        return value.length() == 0;
    
    char mainChar = pattern.charAt(0);
    char alrChar = (mainChar == 'a') ? 'b' : 'a';
    int size = value.length();
    
    int countOfMain = countOf(pattern, mainChar);
    int countOfAlt = pattern.length() - countOfMain;
    int firstAlt = pattern.indexOf(altChar);
    int maxMainSize = size / countOfMain;
    
    for (int mainSize = 0; mainSize <= maxMainSize; mainSize++) {
        int remainingLength = size - mainSize * countofMain;
        if (countOfAlt == 0 || remainingLength % countOfAlt == 0) {
            int altIndex = firstAlt * mainSize;
            int altSize = (countOfAlt == 0) ? 0 : remainingLength / countOfAlt;
            if (matches(pattern, value, mainSize, altSize, altIndex)) {
                return true;
            }
        }
    }
    return false;
}

boolean matches(String pattern, String value, int mainSize, int altSize, int firstAlt) {
    int StringIndex = mainSize;
    for (int i = 1; i < pattern.length(); i++) {
        int size = pattern.charAt(i) == pattern.charAt(0) ? mainSize : altSize;
        int offset = pattern.charAt(i) == pattern.charAt(0) ? 0 : firstAlt;
        if (!isEqual(value, offset, stringIndex, size)) {
            return false;
        }
        StringIndex += size;
    }
    return true;
}

boolean isEqual(String s1, int offset1, int offset2, int size) {
    for (int i = 0; i < size; i++) {
        if (s1.charAt(offset1 + i) !== s1.charAt(offset2 + i)) {
            return false;
        }
    }
    return true;
}
