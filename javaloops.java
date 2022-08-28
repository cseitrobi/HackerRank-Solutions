package JavaProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class javaloops {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine());
		  
	        for (int i=1;i<=10;i++)
	        {
	            int Fin=i*N;
	            System.out.println(N+" x "+i+" = "+Fin);
	        }

	        bufferedReader.close();
		

	}

}
