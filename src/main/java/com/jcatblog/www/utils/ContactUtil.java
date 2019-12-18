package com.jcatblog.www.utils;

import org.apache.log4j.Logger;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class ContactUtil {
    private static Logger logger = Logger.getLogger(ContactUtil.class);

    public static String getContectId(){
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
        LocalDateTime localDateTime = LocalDateTime.now();
        StringBuilder  id= new StringBuilder(dateTimeFormatter.format(localDateTime));
        Random random = new Random();
        for (int size_t = 1 ; size_t <=4 ; size_t ++){
            id.append(random.nextInt(10));
        }
        logger.debug(id);
        return id.toString();
    }
    public static String getContectDate(){
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime localDateTime = LocalDateTime.now();
        StringBuilder date = new StringBuilder(dateTimeFormatter.format(localDateTime));
        logger.debug(date);
        return date.toString();
    }
}
