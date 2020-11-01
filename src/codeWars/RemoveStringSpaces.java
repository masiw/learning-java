package codeWars;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RemoveStringSpaces {
  public static String noSpace(final String input) {
    Pattern pattern = Pattern.compile(" +");
    Matcher matcher = pattern.matcher(input);
    return matcher.replaceAll("");
  }
}
