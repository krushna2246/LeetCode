class Solution {
    public static boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;  
        }
        return (n & (n - 1)) == 0; 
    }
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(16)); // true (16 = 2^4)
        System.out.println(isPowerOfTwo(18)); // false
        System.out.println(isPowerOfTwo(1));  // true (1 = 2^0)
        System.out.println(isPowerOfTwo(0));  // false
    }
}
