package lecture6_pattern2;

import java.util.Scanner;

public class Parallelogram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();

		int i=1;
		while(i<=n){
			int spac=1;
			while(spac<=i-1){
				System.out.print(" ");
				spac++;
			}
			int star=1;
			while(star<=n){
				System.out.print("*");
				star++;
			}
			System.out.println();
			i++;
		}


	}

}
