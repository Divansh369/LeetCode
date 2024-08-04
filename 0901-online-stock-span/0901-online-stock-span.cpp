#include <stack>
#include <utility>

class StockSpanner {
private:
    std::stack<std::pair<int, int>> obj; // Stack to store pairs of (price, span)

public:
    StockSpanner() {
        // No need to initialize obj here, it will be default-constructed
    }

    int next(int price) {
        int res = 1; // Span count starts at 1 for the current day
        while (!obj.empty() && obj.top().first <= price) {
            res += obj.top().second; // Accumulate spans of popped elements
            obj.pop(); // Remove elements with prices less than or equal to current price
        }
        obj.push({price, res}); // Push the current price and its calculated span
        return res; // Return the span for the current price
    }
};

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner* obj = new StockSpanner();
 * int param_1 = obj->next(price);
 */
