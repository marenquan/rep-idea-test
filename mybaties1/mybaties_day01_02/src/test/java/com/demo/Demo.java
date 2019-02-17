package com.demo;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.session.defaults.DefaultSqlSessionFactory;

import java.io.IOException;
import java.io.InputStream;

public class Demo {
    public static void main(String[] args) throws Exception {
        //读取核心配置文件
        InputStream is = Resources.getResourceAsStream("sqlComfig.xml");
        //创建sqlsessionfactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);

        //获取sqlsession
        //执行操作
        //事物提交
        //释放资源（关闭sqlsession）
    }
}
