class TreeNode{
    private int data, size;
    public TreeNode left, right;
    
    public TreeNode(int d) {
        this.data = d;
        this.size = 0;
    }
    
    public TreeNode getRandomNode(){
        int leftSize = (left == null) ? 0 : left.size();
        Random random = new Random();
        int index = random.nextInt(size);
        
        if(index < leftSize)
            return left.getRandomNode();
        else if(index == left.size)
            return this;
        else
            return right.getRandomNode();
    }
    
    public void insertInOrder(int d){
        if(d <= data){
            if(left == null)
                left = new TreeNode(d);
            else
                left.insertInOrder(d);
        } else {
            if(right == null)
                right = new TreeNode(d);
            else
                right.insertInOrder(d);
        }
        size++;
    }
    
    public void delete(int d){
        //  Little complicated;
        //  including moving nodes;
    }
    
    public int size(){
        return size;
    }
    
    public int data(){
        return data;
    }
    
    public TreeNode find(int d){
        if(d == data)
            return this;
        else if(d < data)
            return (left == null) ? null : left.find(d);
        else
            return (right == null) ? null : right.find(d);
    }
}

