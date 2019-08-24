package com.spring.springbasics;

import com.spring.springbasics.basic.BinarySearchImpl;
import com.spring.springbasics.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringScopeApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringScopeApplication.class);

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(SpringScopeApplication.class, args);

		PersonDAO personDAO = applicationContext.getBean(PersonDAO.class);

		PersonDAO personDAO2 = applicationContext.getBean(PersonDAO.class);

		LOGGER.info("{}", personDAO);
		LOGGER.info("{}", personDAO.getJdbcConnection());

		LOGGER.info("{}", personDAO2);
		LOGGER.info("{}", personDAO2.getJdbcConnection());
	}

}
