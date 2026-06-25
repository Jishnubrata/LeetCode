class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        long ans = 0;
        int prefix = 0;
        map.put(0, 1);

        for (int num : nums) {
            prefix += (num == target ? 1 : -1);

           for (int key : map.keySet()) {
           if (key < prefix) {
            ans += map.get(key);
        }
    }

    map.put(prefix, map.getOrDefault(prefix, 0) + 1);
        }
        return (int) ans;

        
    }
}