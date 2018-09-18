import java.util.*;
class Substring
{
	public static void main(String args[])
	{
      Scanner sc=new Scanner(System.in);
      System.out.println("enterr a string");
  	  String str=sc.nextLine();
  	  System.out.println("Substrings are");
      substr(str);
 	}
    public static void substr(String str)
    {
    for (int i = 0; i < str.length(); i++)
      {
        for (int j = i+1; j <= str.length(); j++)	
        {
			System.out.println(str.substring(i, j));
        }
        System.out.println();
    }
  }
}