package com.jiaox.annotation;
/**
 * 通过注解进行校验
 * @author Administrator
 *
 */
public class Test2 {
	public static void main(String[] args)
    {
        User2 user = new User2();
        
        user.setName("liang");
        user.setAge("1");
        
        System.out.println(UserCheck.check(user));
    }
}
