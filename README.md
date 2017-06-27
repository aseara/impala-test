# impala-test

这是使用jdbc连接impala的测试项目。
项目中使用的jdbc的版本是兼容CDH5.11.1的Hive JDBC驱动。


本项目首先使用原生的jdbc方式测试连接impala，测试通过。对应类`com.hginfo.db.impala.NativeJdbc`


然后使用druid连接池 + spring jdbcTemplate的方式测试连接impala。对应类`com.hginfo.db.impala.JdbcTemplateTest`

上述两种方式测试都能够成功连接impala并返回数据。因此在项目中使用jdbc连接impala的方式查询明细数据是没有问题的。