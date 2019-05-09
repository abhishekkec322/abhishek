package prep_2019;

public class ArrayManipulationWithRunOperationsHackerRank {

	//HackerRank Practice
	public static void main(String args []) {
		
		int n=5;
		int[][] queries = new int[n][];
		for (int i = 0; i < n; i++) {
			queries[i] = new int[10];
		}
		
		System.out.println(queries.length);
		
		//System.out.println("arrayManipulation : "+arrayManipulation(n,queries));
	}
	
	
	static long arrayManipulation(int n, int[][] queries) {

	long arr[] = new long[n];

	// each successive element contains the difference between itself and previous element

	for (int i = 0; i < queries.length; i++) {
	// when checking query, subtract 1 from both a and b since 0 indexed array
	int a = queries[i][0] - 1;
	int b = queries[i][1] - 1;
	int k = queries[i][2];

	arr[a] += k;
	if (b+1 < n) {
	arr[b+1] -= k;  
	}
	}

	// highest value seen so far as we go
	long maxValue = Long.MIN_VALUE;
	for (int i = 1; i < arr.length; i++) {
	arr[i] += arr[i-1];
	maxValue = Math.max(arr[i], maxValue);
	}

	return maxValue;
	}
}
