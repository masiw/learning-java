package codeWars;

public class Xbonacci {

  public double[] tribonacci(double[] s, int n) {
    double[] result = new double[n];
    for (int i = 0; i < n; i++) {
      if (i < 3) {
        result[i] = s[i];
        continue;
      }
      result[i] = result[i-3] + result[i-2] + result[i-1];
    }
    return result;
  }
}