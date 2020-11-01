package codeWars;

public class MultiplesOf3Or5 {
  private int sum(int n) {
    return n*(n+1)/2;
  }
  public int solution(int number) {
    if (number > 0) {
      int max3 = (int)Math.floor((number-1)/3);
      int max5 = (int)Math.floor((number-1)/5);
      int max15 = (int)Math.floor((number-1)/15);
      return 3*sum(max3) + 5*sum(max5) - 15*sum(max15);
    }
    return 0;
  }
}
