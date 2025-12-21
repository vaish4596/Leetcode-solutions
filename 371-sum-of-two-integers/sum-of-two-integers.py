class Solution(object):
    def getSum(self, a, b):
        list=[a,b]
        return sum(list)

#or
class Solution(object):
    def getSum(self, a, b):
        while b != 0:
            x = a ^ b          # sum without carry
            y = (a & b) << 1   # carry
            a = x
            b = y
        return a
