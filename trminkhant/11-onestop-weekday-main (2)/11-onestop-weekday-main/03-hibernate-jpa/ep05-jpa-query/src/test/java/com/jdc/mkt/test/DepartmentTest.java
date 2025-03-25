package com.jdc.mkt.test;

import org.junit.jupiter.api.BeforeAll;

import com.jdc.mkt.services.EmployeeService;

public class DepartmentTest {
	private static EmployeeService empService;
	@BeforeAll
	void init() {
		empService = new EmpService();
	}
	@ParameterizedTest
	@CsvSource
		

}
