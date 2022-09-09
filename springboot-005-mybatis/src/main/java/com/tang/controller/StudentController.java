package com.tang.controller;

import com.tang.mapper.StudentMapper;
import com.tang.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author 临渊
 * @Date 2022-09-09 10:20
 */

@RestController
public class StudentController {

    @Autowired
    private StudentMapper studentMapper;

    @GetMapping("/queryStudentList")
    public List<Student> queryStudentList() {
        List<Student> studentList = studentMapper.queryStudentList();
        for (Student student: studentList) {
            System.out.println(student);
        }
        return studentList;
    }

}
