package lecture_5Pattern1;

import java.util.Scanner;

public class AlphabeticPattern {

	public static void main(String[] args) {
		/*
		 * Scanner sc=new Scanner(System.in); int n=sc.nextInt();
		 * 
		 * int i=1; while(i<=n){ int j=1; while(j<=i){
		 * System.out.print((char)('A'+j-1)+" "); j++; } i++; System.out.println(); }
		 */

		Scanner st = new Scanner(System.in);
		int n = st.nextInt();
		int row = 1;
		while (row <= n) {
			char ch = 'A';
			int col = 1;
			while (col <= row) {
				System.out.print(ch + " ");
				col++;
				ch++;
			}
			System.out.println();
			row++;
		}

	}

}
