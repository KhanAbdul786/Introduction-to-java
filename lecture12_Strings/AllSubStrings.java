package lecture12_Strings;

public class AllSubStrings {
	public static void subString(String str) {
		for(int start=0;start<str.length();start++) {
			for(int end=start;end<str.length();end++) {
				System.out.println(str.substring(start, end+1));
			}
		}
		for (int len = 1; len <= str.length(); len++) {
			for (int start = 0; start <= str.length() - len; start++) {
				int end = start+len-1; 
				System.out.println(str.substring(start, end + 1));
			}
		}
	}

	public static void main(String[] args) {
		String str = "pqrs";
		subString(str);
		System.out.println("======");
		System.out.println(str.substring(0, 1));

	}

}
