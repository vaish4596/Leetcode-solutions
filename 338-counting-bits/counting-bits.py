class Solution(object):
    def countBits(self, n):
        result = []
        for i in range(n + 1):
            binary = bin(i)[2:]      # binary representation
            result.append(binary.count('1'))  # count of 1s
        return result