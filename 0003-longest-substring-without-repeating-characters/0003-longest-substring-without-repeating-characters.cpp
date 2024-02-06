#include <string>
#include <algorithm>

class Solution {
public:
    int lengthOfLongestSubstring(std::string s) {
        int n = s.length();
        int ans = 0;
        int index[128] = {0};
        for (int j = 0, i = 0; j < n; j++) {
            i = std::max(index[s[j]], i);
            ans = std::max(ans, j - i + 1);
            index[s[j]] = j + 1;
        }
        return ans;
    }
};

