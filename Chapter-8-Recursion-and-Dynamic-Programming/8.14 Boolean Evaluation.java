//  Assume the input expression is valid;
    int numberOfBooleanEvaluation(String expression, boolean res) {
        char[] expre = expression.toCharArray();

        int[][] trueMat = new int[expre.length][expre.length];
        int[][] falseMat = new int[expre.length][expre.length];

        int[] combCount = new int[expre.length];
        combCount[0] = 1;
        combCount[2] = 1;
        for(int i = 4; i < expre.length; i += 2) {
            int c = 0;
            for(int j = 0; j < i; j += 2)
                c += combCount[j] * combCount[i - 2 - j];
            combCount[i] = c;
        }

        System.out.println(combCount[expre.length - 1]);

        for(int i = 0; i < expre.length; i += 2)
            if (expre[i] == '1')
                trueMat[i][i] = 1;
            else
                falseMat[i][i] = 1;

        return numberOfBooleanEvaluation(expre, 0, expre.length - 1, trueMat, falseMat, res);
    }

    int numberOfBooleanEvaluation(char[] expre, int left, int right, int[][] trueMat, int[][] falseMat, boolean target){
        if (left == right)
            return (target) ? trueMat[left][left] : falseMat[left][left];

        if (target && trueMat[left][right] != 0 || !target && falseMat[left][right] != 0)
            return (target) ? trueMat[left][right] : falseMat[left][right];

        int count = 0;
        for(int i = left + 1; i < right; i += 2){
            switch (expre[i]) {
                case ('&'):
                    if (target)
                        count += numberOfBooleanEvaluation(expre, left, i - 1, trueMat, falseMat, true) *
                                numberOfBooleanEvaluation(expre, i + 1, right, trueMat, falseMat, true);
                    else
                        count += numberOfBooleanEvaluation(expre, left, i - 1, trueMat, falseMat, true) *
                                        numberOfBooleanEvaluation(expre, i + 1, right, trueMat, falseMat, false) +
                                numberOfBooleanEvaluation(expre, left, i - 1, trueMat, falseMat, false) *
                                        numberOfBooleanEvaluation(expre, i + 1, right, trueMat, falseMat, true) +
                                numberOfBooleanEvaluation(expre, left, i - 1, trueMat, falseMat, false) *
                                        numberOfBooleanEvaluation(expre, i + 1, right, trueMat, falseMat, false);
                    break;
                case ('|'):
                    if (target)
                        count += numberOfBooleanEvaluation(expre, left, i - 1, trueMat, falseMat, true) *
                                        numberOfBooleanEvaluation(expre, i + 1, right, trueMat, falseMat, false) +
                                numberOfBooleanEvaluation(expre, left, i - 1, trueMat, falseMat, false) *
                                        numberOfBooleanEvaluation(expre, i + 1, right, trueMat, falseMat, true) +
                                numberOfBooleanEvaluation(expre, left, i - 1, trueMat, falseMat, true) *
                                        numberOfBooleanEvaluation(expre, i + 1, right, trueMat, falseMat, true);
                    else
                        count += numberOfBooleanEvaluation(expre, left, i - 1, trueMat, falseMat, false) *
                                numberOfBooleanEvaluation(expre, i + 1, right, trueMat, falseMat, false);
                    break;
                case ('^'):
                    if (target)
                        count += numberOfBooleanEvaluation(expre, left, i - 1, trueMat, falseMat, true) *
                                        numberOfBooleanEvaluation(expre, i + 1, right, trueMat, falseMat, false) +
                                numberOfBooleanEvaluation(expre, left, i - 1, trueMat, falseMat, false) *
                                        numberOfBooleanEvaluation(expre, i + 1, right, trueMat, falseMat, true);
                    else
                        count += numberOfBooleanEvaluation(expre, left, i - 1, trueMat, falseMat, true) *
                                        numberOfBooleanEvaluation(expre, i + 1, right, trueMat, falseMat, true) +
                                numberOfBooleanEvaluation(expre, left, i - 1, trueMat, falseMat, false) *
                                        numberOfBooleanEvaluation(expre, i + 1, right, trueMat, falseMat, false);
                    break;
            }
        }

        if(target)
            trueMat[left][right] = count;
        else
            falseMat[left][right] = count;

        return count;
    }
