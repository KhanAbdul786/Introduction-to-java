package lecture12_Strings;

public class ReverseEachWordd {
	public static String reverseEachWordd(String str) {
		if(str.length()==0) {
			return str;
		}
		String ans="";
		String[] spl=str.split(" ");
		for(String s:spl) {
			String rev="";
			for (int i = 0; i < s.length(); i++) {
				rev=s.charAt(i)+rev;
			}
			ans=ans+rev+" ";
		}
		return ans;

//		char[] charArray = str.toCharArray();
//		int ptrA = 0, ptrB = 0, i = 0;
//		int len = charArray.length;
//		while (true) {
//			if (i == len || charArray[i] == ' ') {
//				ptrB = i - 1;
//				while (ptrA < ptrB) {
//					// Swap characters using a temporary variable
//					char temp = charArray[ptrA];
//					charArray[ptrA] = charArray[ptrB];
//					charArray[ptrB] = temp;
//					ptrA++;
//					ptrB--;
//				}
//				ptrA = i + 1;
//				ptrB = ptrA;
//			}
//			if (i == len) {
//				break;
//			}
//			i++;
//		}
//		return new String(charArray);
	}

	public static void main(String[] args) {
		String s = "hello world";
		System.out.println(reverseEachWordd(s));

	}

}
