package lecture12_Strings;

public class ReverseEachWord {
	public static String reverse(String str) {
//		String[] spl = str.split(" ");
//		
//		String ans="";
//		for (String s1 : spl) {
//			String rev="";
//			for (int i = 0; i < s1.length(); i++) {
//				rev=s1.charAt(i)+rev;
//			}
//			ans=ans+rev+" ";
//		}
//		return ans;
		
		//solution ninjas
		String ans="";
		int currWordStart=0;
		int i;
		
		for(i=0;i<str.length();i++) {
			
			if(str.charAt(i)==' ') {
				int currEordEnd=i-1;
				String reverWord="";
				for(int j=currWordStart;j<=currEordEnd;j++) {
					reverWord=str.charAt(j)+reverWord;
				}
				ans=ans+reverWord+" ";
				currWordStart =i+1;
			}
		}
		int currEordEnd=i-1;
		String reverWord="";
		for(int j=currWordStart;j<=currEordEnd;j++) {
			reverWord=str.charAt(j)+reverWord;
		}
		ans=ans+reverWord;
		return ans;
	}

	public static void main(String[] args) {
		String str="abc def jkl";
		System.out.println(reverse(str));
	}

}
