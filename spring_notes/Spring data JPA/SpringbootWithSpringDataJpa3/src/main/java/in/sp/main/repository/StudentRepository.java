package in.sp.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import in.sp.main.entity.Student;


@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>
{
	@Query(value = "SELECT * FROM std_marks WHERE std_rollno = :stdRollno", nativeQuery = true)
	public Student myFindByRollno(@Param("stdRollno") int rollno);
}