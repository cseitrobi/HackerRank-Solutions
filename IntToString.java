package JavaProblems;
import java.util.*;

public class IntToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//int n=sc.nextInt();
		//String s=String.valueOf(n);
		//System.out.println(s);
		String ss="1"+"2";
		System.out.println(ss);
		
		Calendar c= Calendar.getInstance();
		System.out.println(c.getTimeZone());
		System.out.println(c.getTimeInMillis());
		System.out.println(c.getTime());
		System.out.println(c.getCalendarType());
		//System.out.println(c.setTime());
		System.out.println(c.getTimeZone().getID());
		System.out.println(c.DAY_OF_MONTH);
		
		String[] colors= {"Cricket","Badminton","Apple"};
		System.out.println(Arrays.toString(colors));
		Arrays.sort(colors);
		
		System.out.println(Arrays.toString(colors));
		
	
		

	}

}
