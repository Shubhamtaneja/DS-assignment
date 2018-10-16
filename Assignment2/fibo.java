import java.util.*;
public class fibo
{ 
	public static void main(String args[]) 
	{
	    System.out.println("enter no");
	    Scanner sc=new Scanner(System.in);
		int number = sc.nextInt();
		System.out.println("fibonacci series upto " + number);
		System.out.print(0+" ");
		for(int i=1; i<=number; i++)
		{ 
			System.out.print(fibonacci(i)+" "); 
		} 
	} 
	public static int fibonacci(int number)
	{ 
		if(number == 1 || number == 2)
		{ 
			return 1; 
		} 
		return fibonacci(number-1) + fibonacci(number -2);
	}
}