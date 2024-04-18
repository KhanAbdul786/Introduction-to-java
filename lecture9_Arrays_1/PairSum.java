package lecture9_Arrays_1;

public class PairSum {
	 public static int pairSum(int arr[], int x) {
	    	//Your code goes here
	        int count=0;
	        for(int i=0;i<arr.length-1;i++){
	            for(int j=i+1;j<arr.length;j++){
	                if(arr[i]+arr[j]==x){
	                    count++;
	                }
	            }
	        }
	        return count;
	 }

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7};
		System.out.println(pairSum(arr, 5));

	}

}
