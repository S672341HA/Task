package com.codes.studentsystem.service;

import java.util.List;

import com.codes.studentsystem.model.Student;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}
