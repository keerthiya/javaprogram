import java.util.*;
import java.lang.*;
import java.io.*;
class oddeven
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number");
        n = s.nextInt();
        if(n % 2=0)
        {
            System.out.println("This number "+n+" is even");
        }
        else
        {
            System.out.println("The number "+n+" is odd");
        }
	}
}
