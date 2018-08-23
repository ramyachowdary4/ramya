import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	   Scanner sc=new Scanner(System.in);
	    String s=sc.nextLine();
	    boolean b=true;
		try
		{
			Double num=Double.parseDouble(s);
		}
		    catch(NumberFormatException e)
		    {
		    	b=false;
		    }
		       if(b)
		       {
		       	System.out.println("yes");
		       }
		         else
		         {
		         	System.out.println("no");
		         }
	}
}
