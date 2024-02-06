class Solution {
public:
    std::vector<int> twoSum(std::vector<int>& nums, int target) {
        std::unordered_map<int, int> hash_map;
        std::vector<int> sol;
        
        for (int i = 0; i < nums.size(); ++i) {
            int complement = target - nums[i];
            if (hash_map.find(complement) != hash_map.end()) {
                sol.push_back(hash_map[complement]);
                sol.push_back(i);
                return sol;
            }
            hash_map[nums[i]] = i;
        }
        
        return sol;
    }
};