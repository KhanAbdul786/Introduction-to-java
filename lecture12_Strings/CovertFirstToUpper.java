package lecture12_Strings;

public class CovertFirstToUpper {
	public static String conevert(String s) {
		String[] str=s.split(" ");
		String ans="";
		for(String each:str) {
			ans=ans+each.substring(0, 1).toLowerCase()+each.substring(1)+" ";
		}
		return ans;
		
	}
	public static void main(String[] args) {
		String s="Abdul Khan";
		System.out.println(conevert(s));

	}

}
