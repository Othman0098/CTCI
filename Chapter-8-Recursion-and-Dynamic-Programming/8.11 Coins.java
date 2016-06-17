int coins(int n) {
        int count = 0;

        for(int i = 0; i <= n / 25; i++)
            for(int j = 0; j <= (n - 25 * i) / 10; j++)
                for(int k = 0; k <= (n - 25 * i - 10 * j) / 5; k++)
                    count++;

        return count;
    }
