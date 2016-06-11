    static void sortStack(Stack<Integer> stack){
        Stack<Integer> tmp = new Stack<>();
        
        while(!stack.isEmpty()){
            int t = stack.pop();
            while(!tmp.isEmpty() && tmp.peek() < t)
                stack.push(tmp.pop());
            tmp.push(t);
        }
        
        while(!tmp.isEmpty())
            stack.push(tmp.pop());
        
        return;
    }
