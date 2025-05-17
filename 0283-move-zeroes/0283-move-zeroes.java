class Solution {
    public void moveZeroes(int[] nums) {
        int insertPos = 0;

        // First pass: move all non-zero elements to the front
        for (int num : nums) {
            if (num != 0) {
                nums[insertPos++] = num;
            }
        }

        // Second pass: fill the rest with zeroes
        while (insertPos < nums.length) {
            nums[insertPos++] = 0;
        }
    }
}
