package codeWars;

public class BitCounting {

  public static int countBits(int n){
    int count = 0;
    for (int i = 0; Math.pow(2, i) <= n; i++) {
      if (0 < (n & (int)Math.pow(2, i))) {
        count++;
      }
    }
    return count;
  }

}
