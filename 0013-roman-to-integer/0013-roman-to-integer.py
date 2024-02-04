class Solution(object):
    def romanToInt(self, s):
        """
        :type s: str
        :rtype: int
        """
        dic={'I':1,'V':5,'X':10,'L':50,'C':100,'D':500,'M':1000}
        prior={'M':7,'D':6,'C':5,'L':4,'X':3,'V':2,'I':1}
        sum=0
        for i in range(len(s) - 1):
            if prior[s[i]] >= prior[s[i + 1]]:
                sum += dic[s[i]]
            else:
                sum -= dic[s[i]]
        sum += dic[s[len(s) - 1]]
        return sum