package test;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ConcurrentModificationExcep {
	
	public static void main(String args []) {
		
		List <String> ls = new ArrayList<String>();
		ls.add("Abhishek");
		ls.add("Saini");
		
		for (ListIterator <String> st = ls.listIterator(); st.hasNext();){
			
			String s= st.next();
					System.out.println("Print Val : "+ s);
			ls.add("K");
			
		}
		
		
	}

}
