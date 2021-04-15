package Week02;

public class StudentMain {

	

		public static void main(String[] args) {
				
			Student s;
			s=getStudentInfo();
			displayStudentInfo(s);	
		}
		public static Student getStudentInfo()
		{
			Student s1=new Student();
			s1.setName("Mary");
			s1.setFee(1000);
			s1.setStuId(2);
			
			return(s1);
		}
		public static void displayStudentInfo(Student d)
		{
			System.out.println(d.getFee());
			System.out.println(d.getName());
			System.out.println(d.getStuId());
			
		}

	

}
