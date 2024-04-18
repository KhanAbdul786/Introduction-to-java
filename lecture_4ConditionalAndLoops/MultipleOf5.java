package lecture_4ConditionalAndLoops;

import java.util.Scanner;

public class MultipleOf5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();

		if(n%5==0){
			System.out.println(" Multiple of 5");
		}
		else{
			System.out.println("Not a Multiple of 5");
		}

	}

}
