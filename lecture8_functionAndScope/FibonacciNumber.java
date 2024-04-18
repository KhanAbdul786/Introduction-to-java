package lecture8_functionAndScope;

public class FibonacciNumber {
	
	public static boolean checkMember(int n){
		
		/* Your class should be named Solution
		* Don't write main().
	 	* Don't read input, it is passed as function argument.
	 	* Return output and don't print it.
	 	* Taking input and printing output is handled automatically.
		*/

		if(n==0 || n==1){
			return true;
		}

		if(n==2){
			return true;
		}

		int n1=0;
		int n2=1;
		int sum=0;

		for(int i=3;i<=n;i++){
			sum=n1+n2;
			if(n==sum){
				return true;
			}
			n1=n2;
			n2=sum;
		}
		return false;

	}

	public static void main(String[] args) {
		System.out.println(checkMember(10));

	}

}
