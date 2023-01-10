package q22864;

import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args) {

		int tiredness = 0;
		int task = 0;
	 
	 	Scanner sc = new Scanner(System.in);
	 	
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int M = sc.nextInt();
		
		for(int i = 0; i < 24; i++)
		{
			if ( M < tiredness + B) {
				tiredness -= C;
				if ( tiredness < 0)
				tiredness = 0;
				}
			else
				{tiredness += A;
				task += B;}
		}
		
		System.out.println(task);

		sc.close();
	}


}
