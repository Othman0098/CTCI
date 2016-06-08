boolean checkPermutation(String s1, String s2){
      if(s1 == null || s2 == null || s1.length() != s2.length())
          return false;
        
      int len = s1.length();

      Hashtable<Character, Integer> table = new Hashtable<>();
        
        for(int i = 0; i < len; i++){
            char c = s1.charAt(i);
            if(table.containsKey(c))
                table.put(c, table.get(c) + 1);
            else
                table.put(c, 1);
        }
        
        for(int i = 0; i < len; i++){
            char c = s2.charAt(i);
            if(table.containsKey(c)) {
                int count = table.get(c);
                if(count == 1)
                    table.remove(c);
                else
                    table.put(c, count - 1);
            }
            else
                return false;
        }
        
        return table.isEmpty();
    }
