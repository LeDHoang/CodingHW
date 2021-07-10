
/**
 * Write a description of exercise here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import edu.duke.*;
import java.util.Scanner;
public class exercise {
public static void main(String[] args) 
    {
        int Num;
        Scanner check = new Scanner(System.in);
        System.out.print("What is the number you want to check:");
        Num = check.nextInt();
        check.close();
        if(Num > 0)
        {
            System.out.println(Num +" is a positive interger");
        }
        else if(Num < 0)
        {
            System.out.println(Num +" is a negative interger");
        }
        else
        {
            System.out.println(Num +" is equal to 0");
        }
    }
}
