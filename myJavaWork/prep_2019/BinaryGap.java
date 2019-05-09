package prep_2019;

public class BinaryGap {

//HakerRank - Practice
	public static void main(String args[]) {

		int num = 32;
		System.out.println("Binary Gap: " + solution(num));
	}

	public static int solution(int N) {

		// String binary = Integer.toBinaryString(N);

		// Start Manual Conversion from Integer to Binary
		String binary = "";

		for (int i = 0; N > 0; i++) {
			if (N <= 2) {
				String reverse = "";
				for (int j = binary.length() - 1; j >= 0;) {
					reverse = reverse + binary.charAt(j);
					j--;
				}
				binary = reverse;
				System.out.println("binary after reverse:" + binary);
				if (N == 0) {
					binary = binary + "0";
					break;
				} else if (N == 1) {
					binary = "1" + binary;
					break;
				} else if (N == 2) {
					binary = "10" + binary;
					break;
				}
			} else {
				binary = binary + (N % 2 == 0 ? "0" : "1");
				N = N / 2;
			}
		}

		System.out.println("Final binary :" + binary);

		for (int k = binary.length() - 1; k > 0; k--) {
			if (binary.endsWith("0"))
				binary = binary.substring(0, k);
		}

		System.out.println("Final Binary after removing trailing 0 :" + binary);

		// End Manual Conversion from Integer to Binary

		char[] ch = binary.toCharArray();

		int biggestBinaryGap = 0;
		int currentBinaryGap = 0;

		for (int i = 0; i < ch.length; i++) {
			Character c = ch[i];

			if (c.equals('0')) {

				currentBinaryGap = currentBinaryGap + 1;

				if (biggestBinaryGap < currentBinaryGap) {
					biggestBinaryGap = currentBinaryGap;
				}
			} else {
				currentBinaryGap = 0;

			}
		}

		return biggestBinaryGap;

	}

}
