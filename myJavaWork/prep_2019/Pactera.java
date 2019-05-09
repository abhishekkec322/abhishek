package prep_2019;

import java.util.ArrayList;
import java.util.List;

public class Pactera {

	public static void main(String[] args) {
		int lowerLimits[] = { 2,4 };

		int upperLimits[] = { 6,7 };

		int scores[] = { 1, 3, 5, 6, 8, 2, 1, 5 };

		System.out.println(jobOffers(scores, lowerLimits, upperLimits));

	}

	static int[] jobOffers(int[] scores, int[] lowerLimits, int[] upperLimits) {

		//List<Integer> result = new ArrayList<Integer>();
		
		int[] result = new int[lowerLimits.length];
		
		int temp=0;
		
		for(int j=0;j<lowerLimits.length; j++) {
					
			for (int i = 0; i < scores.length; i++) {
				if ((scores[i] >= lowerLimits[j]) && (scores[i] <= upperLimits[j]))
				temp++;
		}			
			result[j]=temp;
			temp=0;
		
		}
		//int[] finalResult = result.stream().mapToInt(i->i).toArray();
		
	/*	System.out.println(finalResult.length);
		
		for(int k=0;k<finalResult.length;k++)
			System.out.println(finalResult[k]);
			*/
		
		
		return result;
		
		
	}

}