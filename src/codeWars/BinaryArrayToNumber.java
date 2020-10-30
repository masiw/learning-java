package codeWars;

import java.util.List;

public class BinaryArrayToNumber {
  public static int ConvertBinaryArrayToInt(List<Integer> binary) {
    int value = 0;
    for (int i = 0; i < binary.size(); i++) {
      value += Math.pow(2, i) * binary.get(binary.size() - i - 1);
    }
    return value;
  }
}
