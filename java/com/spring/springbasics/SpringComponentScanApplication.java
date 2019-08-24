package com.spring.springbasics;

import com.spring.componentscan.ComponentDAO;

import com.spring.springbasics.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.awt.*;

@SpringBootApplication
public class SpringComponentScanApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringComponentScanApplication.class);

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(SpringComponentScanApplication.class, args);

		ComponentDAO componentDAO = applicationContext.getBean(ComponentDAO.class);

		ComponentDAO componentDAO2 = applicationContext.getBean(ComponentDAO.class);

		LOGGER.info("{}", componentDAO);

	}

}
