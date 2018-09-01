package com.shank.onemore;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

class One {
	
}

class Two {
	
}

class Three {
	
}

@Configuration
public class MyConfig {

	@Bean(name="deepthi Naughty")
	public One getOne() {
		return new One();
	}
	
	@Bean(name="My Dear RaghuDada")
	public Two getTwo() {
		return new Two();
	}
	
	@Bean(name="prenithSeriousOne")
	public Three getThree() {
		return new Three();
	}
	
}
