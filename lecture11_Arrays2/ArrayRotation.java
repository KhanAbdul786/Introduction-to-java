package lecture11_Arrays2;

public class ArrayRotation {
	public static int[] rotateArray(int[] a, int x, String dir) {
		int n = a.length;
		// Performing the 'X' operation is the same as
		// performing 'X' % 'N' operations
		x %= n;
		// If we have to rotate 'LEFT'
		if (dir.equals("LEFT")) {
			// Rotate 'X' times.
			rotateLeft(a, x);
		}
		// If we have to rotate 'RIGHT'
		else if (dir.equals("RIGHT")) {
			// Rotate 'X' times.
			rotateRight(a, x);
		}
		// Return the rotated array 'a'.
		return a;
	}

	public static void rotateLeft(int[] a, int x) {
		int n = a.length;
		// Reverse whole array.
		reverse(a, 0, n);
		// Reverse first 'N' - 'X' elements.
		reverse(a, 0, n - x);
		// Reverse next 'X' elements.
		reverse(a, n - x, n);
	}

	public static void rotateRight(int[] a, int x) {
		int n = a.length;
		// Reverse whole array.
		reverse(a, 0, n);
		// Reverse first 'X' elements.
		reverse(a, 0, x);
		// Reverse next 'N' - X' elements.
		reverse(a, x, n);
	}

	public static void reverse(int[] a, int l, int r) {
		for (int i = 0; i < (r - l) / 2; i++) {
			int temp = a[l + i];
			a[l + i] = a[r - i - 1];
			a[r - i - 1] = temp;
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		int[] a = rotateArray(arr, 1, "RIGHT");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

	}

}
