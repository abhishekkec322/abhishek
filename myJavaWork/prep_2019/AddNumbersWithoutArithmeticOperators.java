package prep_2019;

public class AddNumbersWithoutArithmeticOperators {

	public static void main(String[] args) {		
		int i=9;
		int j=13;		
		System.out.println(add(i,j));
	}
	
	static int add(int i, int j) {
		if (i==0)
			return j;
		if (j==0)
			return i;		
		else
			return add(i^j, (i&j)<<1 );		
	}
}
