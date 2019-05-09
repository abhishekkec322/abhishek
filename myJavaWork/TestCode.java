import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TestCode {
	
	public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();    //init first,just for test
        al.add("aaa");
        al.add("bbb");
        al.add("ccc");
        al.add("aaa");
        al.add("ccc");
         
        Map<String,Integer> map = new TreeMap<String, Integer>();
        for(int i=0;i<al.size();i++){            
            Integer count = map.get(al.get(i));       
            map.put(al.get(i), count==null?1:count+1);   //auto boxing and count
        }
        System.out.println(map);
        
        int max= Collections.max(map.values());
        System.out.println(max);
        
        List<String> keys = new ArrayList<>();
        for (Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue()==max) {
                keys.add(entry.getKey());
            }
        }
         System.out.println(keys.get(0));
      
    }

}
