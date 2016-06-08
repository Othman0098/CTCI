boolean isUnique(String s){
        if(s == null || s.length() < 0)
                return true;

        boolean[] used = new boolean[26];
        for(int i = 0; i < s.length(); i++)
                if(used[s.charAt(i) - 'a'])
                        return false;
                else
                        used[s.charAt(i) - 'a'] = true;

        return true;
}
