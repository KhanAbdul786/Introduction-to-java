package lecture11_Arrays2;

public class SUmOfTwoArrays {
	public static int[] sumArrays(int[] arr1, int[] arr2, int out[]) {
		int i = arr1.length - 1;
		int j = arr2.length - 1;
		int k = Math.max(i, j);

		int carry = 0;
		while (i >= 0 && j >= 0) {
			int sum = arr1[i] + arr2[j] + carry;
			out[k] = sum % 10;
			carry=sum/10;
			
			i--;
			j--;
			k--;
		}
		
		while(i>=0) {
			int sum = arr1[i] + carry;
			out[k] = sum % 10;
			carry=sum/10;
			i--;
			k--;
		}
		
		while(j>=0) {
			int sum = arr2[j] + carry;
			out[k] = sum % 10;
			carry=sum/10;
			j--;
			k--;
		}
		
		return out;
	}

	public static void main(String[] args) {
		int[] arr1= {8,6,2,4};
		int[] arr2= {5,6};
		
		int n=arr1.length;
		int m=arr2.length;
		int[] out=new int[Math.max(n, m)+1];
		
		int[] arr=sumArrays(arr1, arr2, out);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
