package prep_2019;

import java.util.Arrays;
import java.util.List;

public class FindTheNumber {

	public static void main (String args[]) {
		
		List <Integer> ls = Arrays.asList(1,2,3,4,7,9);
		int num = 5;
		
		System.out.println(findNumber(ls,num));
		
		
	}
	
	static String findNumber(List<Integer> arr, int k) {
		
		for(int i=0; i<arr.size(); i++) {
			if(arr.contains(k))
				return "YES";			
		}		
		return "NO";
    }
	
}
