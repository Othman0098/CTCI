static void zeroMatrix(int[][] mat){
        if(mat == null || mat.length < 1)
            return;
        
        int row = mat.length, col = mat[0].length;
        boolean[] rowMark = new boolean[row];
        boolean[] colMark = new boolean[col];
        
        for(int i = 0; i < row; i++)
            for(int j = 0; j < col; j++)
                if(mat[i][j] == 0){
                    rowMark[i] = true;
                    colMark[j] = true;
                }
        
        for(int i = 0; i < row; i++)
            if(rowMark[i])
                for(int j = 0; j < col; j++)
                    mat[i][j] = 0;

        for(int i = 0; i < col; i++)
            if(colMark[i])
                for(int j = 0; j < col; j++)
                    mat[j][i] = 0;
        
        return;
    }
