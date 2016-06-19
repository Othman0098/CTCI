//  Binary Search

int findIndex(Listy listy, int x) {
    if (listy.elementAt(0) == x)
        return 0;
    
    int left = 1;
    int right = left * 2;
    
    while (listy.elementAt(right) != 0 && listy.elementAt(right) < x) {
        left = right;
        right *= 2;
    }
    
    //  binarySearch...
}
