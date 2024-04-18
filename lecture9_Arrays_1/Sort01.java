package lecture9_Arrays_1;

public class Sort01 {
	public static void sortZeroesAndOne(int[] arr) {
    	//Your code goes here
        int nextZeros=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                int temp=arr[nextZeros];
                arr[nextZeros]=arr[i];
                arr[i]=temp;
                nextZeros++;
            }
        }
    }

	public static void main(String[] args) {
		int[] arr= {1,1,0,0,1,0};
		sortZeroesAndOne(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
