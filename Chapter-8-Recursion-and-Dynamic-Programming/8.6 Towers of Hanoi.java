
    int count = 0;
    Stack<Integer> first;

    public void towersOfHanoi(int n) {

        Stack<Integer> first = new Stack<>(), middle = new Stack<>(), last = new Stack<>();
        this.first = first;

        for(int i = n; i > 0; i--)
            first.push(i);

        System.out.println("Count: " + count);

        moveDisks(n, first, last, middle);

        System.out.println("Count: " + count);

    }

    private void moveDisks(int level, Stack<Integer> src, Stack<Integer> des, Stack<Integer> exc) {
        printStack();

        if(level == 1){
            des.push(src.pop());
            count++;
        }
        else{
            moveDisks(level - 1, src, exc, des);
            des.push(src.pop());
            count++;
            moveDisks(level - 1, exc, des, src);
        }
    }

    private void printStack() {
        System.out.println("==============================");

        Stack<Integer> tmp = new Stack<>();
        while(!first.isEmpty()){
            int i = first.pop();
            System.out.print(i + " ");
            tmp.push(i);
        }
        while(!tmp.isEmpty())
            first.push(tmp.pop());

        System.out.println();
    }
