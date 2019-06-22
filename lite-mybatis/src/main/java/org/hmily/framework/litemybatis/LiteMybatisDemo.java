package org.hmily.framework.litemybatis;

public class LiteMybatisDemo {

    // Mybatis

    // 什么是mybatis？？
    // MyBatis 是一款优秀的持久层框架，它支持定制化 SQL、存储过程以及高级映射。MyBatis 避免了几乎所有的 JDBC 代码和手动设置参数以及获取结果集。
    // MyBatis 可以使用简单的 XML 或注解来配置和映射原生信息，将接口和 Java 的 POJOs(Plain Old Java Objects,普通的 Java对象)映射成数据库中的记录。

    // mybatis的原理
    // 当框架启动时，通过configuration解析config.xml配置文件和mapper.xml映射文件，映射文件可以使用xml方式或者注解方式，
    // 然后由configuration获得sqlsessionfactory对象，再由sqlsessionfactory获得sqlsession数据库访问会话对象，通过会话对象获得对应DAO层的mapper对象，
    // 通过调用mapper对象相应方法，框架就会自动执行SQL语句从而获得结果。


    //

}
