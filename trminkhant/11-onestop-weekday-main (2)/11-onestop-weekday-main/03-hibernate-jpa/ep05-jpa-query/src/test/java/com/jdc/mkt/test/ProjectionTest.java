package com.jdc.mkt.test;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;

import com.jdc.mkt.entity.Employee;
import com.jdc.mkt.entity.dto.EmployeeDto;
import com.jdc.mkt.services.projection_join.EmployeeProjectionService;

public class ProjectionTest {
	static EmployeeProjectionService empProjectService;
	@BeforeAll
	static void init() {
		empProjectionService = new EmployeeProjectionService();
	}
	@Test
	public List<EmployeeDto> findEmployeeWithJpql();
	
	var em = emf.createEntityManager();
	var query = em.createQuery("""
			select new com.jdc.mkt.entity.dto.EmployeeDto(
			e.name,e.dob,e.department.name)
			from Employee e 
			""",EmployeeDto.class);
	return query.getResultList();
	
	
}
`public List<EmployeeDto> findEmployeeWithCritera(){
	var em = em.createEntityManager();
	var cb = em.getCriteriaBuilder();
	var cq = cb.createQuery(EmployeeDto.class);
	 
	var root = cq.from(Employee.class);
	cq.multiselector()
	
	}
}
