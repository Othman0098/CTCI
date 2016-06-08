static void rotateMatrix(int[][] image){
        if(image == null || image.length < 1 || image.length != image[0].length)
            return;

        int n = image.length;
        int left = 0;

        while(left < n / 2){
            for(int i = 0; i < n - 2 * left; i++){
                int tmp = image[left][left + i];
                image[left][left + i] = image[left + i][n - 1 - left];
                image[left + i][n - 1 - left] = image[n - 1 -left][n - 1 - left - i];
                image[n - 1 -left][n - 1 - left - i] = image[n - 1 - left - i][left];
                image[n - 1 - left - i][left] = tmp;
            }
        }
        
        return;
    }
