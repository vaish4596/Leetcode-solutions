class Solution:
    def reverseWords(self, s):
        # Split by whitespace and remove extra spaces
        words = s.split()
        # Reverse and join
        return " ".join(reversed(words))