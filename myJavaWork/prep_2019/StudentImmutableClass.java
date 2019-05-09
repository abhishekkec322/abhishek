package prep_2019;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class StudentImmutableClass {
	
	private final int regNo;
	private final String name;
	private final Date dob;
	private List <Integer> marks = new ArrayList<>();
	private final Map <String, String> hm = new HashMap<>();
	private final Address address;
	
	public Address getAddress() {
		return new Address(address.getStreet(), address.getPostalCode());
	}
	
	public String getName() {
		return name;
	}

	public List getMarks() {
		return Collections.unmodifiableList(new ArrayList<> ());
	}

	public int getRegNo() {
		return regNo;
	}
	
	public Date getDob() {
		return new Date (dob.getTime());
	}



	@Override
	public String toString() {
		return "StudentImmutableClass [regNo=" + regNo + ", name=" + name + ", dob=" + dob + ", marks=" + marks
				+ ", address=" + address + "]";
	}

	public StudentImmutableClass(int regNo, String name, Date dob, List<Integer> marks, Address address) {
		super();
		this.regNo = regNo;
		this.name = name;
		this.dob = dob;
		this.marks = marks;
		this.address = address;
	}


	
}


class Address{
	
	private String street;
	private int PostalCode;
	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public int getPostalCode() {
		return PostalCode;
	}
	public void setPostalCode(int postalCode) {
		PostalCode = postalCode;
	}
	public Address(String street, int postalCode) {
		super();
		this.street = street;
		PostalCode = postalCode;
	}
	
	
}
