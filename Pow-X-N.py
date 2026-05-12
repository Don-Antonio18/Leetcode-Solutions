# Implement pow(x, n), which calculates x raised to the power n (i.e., x^n).

class Solution:
    def myPow(self, x: float, n: int) -> float:

        if n == 0:
            return 1
        elif n == 1:
            return x
        else:
            return x**n
