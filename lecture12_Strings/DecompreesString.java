package lecture12_Strings;

public class DecompreesString {
	private static String repeatCharacters(String input) {
		
		StringBuilder result=new StringBuilder();
		for (int i = 0; i < input.length(); i++) {
			char currChar=input.charAt(i);
			if(Character.isLetter(currChar)) {
				int count =0;
				if(i+1< input.length() && Character.isDigit(input.charAt(i+1))) {
					count = Character.getNumericValue(input.charAt(i+1));
					i++;
				}
				for (int j = 0; j < count; j++) {
					result.append(currChar);
				}
			}
		}
		
		return result.toString();
	}
	
	public static String decode(String s) {
		int start=0;	
		int n=s.length();
		String ans="";
		while(start<n) {
			int next=start+1;
			char ch=s.charAt(start);
			int count=Character.getNumericValue(s.charAt(next));
			while(count>0) {
				ans=ans+ch;
				count--;
			}
			start=start+2;
		}
		return ans;
	}

	public static void main(String[] args) {
		String input="a4b3c4";
        System.out.println(repeatCharacters(input));

	}

	

}
