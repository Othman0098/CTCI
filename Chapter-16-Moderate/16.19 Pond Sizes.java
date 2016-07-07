/**
 * Leetcode;
 * 
 * Depth First Search;
 * 
 * Need a extra boolean[][] matrix;
 * Keep track of any pond that has been visited;
 * 
 */


int[] allPonds(int[][] lands) {
    int[] res;
    boolean[][] isVisited = all false;
    
    for each land
        if land == 0 && isVisited == false
            res.add(dfs(thisLand));
            
    return res;
} 

int dfs(land) {
    int res = 1;
    isVisited = true;
    
    for all eight nearby land
        if nextLand == 0 && isVisited == false;
            res += dfs(nextLand);
            
    return res;
}
