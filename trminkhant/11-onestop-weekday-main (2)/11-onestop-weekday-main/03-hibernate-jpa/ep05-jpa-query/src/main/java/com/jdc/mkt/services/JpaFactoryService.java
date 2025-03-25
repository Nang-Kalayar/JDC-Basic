package com.jdc.mkt.test;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JpaFactoryService {

	static EntityManagerFactory emf;
	static void init() {
		emf = Persistence.createEntityManagerFactory("jpa_query");
	}
	
	
	void test() {}
}
