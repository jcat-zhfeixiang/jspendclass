package com.jcatblog.www.daos;

import com.jcatblog.www.beans.ContactBean;

import java.sql.SQLException;
import java.util.List;

public interface ContactDao {
    public boolean createContact(ContactBean contactBean) throws SQLException;
    public boolean deleteContact(String contactId);
    public List<ContactBean> selectContact();
}