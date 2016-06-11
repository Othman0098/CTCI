/**
 * Created by Muchen on 6/11/16.
 * Fixed size;
 */
public class MyThreeStacksFixed {
    private final int numberOfStacks = 3;
    private int stackCapacity;
    private int[] values;
    private int[] sizes;
    
    public MyThreeStacksFixed(int stackCapacity){
        this.stackCapacity = stackCapacity;
        values = new int[numberOfStacks * stackCapacity];
        sizes = new int[numberOfStacks];
    }
    
    public void push(int k, int stackNum){
        if(isFull(stackNum))
            return;
        
        sizes[stackNum]++;
        int offset = stackNum * stackNum + sizes[stackNum];
        values[offset] = k;
        return;
    }
    
    public int pop(int stackNum){
        
    }
    
    public int peek(int stackNum){
        
    }
    
    public boolean isEmpty(int stackNum){
        
    }
    
    private boolean isFull(int stackNum){
        return sizes[stackNum] == stackCapacity;    
    }
    
}
