#include <vector>
#include <string>

class Solution {
public:
    std::vector<std::string> generateParenthesis(int n) {
        std::vector<std::string> res;
        recurse(res, 0, 0, "", n);
        return res;
    }
private:
    void recurse(std::vector<std::string>& res, int left, int right, std::string s, int n) {
        if (s.length() == n * 2) {
            res.push_back(s);
            return;
        }
        if (left < n) {
            recurse(res, left + 1, right, s + "(", n);
        }
        if (right < left) {
            recurse(res, left, right + 1, s + ")", n);
        }
    }
};


