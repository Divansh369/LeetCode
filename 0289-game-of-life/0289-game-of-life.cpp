class Solution {
public:
    vector<int> neighbours(std::vector<std::vector<int>>& board, int i, int j) {
    std::vector<int> neighbours;

    int rows = board.size();
    int cols = board[0].size();

    // Check boundaries before accessing elements
    if (i - 1 >= 0 && j - 1 >= 0)
        neighbours.push_back(board[i - 1][j - 1]);

    if (i - 1 >= 0)
        neighbours.push_back(board[i - 1][j]);

    if (i - 1 >= 0 && j + 1 < cols)
        neighbours.push_back(board[i - 1][j + 1]);

    if (j - 1 >= 0)
        neighbours.push_back(board[i][j - 1]);

    if (j + 1 < cols)
        neighbours.push_back(board[i][j + 1]);

    if (i + 1 < rows && j - 1 >= 0)
        neighbours.push_back(board[i + 1][j - 1]);

    if (i + 1 < rows)
        neighbours.push_back(board[i + 1][j]);

    if (i + 1 < rows && j + 1 < cols)
        neighbours.push_back(board[i + 1][j + 1]);
        
    return neighbours;
}
    int neighbourSum(vector<vector<int>>& board,int row,int column){
        int sum = 0;
        vector<int> n=neighbours(board,row,column);
    for (int num : n) {
        sum += num;
    }
        return sum;
    }
    int fate(vector<vector<int>>& board,int row,int column){
        int sum=neighbourSum(board,row,column);
        if (board[row][column]==1){
        if (sum>3 || sum<2){
            return 0;
        }
        }
        else if (board[row][column]==0){
            if (sum==3){
            return 1;
        }
        }
        return board[row][column];
    }
    void gameOfLife(vector<vector<int>>& board) {
    int rows = board.size();
    int columns = board[0].size();
    vector<vector<int>> b(rows, vector<int>(columns, 0)); // Initialize a new board

    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < columns; j++) {
            b[i][j] = fate(board, i, j);
        }
    }

    // Update the original board with the new values
    board = b;
}
};