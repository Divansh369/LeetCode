class Solution {
public:
    vector<int> rearrangeArray(vector<int>& nums) {
        vector<int> pos, neg, sol;
        
        // Separate positive and negative numbers
        for (int i = 0; i < nums.size(); i++) {
            if (nums[i] <= 0) {
                neg.push_back(nums[i]);
            } else {
                pos.push_back(nums[i]);
            }
        }
        
        // Ensure both vectors have the same size
        while (pos.size() > neg.size() ) {
            neg.push_back(0); // Add a placeholder element
        }
        while (neg.size() > pos.size() ) {
            pos.push_back(0); // Add a placeholder element
        }
        
        // Interleave positive and negative numbers
        for (int i = 0; i < pos.size(); i++) {
            sol.push_back(pos[i]);
            sol.push_back(neg[i]);
        }
        
        return sol;
    }
};
