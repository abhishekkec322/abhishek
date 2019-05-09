package prep_2019;

public class SolutionAmex1 {

	public static void main(String[] args) {
		
		int [] A = {-1000,-101,-100,-990,-600,-991,-1,-7,-2,2,4,6,8,9,-997};
		System.out.println(solution(A));
	}
	
	static int solution(int[] A) {
        int ans = 0;
        for (int i = 0; i <A.length; i++) {
            if (ans > A[i]) {
                ans = A[i];
            }
        }
        return ans;
    }
}
