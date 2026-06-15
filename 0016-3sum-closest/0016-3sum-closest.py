class Solution:
    def threeSumClosest(self, nums: List[int], target: int) -> int:
        ans = float('inf')
        res = 0

        nums.sort()

        for i in range(len(nums)):
            j = i + 1
            k = len(nums) - 1

            while j < k:
                curr = nums[i] + nums[j] + nums[k]

                diff = abs(target - curr)

                if diff < ans:
                    ans = diff
                    res = curr

                if curr > target:
                    k -= 1
                elif curr < target:
                    j += 1
                else:
                    return curr

        return res