package com.demo;

import com.dao.StudentMapper;
import com.itheima.domain.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

//import java.io.IOException;
import java.io.InputStream;
import java.util.List;


public class Demo {
    @Test
    public static void main(String[] args) throws Exception {
        //1、读取核心配置文件
        InputStream is = Resources.getResourceAsStream("sqlConfig.xml");
        //2、创建SqlSessionFactory 标准查询语言会话工厂
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        //3、获取SqlSession
        //SqlSession提供常用方法：selectone、commit、selectlist、delete、update、insert
        SqlSession sqlSession = factory.openSession();
       /* //4、执行操作
        //参数：namespace+“.”+statement对象的id
        List<Student> list = sqlSession.selectList("one.findAll");
        //5、事物提交
        //6、释放资源或者叫关闭SqlSession
        sqlSession.close();
        is.close();*/
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> all = mapper.findAll();
        for (Student student : all) {
            System.out.println(student);
        }
        sqlSession.close();
    }

}
