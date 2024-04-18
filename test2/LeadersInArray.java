package test2;

public class LeadersInArray {
	public static void leadersInArray(int[] arr) {
		if(arr.length==0) {
			return;
		}
		for (int i = 0; i < arr.length; i++) {
			int j;
			for (j = i+1; j < arr.length; j++) {
				if(arr[i]<arr[j]) {
					break;
				}
			}
			if(j==arr.length) {
				System.out.print(arr[i]+" ");
			}
		}
	}

	public static void main(String[] args) {
		int[] arr= {3 ,12 ,34 ,2 ,0 ,-1};
		leadersInArray(arr);
		

	}

}
