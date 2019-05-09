package prep_2019;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Test {
	
	public static void main(String args []) {
		System.out.println("Hello");
		
		//Map <String, Integer> hm = new HashMap<>();
		Map <String, Integer> hm = new Hashtable<>(); 
		
		hm.put("", 1);
		//hm.put(null, 2);
		//hm.put(null,3);
		hm.put("", 4);
		System.out.println(hm);
		
		Integer i1= 10;
		Integer i2= 10;		
		System.out.println(i1.equals(i2));
		System.out.println(i1==i2);
		
		switch(i2-i1+11) {
		case 1: System.out.println("1");
		break;
		default: System.out.println("0");
		case 9: System.out.println("9");
		break;
		case 10: System.out.println("10");
		break;
		}
		
		String s1= "abhi";
		String s2= "abhi";
		String s3= new String ("abhi");

		System.out.println(s1==s2);
		System.out.println(s2==s3);
		
		Map <String, Integer> h = new HashMap<>();
		h.put("abc", 1);
		h.put("abc", 2);
		h.put(new String("abc"), 3);
		h.put("abc", 22);
		h.put("abcd", 11);
		
		System.out.println(h);
		
	}	
}

