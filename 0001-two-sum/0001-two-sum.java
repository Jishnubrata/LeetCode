class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>h=new HashMap<>();
        int []a=new int[2];
        int x=0;
        for(int i:nums){
            if(h.containsKey(target-i)){
                a[0]=h.get(target-i);
                a[1]=x;

            }else{
                h.put(i,x);
            }
            x++;
        }
        return a;
        
    }
}