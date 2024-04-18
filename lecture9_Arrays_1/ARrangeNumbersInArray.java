package lecture9_Arrays_1;

public class ARrangeNumbersInArray {
	public static void arrange(int[] arr,int n) {
		int start=0;
		int end=n-1;
		int count=1;
		while(start<=end) {
			arr[start]=count;
			count++;
			
			if(start==end) {
				break;
			}
			
			arr[end]=count;
			count++;
			start++;
			end--;
		}
	}

	public static void main(String[] args) {
		int n=7;
		int[] arr=new int[n];
		arrange(arr, n);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
