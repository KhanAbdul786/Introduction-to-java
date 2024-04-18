package lecture8_functionAndScope;

public class FarenheightToCelcius {
	
	public static void printFahrenheitTable(int start, int end, int step) {
		/* Your class should be named Solution 
		 * Don't write main(). 
		 * Don't read input, it is passed as function argument. 
		 * Print the specified output in required format. 
		 * Taking input is handled automatically. 
		 */
		while(start<=end){
			double d=((start-32)*5)/9;
			long n=(long)d;
			System.out.println(start+"  "+n);
			start +=step;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
