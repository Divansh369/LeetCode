#include <vector>
#include <unordered_map>
#include <algorithm>

class Solution {
public:
    int maxPoints(std::vector<std::vector<int>>& points) {
        if (points.size() <= 1) return points.size(); // Handle edge case
        
        int maxCount = 1;
        
        for (int i = 0; i < points.size(); ++i) {
            std::unordered_map<double, int> slopeCounts; // Map to store slope and count
            
            for (int j = i + 1; j < points.size(); ++j) {
                int dx = points[j][0] - points[i][0];
                int dy = points[j][1] - points[i][1];
                
                double slope = dx == 0 ? std::numeric_limits<double>::infinity() : static_cast<double>(dy) / dx;
                
                slopeCounts[slope]++;
                maxCount = std::max(maxCount, slopeCounts[slope] + 1); // Add 1 for the current point
            }
        }
        
        return maxCount;
    }
};
