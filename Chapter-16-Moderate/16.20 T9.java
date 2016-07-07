/**
 * Brute Force;
 * 
 * For a given sequnce of digits; e.g. 8733
 * Generate all possible characters sequence: e.g. tpdd, tpde, tpdf, tped ...
 * Decide if any of them belongs to the Dict;
 * 
 * Very Slow;
 * 
 */

/**
 * Possible optimization for brute force;
 * 
 * Use a trie to store the Dict;
 * Then any invalid prefix can be terminate at early iteration;
 * 
 * Trie running time ? ?
 * 
 */
 
 /**
  * Optimized;
  *
  * Use preprocessing;
  * Create a hash table that maps from sequence of digits to a list of Strings;
  * Iterate the dictionary, store all digits -> words in the hash table above;
  * 
  * Every time read a sequence of digits, just look it up in the hash table;
  * 
  */
  



