static boolean isPalindromePermutation(String s){
        if(s == null || s.length() < 1)
            return false;

        s = s.toLowerCase();
        Hashtable<Character, Integer> table = new Hashtable<>();

        for(int i = 0; i < s.length(); i++)
            if(s.charAt(i) != ' '){
                if(table.containsKey(s.charAt(i)))
                    table.remove(s.charAt(i));
                else
                    table.put(s.charAt(i), 1);
            }

        return table.size() <= 1;
    }
