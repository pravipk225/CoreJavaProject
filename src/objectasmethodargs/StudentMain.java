package objectasmethodargs;

public class StudentMain {
	public static void main(String[] args) {
		Student stuMurli=new Student(1010, "Murli", 60.56, 99, 77);
		Student stuAjay=new Student(2020, "Ajay", 92, 32, 12);
		SchoolSystem scSystem=new SchoolSystem();
		Result murliResult=scSystem.getResult(stuMurli);
		Result ajayResult=scSystem.getResult(stuAjay);
		scSystem.showStudentDetails(stuAjay);
		scSystem.showStudentResult(ajayResult);
		System.out.println("---------------------");
		scSystem.showStudentDetails(stuMurli);
		scSystem.showStudentResult(murliResult);
	}

}
