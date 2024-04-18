package lecture7_operator_for_loop;

import java.util.Scanner;

public class SumOrProduct {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int choice = sc.nextInt();

		int sum = 0;
		int product = 0;

		if (choice == 1) {
			for (int i = 1; i < n; i++) {
				sum += i;
			}

			System.out.println(sum);
		} else if (choice == 2) {
			for (int i = 1; i < n; i++) {
				product *= i;
			}

			System.out.println(product);
		} else {
			System.out.println(-1);
		}

	}

}
