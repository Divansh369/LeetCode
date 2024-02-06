#include <string>
#include <algorithm>
#include <vector>

class Solution {
public:
    int findSubstringInWraproundString(const std::string& p) {
        
        std::vector<int> count(26, 0);
        
        int maxLengthCur = 0; 
        for (size_t i = 0; i < p.length(); i++) {
            if (i > 0 && (p[i] - p[i - 1] == 1 || (p[i - 1] - p[i] == 25))) {
                maxLengthCur++;
            }
            else {
                maxLengthCur = 1;
            }
            int index = p[i] - 'a';
            count[index] = std::max(count[index], maxLengthCur);
        }
        
        int sum = 0;
        for (int i = 0; i < 26; i++) {
            sum += count[i];
        }
        return sum;
    }
};