package codeWars;

public class XO {
  
  public static boolean getXO (String str) {
    return str.replaceAll("[oO]", "").length() == str.replaceAll("[xX]", "").length();
  }
}
