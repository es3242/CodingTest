package q23663;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] winner = new int[T];

		int n, m;
		
		for(int i = 0; i<T; i++)
		{

			n = sc.nextInt();
			m = sc.nextInt();
			int[] Red = new int[n-1];
			int[] White = new int[m-1];

			int red = sc.nextInt();
			for(int j = 0; j< n-1; j++) {
				Red[j] = sc.nextInt();
				if (red>Red[j])
				red = Red[j];
			}
			int white = sc.nextInt();
			for(int j = 0; j< m-1; j++) {
				White[j] = sc.nextInt();
				if (white<White[j])
					white = White[j];
				}
			if (red>=white)
			winner[i] = 1;
			else
			winner[i] = 0;
		}
		
		for(int i =0; i<T; i++) {
			if (winner[i] == 1)
				System.out.println("Yes");
			else
				System.out.println("No");
		}
		
		sc.close();

	}

}
