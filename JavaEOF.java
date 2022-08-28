package JavaProblems;
import java.util.Scanner;

public class JavaEOF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String Line;
		int counter=1;
		while(sc.hasNext())
		{
			Line=sc.nextLine();
			System.out.print(counter+" "+Line);
			counter++;
			System.out.println();
			
		}
		sc.close();

	}

}
