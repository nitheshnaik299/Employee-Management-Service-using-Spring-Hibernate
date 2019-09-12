package com.hbspring.configuration;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.hbspring.model.Employee;
import com.mchange.v2.c3p0.DriverManagerDataSource;

@Configuration
@EnableWebMvc
@EnableTransactionManagement
@ComponentScan("com.hbspring")
public class WebConfig {
	
	@Bean
	DriverManagerDataSource dbsource()
	{
		DriverManagerDataSource db=new DriverManagerDataSource();
		db.setDriverClass("com.mysql.jdbc.Driver");
		db.setJdbcUrl("jdbc:mysql://localhost:3306/sakhadb");
		db.setUser("root");
		db.setPassword("root");
	
		return db;
		
	}
	
	@Bean
	public LocalSessionFactoryBean getSsnFac()
	{
		LocalSessionFactoryBean lsf=new LocalSessionFactoryBean();
		lsf.setDataSource(dbsource());
		Properties hbProperties=new Properties();
		hbProperties.put("hibenate.show_sql", true);
		hbProperties.put("hibernate.hbm2ddl.auto", "update");
		hbProperties.put("hibenate.dialect", "org.hibernate.dialect.MySQL5Dialect");
		lsf.setHibernateProperties(hbProperties);
		lsf.setAnnotatedClasses(Employee.class);
		
		return lsf;
		
	}
    @Bean
	public HibernateTransactionManager hbTranscationManager()
	{
		HibernateTransactionManager hbt=new HibernateTransactionManager();
		hbt.setSessionFactory(getSsnFac().getObject());
		return hbt;
	}
}
