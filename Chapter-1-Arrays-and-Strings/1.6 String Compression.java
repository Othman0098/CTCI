static String stringCompression(String s) {
        if(s == null || s.length() < 1)
            return s;

        int idx = 0;
        StringBuilder res = new StringBuilder();

        while(idx < s.length()){
            int start = idx;
            while(idx + 1 < s.length() && s.charAt(idx + 1) == s.charAt(idx))
                idx++;

            if(idx - start < 2)
                for(int i = start; i <= idx; i++)
                    res.append(s.charAt(start));
            else{
                res.append(s.charAt(start));
                res.append(idx - start + 1);
            }

            idx++;
        }

        return res.toString();
    }
