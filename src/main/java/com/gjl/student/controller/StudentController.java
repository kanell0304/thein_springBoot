package com.gjl.student.controller;

import com.gjl.student.dto.StudentDTO;
import com.gjl.student.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/student")
public class StudentController {

    private final StudentService studentService;

    // 학생 등록
    @GetMapping("/add")
    public StudentDTO addStudent(StudentDTO studentDTO) {
        return studentService.addStudent(studentDTO);
    }

    // 모든 학생 조회
    @GetMapping("/students")
    public List<StudentDTO> getStudents(){
        return studentService.findAll();
    }

    // 학생id를 기준으로 특정 학생 조회
    @GetMapping("/get/{studentId}")
    public StudentDTO getStudentById(@PathVariable Long studentId){
        return studentService.getStudentById(studentId);
    }

    // 이름을 기준으로 특정 학생'들' 조회
    @GetMapping("/name/{studentName}")
    public List<StudentDTO> getStudentById(@PathVariable String studentName){
        return studentService.getStudentByName(studentName);
    }

    // 나이를 기준으로 특정 학생'들' 조회
    @GetMapping("/age/{studentAge}")
    public List<StudentDTO> getStudentByAge(@PathVariable int studentAge){
        return studentService.getStudentByAge(studentAge);
    }

}
