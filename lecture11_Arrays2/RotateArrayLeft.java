package lecture11_Arrays2;

public class RotateArrayLeft {
	public static void roateArray(int[] arr,int d) {
		int n=arr.length;
		reverseArray(arr,0,n);
		reverseArray(arr, 0, n-d);
		reverseArray(arr, n-d, n);
	}
	public static void reverseArray(int[] arr,int start,int end) {
		 for(int i=0;i<(end-start)/2;i++){
	            int temp=arr[start+i];
	            arr[start+i]=arr[end-i-1];
	            arr[end-i-1]=temp;
	        }
	}

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6};
		
		roateArray(arr, 2);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
