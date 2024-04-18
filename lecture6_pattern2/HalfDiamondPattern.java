package lecture6_pattern2;

import java.util.Scanner;

public class HalfDiamondPattern {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
			int n = s.nextInt();
			System.out.println("*");
			// First half
			int currRow = 1;
			while (currRow <= n) {
				System.out.print("*");
				int currCol = 1;
				while (currCol <= currRow) {
					System.out.print(currCol);
					currCol += 1;
				}
				currCol = currCol - 2;
				while (currCol >= 1) {
					System.out.print(currCol);
					currCol -= 1;
				}
				System.out.println("*");
				currRow += 1;
			}
			// Second Half
			currRow = 1;
			while (currRow <= n - 1) {
				System.out.print("*");
				int currCol = 1;
				while (currCol <= n - currRow) {
					System.out.print(currCol);
					currCol += 1;
				}
				currCol = currCol - 2;
				while (currCol >= 1) {
					System.out.print(currCol);
					currCol -= 1;
				}
				System.out.println("*");
				currRow += 1;
			}
			System.out.print("*");
		}
	}