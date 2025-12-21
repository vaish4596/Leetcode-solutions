class Solution(object):
    def singleNumber(self, nums):
        res = []
        for i in nums:
            if nums.count(i) == 1:
                res.append(i)
        return res


#or


class Solution(object):
    def singleNumber(self, nums):
        res = 0
        for num in nums:
            res ^= num
        return res

#method
res = 0
res ^= 4 → 4
res ^= 1 → 5
res ^= 2 → 7
res ^= 1 → 6
res ^= 2 → 4
