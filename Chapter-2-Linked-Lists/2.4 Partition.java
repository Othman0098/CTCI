   static LinkedListNode partition(LinkedListNode root, int x){
        LinkedListNode curr = root;
        LinkedListNode head = root, tail = root;
        
        while(curr != null){
            LinkedListNode next = curr;
            if(curr.val < x){
                curr.next = head;
                head = curr;
            } else {
                tail.next = curr;
                curr.next = null;
            }
            curr = next;
        }
        
        return head;
    }
