class Solution {
    public int tribonacci(int n) {
        if(n<2){
            return n;
        }

        int prev0 = 0;
        int prev1 = 1;
        int curr = 1;
        
        for(int i=2;i<n;i++){
            int next = prev0+prev1+curr;
            prev0 = prev1;
            prev1 = curr;
            curr = next;

        }

        return curr;
    }
}