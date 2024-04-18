package test2;

public class MinLengthWord {
	public static String minLengthWord(String input) {
		//solution by ninjas
		
//		int minStart = -1;
//		int minLength = Integer.MAX_VALUE;
//		int currentStart = 0;
//		int i = 0;
//		for (; i < input.length(); i++) {
//			if (input.charAt(i) == ' ') {
//				int currentWordLength = i - currentStart;
//				if (currentWordLength < minLength) {
//					minStart = currentStart;
//					minLength = currentWordLength;
//				}
//				currentStart = i + 1;
//			}
//		}
//		if (minStart == -1) {
//			return input;
//		} else {
//			int currentWordLength = i - currentStart;
//			if (currentWordLength < minLength) {
//				minStart = currentStart;
//				minLength = currentWordLength;
//			}
//			return input.substring(minStart, minStart + minLength);
//		}
		
		if(input.length()==0){
			return input;
		}
		String str1="";
		int x=Integer.MAX_VALUE;
		String[] str=input.split(" ");
		for (String len : str) {
			if(len.length()<x){
				x=len.length();
				str1=len;
			}
		}
		return str1;

	}

	public static void main(String[] args) {
		String s="Minimum length word";
		System.out.println(minLengthWord(s));

	}

}
