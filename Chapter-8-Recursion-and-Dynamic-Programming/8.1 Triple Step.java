private int countWays(int n) {
    if(n < 0)
        return 0;
    if(n <= 1)
        return 1;
    if(n == 2)
        return 2;
    if(n == 3)
        return 4;
    
    int a = 1, b = 2, c = 4;
    int res = 0;
    
    for(int i = 0; i < n - 3; i++){
        res = a + b + c;
        a = b;
        b = c;
        c = res;
    }
    
    return res;
}
