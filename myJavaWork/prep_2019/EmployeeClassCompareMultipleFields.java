package prep_2019;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeClassCompareMultipleFields {

	public static void main(String args[]) {

		Employee emp1 = new Employee("Abhishek", 34);
		Employee emp3 = new Employee("Robin", 29);
		Employee emp4 = new Employee("Zoo", 28);
		Employee emp5 = new Employee("Abhi", 55);
		Employee emp2 = new Employee("Abhishek", 31);

		List<Employee> ls = new ArrayList<>();
		ls.add(emp1);
		ls.add(emp2);
		ls.add(emp3);
		ls.add(emp4);
		ls.add(emp5);
		Collections.sort(ls, new MixComparator());
		System.out.println(ls);
	}
}

class Employee {

	private String name;
	private int age;

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + "]";
	}

	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}

class MixComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		int compareResult = o1.getName().compareTo(o2.getName());

		if (compareResult != 0) {
			return compareResult;
		}

		Integer age1 = o1.getAge();
		Integer age2 = o2.getAge();

		// return (age1.compareTo(age2));
		return age1 - age2;
	}
}
