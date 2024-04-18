package lecture_4ConditionalAndLoops;

import java.util.Scanner;

public class SumOfEvenOdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();

		int sumEven=0,sumOdd=0;
		while(n!=0){
			int rem=n%10;
			if(rem%2==0){
				sumEven +=rem;
			}
			else{
				sumOdd +=rem;
			}

			n=n/10;
		}
		System.out.println(sumEven+" "+sumOdd);

	}

}
