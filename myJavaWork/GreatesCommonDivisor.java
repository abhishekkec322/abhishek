import java.util.Arrays;

public class GreatesCommonDivisor {

	public static void main(String args[]) {

		int[] arr = { 48, 60, 100,32, 8, 80, 44 };
		int n = 5;

		System.out.println(generalizedGDC(n, arr));
	}

	public static int generalizedGDC(int num, int[] arr) {
		int j;
		Arrays.sort(arr);

		for (int i = arr[0]; i >= 1; i--) {
		
			for (j = 0; j < arr.length; ++j) {
				if (arr[j] % i != 0)
					break;
			}
			if (j == arr.length)
				return i;
		}
		return 1;

	}

}
