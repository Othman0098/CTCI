String binaryToString(double num){
    if(num >= 1 || num <= 0)
        return "ERROR";
        
    StringBuilder res = new StringBuilder();
    res.append(".");
    
    while(num > 0){
        if(res.length() >= 32)
            return "ERROR";
        
        double tmp = num * 2;
        if(tmp >= 1){
            res.append(1);
            num = tmp - 1;
        } else {
            res.append(0);
            num = tmp;
        }
    }
    
    return res.toString();
}
