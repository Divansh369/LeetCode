class Solution {
public:
    vector<int> flip(vector<int> x){
        vector<int> y;
        for (int i=0;i<x.size();i++){
            y.push_back(x[x.size()-1-i]);
        }
        return y;
    }
    vector<int> invert(vector<int> x){
        vector<int> y;
        for (int i=0;i<x.size();i++){
            if (x[i]==0){
                y.push_back(1);
            }
            else{
                y.push_back(0);
            }
        }
        return y;
    }
    vector<vector<int>> flipAndInvertImage(vector<vector<int>>& image) {
        for (int i=0;i<image.size();i++){
            image[i]=flip(image[i]);
            image[i]=invert(image[i]);
        }
        return image;
    }
};