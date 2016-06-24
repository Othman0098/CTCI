int addWithoutPlus(int a, int b) {
    int sum = a ^ b;
    int carry = (a & b) << 1;
    
    while (carry != 0) {
        int tmp = sum;
        sum = sum ^ carry;
        carry = (tmp & carry) << 1;
    }
    
    return sum;
}
