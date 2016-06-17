
    List<String> permutationsWithoutDups(String str) {
        char[] charStr = str.toCharArray();
        List<String> res = new LinkedList<>();

        generate(res, charStr, 0);

        return res;
    }

    void generate(List<String> res, char[] charStr, int idx) {
        if (idx == charStr.length) {
            res.add(String.valueOf(charStr));
            return;
        }

        for(int i = idx; i < charStr.length; i++) {
            char tmp = charStr[idx];
            charStr[idx] = charStr[i];
            charStr[i] = tmp;

            generate(res, charStr, idx + 1);

            tmp = charStr[idx];
            charStr[idx] = charStr[i];
            charStr[i] = tmp;
        }

        return;
    }
