package lecture6_pattern2;

import java.util.Scanner;

public class MirrorImageNumberPattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();

		int i=1;
		while(i<=n){
			int j=1;
			while(j<=n-i){
				System.out.print(" ");
				j++;
			}
			int count=1;
			 j=1;
			while(j<=i){
				System.out.print(count);
				j++;
				count++;
			}
			System.out.println();
			i++;
		}

	}

}
