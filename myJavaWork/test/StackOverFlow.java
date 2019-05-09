package test;
public class StackOverFlow {

	public static void main (String args []) {
		call();
	}
		
	public static void call() {
		call();
		System.out.println("Hi");
	}
}
