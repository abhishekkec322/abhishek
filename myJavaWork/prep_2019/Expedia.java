package prep_2019;

import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

public class Expedia {
  public static void main(String[] args) {
    List<String> list = new ArrayList<String>();
    list.add("Apple");
    list.add("Orange");
    list.add("Carrot");
    list.add("Grapes");
    
    // What is the output for the following method?    
    one(list);
    
  }

  private static void one(List<String> list) {
    for(int i=0; i<list.size(); i++) {
      String name = list.get(i);
      if("Carrot".equals(name)) {
        list.remove(name);
      }
      System.out.println(name);
    }
  }
}
