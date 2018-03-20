class Solution:
    def mypow(self, x, n):
        """
        :type x: float
        :type n: int
        :rtype: float
        """
        # handle 1 and -1
        if x == 1:
            return 1
        elif x == -1:
            if n > 0:
                if n % 2 == 0:
                    return 1
                else:
                    return -1
            else:
                n = -n
                if n % 2 == 0:
                    return 1
                else:
                    return -1

        if n >= 0:
            if n == 0:
                return 1
            if n == 1:
                return x
            # x^n = x ^ (n/2) * 2 = (x * x) ^ n/2
            if n % 2 == 0:
                return self.mypow(x * x, n / 2)
            else:
                return x * self.mypow(x * x, (n-1) / 2)
        else:
            if n == -1:
                return 1 / x
            n = -n
            if n % 2 == 0:
                return self.mypow(1 / x * 1 / x, n / 2)
            else:
                return 1 / x * self.mypow(1 / x * 1 / x, (n-1) / 2)
    if __name__ == '__main__':
        print(mypow(0.44528, 0))