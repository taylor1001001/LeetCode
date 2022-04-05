class Solution:
    def maxArea(self, height: List[int]) -> int:
        maxA, low, high = 0, 0, len(height)-1
        while(low<high):
            maxA = max(maxA, min(height[low], height[high])*(high - low))
            if height[low]<height[high]:
                low += 1
            else:
                high -=1
        
        return maxA
