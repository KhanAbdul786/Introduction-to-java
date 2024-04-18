package allPrograms;

public class Anagram {
	public static void anagram(String a,String b) {
		int[] arr=new int[256];
		boolean ana=true;
		for (int i = 0; i < arr.length; i++) {
			arr[i]=0;
		}
		for (int i = 0; i < a.length(); i++) {
			char ch=a.charAt(i);
			arr[ch]++;
		}
		for (int i = 0; i < b.length(); i++) {
			char ch=b.charAt(i);
			arr[ch]--;
		}
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>0) {
				ana=false;
			}
			
		}
		if(ana) {
			System.out.println("anagaram");
		}
		else {
			System.out.println("not");
		}
	}

	public static void main(String[] args) {
		String a="abcdr";
		String b="dcba";
		anagram(a, b);

	}

}
