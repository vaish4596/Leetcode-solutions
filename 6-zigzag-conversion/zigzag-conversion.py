class Solution(object):
    def convert(self, s, numRows):
        if numRows == 1 or numRows >= len(s):
            return s

        # Create a list to store strings for each row
        rows = [''] * numRows
        current_row = 0
        going_down = False

        # Traverse the characters in the string
        for char in s:
            rows[current_row] += char
            # Change direction at top or bottom row
            if current_row == 0 or current_row == numRows - 1:
                going_down = not going_down
            current_row += 1 if going_down else -1

        # Concatenate all rows to get the final result
        return ''.join(rows)

# Test examples
sol = Solution()
print(sol.convert("PAYPALISHIRING", 3))  # Output: "PAHNAPLSIIGYIR"
print(sol.convert("PAYPALISHIRING", 4))  # Output: "PINALSIGYAHRPI"
print(sol.convert("A", 1))               # Output: "A"
