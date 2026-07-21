class Solution {
    public String reverseWords(String s) {
        // Step 1: Trim leading and trailing spaces
        s = s.trim();
                        
        // Step 2: Split by one or more spaces
        String[] words = s.split("\\s+");
                                                
        // Step 3: Reverse words
        int left = 0, right = words.length - 1;
        while (left < right) {
            String temp = words[left];
            words[left] = words[right];
            words[right] = temp;
            left++;
            right--;
        }
                                                                                        
    // Step 4: Join with single space
    return String.join(" ", words);
        
    }
}