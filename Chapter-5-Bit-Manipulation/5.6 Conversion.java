    int conversion(int a, int b){
        int c = a ^ b;
        
        int res = 0;
        while(c != 0){
            if((c & 1) == 1)
                res++;
            c >>>= 1;
        }
        
        return res;
    }
