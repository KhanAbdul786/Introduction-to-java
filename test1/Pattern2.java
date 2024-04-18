package test1;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		int t = sr.nextInt();
		while (t > 0) {
			int n = sr.nextInt();
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (j >= i) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			t -= 1;
		}

	}

}
