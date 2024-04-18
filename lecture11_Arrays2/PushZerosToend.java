package lecture11_Arrays2;

public class PushZerosToend {
	public static void zeros(int[] arr) {
		int next=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]!=0) {
				int temp=arr[next];
				arr[next]=arr[i];
				arr[i]=temp;
				next++;
			}
		}
	}

	public static void main(String[] args) {
		int[] arr= {2,0,0,1,3,0,0};
		zeros(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
