package com.jiaox.annotation;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.jiaox.annotation.UseCase.UseCases;

/**
 * 解析注解：
 * 
 * */
public class UseCaseTest {
	public static void main(String[] args) {
		List<Integer> useCases = new ArrayList<Integer>();
		Collections.addAll(useCases, 47, 48, 49, 50);
		trackUseCases(useCases, PasswordUtils.class);
	}

	public static void trackUseCases(List<Integer> useCases, Class<?> cl) {
		for (Method m : cl.getDeclaredMethods()) {
			// 获得注解的对象
			UseCases uc = m.getAnnotation(UseCases.class);
			if (uc != null) {
				System.out.println("Found Use Case:" + uc.id() + " "
						+ uc.description());
				useCases.remove(new Integer(uc.id()));
			}
		}
		for (int i : useCases) {
			System.out.println("Warning: Missing use case-" + i);
		}
	}
}