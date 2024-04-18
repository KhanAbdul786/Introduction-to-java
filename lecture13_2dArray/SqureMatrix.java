package lecture13_2dArray;

import java.util.Scanner;

public class SqureMatrix {
	public static String sqrMat(int[][]mat,int n,int m,int diag[]) {
//		String str="";
//		if(n==m) {
//			str="YES";
//			for (int i = 0; i < n; i++) {
//				for (int j = 0; j < m; j++) {
//					if(i==j) {
//						diag[i]=mat[i][j];
//					}
//				}
//			}
//			return str;
//		}
//		return str="NO";
		
		if(n==m) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					if(i==j) {
						diag[i]=mat[i][j];
					}
				}
			}
			return "YES";
		}
		return "NO";
		
	}

	public static void main(String[] args) {
//		int[][] mat= {{1,3,5},{7,8,9},{2,4,6}};
		 int t, m, n;
	        Scanner sr = new Scanner(System.in);
	        t = sr.nextInt();
	        for (int k = 0; k < t; ++k) {
	            n = sr.nextInt();
	            m = sr.nextInt();
	            int ar[][] = new int[n][m]; // Swap n and m in array dimensions
	            for (int i = 0; i < n; i++) {
	                for (int j = 0; j < m; j++) {
	                    ar[i][j] = sr.nextInt();
	                }
	            }
	            int diag[] = new int[Math.min(n, m)]; // Use Math.min to get the smaller dimension
	            String ans = SqureMatrix.sqrMat(ar, n, m, diag);
	            System.out.println(ans);
	            if (ans.equals("YES")) {
	                for (int i = 0; i < diag.length; i++) {
	                    System.out.print(diag[i] + " ");
	                }
	                System.out.println();
	            }
	        }
	    }
		

	

}
