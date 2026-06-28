class Solution {
    public boolean isPowerOfThree(int n) {
        if (n<=0) {
            return false;
        }
        int a = n;
        while (a%3==0) {
            a=a/3;
        }
        return a == 1;
    }
}