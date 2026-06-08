class Solution:
    def pivotArray(self, nums: List[int], pivot: int) -> List[int]:
        small_ele = []
        large_ele = []
        equal_ele = []
        for num in nums:
            if num < pivot:
                small_ele.append(num)
            elif num == pivot:
                equal_ele.append(num)
            else:
                large_ele.append(num)
        small_ele.extend(equal_ele)
        small_ele.extend(large_ele)
        return small_ele
