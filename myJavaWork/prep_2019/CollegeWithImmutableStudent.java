package prep_2019;

import java.util.Arrays;
import java.util.Date;

// https://stackoverflow.com/questions/34109363/how-can-we-maintain-immutability-of-a-class-with-a-mutable-reference

public class CollegeWithImmutableStudent {

	public static void main(String[] args) {

		StudentImmutableClass s1 = new StudentImmutableClass(101, "Abhishek", new Date(2323223232L),Arrays.asList(55,67),new Address ("str1", 12345));
		StudentImmutableClass s2 = new StudentImmutableClass(102, "Neha", new Date(3323223232L), Arrays.asList(73,45),new Address ("str2", 12346));
		StudentImmutableClass s3 = new StudentImmutableClass(103, "Advika", new Date(432322323L), Arrays.asList(86,68),new Address ("str3", 12347));

		s1.getDob().setDate(432322323);
		//Throws error as its unmodifiable List
		//s1.getMarks().set(0, 55);
		
		//if no setters then it cannot be modified.
		//But as we are making deep copy of Address here,it will not modify its old value.
		s1.getAddress().setStreet("str5");
		s1.getAddress().setPostalCode(99999);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s1.getAddress().getPostalCode());
		System.out.println(s2.getAddress().getPostalCode());
		System.out.println(s3.getAddress().getPostalCode());
		System.out.println(s1.getAddress().getStreet());
		System.out.println(s2.getAddress().getStreet());
		System.out.println(s3.getAddress().getStreet());

	}

}
