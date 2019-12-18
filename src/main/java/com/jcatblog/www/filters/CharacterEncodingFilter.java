package com.jcatblog.www.filters;

import javax.servlet.*;
import java.io.IOException;

public class CharacterEncodingFilter implements Filter {
    private String encoding = null;
    //销毁
    public void destroy() { }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        if(encoding!=null){
            req.setCharacterEncoding(encoding);
            resp.setContentType("text/html;charset="+encoding.toLowerCase());
        }else {
            encoding = "UTF-8";
            req.setCharacterEncoding(encoding);
            resp.setContentType("text/html;charset="+encoding.toLowerCase());
        }
        chain.doFilter(req, resp);
    }
    //初始化
    public void init(FilterConfig config) { }
}
