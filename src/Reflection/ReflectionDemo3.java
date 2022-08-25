package Reflection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.HashSet;

/**
 * How to display the metadata of a class.
 *
 */
public class ReflectionDemo3 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Enter the ClassName: ");
			String className = null;
			try {
				className = br.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				br.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			Class<?> classObj = null;
			try {
				classObj = Class.forName(className);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Fields: ");

			/*
			 * Returns:the array of Field objects representing all the declared fields of
			 * this class
			 */
			Field[] fieldArray = classObj.getDeclaredFields();
			for (Field field : fieldArray) {
				System.out.println(field);
			}

			System.out.println("---------------------------------------");

			System.out.println("\nConstructors:");
			/*
			 * Returns:the array of Constructor objects representing all the declared
			 * constructors of this class
			 */
			Constructor<?>[] constructorArray = classObj.getDeclaredConstructors();

			for (Constructor<?> constructor : constructorArray) {
				System.out.println(constructor);
			}
			System.out.println("---------------------------------------");

			System.out.println("\nMethods:");
			/*
			 * Returns:the array of Method objects representing all the declared methods of
			 * this class
			 */
			Method[] methodArray = classObj.getDeclaredMethods();

			for (Method method : methodArray) {
				System.out.println(method);
			}

			//
			Class<HashSet> classObj1 = HashSet.class;

			/*
			 * Returns:the array of Constructor objects representing the public constructors
			 * of this class
			 */

			Constructor[] constructorArray1 = classObj1.getConstructors();

			for (Constructor constructor : constructorArray1) {
				System.out.println("constructor = " + constructor);
				System.out.println("Parameter Count = " + constructor.getParameterCount());
				/*
				 * Returns:an array of Parameter objects representing all the parameters to the
				 * executable this object represents.
				 */
				Parameter[] parameterArray = constructor.getParameters();
				for (Parameter parameter : parameterArray) {
					System.out.println("Parameter Type = " + parameter.getParameterizedType());
					System.out.println("Parameter Name = " + parameter.getName());
				}
				System.out.println("--------------------------------");
			}
		}

		finally {

		}
	}
}
