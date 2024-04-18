package lecture12_Strings;

public class ReverseWordWise {
	public static String reverse(String str) {
		String[] spl = str.split(" ");
		String ans="";
		for (String s : spl) {
			String rev = "";
			for (int i = 0; i < s.length(); i++) {
				rev=s.charAt(i)+rev;
			}
			ans=rev+" "+ans;
		}
		return ans;
		
		//coding ninja solutionnn
//		public static String reverseWordWise(String input) {
//			int end = input.length();
//			int i = input.length() - 1;
//			String output = "";
//			while (i >= 0) {
//			if (input.charAt(i) == ' ') {
//			output = output + input.substring(i + 1, end) + " ";
//			end = i;
//			}
//			i--;
//			}
//			output += input.substring(i + 1, end);
//			return output;
//			}
	}

	public static void main(String[] args) {
		String str="this is automation";
		System.out.println(reverse(str));

	}

}
