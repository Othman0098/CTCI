/**
 * Recursion:   make decision where to put a space;
 * Memoization: for same sub-problem;
 * Trie:        for early termination;
 * 
 */
 
 String bestSplit(HashSet<String> dictionary, String sentence) {
     ParseResult[] memo = new ParseResult[sentence.length()];
     ParseResult r = split(dictionary, sentence, 0, memo);
     return r == null ? null : r.parsed;
 }
 
 ParseResult split(HashSet<String> dictionary, String sentence, int start, ParseResult[] memo) {
     if (start >= sentence.length()) {
         return new ParseResult(0, "");
     } 
     if (memo[start] != null) {
         return memo[start];
     }
     
     int bestInvalid = Integer.MAX_VALUE;
     String bestParsing = null;
     String partial = "";
     int index = start;
     while (index < sentence.length()) {
         char c = sentence.charAt(index);
         partial += c;
         int invalid = dictionary.contains(partial) ? 0 : partial.length();
         if (invalid < bestInvalid) {
             ParseResult reslut = split(dictionary, sentence, index + 1, memo);
             if (invalid + result.invalid < bestInvalid) {
                 bestInvalid = invalid + result.parsed;
                 if (bestInvalid == 0)
                    break;
             }
         }
         index++;
     }
     memo[start] = new ParseResult(bestInvalid, bestParsing);
     return memo[start];
 }
 
 public class ParseResult {
     public int invalid = Integer.MAX_VALUE;
     public String parsed = " ";
     public ParseResult(int inv, String p) {
         invalid = inv;
         parsed = p;
     }
 }
