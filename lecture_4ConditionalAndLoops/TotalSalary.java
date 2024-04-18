package lecture_4ConditionalAndLoops;

import java.util.Scanner;

public class TotalSalary {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	        int basic =sc.nextInt();

	        String str=sc.next();
	        char ch=str.charAt(0);

	        int allow=0;

	        if(ch=='A'){
	            allow=1700;
	        }
	        else if(ch=='B'){
	            allow=1500;
	        }
	        else {
	            allow=1300;
	        }

	        double total=basic+(.20*basic)+(.50*basic)+allow-(.11*basic);
	       long t= Math.round(total);
	       System.out.println(t);

	}

}
