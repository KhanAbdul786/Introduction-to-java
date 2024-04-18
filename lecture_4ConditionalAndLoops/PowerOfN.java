package lecture_4ConditionalAndLoops;

import java.util.Scanner;

public class PowerOfN {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	        int x=sc.nextInt();
	        int n=sc.nextInt();

	        int i=1;
	        int pow=1;
	        while(i<=n){
	            pow =pow*x;
	            i++;
	        }
	        System.out.println(pow);

	}

}
