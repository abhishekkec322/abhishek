package learning;


public class ClassInstanceWithoutNewKeyword implements Cloneable{
	
	public static void main(String args []) throws CloneNotSupportedException, ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		ClassInstanceWithoutNewKeyword obj1 = new ClassInstanceWithoutNewKeyword();
		
		//Using Reflection
		Class<?> ref = Class.forName("learning.ClassInstanceWithoutNewKeyword");
		ClassInstanceWithoutNewKeyword obj2 = (ClassInstanceWithoutNewKeyword)ref.newInstance();

		//Using Class Loader
		Class<ClassInstanceWithoutNewKeyword> obj3 = (Class<ClassInstanceWithoutNewKeyword>) ClassLoader.getSystemClassLoader().loadClass("learning.ClassInstanceWithoutNewKeyword");
		
		//Using Clone of an existing object
		ClassInstanceWithoutNewKeyword obj4 = (ClassInstanceWithoutNewKeyword) obj1.clone();
			
		obj1.callMe();
		obj2.callMe();
		obj3.newInstance().callMe();
		obj4.callMe();
		
		
	}
	
	public void callMe() {
		
		System.out.println("I am Here");
		
	}

}
