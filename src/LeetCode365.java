public class LeetCode365 {

    public boolean canMeasureWater(int x, int y, int z) {
        if (x + y < z) {
            return false;
        }
        int gcdValue = x >= y ? gcd(x, y) : gcd(y, x);
        return (gcdValue != 0 && z % gcdValue == 0) || (gcdValue == 0 && z == 0);
    }

    public int gcd(int x, int y) {
        if (y == 0) {
            return x;
        }
        if (x % y == 0) {
            return y;
        }
        return gcd(y, x % y);
    }

}
