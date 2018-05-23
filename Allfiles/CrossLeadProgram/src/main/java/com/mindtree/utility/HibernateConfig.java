package com.mindtree.utility;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/**
 * @author M1044323
 * @description This class is to configure Spring and Hibernate.
 *
 */

@Configuration
@PropertySource({ "classpath:application.properties" })
@ComponentScan({ "com.mindtree" })
@EnableWebMvc
@EnableTransactionManagement
public class HibernateConfig {
	@Value("${jdbc.driverClassName}")
	private String driverClassName;
	@Value("${jdbc.url}")
	private String url;
	@Value("${jdbc.username}")
	private String userName;
	@Value("${jdbc.password}")
	private String password;
	@Value("${hibernate.dialect}")
	private String hibernateDialect;
	@Value("${hibernate.show_sql}")
	private String hibernateShowSql;
	@Value("${hibernate.hbm2ddl.auto}")
	private String hibernateHbm2ddlAuto;

	/**
	 * @description InternalResourceViewResolver is used to resolve internal
	 *              resource view (in simple, it final output, jsp or htmp page)
	 *              based on a predefined URL pattern. In additional, it allow you
	 *              to add some predefined prefix or suffix to the view name (prefix
	 *              + view name + suffix), and generate the final view page URL.
	 */
	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/");
		viewResolver.setSuffix(".jsp");
		viewResolver.setViewClass(JstlView.class);
		return viewResolver;
	}

	/**
	 * @description DataSource is used to set the database properties.
	 * @return DriverManagerDataSource
	 */
	@Bean
	public DataSource getDataSource() {
		DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
		driverManagerDataSource.setDriverClassName(driverClassName);
		driverManagerDataSource.setUrl(url);
		driverManagerDataSource.setUsername(userName);
		driverManagerDataSource.setPassword(password);
		return driverManagerDataSource;
	}

	/**
	 * @description getHibernateProperties method sets the hibernate properties.
	 * 
	 * @return properties.
	 */
	@Bean
	public Properties getHibernateProperties() {
		Properties properties = new Properties();
		properties.put("hibernate.dialect", hibernateDialect);
		properties.put("hibernate.show_sql", hibernateShowSql);
		properties.put("hibernate.hbm2ddl.auto", hibernateHbm2ddlAuto);
		return properties;
	}

	/**
	 * @description HibernateTransactionManager handles transaction manager in
	 *              Spring. The application that uses single hibernate session
	 *              factory for database transaction, has good choice to use
	 *              HibernateTransactionManager. HibernateTransactionManager allows
	 *              bulk update and bulk insert and ensures data integrity.
	 */
	@Bean
	@Autowired
	public HibernateTransactionManager transactionManager(SessionFactory sessionFactory) {
		HibernateTransactionManager hibernateTransactionManager = new HibernateTransactionManager();
		hibernateTransactionManager.setSessionFactory(sessionFactory);
		return hibernateTransactionManager;
	}

	@Bean
	@Autowired
	public HibernateTemplate getHibernateTemplate(SessionFactory sessionFactory) {
		return new HibernateTemplate(sessionFactory);
	}

	/**
	 * @description FactoryBean that creates a Hibernate SessionFactory. This is the
	 *              usual way to set up a shared Hibernate SessionFactory in a
	 *              Spring application context. the SessionFactory can then be
	 *              passed to Hibernate-based data access objects via dependency
	 *              injection.HibernateTransactionManager allows bulk update and
	 *              bulk insert and ensures data integrity.
	 */
	@Bean
	public LocalSessionFactoryBean getSessionFactory() {
		LocalSessionFactoryBean bean = new LocalSessionFactoryBean();
		bean.setDataSource(getDataSource());
		bean.setPackagesToScan("com.mindtree");
		bean.setHibernateProperties(getHibernateProperties());
		return bean;

	}

}
