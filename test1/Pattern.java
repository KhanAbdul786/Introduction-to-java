package test1;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		while(i<=n){
			int j=1;
			int p=n;
			while(j<=n){

				if(p==i){
					System.out.print("*");
				}
				else{
					System.out.print(p);
				}
				
				j++;
				p--;
			}
			System.out.println();
			i++;
		}

	}

}
