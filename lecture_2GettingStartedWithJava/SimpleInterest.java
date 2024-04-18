package lecture_2GettingStartedWithJava;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int p=sc.nextInt();
		double d=sc.nextDouble();
		int t=sc.nextInt();
		
		int si=(int)(p*d*t)/100;
		System.out.println(si);

	}

}
