static boolean isOneAway(String s1, String s2){
        if(s1 == null || s2 == null)
            return false;

        if(s1.length() == s2.length()){
            boolean flag = false;
            for(int i = 0; i < s1.length(); i++)
                if(s1.charAt(i) != s2.charAt(i)){
                    if(flag)
                        return false;
                }
        } else {
            if(Math.abs(s1.length() - s2.length()) != 1)
                return false;
            boolean flag = false;
            for(int i = 0, j = 0; i < s1.length() && j < s2.length(); i++, j++)
                if(s1.charAt(i) != s2.charAt(j)){
                    if(flag)
                        return false;
                    flag = true;
                    if(s1.length() > s2.length())
                        i++;
                    else
                        j++;
                }
        }
        return true;
    }
