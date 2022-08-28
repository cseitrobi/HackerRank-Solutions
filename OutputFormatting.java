package JavaProblems;
import java.util.Scanner;
import java.lang.Math;

public class OutputFormatting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
        	//System.out.println("Enter String");
            String s1=sc.next();
            //System.out.println("Enter Integer Value");
            int x=sc.nextInt();
            String s2=String.valueOf(x);

            //Complete this line
            while (s1.length()<15)
            {
            	s1=s1+" ";
            }
            System.out.print(s1);
            while (s2.length()<3)
            {
            	s2="0"+s2;
            	
            }
            System.out.print(s2);
            System.out.println();
            
        }
        
        System.out.println("================================");

		

		

		   
		            
		   
	




		

	}

}
