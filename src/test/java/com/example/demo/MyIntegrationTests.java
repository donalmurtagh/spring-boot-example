package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.orm.jpa.AbstractEntityManagerFactoryBean;

import static org.mockito.Mockito.doNothing;

@SpringBootTest
public class MyIntegrationTests {

	@SpyBean
	private AbstractEntityManagerFactoryBean entityManagerFactoryBean;

	@Test
	void myIntegrationTest() {
		doNothing().when(entityManagerFactoryBean).destroy();
	}
}
