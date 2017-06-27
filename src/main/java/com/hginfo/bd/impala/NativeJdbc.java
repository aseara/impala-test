package com.hginfo.bd.impala;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Created by qiujingde on 2017/6/27.
 * 测试原生jdbc写法。
 */
public class NativeJdbc {

    static String JDBC_DRIVER = "org.apache.hive.jdbc.HiveDriver";
    static String CONNECTION_URL = "jdbc:hive2://192.168.2.11:21050/;auth=noSasl";

    public static void main(String[] args) throws Exception {
        Class.forName(JDBC_DRIVER);

        try(Connection con = DriverManager.getConnection(CONNECTION_URL);
            PreparedStatement ps = con.prepareStatement("select * from user_collect limit 10");
            ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                System.out.println(rs.getString(2));
            }
        }

        System.exit(0);
    }

}
