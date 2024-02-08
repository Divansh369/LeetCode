class Solution {
public:
    bool checkDistances(string s, vector<int>& d) {
        vector<int> v(26,-1);
        for(int i=0;i<s.size();i++){
            int idx= s[i]-'a';
            //fALSE - if was seen already and distance from last occurence is not equal to distance given 
            if(v[idx]!=-1 && (i-v[idx]-1)!=d[idx]) return false;
            v[idx]=i;  //UPDATE THE LATEST INDEX
        }
        return true;
    }
};