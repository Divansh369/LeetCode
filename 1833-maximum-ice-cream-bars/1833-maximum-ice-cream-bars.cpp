class Solution {
public:
    int maxIceCream(vector<int>& costs, int coins) {
        sort(costs.begin(), costs.end());

int cur = coins; // Remaining coins
int count = 0;   // Number of ice cream bars bought

for (int i = 0; i < costs.size(); ++i) {
    if (cur == 0 || cur < costs[i]) {
        break; // No more coins or cannot afford the next ice cream bar
    } else {
        cur -= costs[i]; // Deduct the cost from remaining coins
        ++count;         // Increment the count of bought ice cream bars
    }
}

return count; // Maximum number of ice cream bars bought
    }};