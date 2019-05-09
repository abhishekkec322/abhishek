package prep_2019;

import java.util.concurrent.ThreadLocalRandom;

public class SolutionAmex3 {

	public static void main(String[] args) {
		int K = 99999997;
		System.out.println(solution(K));
	}

	public static int solution(int N) {
		//Missed this if condition in initial solution submitted to AMEX
		if (N >= 999999990 && N <= 999999999)
			return 1000000000;

		int lowerBound = (int) ((N / 10) + 1);
		System.out.println("lowerBound :"+lowerBound);
		//While submitting to AMEX I have put bound value as 99999999 but it should be 100000000
		int answer = ThreadLocalRandom.current().nextInt(lowerBound, 100000000);
		System.out.println(answer);
		return (answer * 10);

	}

}
