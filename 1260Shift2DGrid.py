class Solution:
    def shiftGrid(self, grid: List[List[int]], k: int) -> List[List[int]]:
        n = len(grid)
        m = len(grid[0])
        
        for _ in range(k):
            temp_grid = [[0]*m for i in range(n)]
        
            for row in range(n):
                for col in range(m-1):
                    temp_grid[row][col+1] = grid[row][col]
            
            for row in range(n-1):
                temp_grid[row+1][0] = grid[row][-1]
            
            temp_grid[0][0] = grid[-1][-1]
            
            grid = temp_grid
        
        return grid
        
