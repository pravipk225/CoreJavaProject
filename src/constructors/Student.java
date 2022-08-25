package constructors;

public class Student {
	int rollNo;
	String name;
	String schoolName;
	public Student() {
		// TODO Auto-generated constructor stub
		System.out.println("default constructor Calling...");
		schoolName="DAV Public School, Saltlake.";
	}
	public Student(int rollNo){
		this();
		System.out.println("one param constructor Calling...");
		this.rollNo=rollNo;
	}
	public Student(int rollNo,String name){
		this(rollNo);
		System.out.println("two param constructor Calling...");
		this.name=name;
	}
	void getDetails(){
		System.out.println("Student Details:");
		System.out.println("Roll No    : "+rollNo);
		System.out.println("Name       : "+name);
		System.out.println("School Name: "+schoolName);
	}
}
