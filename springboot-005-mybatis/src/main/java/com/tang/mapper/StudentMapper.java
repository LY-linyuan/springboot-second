package com.tang.mapper;

import com.tang.pojo.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author 临渊
 * @Date 2022-09-09 10:00
 */

// 这个注解表示了这是一个 mybatis 的 mapper类
@Mapper
@Repository
public interface StudentMapper {

    List<Student> queryStudentList();

    Student queryById(int id);

    int addStudent(Student student);

    int updateStudent(Student student);

    int deleteStudent(int id);

}
