int multiply(int a, int b) {
    int res = 0;
    for (int i = 0; i < b; i++)
        res += a;
    return res;
}

int subtract(int a, int b) {
    //...
}


/**
 * Standard Solution;
 * 
 */
 
/* Flip a positive sign to negative or negative sign to pos. */
int negate(int a) {
    int neg = 0;
    int newSign = a < 0 ? 1 : -1;
    while (a != 0) {
        neg += newSign;
        a += newSign;
    }
    return neg;
}

