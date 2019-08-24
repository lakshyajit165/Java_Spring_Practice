package com.spring.springbasics;

import com.spring.springbasics.basic.BinarySearchImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.spring.componentscan")
public class SpringbasicsApplication {

	// What are the beans?
	// What are the dependencies of a bean?
	// Where to search for beans? => No need (@SpringBootApplication does the job)
	public static void main(String[] args) {

//		BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());
//

		// System.out.println(res);

		// Application Context
		ApplicationContext applicationContext = SpringApplication.run(SpringbasicsApplication.class, args);

		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		int res = binarySearch.binarySearch(new int[]{12, 4, 6}, 3);

		System.out.println(res);
	}

}
