class Solution {
    public String longestCommonPrefix(String[] strs) {
       String commonPrefix = strs[0];

        // Iterate over the rest of the strings in strs
        for (int i = 1; i < strs.length; i++) {
            // Check characters in corresponding positions
            StringBuilder newPrefix = new StringBuilder();
            for (int j = 0; j < Math.min(commonPrefix.length(), strs[i].length()); j++) {
                if (commonPrefix.charAt(j) == strs[i].charAt(j)) {
                    newPrefix.append(commonPrefix.charAt(j));
                } else {
                    break;
                }
            }
            commonPrefix = newPrefix.toString();

            // If the common prefix becomes empty, break early
            if (commonPrefix.isEmpty()) {
                break;
            }
        }

        return commonPrefix;
    }}
