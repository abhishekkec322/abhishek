package prep_2019;

import java.util.Arrays;
import java.util.List;
//HackerRank - India Company

public class MaximumDifferenceInAnArrayElements {

	public static void main(String[] args) {
		List <Integer> ls = Arrays.asList(7,2,3,10,2,4,8,1,19,1);
		System.out.println(findMaxDifference(ls));
	}

	static int findMaxDifference(List <Integer> a){
		int maxValue=0;
		for(int i=0; i<a.size()-1;i++) {
			if(a.size()>0) {
			if(a.get(i)<a.get(i+1)) 
				{
				maxValue = (maxValue < (a.get(i+1) - a.get(i))) ? ( a.get(i+1) - a.get(i)): maxValue;	
				}
			if(a.get(i)>a.get(i+1))  
				{
				maxValue = (maxValue < (a.get(i) - a.get(i+1))) ? ( a.get(i) - a.get(i+1)): maxValue;	
				}	
		}
		}
		return maxValue;
	}	
}