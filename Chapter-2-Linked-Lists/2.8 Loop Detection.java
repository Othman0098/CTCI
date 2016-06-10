//  If two lists have intersecting, both lists should end in the same node;
    static LinkedListNode loopDetection(LinkedListNode root){
        LinkedListNode fast = root.next.next, slow = root.next;
        
        while(fast != slow){
            fast = fast.next.next;
            slow = slow.next;
        }
        
        fast = root;
        while(fast != slow){
            fast = fast.next;
            slow = slow.next;
        }
        
        return fast;
    }
