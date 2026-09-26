package in.sp.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import in.sp.main.entity.Student;
import in.sp.main.service.StudentService;
import in.sp.main.service.StudentServiceImpl;

@SpringBootApplication
public class SpringbootWithSpringDataJpa2Application 
{
	public static void main(String[] args) 
	{
		ApplicationContext context = SpringApplication.run(SpringbootWithSpringDataJpa2Application.class, args);
		StudentService stdService = context.getBean(StudentServiceImpl.class);
		
		Student std = stdService.getStdDetailsByRollno(102);
		System.out.println("----------------");
		System.out.println("Id : "+std.getId());
		System.out.println("Name : "+std.getName());
		System.out.println("Rollno : "+std.getRollno());
		System.out.println("Marks : "+std.getMarks());
		System.out.println("----------------");
	}
}