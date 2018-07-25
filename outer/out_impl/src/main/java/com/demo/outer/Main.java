package com.demo.outer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


/**
 * @description
 * @auther monicamo
 * @date 2018/7/25
 */
@ComponentScan(basePackages = {"com.demo"})
@SpringBootApplication
public class Main {

	//使用指定类初始化日志对象，日志输出时，打印出日志信息的对象
	private static Logger logger = LoggerFactory.getLogger(Main.class);

	public static void main(String[] args) {

		SpringApplication.run(Main.class,args);
		logger.info("demo spring boot started");
	}
}
