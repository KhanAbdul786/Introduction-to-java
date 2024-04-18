package lecture7_operator_for_loop;

import java.util.Scanner;

public class TermOfAP {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int current=1;
		
		int count=1;
		while(count<=n) {
			int out=(3*current)+2;
			
			if(out%4!=0) {
				System.out.print(out+" ");
				count++;
			}
			current++;
		}
	}

}
