class Solution {
    public int[] sortedSquares(int[] nums) {
        int val=0;
        int[] nums2 = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            val=nums[i]*nums[i];
            nums2[i]+=val;
        }
        Arrays.sort(nums2);
        return nums2;
    }
}