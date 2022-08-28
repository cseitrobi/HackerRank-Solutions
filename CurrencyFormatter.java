package JavaProblems;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CurrencyFormatter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        // Write your code here.
        int US=36;
        char us=(char) US ;
        int R=82;
        int s=115;
        int dot=46;
        char india1=(char) R;
        char india2=(char) s;
        char india3=(char) dot;
        int China=65509;
        int France=8364;
        char china=(char) China;
        char france=(char) France;
        DecimalFormat ii=new DecimalFormat("##,###.00");
        DecimalFormat iii=new DecimalFormat("## ###,.00");
      
        
        
        
        System.out.println("US: " + us+""+ii.format(payment));
        System.out.println("India: " + india1+""+india2+""+india3+""+ii.format(payment));
        System.out.println("China: " + china+""+ii.format(payment));
        System.out.println("France: "+payment+" " + iii.format(payment));
	}

}

/*int a=65509;
char c=(char) a;

char m='$';
int u=(int) m;
System.out.println(u);*/
