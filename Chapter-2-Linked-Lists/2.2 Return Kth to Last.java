static LinkedListNode returnKthToLast(LinkedListNode root, int k){
        LinkedListNode left = root, right = root;
        for(int i = 0; i < k; i++){
            if(right.next == null)
                return null;
            right = right.next;
        }
        
        while(right.next != null){
            left = left.next;
            right = right.next;
        }
        
        return left;
    }
