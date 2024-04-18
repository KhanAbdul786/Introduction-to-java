package lecture9_Arrays_1;

public class FindDuplicate {
	public static int duplicate(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(i!=j) {
					if(arr[i]==arr[j]) {
						return arr[i];
					}
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr= {0,7,1,2,3,4,9};
		System.out.println(duplicate(arr));

	}

}
