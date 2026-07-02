class Solution {
    public int findPeakElement(int[] nums) {
        int max=nums[0];
        int index=0;
        for(int i=0;i<nums.length;i++){
            int newMax=Math.max(max,nums[i]);
            if(newMax !=max){
                max=newMax;
                index=i;
            }
        }
        return index;
        
    }
}