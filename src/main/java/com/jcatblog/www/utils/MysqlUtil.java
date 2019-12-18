package com.jcatblog.www.utils;

import org.apache.log4j.Logger;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MysqlUtil {
    private static Logger logger = Logger.getLogger(MysqlUtil.class);
    private static DataSource dataSource;

    static {
        try {
            Context ctx = new InitialContext();
            Context envContext = (Context) ctx.lookup("java:comp/env/");
            dataSource = (DataSource) envContext.lookup("jdbc/jspendclass_datasource");
        } catch (Exception e) {
            logger.error(e);
        }
    }

    public static Connection getConnect() {
        Connection connection = null;
        try {
            connection = dataSource.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
            logger.error(e);
        }
        return connection;
    }

    public static void release(Connection conn, Statement sta, ResultSet res) {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
                logger.error(e);
            }
        }
        if (sta !=null){
            try {
                sta.close();
            } catch (SQLException e) {
                e.printStackTrace();
                logger.error(e);
            }
        }
        if (res!=null){
            try {
                res.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
