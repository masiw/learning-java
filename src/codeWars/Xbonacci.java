package codeWars;

import java.util.Arrays;

public class Xbonacci {

  public double[] tribonacci(double[] s, int n) {
    double[] result = Arrays.copyOf(s, n);
    for (int i = 3; i < n; i++) {
      result[i] = result[i-3] + result[i-2] + result[i-1];
    }
    return result;
  }
}