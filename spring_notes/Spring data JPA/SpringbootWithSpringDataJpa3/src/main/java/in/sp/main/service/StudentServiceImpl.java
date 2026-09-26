package in.sp.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.sp.main.entity.Student;
import in.sp.main.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService
{
	@Autowired
	private StudentRepository stdRepository;
	
	@Override
	public Student getStdDetailsByRollno(int rollno)
	{
		return stdRepository.myFindByRollno(rollno);
	}
}
