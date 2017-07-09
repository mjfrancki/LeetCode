class Solution(object):
    def reverse(self, x):
        """
        :type x: int
        :rtype: int
        """



        neg = False
        if x < 0:
            neg = True

        x = abs(x)

        x = list(str(x))

        x.reverse()

        x = int("".join(map(str, x)))

        if neg:
            x = x*-1

        if abs(x) > 2147483648:
            return 0

        return x
