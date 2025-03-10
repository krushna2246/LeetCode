class Solution {
    public int tribonacci(int n) {
        // Base cases for n = 0, 1, and 2
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (n == 2) return 1;
        
        // Variables to hold Tn-3, Tn-2, and Tn-1
        int t0 = 0, t1 = 1, t2 = 1;
        
        // Calculate the tribonacci number for n >= 3
        for (int i = 3; i <= n; i++) {
            int next = t0 + t1 + t2; // Tn = Tn-1 + Tn-2 + Tn-3
            t0 = t1; // Move t1 to t0
            t1 = t2; // Move t2 to t1
            t2 = next; // Update t2 with the new value
        }
        
        return t2; // The result will be in t2 at the end
    }
}
