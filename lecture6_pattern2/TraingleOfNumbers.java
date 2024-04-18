package lecture6_pattern2;

import java.util.Scanner;

public class TraingleOfNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();

		int i=1;
		while(i<=n){
			int spac=1;
			while(spac<=n-i){
				System.out.print(" ");
				spac++;
			}
			int num=i;
			int j=1;
			while(j<=i){
				System.out.print(num);
				num++;
				j++;
			}
			int dec=num-2;
			 j=1;
			while(j<=i-1){
				System.out.print(dec);
				dec--;
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
