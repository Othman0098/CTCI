/* Count the number of factor 5 */

int factorialZeros(int n) {
    int res = 0;
    int base = 5;
    
    while (n > base) {
        res += n / base;
        base *= 5;
    }
    
    return res;
}
