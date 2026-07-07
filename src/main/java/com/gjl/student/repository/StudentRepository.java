package com.gjl.student.repository;

import com.gjl.student.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {

    // 모든 학생 가져오기 - jpa가 자동으로 제공하는 findAll() 사용
    List<Student> findAll();

    // 학생id로 특정 학생 조회 - jpa가 자동으로 제공하는 findById() 사용
    Student findById(long studentId);

    // 이름으로 학생 찾기 - 동명이인이 있을 수 있으므로 list형태로 가져오기
    @Query("SELECT s FROM Student s WHERE s.student.name = :studentName ORDER BY s.id DESC")
    List<Student> findByName(@Param("studentName") String studentName);

    // 나이로 학생 찾기 - 같은 나이의 여러 학생이 있을 수 있으므로 list 형태로 가져오기
    @Query("SELECT s FROM Student s WHERE s.student.age = :studentAge ORDER By s.id DESC")
    List<Student> findByAge(@Param("studentAge") Integer studentAge);

}
