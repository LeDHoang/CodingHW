
/**
 * Write a description of palindromicWord here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class palindromicWord {
    public static void main(String args[])
  {
    String original= "";
    String reverse = "";
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the String");
    original = in.nextLine();
    int length = original.length();
    for (int i = length - 1; i >= 0; i--)
      reverse = reverse + original.charAt(i);

    if (original.equals(reverse))
      System.out.println("The string " + original + " is a palindrome.");
    else
      System.out.println("The string " + original + " isn't a palindrome.");
  }
}
