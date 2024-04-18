package lecture6_pattern2;

import java.util.Scanner;

public class SumPattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();

		int i=1;
		while(i<=n){
			int sum=0;
			int col=1;
			while(col<=i){
				System.out.print(col);
				sum +=col;
				if(col<i){
					System.out.print("+");
				}
				col++;
				
			}
			System.out.print("="+sum);
			System.out.println();
			i++;
		}
	}
}