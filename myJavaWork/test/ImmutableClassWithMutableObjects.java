package test;

// Passing mutable bojects to immutable class
//https://dzone.com/articles/how-to-create-an-immutable-class-in-java
public class ImmutableClassWithMutableObjects {
	
	private final int id;
	private final String name;
	private final Age age;
	
	
	public ImmutableClassWithMutableObjects(int id,String name, Age age) {
		this.id=id;
		this.name=name;
		
		// Code added to make this class immutable
		Age cloneAge = new Age();
	    cloneAge.setDay(age.getDay());
	    cloneAge.setMonth(age.getMonth());
	    cloneAge.setYear(age.getYear());
	    this.age=cloneAge;
	    // End
//Uncomment this code and comment abobe code to check mutable version.
	    //this.age=age;
	}

	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}

	public Age getAge() {
		return age;
	}
	
	
	public static void main (String args []) {
		
		 Age age = new Age();
		 age.setDay(1);
		 age.setMonth(1);
		 age.setYear(1992);
		 
		 ImmutableClassWithMutableObjects student = new ImmutableClassWithMutableObjects(1, "Alex", age);
		 System.out.println("Alex age year before modification = " + student.getAge().getYear());
		 age.setYear(1993);
		 System.out.println("Alex age year after modification = " + student.getAge().getYear());
		 
		 /* Before the code of line 15-20 was added.
		  * Alex age year before modification = 1992
		  * Alex age year after modification = 1993
		  * */		 
		 //Returning Mutable Objects From Immutable Class
		 student.getAge().setYear(1993);
		 System.out.println("Alex age year after modification = " + student.getAge().getYear());
		    
	}
	
}
