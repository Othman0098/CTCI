/**
 * Tree Traversal;
 * 
 */

public class BiNode {
    public BiNode node1, node2;
    public int data;
}


BiNode[] convertBTStoDLL(BiNode root) {
    
    /* res[0]: Head;    res[1]: Tail. */
    BiNode[] res = new BiNode[2];
    
    /**
     * Better way to return two nodes ! ! ! ! ! !
     * Using a wrapper class for clean code ! ! ! ! ! !
     * 
     * private class NodePari{
     *      BiNode head, tail;   
     * }
     * 
     */
    
    if (root == null) {
        res[0] = null;
        res[1] = null;
    } else {
        BiNode[] prev = convertBTStoDLL(root.node1);
        BiNode[] next = convertBTStoDLL(root.node2);
    
        root.node1 = prev[1];
        root.node2 = next[0];
        res[0] = prev[0];
        res[1] = next[1];
    }
    
    return res;
}
