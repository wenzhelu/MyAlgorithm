//
//  main.cpp
//  Search2DMatrixII_240
//
//  Created by Wenzhe Lu on 2018/3/9.
//  Copyright © 2018年 Wenzhe Lu. All rights reserved.
//

//Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:
//
//Integers in each row are sorted in ascending from left to right.
//Integers in each column are sorted in ascending from top to bottom.
//For example,
//
//Consider the following matrix:
//
//[
// [1,   4,  7, 11, 15],
// [2,   5,  8, 12, 19],
// [3,   6,  9, 16, 22],
// [10, 13, 14, 17, 24],
// [18, 21, 23, 26, 30]
// ]
//Given target = 5, return true.
//
//Given target = 20, return false.


#include <iostream>
#include <vector>

using namespace std;

class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        if (matrix.size() == 0) return false;
        int rows = matrix.size(), cols = matrix[0].size(), row = 0, col = cols - 1;
        // So initially we are at upper right corner.
        while (row < rows && col > -1) {
            if (matrix[row][col] == target) return true;
            else if (matrix[row][col] > target) col--;
            else row++;
        }
        
        return false;
    }
};



int main(int argc, const char * argv[]) {
    return 0;
}
