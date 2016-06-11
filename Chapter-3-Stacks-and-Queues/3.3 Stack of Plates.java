import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by Muchen on 6/11/16.
 */
public class SetOfStacks {
    ArrayList<Stack> sets;
    int stackCapacity;
    
    public SetOfStacks(int stackCapacity){
        sets.add(new Stack<Integer>());
        this.stackCapacity = stackCapacity;
    }
    
    public void push(int k){
        
    }
    
    public int pop(){
        return 0;
    }
    
    public int popAt(int stackNum){
        return 0;
    }
    
    public boolean isEmpty(){
        return (sets.size() < 2) && sets.get(0).isEmpty();
    }
    
}
