package lecture10_searchingAndSorting;

public class Sort012 {
	public static void sort(int[] arr) {
		int nextZero=0;
		int nextTwo=arr.length-1;
		int i=0;
		while(i<=nextTwo) {
			if(arr[i]==0) {
				int temp=arr[nextZero];
				arr[nextZero]=arr[i];
				arr[i]=temp;
				nextZero++;
				i++;
			}
			else if (arr[i]==2) {
				int temp=arr[nextTwo];
				arr[nextTwo]=arr[i];
				arr[i]=temp;
				nextTwo--;
			}
			else {
				i++;
			}
		}
	}

	public static void main(String[] args) {
		int[] arr= {1,0,1,2,2,0,2,0,0,1};
		sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
