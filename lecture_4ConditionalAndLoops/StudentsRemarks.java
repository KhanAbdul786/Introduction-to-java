package lecture_4ConditionalAndLoops;

import java.util.Scanner;

public class StudentsRemarks {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int marks=sc.nextInt();
		if(marks>=75 && marks<=100){
			System.out.println("Distinction");
		}
		else if(marks>=50 && marks<=75){
			System.out.println("Average");
		}
		else if(marks>=35 && marks<=50){
			System.out.println("Below Average");
		}
	}

}
