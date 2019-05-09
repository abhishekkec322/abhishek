package prep_2019;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

//HackerRank - India Company
public class StringWithMaximumRepeatitionArrayList2 {
	
	public static void main(String args[]) {
		
		List <String> al = new ArrayList <>();    
		
		al.add("Laddu");
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
		al.add("Laddu");
		al.add("Barfi");
		al.add("Barfi");
		
        System.out.println(popularChoice(al));
	}
		
static String popularChoice(List <String> votes) {
	
	Map <String, Integer> map = new TreeMap<>();
	
	if(votes.size()>1) {
	for(int i=0; i<votes.size()-1;i++) {
		int repetition=1;
		for(int j=i+1; j<= votes.size()-1;j++) {
			
			if (votes.get(i).equalsIgnoreCase(votes.get(j)))
			repetition++;
		}
		if(map.get((votes.get(i))) == null) {
		map.put(votes.get(i), repetition);
		}
		if (votes.size()==2)
			map.put(votes.get(1), repetition);	
	}	
	
	System.out.println(map);
	
	int max= Collections.max(map.values());
	List<String> keys = new ArrayList<>();
    for (Entry<String, Integer> entry : map.entrySet()) {
        if (entry.getValue()==max) {
            keys.add(entry.getKey());
        }
    }
     return keys.get(0);
	
	}
	
	else if (votes.size() ==1) {
	
		return votes.get(0);
	}
	else
		return null;
	
}
}
