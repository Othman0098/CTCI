/** 
 * Let k be 1 if a > b and 0 otherwise, if given k, how to return the max of a & b;
 * 
 * return (all k & a) | (all ~k & b);
 * 或:  return a*k + b*(not k);
 * 
 */

/**
 * Naive
 * 
 */

int flip(int bit) {
    return 1 ^ bit;
}

int sign(int a) {
    return flip((a >> 31) & 0x1);
}

int getMaxNaive(int a, int b) {
    int k = sign(a - b);
    int q = flip(k);
    return a * k + b * q;
}


/**
 * Considering Overflow situation;
 * 
 */
 
int getMax(int a, int b) {
    int c = a - b;
    
    int sa = sign(a);   // if a >= 0, then 1 else 0
    int sb = sign(b);   // if b >= 0, then 1 else 0
    int sc = sign(c);   // depends on whether or not a - b overflow
    
    /* Goal: define a value k whick is 1 if a > b and 0 if a < b.
     * (if a = b, it doesn`t matter what value k is) */
     
    // if a and b have different signs, then k = sign(a)
    int use_sign_of_a = sa ^ sb;
    
    // if a and b have same sign, then k = sign(a - b)
    int use_sign_of_c = flip(sa ^ sb);
    
    int k = use_sign_of_a * sa + use_sign_of_c * sc;
    int q = flip(k);    // opposite of k
    
    return a * k + b * q;
}
