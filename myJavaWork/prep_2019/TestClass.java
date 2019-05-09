package prep_2019;

class ReflectionTest1 {
	private String firstName = "Abhishek";
	
	public ReflectionTest1(String firstName) {
		super();
		this.firstName = firstName;
	}

	public ReflectionTest1() {
		System.out.println("Default Constructor");
	}

	public void print1() {

		System.out.println("*** :" + firstName);
	}

	private void print2() {

		System.out.println("Full Name :" + firstName + " Saini");
	}

}
