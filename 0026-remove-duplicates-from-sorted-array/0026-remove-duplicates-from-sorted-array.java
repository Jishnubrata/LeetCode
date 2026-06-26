class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer>h=new HashSet<>();
        int index=0;
        for(int i:nums){
            if(h.add(i)){
                nums[index++]=i;

            }

        }
        return index;
    }
}