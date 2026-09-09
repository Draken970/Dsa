class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minLen = Integer.MAX_VALUE;
        int j = 0;
        int windowSum = 0;

        for(int i = 0; i<nums.length; i++){
            windowSum += nums[i];

            while(windowSum >= target){
                minLen = Math.min(minLen, i - j +1);
                windowSum -= nums[j];
                j++;
            }

            

        }

    return minLen == Integer.MAX_VALUE ? 0 : minLen;
        
    }
}