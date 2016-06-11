import java.util.Stack;

/**
 * Created by Muchen on 6/11/16.
 */
public class MyQueue2<T> {
    
    private Stack<T> stackNew, stackOld;
    
    public MyQueue2() {
        stackNew = new Stack<>();
        stackOld = new Stack<>();
    }
    
    public boolean isEmpty() {
        return stackNew.isEmpty() && stackOld.isEmpty();
    }
    
    public int size() {
        return stackNew.size() + stackOld.size();
    }
    
    public void push(T k) {
        stackNew.push(k);
    }
    
    public T pop() {
        exchangeStack();
        return stackOld.pop();
    }
    
    public T peek() {
        exchangeStack();
        return stackOld.peek();
    }
    
    private void exchangeStack() {
        if(stackOld.isEmpty())
            while(!stackNew.isEmpty())
                stackOld.push(stackNew.pop());
        return;
    }
    
}
