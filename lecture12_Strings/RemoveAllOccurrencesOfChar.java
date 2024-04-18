package lecture12_Strings;

public class RemoveAllOccurrencesOfChar {
	public static String removeAllOccurrencesOfChar(String str,char ch) {
		if(str.length()==0) {
			return str;
		}
		String ans="";
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)!=ch) {
				ans=ans+str.charAt(i);
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		String str="Hello world";
		System.out.println(removeAllOccurrencesOfChar(str, 'l'));

	}

}
