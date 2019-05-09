package test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class LearnJava8 {
		
	public static void main(String args []) {
	List <String> ls = Arrays.asList("acf", "abew", "bcvwa", "DCAUOW", "dcnoi", "sr");
	System.out.println(sort(ls));
	MethodRef(ls);
	System.out.println(streamProcessing(ls));
	printOnetoTenwithoutloopandRecursion();
	}
	
	public static List<String> sort(List <String> ls){
		Collections.sort(ls, (a,b) -> b.compareToIgnoreCase(a));
		return ls;
	}	
	public static void MethodRef(List <String> ls) {
		ls.forEach(System.out :: println);
	}
	public static long streamProcessing(List <String> ls){
	long count = ls.stream().filter(str -> (str.length()>4) ).count();
		return count;
	}
	
	public static void printOnetoTenwithoutloopandRecursion(){
		
		IntStream.range(1, 10).forEach(System.out :: println);
		
		
	}
}
