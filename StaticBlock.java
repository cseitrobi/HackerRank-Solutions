package JavaProblems;
import java.util.*;
import java.io.*;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StaticBlock
{
	static int B,H;
	static boolean flag=true;
	static
	{
		Scanner sc=new Scanner(System.in);
		B=sc.nextInt();
		sc.nextLine();
		H=sc.nextInt();
		
			try
			{
				if (B<0||H<0)
				{
					flag=false;
					throw new Exception("Breadth and height must be positive");
					
				}
				
			}
			catch(Exception e)
			{
				System.out.println(e);
				System.exit(0);
				
			}
			
		}
		
	
	
	
	public static void main(String[] args)
	{
		if (flag)
			{ 
			int area=B*H;
			System.out.println(area);
	}
	}
	


}