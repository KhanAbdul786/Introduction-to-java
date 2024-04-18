package lecture7_operator_for_loop;

import java.util.Scanner;

public class DecimalTObinary {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int bin=0;
		int placeValue=1;
		while(n!=0){
			int rem=n%2;
			bin=placeValue*rem+bin;
			placeValue *=10;
			n=n/2;
		}
		System.out.println(bin);


	}

}
