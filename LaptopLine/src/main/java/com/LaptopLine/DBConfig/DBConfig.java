package com.LaptopLine.DBConfig;

import java.util.Properties;
import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.LaptopLine.model.Category;
import com.LaptopLine.model.Item;
import com.LaptopLine.model.Distributor;
import com.LaptopLine.model.PurchaseDetails;
import com.LaptopLine.model.CartDetails;
import com.LaptopLine.model.User;

@Configuration
@EnableTransactionManagement
@ComponentScan("com.LaptopLine")
public class DBConfig {

	@Bean(name="dataSource")
	public DataSource getH2DataSource()
	{
		DriverManagerDataSource dataSource=new DriverManagerDataSource();
		dataSource.setDriverClassName("org.h2.Driver");
		dataSource.setUrl("jdbc:h2:tcp://localhost/~/test");
		dataSource.setUsername("sa");
		dataSource.setPassword("123456");
		return dataSource;
}
	
	 
	@Bean(name="sessionFactory")
	public SessionFactory getSessionFactory()
	{
		Properties hibernateProperties=new Properties();
		hibernateProperties.put("hibernate.dialect","org.hibernate.dialect.H2Dialect");
		hibernateProperties.setProperty("hibernate.hbm2ddl.auto", "update");
		
		LocalSessionFactoryBuilder localsessionFactory=new LocalSessionFactoryBuilder(getH2DataSource());
		localsessionFactory.addProperties(hibernateProperties);
		
		localsessionFactory.addAnnotatedClass(Category.class);
		localsessionFactory.addAnnotatedClass(Item.class);
		localsessionFactory.addAnnotatedClass(Distributor.class);
		localsessionFactory.addAnnotatedClass(PurchaseDetails.class);
		localsessionFactory.addAnnotatedClass(CartDetails.class);
		localsessionFactory.addAnnotatedClass(User.class);
		
		SessionFactory sessionFactory=localsessionFactory.buildSessionFactory();
		
		return sessionFactory;
		
}
	
	@Bean(name="txManager")
	public HibernateTransactionManager getHibernateTransactionmanager(SessionFactory sessionFactory)
	{
		return new HibernateTransactionManager(sessionFactory);
	}
	
}
