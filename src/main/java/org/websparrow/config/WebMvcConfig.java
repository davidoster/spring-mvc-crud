package org.websparrow.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.websparrow.dao.StudentDao;
import org.websparrow.dao.StudentDaoImpl;

@Configuration
@EnableWebMvc
@ComponentScan("org.websparrow")
public class WebMvcConfig {

	@Bean
	InternalResourceViewResolver viewResolver() {

		InternalResourceViewResolver vr = new InternalResourceViewResolver();

		vr.setPrefix("/");
		vr.setSuffix(".jsp");
		return vr;
	}

	@Bean
	DriverManagerDataSource getDataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://172.17.0.2:3306/afdemp?useSSL=false");
		ds.setUsername("root");
		ds.setPassword("root");

		return ds;
	}

	@Bean
	public StudentDao getUserDao() {
		return new StudentDaoImpl(getDataSource());
	}
}