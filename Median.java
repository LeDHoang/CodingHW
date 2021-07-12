
/**
 * Write a description of Median here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class Median {
    public static void main(String args[]) 
    { 
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number"); 
	int a=sc.nextInt();
	int[] input=new int[a];
	System.out.println("enter "+a+" elements");
	for(int i=0;i<a;i++) 
	{
		input[i]=sc.nextInt();
		
	}
	double res=medianCal(a,input);
	 System.out.println("Median :"+res);  
        int res2 = mostFrequent(a,input);
        System.out.println("Most Common :" + res2);
    }
static double medianCal(int  n,int in[])
{
	double m=0;	
	
	if(n%2==1)
	{
		m=in[((n+1)/2)-1];
		
	}
	else
	{
		m=(in[n/2-1]+in[n/2])/2;
		
	}
return m;
	
 }
 static int mostFrequent(int n, int arr[])
    {
         
        Arrays.sort(arr);
         
        
        int max_count = 1, res = arr[0];
        int curr_count = 1;
         
        for (int i = 1; i < n; i++)
        {
            if (arr[i] == arr[i - 1])
                curr_count++;
            else
            {
                if (curr_count > max_count)
                {
                    max_count = curr_count;
                    res = arr[i - 1];
                }
                curr_count = 1;
            }
        }
     
        
        if (curr_count > max_count)
        {
            max_count = curr_count;
            res = arr[n - 1];
        }
     
        return res;
}}

