static void removeDups(LinkedListNode root){
        
        LinkedListNode curr = root, prev = null;
        HashSet<Integer> set = new HashSet<>();
        
        while(curr != null){
            if(set.contains(curr.val))
                prev.next = curr.next;
            else{
                set.add(curr.val);
                prev = curr;
            }
            curr = curr.next;
        }
        return;
    }
  
//      Without extra space;
static void removeDups(LinkedListNode root){

        LinkedListNode slow = root;
        LinkedListNode fast, fastPrev;

        while(slow != null){
            fast = slow.next;
            fastPrev = slow;
            while(fast != null){
                if(fast.val == slow.val)
                    fastPrev.next = fast.next;
                else
                    fastPrev = fast;
                fast = fast.next;
            }
            slow = slow.next;
        }
        
        return;
    }
