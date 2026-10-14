class Solution {
    public double myPow(double x, int n) {
        long power = n;

        if (power < 0) {
            power = -power;
        }

        double result = powerHelper(x, power);

        if (n < 0) {
            return 1.0 / result;
        }

        return result;
    }

    private double powerHelper(double x, long n) {
        if (n == 0) {
            return 1.0;
        }

        double half = powerHelper(x, n / 2);
        double result = half * half;

        if (n % 2 == 1) {
            result *= x;
        }

        return result;
    }
}