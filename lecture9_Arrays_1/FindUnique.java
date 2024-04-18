package lecture9_Arrays_1;

public class FindUnique {
	public static int unique(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int j;
			for (j = 0; j < arr.length; j++) {
				if(i!=j) {
					if(arr[i]==arr[j]) {
						break;
					}
				}
			}
			
			if(j==arr.length) {
				return arr[i];
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr= {2,3,4,4,3,1,1};
		System.out.println(unique(arr));

	}

}
