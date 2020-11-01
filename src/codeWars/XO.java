package codeWars;

public class XO {
  
  public static boolean getXO (String str) {
    int count = 0;
    for (int i = 0; i < str.length(); i++) {
      char current = str.charAt(i);
      if (current == 'x' || current == 'X') {
        count += 1;
      }
      else if (current == 'o' || current == 'O') {
        count -= 1;
      }
    }
    return count == 0;
    
  }
}
