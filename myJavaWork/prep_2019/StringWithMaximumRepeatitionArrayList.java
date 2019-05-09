package prep_2019;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

//HackerRank - India Company

public class StringWithMaximumRepeatitionArrayList {
	
	public static void main(String args[]) {
		
		List <String> al = new ArrayList <>();    
		
		al.add("laddu");
	    al.add("Gulab-Jamun");         
        al.add("Laddu");
        al.add("Barfi");
        al.add("Jelabi");
        al.add("Gulab-Jamun");
        al.add("Jelabi");
        al.add("Gulab-Jamun");
        al.add("Jelabi");
        al.add("Gulab-Jamun");
        al.add("Barfi");
        al.add("Jelabi"); 
		al.add("Barfi");
		al.add("Laddu");
		al.add("Laddu");
        System.out.println(popularChoice(al));
	}
		
static String popularChoice(List <String> choices) {
	
	Map <String, Integer> map = new TreeMap<>();
	for(int i=0; i<choices.size()-1;i++) {
		int repetition=1;
		for(int j=i+1; j<= choices.size()-1;j++) {
			
			// Remove Ignore case if all Strings are in same format (Camel Case/Upper/Lower)
			if (choices.get(i).equalsIgnoreCase(choices.get(j)))
			repetition++;
		}
		// Remove toUpperCase() case if all Strings are in same format (Camel Case/Upper/Lower)
		if(map.get((choices.get(i)).toUpperCase()) == null) {
		map.put(choices.get(i).toUpperCase(), repetition);
		}
	}
	System.out.println(map);
	String popular=""; 
	
	//Option 1 start
	popular = Collections.max(map.entrySet(), Comparator.comparingInt(Map.Entry::getValue)).getKey();
	//option 1 end
	
	// Option 2 Start - Not veri efficient	
/*int max= Collections.max(map.values());
    System.out.println(max);
    
    List<String> keys = new ArrayList<>();
    for (Entry<String, Integer> entry : map.entrySet()) {
        if (entry.getValue()==max) {
            keys.add(entry.getKey());
        }
    }
     popular= keys.get(0);*/
	// Option 2 end
	
	return popular;
}
}
