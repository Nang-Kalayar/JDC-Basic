package com.solt.demo;

//@ComponentScan(lazyInit = true)
public class AppConfig {
	@Beanpublic
	
	SpringBean4 springBean4() {
		return new SpringBean4();
	}
	@Bean  @Scope("prototype")
	public SpringBean5 springBean5() {
		return new SpringBean5();
	}
	@Bean @Lazy false
	public SpringBean6 springBean6() {
		return new SpringBean6();
	}
	

}
