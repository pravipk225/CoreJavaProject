package objectasmethodargs;

public class SchoolSystem {
	public Result getResult(Student stu){
		double totalMark=stu.getcProgMark()+stu.getJavaMark()+stu.getSqlMark();
		double avgMark=totalMark/3;
		String status="FAIL";
		if(avgMark>=70){
			status="PASS";
		}
		Result stuResult=new Result();
		stuResult.setRollNo(stu.getRollNo());
		stuResult.setName(stu.getName());
		stuResult.setStatus(status);
		return stuResult;
	}
	
	public void showStudentDetails(Student stu){
		System.out.println("Student Details: ");
		System.out.println("RollNo      : "+stu.getRollNo());
		System.out.println("Name        : "+stu.getName());
		System.out.println("C Prog mark : "+stu.getcProgMark());
		System.out.println("SQL Mark    : "+stu.getSqlMark());
		System.out.println("Java Mark   : "+stu.getJavaMark());
	}
	public void showStudentResult(Result result){
		System.out.println("*************************");
		System.out.println("Student Result Details:");
		System.out.println("RollNo       : "+result.getRollNo());
		System.out.println("Name         : "+result.getName());
		System.out.println("Result Status: "+result.getStatus());
	}
	
	

}








