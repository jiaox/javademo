package com.jiaox.annotation;

import java.lang.reflect.InvocationTargetException;
/**
 * 通过注解进行赋值（结合了工厂方法模式）
 * @author Administrator
 *
 */
public class Test
{
    public static void main(String[] args) throws IllegalAccessException,
            IllegalArgumentException, InvocationTargetException
    {
        User user = UserFactory.create();
        System.out.println(user.getName());
        System.out.println(user.getAge());
    }
}
