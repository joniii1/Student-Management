package com.example.studentmanagement.Repository;
import com.example.studentmanagement.Domain.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long>{

}