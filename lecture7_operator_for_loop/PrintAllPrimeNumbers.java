package lecture7_operator_for_loop;

import java.util.Scanner;

public class PrintAllPrimeNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();

		for(int i=2;i<=n;i++){
			boolean isTrue=true;
			for(int j=2;j<i;j++){
				if(i%j==0){
					isTrue=false;
					break;
				}
			}
			if(isTrue){
				System.out.println(i);
			}
		}		

	}

}
