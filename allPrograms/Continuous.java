package allPrograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Continuous {
	public static void continuous(String s) {
		int count=0;
		
		Pattern pattern = Pattern.compile("ttt");
		Matcher matcher = pattern.matcher(s);
		while(matcher.find()) {
			count++;
		}
		System.out.println(count+" ");
	}

	public static void main(String[] args) {
		String s="assswatttsettsdttt";
		continuous(s);

	}

}
