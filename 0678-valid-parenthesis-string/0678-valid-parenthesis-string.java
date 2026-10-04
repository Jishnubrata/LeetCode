class Solution {
    public boolean checkValidString(String s) {
        int low = 0;
        int high = 0;

        for (char c : s.toCharArray()) {

            if (c == '(') {
                low++;
                high++;
            } 
            else if (c == ')') {
                low--;
                high--;
            } 
            else { // '*'
                low--;   // Treat '*' as ')'
                high++;  // Treat '*' as '('
            }

            // No possible interpretation can make it valid
            if (high < 0) {
                return false;
            }

            // Minimum unmatched '(' cannot be negative
            low = Math.max(low, 0);
        }

        return low == 0;
    }
}