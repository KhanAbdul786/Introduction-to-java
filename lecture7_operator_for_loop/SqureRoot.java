package lecture7_operator_for_loop;

import java.util.Scanner;

public class SqureRoot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		while(i*i<=n) {
			i++;
		}
		System.out.println(i-1);
	}

}
