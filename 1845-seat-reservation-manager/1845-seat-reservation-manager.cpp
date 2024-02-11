#include <vector>
#include <queue>

class SeatManager {
public:
    std::vector<bool> res;
    std::priority_queue<int, std::vector<int>, std::greater<int>> availableSeats;
    
    SeatManager(int n) {
        res.resize(n, false);
        for (int i = 1; i <= n; ++i) {
            availableSeats.push(i);
        }
    }
    
    int reserve() {
        if (availableSeats.empty()) return -1; // No available seats
        
        int seatNumber = availableSeats.top();
        availableSeats.pop();
        res[seatNumber - 1] = true;
        return seatNumber;
    }
    
    void unreserve(int seatNumber) {
        if (seatNumber >= 1 && seatNumber <= res.size() && res[seatNumber - 1]) {
            res[seatNumber - 1] = false;
            availableSeats.push(seatNumber);
        }
    }
};
