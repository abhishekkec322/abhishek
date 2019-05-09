package prep_2019;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;

public class TesterClass {

	public TesterClass() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable <Integer, String> ht = new Hashtable <>();
		ht.put(1, "aa");
		ht.put(2, "bb");
		ht.put(3, "cc");
		//ht.put(null,"dd");
		System.out.println(ht);
		
		HashMap <Integer, String> hm = new HashMap<>();
		hm.put(1, "aa");
		hm.put(null, "bb");
		hm.put(null, "cc");
		hm.put(2, null);
		hm.put(3, null);		
		System.out.println(hm);
		
		int [] arr = new int[5];
		
		arr[0]=new Integer(6);
		arr[1]=9;
		arr[1]=10;
		
		List <String> ls = new ArrayList<>(Arrays.asList("1","","4","6",null,"7","", null));
		
		ls.add("abhi");
		ls.add(2, "abhishek");
		System.out.println(ls);
		
		try {
			for(int i=0; i<=arr.length;i++)
				System.out.println(arr[i]);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Quit1");
			throw new ArrayIndexOutOfBoundsException("I am sorry");
			
		} finally {
			
			System.out.println("Quit2");
			throw new NullPointerException("I am sorry dear");
		}
	}
}
