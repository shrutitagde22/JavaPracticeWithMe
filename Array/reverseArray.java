/* Que: Reverse an array element
 -----------------------------------------------------------------------------------------------------------------------	
 Approach: 
 # A for loop is used to reverse only the second half of the array.
 # The loop starts from the last index (arr.length - 1) and runs until it reaches the middle (arr.length / 2).
 # The swapping logic is applied to reverse the elements between the second half and the first half
 # Inside the loop, the element at the current index i is swapped with its corresponding element from the first half (arr[arr.length - (i + 1)]).
 */


package Arrays;

public class reverseArray {

	static int[] arr = { 2, 4, 5, 67, 87 };

	public static void main(String[] args) {

		for (int i = arr.length - 1; i >= arr.length / 2; i--) {
			int temp = arr[i];
			arr[i] = arr[arr.length - (i + 1)];
			arr[arr.length - (i + 1)] = temp;

		}
		for (int arr1 : arr) {
			System.out.println(arr1);
		}

	}
}

/* 
 -----------------------------------------------------------------------------------------------------------------------	
 Output:

87
67
5
4
2
*/