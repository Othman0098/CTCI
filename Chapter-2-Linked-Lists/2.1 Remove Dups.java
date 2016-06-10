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
