class Solution {
    public int longestOnes(int[] nums, int k) {
        int maxOnes = 0;
        int zeroCount = 0;
        int j = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == 0){
                zeroCount+=1;
            }

            while(zeroCount > k){
                if(nums[j] == 0){
                    zeroCount--;
                }
                j++;
            }

            maxOnes = Math.max(maxOnes, i-j+1);


        }
        return maxOnes;
        
    }
}