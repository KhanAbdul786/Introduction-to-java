package lecture_4ConditionalAndLoops;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		while(i<=10){
			int mul=i*n;
			System.out.println(mul);
			i++;
		}

	}

}
