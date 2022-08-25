package test;

import java.io.*;

public class Person implements Serializable {
	int id = 0;
	String name = "empty";

	public Person(int identity, String nomenclature) {
		name = nomenclature;
		id = identity;
	}

	public static void main(String[] args) throws FileNotFoundException, IOException {
		String filename = "filename here";
		Person person = new Person(1, "John");
		// serialization
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename));
		try {
			out.writeObject(person);
			System.out.println("Success");
		} catch (Exception e) {
			System.out.println("Unsuccessful");
		} finally {
			if (out != null) {
				out.close();
			}
		}
	}
	
}