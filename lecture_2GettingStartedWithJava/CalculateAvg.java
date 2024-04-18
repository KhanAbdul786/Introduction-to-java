package lecture_2GettingStartedWithJava;

import java.util.Scanner;

public class CalculateAvg {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		String str=sc.next();
		char ch=str.charAt(0);

		int m1=sc.nextInt();
		int m2=sc.nextInt();
		int m3=sc.nextInt();

		int avg=(m1+m2+m3)/3;

		System.out.println(ch);
		System.out.println(avg);


	}

}
