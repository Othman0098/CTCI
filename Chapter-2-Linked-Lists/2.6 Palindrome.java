static boolean palindrome(LinkedListNode root){
        boolean odd;
        LinkedListNode fast = root, slow = root;
        
        Stack<Integer> firstHalf = new Stack<>();
        
        while(true){
            if(fast == null){
                odd = false;
                break;
            }
            if(fast.next == null){
                odd = true;
                break;
            }
            
            firstHalf.push(slow.val);
            
            slow = slow.next;
            fast = fast.next.next;
        }
        
        if(odd)
            slow = slow.next;
        
        //  Check;
        while(slow != null){
            if(slow.val != firstHalf.pop())
                return false;
            slow = slow.next;
        }
        return true;
    }
