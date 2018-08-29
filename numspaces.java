import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int count=0,i;
		String c=sc.nextLine();
		for(i=0;i<c.length();i++)
		{
			if(c.charAt(i)==' ')
			{
				count++;
			}
		}
		    System.out.print(count);
	}
}
