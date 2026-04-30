class Solution(object):
    def reverse(self, x):
        
        if x<0:
            s = str(abs(x))
            res = -int(s[::-1]) 
        else:
            s = str(x)
            res = int(s[::-1])

        if res < -2**31 or res > 2**31-1:
            return 0
        return res
    
        