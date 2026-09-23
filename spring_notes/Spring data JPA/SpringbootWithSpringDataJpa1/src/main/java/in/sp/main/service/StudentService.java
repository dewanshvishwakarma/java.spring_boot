package in.sp.main.service;

import java.util.List;

import in.sp.main.entity.Student;

public interface StudentService
{
	public boolean addStudent(Student std);
	public boolean updateStdDetails(int id, float marks);
	public boolean deleteStdDetailsById(int id);
	public boolean deleteAllStdDetails();
	public Student getStdDetailsById(int id);
	public List<Student> getAllStdDetails();
}