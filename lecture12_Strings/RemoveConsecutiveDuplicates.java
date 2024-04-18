package lecture12_Strings;

public class RemoveConsecutiveDuplicates {
	public static String removeConsecutiveDuplicates(String str) {
		if (str.length() == 0) {
			return str;
		}
		String ans = "";
		int n = str.length();
		int startIndex = 0;
		while (startIndex < n) {
			int nextIndex = startIndex + 1;
			char ch = str.charAt(startIndex);
			while (nextIndex < n && str.charAt(nextIndex) == ch) {
				nextIndex++;
			}
			ans = ans + ch;
			startIndex = nextIndex;
		}
		return ans;
	}

	public static void main(String[] args) {
		String s = "aaaabc";
		System.out.println(removeConsecutiveDuplicates(s));

	}

}
