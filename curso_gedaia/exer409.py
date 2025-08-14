class Solution(object):
    def longestPalindrome(self, s):
        """
        :type s: str
        :rtype: int
        """
        table = {}
        for c in s:
            if c not in table:
                table[c] = 1
            else:
                table[c] += 1

        values = list(table.values())

        values.sort(reverse = True)

        size = 0
        flag = False

        for i in values:
            if i % 2 == 0:
                size = size + i
            else:
                size = size + i - 1
                flag = True

        if flag:
            size += 1

        return size





