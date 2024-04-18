package lecture6_pattern2;

import java.util.Scanner;

public class DiamondOfStars {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
			int n = s.nextInt();
			
			int firstHal=(n+1)/2;
			int secondFalf=n/2;
			
			int currRow=1;
			while(currRow<=firstHal) {
				int space=1;
				while(space<=firstHal-currRow) {
					System.out.print(" ");
					space++;
				}
				int star=1;
				while(star<=(2*currRow)-1) {
					System.out.print("*");
					star++;
				}
				System.out.println();
				currRow++;
			}
			//second half
			currRow=secondFalf;
			while(currRow>=1) {
				int space=1;
				while(space<=secondFalf-currRow+1) {
					System.out.print(" ");
					space++;
				}
				int j=1;
				while(j<=(2*currRow)-1) {
					System.out.print("*");
					j++;
				}
				System.out.println();
				currRow--;
			}

		}
	}