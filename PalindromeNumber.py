class Solution(object):
    def isPalindrome(self, x):
        """
        :type x: int
        :rtype: bool
        """

        if x < 0:
            return False



        x = abs(x)
        lst = [int(i) for i in str(x)]

        if len(lst) == 1:
            return True


        for x in range(0, len(lst)/2 ):
            print(lst[x])

            if lst[x] != lst[ len(lst)-x-1] :
                return False

        return True
