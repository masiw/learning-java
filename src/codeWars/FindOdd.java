package codeWars;

import java.util.Arrays;

public class FindOdd {
  public static int findIt(int[] a) {
    return Arrays.stream(a).reduce(0, (x, y) -> x ^ y);
  }
}
