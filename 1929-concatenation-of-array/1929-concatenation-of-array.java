import java.util.*;
class Solution {
    public int[] getConcatenation(int[] nums) {
    ArrayList<Integer> ans = new ArrayList<>();

    // add twice
    for(int i : nums) ans.add(i);
    for(int i : nums) ans.add(i);


    // convert ArrayList -> int[]
    int[] result = new int[ans.size()];
    for(int i = 0; i < ans.size(); i++){
    result[i] = ans.get(i);
    }

    return result;

        
    }
}