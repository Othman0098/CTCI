//  Solution #1;

void numberSwapper(int a, int b) {
    a += b;
    b = a - b;
    a -= b;
    
    return;
}


//  Solution #2;
//  Bit manipulation;

void numberSwapper(int a, int b) {
    a = a ^ b;
    b = a ^ b;
    a = a ^ b;
    
}
