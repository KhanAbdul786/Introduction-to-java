package lecture7_operator_for_loop;

import java.util.Scanner;

public class NthFibonaci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int f1=1;
		int f2=1;
		int sum=0;
		for(int i=3;i<=n;i++) {
			sum=f1+f2;
			f1=f2;
			f2=sum;
		}
		System.out.println(sum);

	}

}
