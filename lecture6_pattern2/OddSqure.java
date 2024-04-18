package lecture6_pattern2;

import java.util.Scanner;

public class OddSqure {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		
		int curRow=1;
		while(curRow<=n) {
			int col=1;
			int valueToPrint=(2*curRow)-1;
			while(col<=n) {
				System.out.print(valueToPrint);
				col++;
				valueToPrint +=2;
				if(valueToPrint>(2*n)-1) {
					valueToPrint=1;
				}
			}
			curRow++;
			System.out.println();
			
		}

	}

}
