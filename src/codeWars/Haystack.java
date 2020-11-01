package codeWars;

import java.util.Arrays;

public class Haystack {
  public static String findNeedle(Object[] haystack) {
    return String.format("found the needle at position %s", Arrays.asList(haystack).indexOf("needle"));
  }
}
