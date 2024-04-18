package allPrograms;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IdentifyPanCard {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		
		Pattern pattern = Pattern.compile("[A-Z]{5}[0-9]{4}[A-Z]{1}");
		Matcher matcher = pattern.matcher(s);
		
		if(matcher.matches()) {
			System.out.println("given string is in pan format");
		}
		else {
			System.out.println("given string is  NOT in pan format");
		}
		

	}

}
