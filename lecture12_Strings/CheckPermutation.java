package lecture12_Strings;

import java.util.Arrays;

public class CheckPermutation {
	public static boolean isPermutation(String str1, String str2) {
		if (str1.length() != str2.length()) {
			return false;
		}
//		char[] ch1=str1.toCharArray();
//		char[] ch2=str2.toCharArray();
//
//		Arrays.sort(ch1);
//		Arrays.sort(ch2);
//
//		for(int i=0;i<ch1.length;i++){
//			if(ch1[i]!=ch2[i]){
//				return false;
//			}
//		}
//		return true;

		int[] frequency=new int[256];
		
		for(int i=0;i<256;i++) {
			frequency[i]=0;
		}
		for(int i=0;i<str1.length();i++) {
			char ch=str1.charAt(i);
			++frequency[ch];
		}
		
		for(int i=0;i<str2.length();i++) {
			char ch=str2.charAt(i);
			--frequency[ch];
		}
		
		for(int i=0;i<256;i++) {
			if(frequency[i]!=0) {
				return false;
			}
			
		}
		return true;
	}

	public static void main(String[] args) {
		String str1="strings";
		String str2="srtigsnd";
		
		System.out.println(isPermutation(str1, str2));

	}

}
