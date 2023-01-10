package q5585;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int price = sc.nextInt();
		int change = 1000-price;
		int m500,m100,m50,m10,m5,m1;
		
		m500 = change/500;
		change -= 500*m500;
		
		m100 = change/100;
		change -= 100*m100;
		
		m50 = change/50;
		change -= 50*m50;
		
		m10 = change/10;
		change -= 10*m10;
		
		m5 = change/5;
		change -= 5*m5;
		
		m1 = change/1;
		change -= 1*m1;
		
		System.out.println(m500+m100+m50+m10+m5+m1);
	}

}
