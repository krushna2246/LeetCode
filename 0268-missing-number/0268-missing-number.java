class Solution {
    public int missingNumber(int[] nums) {
        int range= nums.length;
        int actualsum= (range*(range+1))/2;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum= sum + nums[i];

        }
        int ans = actualsum - sum;
        return ans;
    }
}