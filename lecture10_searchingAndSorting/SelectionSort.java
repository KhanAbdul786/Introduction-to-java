package lecture10_searchingAndSorting;

public class SelectionSort {
	public static void sortSelection(int[] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			int index=-1;
			int min=Integer.MAX_VALUE;
			for(int j=i;j< arr.length;j++) {
				if(arr[j]<min) {
					min=arr[j];
					index=j;
				}
			}
			arr[index]=arr[i];
			arr[i]=min;
		}
	}

	public static void main(String[] args) {
		int[] arr= {1,3,0,4,2,6};
		sortSelection(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
