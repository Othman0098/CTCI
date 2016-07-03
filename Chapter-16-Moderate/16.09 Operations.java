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

/* Optimal Flip. */
int negate(int a) {
    int neg = 0;
    int newSign = a < 0 ? 1 : -1;
    int delta = newSign;
    while (a != 0) {
        boolean differentSigns = (a + delta > 0) != (a > 0);
        if (a + delta != 0 && differentSigns) { // If delta is too big, reset it
            delta = newSign;
        }
        neg += delta;
        a += delta;
        delta += delta; // Double the delta
    }
    return reg;
}
