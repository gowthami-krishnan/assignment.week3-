package Week3;

public class Students {

	
	public void getStudentInfo(long id) {
		System.out.println("Student Id is 12345");
		 
	}
	public void getStudentInfo(String name,int id) {
		System.out.println("Student name=" + name +","+"Student Id=" +id) ;
	}
	public void getStudentInfo(long phonenumber,String emailId) {
		System.out.println("MobileNumber=" +phonenumber+","+"EmailId="+emailId);
	}
	
	 
	 public static void main(String[] args) {
		 Students stu=new Students();
		 stu.getStudentInfo(12345);
		 stu.getStudentInfo("Gowthami", 12345);
		 stu.getStudentInfo(7708024295L,"gowthamikrishnan09@gmail.com");
		 
		 
	 }
	 
	 
	 }
		 
		
		
		
		

	


