/* Que: Find total sum of given array Elements
 -----------------------------------------------------------------------------------------------------------------------	
 Approach: 
# Initialization: Start with a variable sum initialized to 0, which will hold the accumulated sum.
# Iteration: Traverse through the array using a loop.
# Accumulation: For each element in the array, add it to the sum variable.
# Output: After completing the loop, the sum will contain the total sum of all the elements in the array.
*/
package Arrays;

public class sumOfArrayElements {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 }; // Example array
		int sum = 0;

		// Traverse the array and add each element to the sum
		for (int num : arr) {
			sum += num;
		}

		// Output the sum of the array elements
		System.out.println("Sum of array elements: " + sum);
	}
}

/*
 * Output: Sum of array elements: 15
 * 
 */
