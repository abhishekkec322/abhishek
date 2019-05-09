package prep_2019;

public class Test2 {
	
	public static void main(String args[]) {
		
		int []a= {1};
		Test2 t = new Test2();
		t.increment(a);
		System.out.println(a[a.length-1]);
		
	}
	
	void increment(int[] i) {
		i[i.length-1]++;
	}
	
	class B{
		
		int b;
		//public B(int x):b(x){}
	}

}
