//  reverse order;

static LinkedListNode sumLists(LinkedListNode a, LinkedListNode b){
        LinkedListNode currA = a, currB = b;
        LinkedListNode res = new LinkedListNode(0), curr = res;

        int carry = 0;
        while(currA != null && currB != null){
            curr.next = new LinkedListNode((currA.val + currB.val + carry) % 10);
            carry = (currA.val + currB.val + carry) / 10;

            curr = curr.next;
            currA = currA.next;
            currB = currB.next;
        }

        if(currA == null)
            while(currB != null){
                curr.next = new LinkedListNode((currB.val + carry) % 10);
                carry = (currB.val + carry) / 10;
                
                currB = currB.next;
                curr = curr.next;
            }
        else
            while(currA != null) {
                curr.next = new LinkedListNode((currA.val + carry) % 10);
                carry = (currA.val + carry) / 10;

                currA = currA.next;
                curr = curr.next;
            }
        
        if(carry != 0)
            curr.next = new LinkedListNode(carry);
        
        return res.next;
    }
