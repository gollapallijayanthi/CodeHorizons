class Solution:
    def maxArea(self, height: List[int]) -> int:
        ans = 0
        left = 0
        right = len(height)-1
        curr = 0
        while left <= right:
            l = (right - left) 
            curr = (l * min(height[left],height[right]))
            ans = max(ans,curr)
            if height[left] > height [right]:
                right -= 1
            else:
                left += 1
        
        return ans

        