package com.jcatblog.www.daos.daosimpl;

import com.jcatblog.www.beans.ContactBean;
import com.jcatblog.www.daos.ContactDao;
import com.jcatblog.www.utils.ContactUtil;
import com.jcatblog.www.utils.MysqlUtil;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class ContactDaoImpl implements ContactDao {
    private static Logger logger = Logger.getLogger(ContactDaoImpl.class);
    @Override
    public boolean createContact(ContactBean contactBean) {
        Connection connection = MysqlUtil.getConnect();
        if (connection == null){
            return false;
        }else {
            String sqlString = "INSERT INTO contact VALUES (?,?,?,?,?)";
            try {
                PreparedStatement preparedStatement = connection.prepareStatement(sqlString);
                preparedStatement.setString(1, contactBean.getId());
                preparedStatement.setString(2,contactBean.getDate());
                preparedStatement.setString(3,contactBean.getName());
                preparedStatement.setString(4,contactBean.getEmail());
                preparedStatement.setString(5,contactBean.getMessage());
                int res = preparedStatement.executeUpdate();
                MysqlUtil.release(connection , preparedStatement , null);
                if (res < 0) return false;
            } catch (SQLException e) {
                e.printStackTrace();
                logger.error(e);
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean deleteContact(String contactId) {
        Connection connection = MysqlUtil.getConnect();
        return false;
    }

    @Override
    public List<ContactBean> selectContact() {
        Connection connection = MysqlUtil.getConnect();
        return null;
    }
}
