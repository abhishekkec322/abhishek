package prep_2019;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Java8Practice {
	
	public static void main(String args []) {
		
		List <String> ls = new ArrayList (Arrays.asList("Abhishek","abhi", "neha", "advika", "Adv",null, ""));
		// System.out.println(sortData(ls));
		// Remove Strings which are null,"", or length greater than 5 
		ls.stream().filter(str -> ( (str != null) && (str !="") && (str.length() <= 5) )
				                           ).forEach(System.out::println);
	}
	
	public static List <String> sortData(List <String> ls) {
		Collections.sort(ls, (s1,s2) -> ( s1).compareTo( s2));
		ls.forEach(System.out :: println);
		return ls;
	} 
}
