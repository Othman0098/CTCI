static String URLify(String s, int l){
        char[] str = s.toCharArray();
        StringBuilder res = new StringBuilder();

        for(int i = 0; i < l; i++)
            if(str[i] == ' ')
                res.append("%20");
            else
                res.append(str[i]);

        return res.toString();
    }
