class Solution {
public:
    int countSeniors(vector<string>& details) {
        int c=0;
        for (int i=0;i<details.size();i++){
            string temp=details[i];
            string substring = temp.substr(11, 2);
            int age = std::stoi(substring);
            if (age>60){
                c++;
            }
        }
        return c;
    }
};