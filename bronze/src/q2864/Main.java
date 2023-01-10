package q2864;

import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();

		int[] checkA = Stream.of(String.valueOf(A).split("")).mapToInt(Integer::parseInt).toArray();
		int[] checkB = Stream.of(String.valueOf(B).split("")).mapToInt(Integer::parseInt).toArray();
		int[] aMax = Stream.of(String.valueOf(A).split("")).mapToInt(Integer::parseInt).toArray();
		int[] bMax = Stream.of(String.valueOf(B).split("")).mapToInt(Integer::parseInt).toArray();
		int[] aMin = Stream.of(String.valueOf(A).split("")).mapToInt(Integer::parseInt).toArray();
		int[] bMin = Stream.of(String.valueOf(B).split("")).mapToInt(Integer::parseInt).toArray();

		
		for(int i = 0; i <7; i++) {
			if (checkA[i] == 5)
				aMax[i] = 6;
			if (checkA[i] == 6)
				aMin[i] = 5;
		}
		for(int i = 0; i <7; i++) {
			checkB[i] = B % (10^(i+1));
			if (checkB[i] == 5)
				bMax[i] = 6;
			if (checkB[i] == 6)
				bMin[i] = 5;
		}
		
		int am = 0;
		for(int i: aMax) { am *= 10; am += i; }
		int bm = 0;
		for(int i: aMax) { am *= 10; am += i; }
		
		int aM = 0;
		for(int i: aMax) { am *= 10; am += i; }
		int bM = 0;
		for(int i: aMax) { am *= 10; am += i; }
        
		int Min = am +bm;
		int Max = aM+bM;
		System.out.print(Min+" "+Max);
	}


}
