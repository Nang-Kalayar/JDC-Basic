package com.jdc.mkt.services.projection_join;

import java.util.List;

public class EmployeeProjectionService extends JpaFactoryService{
	
	public List<EmployeeDto> findEmployeeWithJpql(){
		var em = emf.createEntityManager();
		var query = em.createQuery("""
				select new com.jdc.mkt.entity.dto.EmployeeDto(e.name,e.dob,e.department.name)
				from Employee e 
				""")
			
		}
	}


