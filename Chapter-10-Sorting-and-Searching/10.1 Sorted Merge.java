//  Better way;
//  Insert elements into the back of the array! ! ! ! ! !


//  Shift elements;
int[] mergeSorted(int[] a, int[] b) {
    int la = a.length;
    int lb = b.length;
    
    int idxa = 0;
    int idxb = 0;
    
    while (a.left < la && b.left < lb) {
        if (a[idxa] <= b[idxb])
            idxa++;
        else {
            a.startFrom(idxa).shiftByOne;
            a[idxa] = b[idxb];
            idxa++;
            idxb++;
        }
    }
    
    if (idxb == lb)
        return a;
    else {
        connect b to a;
        return a;
    }
}
