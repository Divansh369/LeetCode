#include <string>

class Solution {
public:
    int percentageLetter(const std::string& s, char letter) {
        double count = 0;
        for (char ch : s) {
            if (ch == letter) {
                count++;
            }
        }
        return static_cast<int>((count * 100) / s.length());
    }
};

