package com.hginfo.bd.impala;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Created by qiujingde on 2017/6/27.
 * 测试使用druid连接池连接impala
 */
public class JdbcTemplateTest {

    public static void main(String[] args) throws Exception {

        ApplicationContext context = new ClassPathXmlApplicationContext("springContext.xml");

        JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);

        int count = jdbcTemplate.queryForObject("select count(*) from user_collect", Integer.class);

        System.out.println("user_collect count: " + count);

        System.exit(0);
    }

}
