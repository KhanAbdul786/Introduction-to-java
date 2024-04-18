package test1;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		
		
//		int gcd=1;
//		
//		int bigNum=Math.max(num1, gcd);
//		
//		for(int i=2;i<=bigNum;i++) {
//			if(num1%i==0 && num2%i==0) {
//				gcd=i;
//			}
//		}
//		System.out.println(gcd);
		
		Scanner sr = new Scanner(System.in);
		int t = sr.nextInt();
		while (t > 0) {
			int Temp, GCD;
			int Num1 = sr.nextInt();
			int Num2 = sr.nextInt();
			while (Num2 != 0) {
				Temp = Num2;
				Num2 = Num1 % Num2;
				Num1 = Temp;
			}
			GCD = Num1;
			System.out.println(GCD);
			t--;
		}

	}

}
