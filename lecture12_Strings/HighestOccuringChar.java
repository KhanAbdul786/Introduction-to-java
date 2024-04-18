/*Problem statement
For a given a string(str), find and return the highest occurring character.

Example:
Input String: "abcdeapapqarr"
Expected Output: 'a'
Since 'a' has appeared four times in the string which happens to be the highest frequency character, the answer would be 'a'.
If there are two characters in the input string with the same frequency, return the character which comes first.

Consider:
Assume all the characters in the given string to be in lowercase always.
Detailed explanation ( Input/output format, Notes, Images )
Constraints:
0 <= N <= 10^6
Where N is the length of the input string.

Time Limit: 1 second
Sample Input 1:
abdefgbabfba
Sample Output 1:
b
Sample Input 2:
xy
Sample Output 2:
x*/
/*Time complexity:O(N)Space complexity:O(1)where N is the length of the input string*/
/*public class Solution {
public static char highestOccuringChar(String str) {
int n = str.length();
int frequency[] = new int[256];
int maxFrequency = 0;
for (int i = 0; i < n; i++) {
frequency[str.charAt(i)]++;
maxFrequency = Math.max(maxFrequency, frequency[str.charAt(i)]);
}
char answer = '\0';
for (int i = 0; i < n; i++) {
if (frequency[str.charAt(i)] == maxFrequency) {
answer = str.charAt(i);
break;
}
}
return answer;
}
}*/
package lecture12_Strings;

public class HighestOccuringChar {
	public static char highestOccuringChar(String str) {
		if (str.length() == 0) {
			return ' ';
		}
		int n = str.length();
		int[] frequency = new int[256];
		for (int i = 0; i < frequency.length; i++) {
			frequency[i] = 0;
		}

		for (int i = 0; i < n; i++) {
			char ch = str.charAt(i);
//			frequency[ch]++;
			frequency[ch] = frequency[ch] + 1;
		}

		char out = str.charAt(0);
		int max = frequency[out];
		for (int i = 0; i < n; i++) {
			char ch = str.charAt(i);
			if (frequency[ch] > max) {
				max = frequency[ch];
				out = ch;
			}
		}
		return out;
	}

	public static void main(String[] args) {
		String s = "acccbbabaccc";
		System.out.println(highestOccuringChar(s));

	}

}
