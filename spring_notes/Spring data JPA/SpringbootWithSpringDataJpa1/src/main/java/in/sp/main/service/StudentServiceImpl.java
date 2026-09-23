package in.sp.main.service;

import java.util.List;
import java.util.Optional;

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
	public boolean addStudent(Student std)
	{
		try
		{
			stdRepository.save(std);
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean updateStdDetails(int id, float marks)
	{
		try
		{
			Optional<Student> optional = stdRepository.findById(id);
			Student std = optional.get();
			
			std.setMarks(marks);
			
			stdRepository.save(std);
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean deleteStdDetailsById(int id)
	{
		try
		{
			stdRepository.deleteById(id);
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean deleteAllStdDetails()
	{
		try
		{
			stdRepository.deleteAll();
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public Student getStdDetailsById(int id)
	{
		Optional<Student> optional = stdRepository.findById(id);
		if(optional.isPresent())
		{
			return optional.get();
		}
		else
		{
			return null;
		}
	}

	@Override
	public List<Student> getAllStdDetails() 
	{
		return stdRepository.findAll();
	}
}