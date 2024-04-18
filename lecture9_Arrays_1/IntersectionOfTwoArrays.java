package lecture9_Arrays_1;

public class IntersectionOfTwoArrays {
	public static void intersections(int arr1[], int arr2[]) {
    	//Your code goes here

        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    System.out.print(arr1[i]+" ");
                    arr2[j]=Integer.MIN_VALUE;
                    break;
                }
            }
        }
        
    }

	public static void main(String[] args) {
		int[] arr1= {1,2,3,4};
		int[] arr2= {2,3,4,5};
		intersections(arr1, arr2);

	}

}
