package prep_2019;

public final class Test4 {

	public static void main(String args[]) {
		A a = new B();
		a.print();
	}
}

class A {
	public void print() {
		System.out.println("A");
	}
}

class B extends A {
// Compile Time Error : 	public int print() because its against overriding principle{	
	public void print() {
		System.out.println("B");
	}
}