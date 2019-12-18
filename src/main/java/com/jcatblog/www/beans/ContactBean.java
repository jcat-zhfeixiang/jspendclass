package com.jcatblog.www.beans;


import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class ContactBean {
    @NotNull
    @Length(min = 18 ,max = 18,message = "id长度必须为18字符长度")
    private String id;

    @NotNull
    @Length(min = 19,max = 19,message = "日期的长度为20字符长度")
    @Pattern(regexp = "^[1-9]\\d{3}-(0[1-9]|1[0-2])-(0[1-9]|[1-2][0-9]|3[0-1])\\s+(20|21|22|23|[0-1]\\d):[0-5]\\d:[0-5]\\d$",message = "日期格式为:yyyy-MM-dd HH:mm:ss")
    private String date;

    @NotNull
    @Length(min = 4,max = 12,message = "名字长度为4-12字符长度之间")
    private String name;

    @NotNull
    @Pattern(regexp = "^[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+(\\.[a-zA-Z0-9_-]+)+$",message = "邮箱格式")
    private String email;

    @NotNull
    @Length(max = 250 , message = "信息长度为0-250字符长度")
    private String message;

    private ContactBean(){}
    public ContactBean(@NotNull @Length(min = 18, max = 18, message = "id长度必须为18字符长度") String id,
                       @NotNull @Length(min = 20, max = 20, message = "日期的长度为20字符长度") @Pattern(regexp = "^[1-9]\\d{3}-(0[1-9]|1[0-2])-(0[1-9]|[1-2][0-9]|3[0-1])\\s+(20|21|22|23|[0-1]\\d):[0-5]\\d:[0-5]\\d$", message = "日期格式为:yyyy-MM-dd HH:mm:ss") String date,
                       @NotNull @Length(min = 4, max = 12, message = "名字长度为4-12字符长度之间") String name,
                       @NotNull @Pattern(regexp = "^[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+(\\.[a-zA-Z0-9_-]+)+$", message = "邮箱格式") String email,
                       @NotNull @Length(max = 250, message = "信息长度为0-250字符长度") String message) {
        this.id = id;
        this.date = date;
        this.name = name;
        this.email = email;
        this.message = message;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


}
