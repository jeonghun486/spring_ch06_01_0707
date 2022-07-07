package com.hoon.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String config1 = "classpath:applicationCTX.xml";
		String config2 = "classpath:applicationCTX2.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(config1, config2);
		
		Student student1 = ctx.getBean("student1", Student.class);
		
		StudentInfo studentInfo = ctx.getBean("studentInfo1", StudentInfo.class);
		System.out.println(student1.getName());
		System.out.println(student1.getHobbys());
		
		Student stu1 = studentInfo.getStudent();
		System.out.println(stu1.getName());
		System.out.println(stu1.getHobbys());
		
		Student student2 = ctx.getBean("student2", Student.class);
		System.out.println(student2.getName());
		System.out.println(student2.getHobbys());
		
		
		ctx.close();
	}

}
