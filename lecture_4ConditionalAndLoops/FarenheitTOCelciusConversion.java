package lecture_4ConditionalAndLoops;

import java.util.Scanner;

public class FarenheitTOCelciusConversion {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int S=sc.nextInt();

		int E=sc.nextInt();

		int W=sc.nextInt();

		while(S<=E){
			int con=(S-32)*5/9;
			System.out.println(S+" "+con);

			S=S+W;
		}

	}

}
