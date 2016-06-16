List<String> findPath(boolean[][] grid) {
    if (grid == null || grid.length < 1 || !grid[grid.length - 1][grid[0].length - 1])
        return null;
        
    List<String> res = new LinkedList<>();
    
    dfs(grid, 0, 0, res);
    
    return res;
}

private void dfs(boolean[][] grid, int r, int c, List<String> res) {
    if (r == grid.length - 1 && c == grid[0].length - 1)
        return true;
        
    if (!grid[r][c])
        return false;
        
    if (r + 1 < grid.length) {
        res.add("" + (r + 1) + ":" + c);
        if (dfs(gird, r + 1, c, res))
            return true;
        res.remove(res.size() - 1);
    }
    
    if (c + 1 < grid[0].length) {
        res.add("" + r + ":" + (c + 1));
        if (dfs(grid, r, c + 1, res))
            return true;
        res.remove(res.size() - 1);
    }
    
    return false;
}
