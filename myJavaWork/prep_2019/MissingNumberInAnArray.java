package prep_2019;

public class MissingNumberInAnArray {

	//Codility Practice

	public static void main(String args[]) {

		// Find minimum missing number in an array on 1-n (Only 1 number is missing and no duplicates).
		int[] arr = { 1, 3, 5, 6, 4, 2, 9, 10, 11, 8 };

		System.out.println(solution(arr));
	}

	public static int solution(int[] A) {

		int totalSum = 0;
		int currentSum = 0;

		for (int i = 0; i <= A.length; i++) {
			totalSum = totalSum + i;
			// currentSum = currentSum+ A[i-1];
		}

		for (int j = 0; j < A.length; j++) {
			currentSum = currentSum + A[j];
		}

		totalSum = totalSum + (A.length + 1);
		return (totalSum - currentSum);

	}
}
