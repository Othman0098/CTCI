//  011111  ->  101111
//  101100  ->  110011  

int nextNumber(int num){

    //  find first 1 bit;
    int oneIdx = 0;
    int tmp = num;
    while(tmp & 1 == 0){
        tmp >>>= 1;
        oneIdx++;
    }
    
    //  int zeroIdx = oneIdx;
    while(num & 1 == 1){
        tmp >>>= 1;
        zeroIdx++;
    }
    
    //
    ....
}
