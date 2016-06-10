static void deleteMiddleNode(LinkedListNode mid){
        LinkedListNode prev = mid, curr = mid.next;
        if(curr == null){}      //  Error! Cannot delete the last element;
        
        while(curr.next != null){
            prev.val = curr.val;
            prev = curr;
            curr = curr.next;
        }
        prev.next = null;
        return;
    }
