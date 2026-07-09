class Solution {
    public int jump(int[] nums) {
        int curreach=0;
        int curMax=0;
        int jumps=0;
        for (int i=0;i<nums.length-1;i++){
            if(i+nums[i]>curMax){
                curMax=i+nums[i];
            }
            if(i==curreach){
                jumps++;
                curreach = curMax;
            }

        }
        return jumps;
        
    }
}