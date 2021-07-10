
/**
 * Write a description of ReverseString here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class ReverseString {
 public static void main(String[] args)
 {
 System.out.println("Enter a String: ");
 
 Scanner read = new Scanner(System.in);
 String str = read.nextLine();
 
 StringBuilder sb = new StringBuilder();
 
 for(int i = str.length() - 1; i >= 0; i--)
 {
 sb.append(str.charAt(i));
 }
 
 System.out.println("The reverse of the String \""  + str + "\" is \"" + sb.toString()+ "\"");
 }
}
