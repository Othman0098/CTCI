public class MinStack {

    LinkedList<Integer> list;
    LinkedList<Integer> min;

    /** initialize your data structure here. */
    public MinStack() {
        list = new LinkedList<>();
    }

    public void push(int x) {
        list.add(0, x);
        if(min.size() < 1)
            min.add(0, x);
        else
            min.add(0, Math.min(min.get(0), x));
    }

    public int pop() {
        min.remove(0);
        return list.remove(0);
    }

    public int top() {
        return list.get(0);
    }

    public int getMin() {
        return min.get(0);
    }
    
    public boolean isEmpty() {
        return list.isEmpty();
    }
}
