package lecture12_Strings;

public class CompressedString {
	public static String getCompressedString(String str) {
		if(str.length()==0) {
			return str;
		}
		String ans=str.charAt(0)+"";
		int count=1;
		for(int i=1;i<str.length();i++) {
			char curr=str.charAt(i);
			char prev=str.charAt(i-1);
			
			
			if(curr==prev) {
				count++;
			}
			else {
				if(count>1) {
					ans=ans+count;
					count=1;
				}
				ans=ans+curr;
			}
		}
		if(count>1) {
			ans=ans+count;
			count=1;
		}
		return ans;
	}

	public static void main(String[] args) {
		String s="aaabbcc";
		System.out.println(getCompressedString(s));

	}

}
