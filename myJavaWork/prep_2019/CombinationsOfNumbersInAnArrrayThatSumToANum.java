package prep_2019;
import java.util.Arrays;

public class CombinationsOfNumbersInAnArrrayThatSumToANum {

	public static void main(String args[]) {
		int sum = 18;
		int[] arr = { 1, 3, 6, 8, 2, 5, 11, 4,14 };
		int[] result = findCombination(arr, sum);
		System.out.println(Arrays.toString(result));
	}

	static int[] findCombination(int[] arr, int sum) {

		int[] result = new int[2];
		result[0] = -1;
		result[1] = -1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++)
				if (arr[i] + arr[j] == sum) {
					result[0] = arr[i];
					result[1] = arr[j];
				}
		}
		return result;
	}
}
