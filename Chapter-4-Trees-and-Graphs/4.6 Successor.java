TreeNode findNext(TreeNode curr){
    if(curr.right != null){
        curr = curr.right;
        while(curr.left != null)
            curr = curr.left;
    } else {
        //  It will need some extra check if curr is the very last element;
        curr = curr.parent;
        while(curr.parent.right == curr){
            curr = curr.parent;
        }
        curr = curr.parent;
    }
    
    return curr;
}
