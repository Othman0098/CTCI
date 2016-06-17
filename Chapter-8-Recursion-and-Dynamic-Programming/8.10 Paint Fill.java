void paintFill(int[][] image, int x, int y, int newColor) {
        
        int row = image.length, col = image[0].length;
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        
        for (int i = 0; i < 4; i++) {
            int tx = x + directions[i][0];
            int ty = y + directions[i][1];
            if(tx >= 0 && tx < row && ty >= 0 && ty < col && image[x][y] == image[tx][ty])
                paintFill(image, tx, ty, newColor);
        }
        
        image[x][y] = newColor;
        
        return;
    }
