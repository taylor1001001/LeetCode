class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        if len(matrix) == 0:
            return False
        
        n = len(matrix) * len(matrix[0])
        
        start = 0
        end = n-1
        mid = 0
        
        while start <= end:
            mid = int((start+end)/2)
            midValue = matrix[mid//len(matrix[0])][mid%len(matrix[0])]
            
            if midValue == target:
                return True
            elif midValue > target:
                end = mid - 1
            else:
                start = mid + 1
        
        return False
