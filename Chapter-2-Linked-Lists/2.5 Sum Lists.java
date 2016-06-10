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
    
    
    //  forward order;
    //  #1: using stack;
    //  #2: reverse each linked list;

    static LinkedListNode sumLists(LinkedListNode a, LinkedListNode b){
        LinkedListNode currA = a, currB = b;
        LinkedListNode res = new LinkedListNode(0), curr = res;

        Stack<Integer> stackA = new Stack<>();
        Stack<Integer> stackB = new Stack<>();

        //  Fill the stack;
        while(currA != null){
            stackA.push(currA.val);
            currA = currA.next;
        }

        while(currB != null){
            stackB.push(currB.val);
            currB = currB.next;
        }
        
        //  Construct res linked list;
        int carry = 0;
        while(!stackA.isEmpty() && !stackB.isEmpty()){
            int ta = stackA.pop(), tb = stackB.pop();
            curr.next = new LinkedListNode((ta + tb + carry) % 10);
            carry = (ta + tb + carry) / 10;
            
            curr = curr.next;
        }
        
        if(stackA.isEmpty())
            while(!stackB.isEmpty()){
                int tb = stackB.pop();
                curr.next = new LinkedListNode((tb + carry) % 10);
                carry = (tb + carry) / 10;
                
                curr = curr.next;
            }
        else
            while(!stackA.isEmpty()){
                int ta = stackA.pop();
                curr.next = new LinkedListNode((ta + carry) % 10);
                carry = (ta + carry) / 10;

                curr = curr.next;
            }
        
        if(carry != 0)
            curr.next = new LinkedListNode(carry);

        return res.next;
    }
