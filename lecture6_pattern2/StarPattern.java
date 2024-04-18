package lecture6_pattern2;

import java.util.Scanner;

public class StarPattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		 int i=1;
		 while(i<=n){
			 int space=1;
			 while(space<=n-i){
				 System.out.print(" ");
				 space++;
			 }
			 int star=1;
			 while(star<=i){
				 System.out.print("*");
				 star++;
			 }
			 int dec=i-1;
			 while(dec>=1){
				 System.out.print("*");
				 dec--;
			 }
			 System.out.println();
			 i++;
		 }


	}

}
