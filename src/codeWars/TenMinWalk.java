package codeWars;

public class TenMinWalk {
  public static boolean isValid(char[] walk) {
    if (walk.length == 10) {
      String walkStr = new String(walk);
      return (walkStr.replaceAll("[n]", "").length() == walkStr.replaceAll("[s]", "").length()) &&
          walkStr.replaceAll("[e]", "").length() == walkStr.replaceAll("[w]", "").length();
    }
    return false;
  }
}