package lecture11_Arrays2;

import java.util.Iterator;

public class ExtraCandies {
	public static int[] extra(int n,int x,int[] p1,int[] p2) {
		
		int[] out=new int[n];
		int carry=0;
		for (int i = 0; i < n; i++) {
			int total=p1[i]+p2[i]+carry;
			if(total<x) {
				out[i]=total;
			}
			else {
				carry=total-x;
				out[i]=x;
			}
		}
		return out;
	}

	public static void main(String[] args) {
		int[] p1= {2,6,1};
		int[] p2= {1,2,1};
		int n=Math.max(p1.length, p2.length);
		
		int[] arr=extra(n, 6, p1, p2);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
