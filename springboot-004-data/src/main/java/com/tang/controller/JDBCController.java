package com.tang.controller;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @Author 临渊
 * @Date 2022-09-09 7:53
 */

@RestController
public class JDBCController {

    @Resource
    JdbcTemplate jdbcTemplate;

    // 查询数据库的所有信息
    // 没有实体类数据库的东西怎么获取  Map
    @GetMapping("/userList")
    public List<Map<String, Object>> userList() {
        String sql = "select * from student";
        List<Map<String, Object>> mapList = jdbcTemplate.queryForList(sql);
        return mapList;
    }

    @GetMapping("/addUser")
    public String addUser() {
        String sql = "insert into student(name, age, email, status) values ('T', 17, '@T.com', 0)";
        jdbcTemplate.update(sql);
        return "OK";
    }

    @GetMapping("/updateUser")
    public String UpdateUser() {
        String sql = "update student set name = ?, age = ? where id = ?";
        Object[] objects = new Object[3];
        objects[0] = "C";
        objects[1] = 20;
        objects[2] = 5;
        jdbcTemplate.update(sql, objects);
        return "update ====== OK";
    }

    @GetMapping("/deleteUser")
    public String deleteUser() {
        String sql = "delete from student where id = ?";
        Integer id = 2;
        jdbcTemplate.update(sql, id);
        return "deleteUser ======= OK";
    }

}
