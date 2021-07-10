
/**
 * Write a description of exercise5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class IncomeTaxCalculator {
	public static void main(String args[])
	{
	double t=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the taxable income ");
	double i=sc.nextDouble();
	t=incomeTax(i);
	System.out.println("The income tax payable is "+t);
	}
	static double incomeTax(double i)
	{
	double tax;	
	if(i<=20000)
		tax=0;
	else if(i<=40000)
		tax=0.1*(i-20000);
	else if(i<=60000)
		tax=(0.2*(i-40000))+2000;
	else
		tax=(0.3*(i-60000))+2000+ 4000;
	return tax;
 
}

}
