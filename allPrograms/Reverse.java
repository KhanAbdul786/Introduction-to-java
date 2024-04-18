package allPrograms;

public class Reverse {
	public static String reverse(String s) {
		String ans="",word="";
		for (int i = 0; i < s.length(); i++) {
			if(word=="" && s.charAt(i)==' ') {
				continue;
			}
			else if(word!=""&&s.charAt(i)==' ') {
				ans=word+" "+ans;
				word="";
			}
			else if (s.charAt(i)!=' ') {
				word=s.charAt(i)+word;
			}
		}
		if(word!="") {
			ans=word+" "+ans;
		}
		return ans;
	}

	public static void main(String[] args) {
		String s="vcb   abdul khan";
		System.out.println(reverse(s));

	}

}
