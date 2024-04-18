package lecture9_Arrays_1;

public class TripletSum {
	public static int findTriplet(int[] arr, int x) {
    	//Your code goes here
        int count=0;
        for(int i=0;i<arr.length-2;i++){
            int sum=0;
            for(int j=i+1;j<arr.length-1;j++){
                for(int k=j+1;k<arr.length;k++){
                    sum=arr[i]+arr[j]+arr[k];
                    if(sum==x){
                        count++;
                    }
                }
            }
        }
        return count;
    }

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8,9};
		System.out.println(findTriplet(arr, 7));

	}

}
