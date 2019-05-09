package prep_2019;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnagramsGruopedTogether {

	public static void main(String args []) {
		// Driver program 
        String arr[] = { "cat", "dog", "tac", "god", "act" }; 
        System.out.println(groupAnagrams(arr)); 
	}
	
	public static List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) return new ArrayList <List<String>> ();
        Map<String, List<String>> ans = new HashMap<String, List<String>>();
        for (String s : strs) {
            char[] ca = s.toCharArray();
            Arrays.sort(ca);
            String key = String.valueOf(ca);
            if (!ans.containsKey(key)) 
            	ans.put(key, new ArrayList<String>());
            ans.get(key).add(s);
        }
        return new ArrayList <List<String>>(ans.values());
    }
}
