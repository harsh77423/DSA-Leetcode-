class Solution {
    public int[] runningSum(int[] nums) {
        int sum = 0;
        int psum[] = new int[nums.length];

        for(int i=0 ; i <= nums.length-1 ; i++){
            sum = sum + nums[i];
            psum[i] = sum;

        }
        return psum;
    }
}