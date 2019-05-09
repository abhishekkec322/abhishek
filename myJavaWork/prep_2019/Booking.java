package prep_2019;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.stream.Collectors;

//Maximum Occupancy
public class Booking {
	
	public static void main(String args[]) {
		
		List<Integer> arrive = Arrays.asList(1,2,3,2,6,5,1,5);
		List<Integer> depart = Arrays.asList(3,3,5,4,7,7,4,10);		
//		List<Integer> arrive = Arrays.asList(1,2,3);
//		List<Integer> depart = Arrays.asList(3,3,5);
		System.out.println(maximumOccupancy(arrive, depart));		
	}
	
	static int maximumOccupancy(List <Integer> arrive, List <Integer> depart) {
		
		Map <Integer, Integer> hm = new HashMap<>();
		//int Startdate = Collections.min(arrive);
		//int lastDate = Collections.max(depart);
		for(int i=0; i<depart.size(); i++)
		{
			for(int j= arrive.get(i); j<depart.get(i); j++) {
				hm.put(j,((null == hm.get(j))?1:(hm.get(j) +1)) );
			}
		}
		
		int maxValueKey=getMaxValueKey(hm);		
		System.out.println("Maximum Occupancy Day :" + maxValueKey);
		return hm.get(maxValueKey);
	}

	static int getMaxValueKey(Map<Integer, Integer> hm) {
		
		int max = (int) Collections.max(hm.values());
		
		List<Integer> keys = new ArrayList<>();
		for (Entry<Integer, Integer> entry : hm.entrySet()) {
		    if (entry.getValue()==max) {
		        keys.add(entry.getKey());
		    }
		}		
		return keys.get(0);	
		
		//Java 8 Way of Streaming
		//return hm.entrySet().stream().filter(entry -> entry.getValue() == max).map(entry -> entry.getKey()).collect(Collectors.toList()).get(0);
	}	
}
