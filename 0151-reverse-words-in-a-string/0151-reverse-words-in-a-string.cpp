class Solution {
public:
    string reverseWords(string s) {
        string rev = "", buffer = "";
        for (int i = 0; i < s.length(); i++) {
            if (s[i] != ' ') {
                buffer += s[i];
            } else {
                if (!buffer.empty()) {
                    rev = buffer + (rev.empty() ? "" : " ") + rev;
                    buffer = "";
                }
            }
        }
        if (!buffer.empty()) {
            rev = buffer + (rev.empty() ? "" : " ") + rev;
        }
        return rev;
    }
};
