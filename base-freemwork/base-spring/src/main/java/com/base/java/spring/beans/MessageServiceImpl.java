package com.base.java.spring.beans;

/**
 * @author tangwei
 * @date 2019/3/7 17:42
 */
public class MessageServiceImpl implements MessageService  {
    @Override
    public String getMessage() {
        return "hello world";
    }
}
