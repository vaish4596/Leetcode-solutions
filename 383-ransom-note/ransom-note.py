class Solution:
    from collections import Counter
    def canConstruct(self, ransomNote: str, magazine: str) -> bool:
        at = Counter(ransomNote)
        bt = Counter(magazine)

        for i in at:
            if at[i] > bt[i]:
                return False
        return True
            