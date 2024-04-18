package lecture11_Arrays2;

public class MoveAllNegativeNumbers {
	 public static int[] separateNegativeAndPositive(int[] arr){
		    int n = arr.length;
		    // creating a new array
		    int ans[] = new int[n];
		    int k =0;//for keeping the track of index of last negative number
		    for(int i = 0; i < arr.length - 1; i++){
		        if(arr[i]<0){
		            ans[k++] = arr[i];
		        }
		    }
		//loop for filling positive numbers
		    for(int i = 0; i<n;i++){
		        if(arr[i] >=0){
		        ans[k++] = arr[i];
		        }
		    }
		    return arr;
	 }

	public static void main(String[] args) {
		int[] arr= {1,2,-3,4,-4,-5};

	}

}
