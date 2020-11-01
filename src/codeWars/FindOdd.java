package codeWars;

import java.util.HashSet;
import java.util.Set;

public class FindOdd {
  public static int findIt(int[] a) {
    Set<Integer> odds = new HashSet<Integer>();
    for (int i = 0; i < a.length; i++) {
      if (odds.contains(a[i])) {
        odds.remove(a[i]);
        continue;
      }
      odds.add(a[i]);
    }
    return odds.iterator().next();
  }
}
