class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> h=new HashSet<>();
        int j,k;
        for(int i=0;i<=nums.length-1;i++){
            j=i+1;
            k=nums.length-1;
            while(j<k){
                if(nums[i]+nums[j]+nums[k]==0){
                h.add(Arrays.asList(nums[i], nums[j], nums[k]));
                j++;
                k--;
                 }
                    else if(nums[i]+nums[j]+nums[k]>0){
                        k--;
                    }else{
                        j++;
                    }
                }
            }
        
        return new ArrayList<>(h);
        
        
    }
}