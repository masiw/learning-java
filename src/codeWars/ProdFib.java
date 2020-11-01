package codeWars;

public class ProdFib {
  public static long[] productFib(long prod) {
    long fib1 = 0;
    long fib2 = 1;
    while (fib1*fib2<prod) {
      long fib3 = fib1 + fib2;
      fib1 = fib2;
      fib2 = fib3;
    }
    if (fib1*fib2==prod) {
      return new long[]{fib1, fib2, 1};
    }
    return new long[]{fib1, fib2, 0};
  }
}
