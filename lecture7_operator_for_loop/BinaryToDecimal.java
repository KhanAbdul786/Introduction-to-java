package lecture7_operator_for_loop;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int bin=0;
		int placeValue=1;
		while(n!=0){
			int rem=n%10;
			bin=placeValue*rem+bin;
			placeValue *=2;
			n=n/10;
		}
		System.out.println(bin);


	}

}
