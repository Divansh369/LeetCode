class Solution {
public:
    bool isPalindrome(string s) {
        string x="";
        for (int i=0;i<s.size();i++){
            if (isalpha(s[i]) || isdigit(s[i])){
                x+=tolower(s[i]);
            }
        }
        for (int l=0;l<x.size()/2;l++){
            int r=x.size()-1-l;
            if (x[l]!=x[r]){
                return false;
            }
        }
        return true;
    }
};