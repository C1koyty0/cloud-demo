package com.inspur.cloudbiz1.controller;

import com.inspur.cloudbiz1.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 *
 * @author chenboyu02
 */
@RestController
@RequestMapping("student")
public class TestController {

    @GetMapping("list")
    public String list() {
        Student student = new Student();
        return student.setAge(17).setName("Test").setId(1).toString();
    }
}
