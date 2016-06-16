    public static int recursiveMultiply(int a, int b) {
        if(b == 0)
            return 0;

        int res = recursiveMultiply(a << 1, b >> 1);

        return ((b & 1) == 1) ? a + res : res;
    }
