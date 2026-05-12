// Given a non-negative integer x, return the square root of x rounded down to the nearest integer.
// The returned integer should be non-negative as well.
// You must not use any built-in exponent function or operator.

class SqrtOfX {

    public int mySqrt(int x) {
        for (int i = 0; i <= x; i++) {
            if (i > x / i)
                return i - 1;
            if (i * i == x)
                return i;
        }
        return 0;
    }
}