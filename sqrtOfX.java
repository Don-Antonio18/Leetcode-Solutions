class sqrtOfX {

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