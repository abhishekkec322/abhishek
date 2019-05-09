package prep_2019;

public class SolutionAmex5 {

	public static void main(String[] args) {
		System.out.println(solution(4, 17));
	}

	public static int solution(int A, int B) {
		double root;
		int counter = 0;
		for (int i = A; i <= B; i++) {
			if (i > 0) {
				root = Math.sqrt(i);
				System.out.println(root);
				if (root == (int) root)
					counter++;
			}
		}
		return counter;
	}
}
