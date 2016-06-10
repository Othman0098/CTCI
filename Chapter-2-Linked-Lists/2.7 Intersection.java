//  If two lists have intersecting, both lists should end in the same node;
    static LinkedListNode intersection(LinkedListNode a, LinkedListNode b){
        LinkedListNode currA = a, currB = b;
        int lenA = 0, lenB = 0;
        
        //  Get length of two list;
        while(currA != null){
            currA = currA.next;
            lenA++;
        }
        
        while(currB != null){
            currB = currB.next;
            lenB++;
        }
        
        //  Make the rest of lists have same length; 
        currA = a;
        currB = b;
        if(lenA > lenB){
            for(int i = 0; i < lenA - lenB; i++)
                currA = currA.next;
        } else
            for(int i = 0; i < lenB - lenA; i++)
                currB = currB.next;
        
        //  Check if there is an intersection;
        while(currA != null){
            if(currA == currB)
                return currA;
            currA = currA.next;
            currB = currB.next;
        }
        
        return null;
    }
