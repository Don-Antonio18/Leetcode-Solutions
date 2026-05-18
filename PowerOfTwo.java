class PowerOfTwo{
        public boolean isPowerOfTwo(int n) {
            if (n == 1) {
                return true;
            }
            if (n <= 0) {
                return false;
            }
            // log() returns double, must convert to int
            int logValue = (int) (Math.log(n) / Math.log(2));
            // log(x)/log(y) ^y must == y else x is not a power
            return Math.pow(2, logValue) == n;
        }
}