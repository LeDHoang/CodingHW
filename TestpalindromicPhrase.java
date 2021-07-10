
/**
 * Write a description of TestpalindromicPhrase here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class TestpalindromicPhrase {
    public static void main(String args[])
  {
    String original= "";
    String reverse = "";
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the String");
    original = in.nextLine();
    String original2 = original.toLowerCase();
    original2 = original2.replaceAll(",", "");
    original2 = original2.replaceAll("-", "");
    original2 = original2.replaceAll("'", "");
    original2 = original2.replaceAll(" ", "");
    System.out.println(original2);
    int length = original2.length();
    for (int i = length - 1; i >= 0; i--)
      reverse = reverse + original2.charAt(i);

    if (original2.equals(reverse))
      System.out.println("The phrase " + original + " is a palindrome.");
    else
      System.out.println("The phrase " + original + " isn't a palindrome.");
  }

}
