package lecture_5Pattern1;

import java.util.Scanner;

public class ReverseNumberPattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		while(i<=n) {
			int j=1;
			int p=i;
			while(j<=i){
				System.out.print(p);
				j++;
				p--;
			}
			i++;
			System.out.println();
		}

	}

}
