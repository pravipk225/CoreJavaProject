package objectasmethodargs;

public class Student {
	private int rollNo;
	private String name;
	private double cProgMark;
	private double sqlMark;
	private double javaMark;
	public Student(int rollNo, String name, double cProgMark,
			double sqlMark, double javaMark) {
		this.rollNo = rollNo;
		this.name = name;
		this.cProgMark = cProgMark;
		this.sqlMark = sqlMark;
		this.javaMark = javaMark;
	}
	public int getRollNo() {
		return rollNo;
	}
	public String getName() {
		return name;
	}
	public double getcProgMark() {
		return cProgMark;
	}
	public double getSqlMark() {
		return sqlMark;
	}
	public double getJavaMark() {
		return javaMark;
	}
	
	

}
