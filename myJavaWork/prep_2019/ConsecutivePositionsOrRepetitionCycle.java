package prep_2019;

import java.util.Stack;
//Solace - Codility

public class ConsecutivePositionsOrRepetitionCycle {
	
	public static void main(String args[]) {
		
		int [] arr = new int [2000000];
		for(int i=0; i<200000-1;) {			
			arr[i] = ++i;
		}
		
		arr[199999] = 0;
		
		System.out.println(arr.length);
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[5]);
		System.out.println(arr[10]);
		System.out.println(arr[199998]);
		System.out.println(arr[199999]);
		
		
		System.out.println("final : "+solution(arr));
	}

	
	 public static int solution(int[] A) {

		 int cycleLength=-1;
		 int position=A[0];
		 Stack<Integer> path = new Stack <>();
		 path.push(0);
		 while (cycleLength==-1) {
			 position =A[position];
			 cycleLength=path.search(position);
			 path.add(position);			 
		 }		
		 return cycleLength;	        
	    }
}
