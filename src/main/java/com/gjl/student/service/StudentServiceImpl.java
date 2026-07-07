package com.gjl.student.service;

import com.gjl.student.domain.Student;
import com.gjl.student.dto.StudentDTO;
import com.gjl.student.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService{

    private final StudentRepository studentRepository;

    // 학생 등록
    @Override
    public StudentDTO addStudent(StudentDTO studentDTO) {
        Student student = Student.builder() // 학생 정보 빌드 시작 - id값은 auto increment라서 입력 x
                .name(studentDTO.getName()) // 이름 입력
                .age(studentDTO.getAge()) // 나이 입력
                .build(); // 빌드 완료

        Student addedStudent = studentRepository.save(student); // 입력된 정보를 바탕으로 DB에 학생 등록 -> 등록된 학생의 정보(DB에 추가하면 생성된 id값 포함)를 저장
        return entityToDTO(addedStudent); // 등록된 학생 정보를 return
    }

    // 학생id를 기준으로 특정 학생 조회
    @Override
    public StudentDTO getStudentById(Long studentId) {
        Student student = studentRepository.findById(studentId).orElseThrow(() -> new IllegalArgumentException("존재하지 않는 학생입니다.")); // 없으면 exception

        return entityToDTO(student);
    }

    // 학생 이름을 기준으로 모든 학생 조회(동명이인 존재 가능성 -> List<Student>)
    @Override
    public List<StudentDTO> getStudentByName(String name) {
        List<Student> studentList = studentRepository.findByName(name);

        if (studentList==null || studentList.size()==0){
            throw new IllegalArgumentException("조건에 맞는 학생이 존재하지 않습니다.");
        }

        return studentList.stream().map(StudentDTO::new).toList(); // studentList는 Student 타입이기 떄문에 StudentDTO 타입으로 변환이 필요
    }

    // 학생 나이를 기준으로 모든 학생 조회(같은 나이의 학생 존재 가능성 -> List<Student>)
    @Override
    public List<StudentDTO> getStudentByAge(int age) {
        List<Student> studentList = studentRepository.findByAge(age);

        if (studentList==null || studentList.size()==0){
            throw new IllegalArgumentException("조건에 맞는 학생이 존재하지 않습니다.");
        }

        return studentList.stream().map(StudentDTO::new).toList(); // studentList는 Student 타입이기 떄문에 StudentDTO 타입으로 변환이 필요
    }

    @Override
    public List<StudentDTO> findAll() {
        return List.of();
    }

}
