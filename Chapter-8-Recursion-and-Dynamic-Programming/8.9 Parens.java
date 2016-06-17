List<String> allParens(int n) {
        List<String> res = new LinkedList<>();
        StringBuilder curr = new StringBuilder();

        generate(res, curr, n, n);

        return res;
    }

    //  left <= right
    void generate(List<String> res, StringBuilder curr, int left, int right) {
        if (right == 0)
            res.add(curr.toString());
        else {
            if (left > 0) {
                curr.append("(");
                generate(res, curr, left - 1, right);
                curr.deleteCharAt(curr.length() - 1);
            }

            if (right > left) {
                curr.append(")");
                generate(res, curr, left, right - 1);
                curr.deleteCharAt(curr.length() - 1);
            }
        }

        return;
    }
