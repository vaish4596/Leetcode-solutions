class Solution(object):
    def reverseBits(self, n):
        a = bin(n)[2:].zfill(32)
        rev = a[::-1]
        return int(rev,2)

        