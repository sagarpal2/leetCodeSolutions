class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        d = []
        c = 0
        for i in range(len(s)):
            if not s[i] in d:
                d.append(s[i])
                if c<len(d):
                    c = len(d)
            else:
                index = d.index(s[i])
                d = d[index+1:]
                # print(d)
                d.append(s[i])
        return c