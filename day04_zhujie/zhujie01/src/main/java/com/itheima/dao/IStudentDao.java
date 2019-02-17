package com.itheima.dao;

import com.itheima.domai.Student;

import java.util.List;

public interface IStudentDao {
    List<Student> findAll();
}
