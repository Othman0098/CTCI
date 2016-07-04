/**
 * Leetcode
 * Ugly Number;
 * 
 */

int kthMultiple(int k) {
    
    int res = 0;
    
    LinkedList<Integer> l3 = new LinkedList<>();
    LinkedList<Integer> l5 = new LinkedList<>();
    LinkedList<Integer> l7 = new LinkedList<>();
    
    l3.add(1);
    l5.add(1);
    l7.add(1);
    
    for (int i = 0; i < k; i++) {
        res = Math.min(l3.get(0), Math.min(l5.get(0), l7.get(0)));
        
        if (res == l3.get(0))
            l3.remove(0);
        if (res == l5.get(0))
            l5.remove(0);
        if (res == l7.get(0))
            l7.remove(0);
            
        l3.add(res * 3);
        l5.add(res * 5);
        l7.add(res * 7);
    }
  
    return res;
}
