class SpiralMatrixIII_855 {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        // defining 2 dimensional matrix with each array element containing a cordinate array
        int[][] result = new int[rows * cols][2];
        // defines the direction for position to move right, down , left, up
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        // keeps track of steps we have to move
        int step = 1;
        // keeps track of direction index to move in the defined directions array 0-right, 1-down, 2-left, 3-up
        int dirIndex = 0;
        int x = rStart, y = cStart;
        int count = 0;
        
        // increase the index of result array to store new x and y values
        result[count++] = new int[]{x, y};
        
        while (count < rows * cols) {
            // after each two steps the amount of step count increases by the one count
            for (int i = 0; i < 2; i++) {
                // initially moves to right adding all cordinates in the right
                for (int j = 0; j < step; j++) {
                    x += directions[dirIndex][0];
                    y += directions[dirIndex][1];
                    
                    // if the new cordinate is within the matrix boundaries, add it to the result array
                    if (x >= 0 && x < rows && y >= 0 && y < cols) {
                        result[count++] = new int[]{x, y};
                    }
                }
                // here it keeps the track of direction to move
                // initially it moves in right direction dirIndex starts at 0 (right).
                // After moving step steps in the current direction, dirIndex is incremented.
                // We use % 4 to cycle through the directions. When dirIndex is incremented past 3, it resets to 0:
                dirIndex = (dirIndex + 1) % 4;
            }
            step++;
        }
        
        return result;
    }
}

// view question description - https://leetcode.com/problems/spiral-matrix-iii/description/