package prep_2019;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//https://www.geeksforgeeks.org/reflection-in-java/

public class ReflectionTest extends ReflectionTest1 {

	public static void main(String args[]) throws IllegalArgumentException, IllegalAccessException,
			NoSuchFieldException, SecurityException, NoSuchMethodException, InvocationTargetException {

		//Check Local Methods of inner class
		//ReflectionTest obj = new ReflectionTest();
		ReflectionTest1 obj = new ReflectionTest1();

		Class cls = obj.getClass();
		System.out.println("The name of class is " + cls.getName());

		Constructor cons = cls.getConstructor();

		System.out.println("Constructor Name :" + cons);

		System.out.println("The public methods of class are : ");

		Method[] methodsDeclared = cls.getDeclaredMethods();

		Method[] methods = cls.getMethods();

		// Printing method names
		for (Method method : methods)
			System.out.println(method.getName());

		System.out.println("Current class public methods of class are : ");

		for (Method declaredMethod : methodsDeclared) {
			System.out.println("methodsDeclared = " + declaredMethod.getName());
		}

		Field field = cls.getDeclaredField("firstName");
		field.setAccessible(true);
		// char[] value = (char[]) field.get(0);
		// System.out.println("value :" + field.getName());

		field.set(obj, "Abhi");

		Method method2 = cls.getDeclaredMethod("print1");

		method2.invoke(obj);

		Method methodcall3 = cls.getDeclaredMethod("print2");

		methodcall3.setAccessible(true);

		methodcall3.invoke(obj);

	}

	public static void print3() {

		System.out.println("Printing Local");

	}

}
