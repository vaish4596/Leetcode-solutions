from typing import List

class Solution:
    def maxProfit(self, nums: List[int]) -> int:
        prft = 0
        for i in range(1, len(nums)):
            if nums[i] > nums[i-1]:
                prft += nums[i] - nums[i-1]
        return prft