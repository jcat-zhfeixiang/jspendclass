package com.jcatblog.www.servlets;

import com.jcatblog.www.beans.ContactBean;
import com.jcatblog.www.beans.ResponseContactBean;
import com.jcatblog.www.daos.ContactDao;
import com.jcatblog.www.daos.daosimpl.ContactDaoImpl;
import com.jcatblog.www.utils.ContactUtil;
import org.apache.log4j.Logger;
import com.alibaba.fastjson.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.Set;

@WebServlet(name = "ContactServlet")
public class ContactServlet extends HttpServlet {
    private static Logger logger = Logger.getLogger(ContactServlet.class);
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Validator validator;
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
        ResponseContactBean responseContactBean = new ResponseContactBean();
        boolean result = true;
        ContactDao contactDao = new ContactDaoImpl();
        ContactBean contactBean = new ContactBean(
                ContactUtil.getContectId(),
                ContactUtil.getContectDate(),
                request.getParameter("name"),
                request.getParameter("email"),
                request.getParameter("message")
                );
        logger.debug(JSON.toJSONString(contactBean));
        Set<ConstraintViolation<ContactBean>> constraintViolations = validator.validate(contactBean);
        Iterator<ConstraintViolation<ContactBean>> ite = constraintViolations.iterator();
        if (!ite.hasNext()){
            try {
                contactDao.createContact(contactBean);
                responseSuccess(responseContactBean);
                response.getWriter().append(JSON.toJSONString(responseContactBean));
            } catch (SQLException e) {
                logger.error(e);
                responseFaild(responseContactBean);
                response.getWriter().append(JSON.toJSONString(responseContactBean));
            }
        }else {
            while (ite.hasNext()) System.out.println(ite.next().getMessage());
            responseFaild(responseContactBean);
            response.getWriter().append(JSON.toJSONString(responseContactBean));
        }
    }

    private void responseSuccess(ResponseContactBean responseContactBean){
        responseContactBean.setCode("200");
        responseContactBean.setMsg("留言成功，谢谢！");
    }
    private void responseFaild(ResponseContactBean responseContactBean){
        responseContactBean.setCode("400");
        responseContactBean.setMsg("留言失败，Sorry！");
    }
}
