package com.it.Runner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.it.Writer.Writer;

public class Runner {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("Const-arg.xml");
		Writer writer = (Writer) context.getBean("writer");
		writer.write();

	}

}
