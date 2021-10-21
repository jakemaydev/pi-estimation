## Gauss-Legendre Algorithm

https://en.wikipedia.org/wiki/Gauss–Legendre_algorithm

![Gauss-Legendre Algorithm](https://user-images.githubusercontent.com/92412968/138188057-d1ed57fd-2ff7-4cd6-af21-55f8675c1633.png)

This is a simple program that estimates pi based on the Gauss-Legendre algorithm outlined in the Wikipedia article above.

This program takes one integer as input for the desired number of iterations to run.

Planning to improve estimation accuracy by using BigDecimal objects rather than primitives.

Bugs encountered and fixed during development:
  - Bug: Integer division when calculating t = 1/4
    - Fix: Modify initial calculation to 1/4.0 to implicitly convert result to double
  - Bug: Incorrect bracketing of equations in result calculation
    - Fix: Modify bracketing to perform calculations as intended
