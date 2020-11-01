package codeWars;

public class TwoSum {
  public static int[] solution(int[] numbers, int target) {
    for (int i = 0; i < numbers.length; i++) {
      int first = numbers[i];
      for (int j = i + 1; j < numbers.length; j++) {
        int second = numbers[j];
        if (first + second == target) {
          return new int[]{i, j};
        }
      }
    }
    return null;
  }
}
