package com.gjl.student.service;

import com.gjl.student.domain.Student;
import com.gjl.student.dto.StudentDTO;

import java.util.List;

public interface StudentService {

    // 학생 등록
    StudentDTO addStudent(StudentDTO studentDTO);
    // 학생id를 기준으로 특정 학생 조회
    StudentDTO getStudentById(Long studentId);
    // 이름을 기준으로 특정 학생들 조회
    List<StudentDTO> getStudentByName(String name);
    // 나이를 기준으로 특정 학생들 조회
    List<StudentDTO> getStudentByAge(int age);

    // 모든 학생들 조회
    List<StudentDTO> findAll();

    // 학생 정보 수정
    StudentDTO updateStudentById(StudentDTO studentDTO);

    // 특정 학생 삭제
    StudentDTO deleteStudentById(Long studentId);

    // DB에서 가져온 Student 타입의 데이터를 StudentDTO로 변환
    default StudentDTO entityToDTO(Student student) {
        return new StudentDTO(student);
    }

}
