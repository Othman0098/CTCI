
    List<String> permutationsWithoutDups(String str) {
        char[] charStr = str.toCharArray();
        Arrays.sort(charStr);
        List<String> res = new LinkedList<>();
        boolean[] used = new boolean[charStr.length];
        StringBuilder curr = new StringBuilder();

        generate(res, charStr, 0, used, curr);

        return res;
    }

    void generate(List<String> res, char[] charStr, int idx, boolean[] used, StringBuilder curr) {
        if (idx == charStr.length) {
            res.add(curr.toString());
            return;
        }

        for (int i = 0; i < charStr.length; i++)
            if (!used[i]){
                curr.append(charStr[i]);
                used[i] = true;

                generate(res, charStr, idx + 1, used, curr);

                curr.deleteCharAt(curr.length() - 1);
                used[i] = false;

                while(i < charStr.length - 1 && charStr[i] == charStr[i + 1])
                    i++;
            }

        return;
    }
