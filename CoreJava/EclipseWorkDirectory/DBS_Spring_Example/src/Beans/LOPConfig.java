package Beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LOPConfig {

	@Bean
	public A a() {
		return new A();
	}
	
	@Bean
	public B b() {
		return new B();
	}
	
}
