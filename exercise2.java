
/**
 * Write a description of exercise2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import edu.duke.*;
import java.util.Scanner;
public class exercise2 {
public static void main(String[] args) 
   {
        Scanner check = new Scanner(System.in);
        System.out.print("What is the first number: ");
        double Num1 = check.nextDouble();
        System.out.print("What is the second number: ");
        double Num2 = check.nextDouble();
       System.out.print("What is the third number:");
        double Num3 = check.nextDouble();
        if (Num1 < Num2 && Num2 < Num3)
        {
            System.out.println("Numbers are in Increasing order");
        }
        else if (Num1 > Num2 && Num2 > Num3)
        {
            System.out.println("Numbers are in Decreasing order");
        }
        else
        {
            System.out.println("Neither increasing or decreasing order");
        }
    }
}
