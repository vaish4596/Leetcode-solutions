class Solution(object):
    def longestCommonPrefix(self, strs):
        
        res = ""
        for i in range(len(strs[0])):
            for s in strs: #here it checks column wise means 1st letter of each words then 2nd letter of each word
                if i == len(s) or s[i] != strs[0][i]:
                    return res

            res += strs[0][i]
            

        return res

        