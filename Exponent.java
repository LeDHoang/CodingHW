
/**
 * Write a description of Exponent here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Exponent {
public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the base: ");
    int base =sc.nextInt();
    System.out.println("Enter the exponent number :");
    int exp = sc.nextInt();
    System.out.println(base + " raises to the power of " + exp + " is: " + exponent(base,exp));
    }
    public static int exponent(int base, int exp){
    if (exp != 0){
        return (base * exponent(base,exp - 1));
    }
    else{
        return 1;
    }
}
}
