package in.sp.main;

import java.util.List;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import in.sp.main.entity.Student;
import in.sp.main.service.StudentService;
import in.sp.main.service.StudentServiceImpl;

@SpringBootApplication
public class SpringbootWithSpringDataJpa1Application 
{
	public static void main(String[] args)
	{
		ApplicationContext context = SpringApplication.run(SpringbootWithSpringDataJpa1Application.class, args);
		
		StudentService stdService = context.getBean(StudentServiceImpl.class);
		
		
		//--------insert operation----------------------
//		Student std = new Student();
//		std.setId(3);
//		std.setName("kamal");
//		std.setRollno(103);
//		std.setMarks(84.3f);
//		
//		boolean status = stdService.addStudent(std);
//		if(status)
//		{
//			System.out.println("insertion success");
//		}
//		else
//		{
//			System.out.println("insertion failed");
//		}
		
		
		//-------select by id operation---------------------
//		Student std = stdService.getStdDetailsById(2);
//		if(std != null)
//		{
//			System.out.println("Id : "+std.getId());
//			System.out.println("Name : "+std.getName());
//			System.out.println("Rollno : "+std.getRollno());
//			System.out.println("Marks : "+std.getMarks());
//		}
//		else
//		{
//			System.out.println("No record found");
//		}
		
		
		
		//--------select all students-------------------
//		List<Student> std_list = stdService.getAllStdDetails();
//		for(Student std : std_list)
//		{
//			System.out.println("Id : "+std.getId());
//			System.out.println("Name : "+std.getName());
//			System.out.println("Rollno : "+std.getRollno());
//			System.out.println("Marks : "+std.getMarks());
//			
//			System.out.println("------------------");
//		}
		
		
		
		//----------update student--------------------
//		boolean status = stdService.updateStdDetails(2, 95.5f);
//		if(status)
//		{
//			System.out.println("updation success");
//		}
//		else
//		{
//			System.out.println("updation failed");
//		}
		
		
		
		//----------delete student by id----------------
//		boolean status = stdService.deleteStdDetailsById(3);
//		if(status)
//		{
//			System.out.println("deletion success");
//		}
//		else
//		{
//			System.out.println("deletion failed");
//		}
		
		
		
		//----------delete all students----------------
		boolean status = stdService.deleteAllStdDetails();
		if(status)
		{
			System.out.println("deletion success");
		}
		else
		{
			System.out.println("deletion failed");
		}
	}
}