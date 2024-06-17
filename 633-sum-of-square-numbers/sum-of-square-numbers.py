class Solution(object):
    def judgeSquareSum(self, c):
        """
        :type c: int
        :rtype: bool
        """
        left, right = 0, int(c**0.5)
        while(left<=right):
            total = (left*left) + (right*right)
            if(c == total):
                return True
            elif(c > total):
                left+=1
            else:
                right-=1
        return False
        