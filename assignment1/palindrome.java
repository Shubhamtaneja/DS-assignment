import java.util.Scanner;
class Palindrome
{
	public static String Reverse(String str)
		{
			int i=0;
			int j=str.length()-1;
			while(j>i)
			{
				if(str.charAt(i)!=str.charAt(j))
				{
					
					return "false";
					
				}
				i++;
				j--;
			}
		return "true";
	}
	
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string");
	String str=sc.nextLine();
	String res=Reverse(str);
	System.out.println(res);
    }

}