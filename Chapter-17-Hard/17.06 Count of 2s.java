/**
 * 个位 2, 1 every 10;
 * 十位 2，10 every 100;
 * 百位 2, 100 every 1000;
 * ...
 * 
 * Be careful;
 * 
 */

int countOf2(int n) {
    int count = 0;
    int len = String.valueOf(number).length();
    for (int digit = 0; digit < len; digit++) {
        count += countOf2AtDigit(number, digit);
    }
    return count;
}

int countOf2AtDigit(int number, int d) {
    int powerOf10 = (int) Math.pow(10, d);
    int nextPowerOf10 = powerOf10 * 10;
    int right = number % powerOf10;
    
    int roundDown = number - number % nextPowerOf10;
    int roundUp = roundDown + nextPowerOf10;
    
    int digit = (number / powerOf10) % 10;
    if (digit < 2)
        return roundDown / 10;
    else if (digit == 2)
        return roundDown / 10 + right + 1;
    else
        return roundUp / 10;
}
