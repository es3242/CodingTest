package q14720;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int shop = sc.nextInt();
		
		int[] iType = new int[shop];
		int nextType=0;
		int milk = 0;
		
		
		for(int i = 0; i<shop; i++) {
		iType[i] = sc.nextInt();
		}
		
		for(int i = 0; i<shop; i++) {
		if ((nextType%3) == iType[i])
			{nextType++;
			milk++;}
		
		
			}
		System.out.print(milk);
		
	}

}