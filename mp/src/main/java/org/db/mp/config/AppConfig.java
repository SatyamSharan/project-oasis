/**
 * 
 */
package org.db.mp.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.db.mp.dao.FormDAO;
import org.db.mp.dao.SiblingDAO;
import org.db.mp.dao.impl.FormDAOImpl;
import org.db.mp.dao.impl.SiblingDAOImpl;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

/**
 * @author Satyam Sharan <satyam.sharan@hotmail.com>
 *
 */

@Configuration
@ComponentScan({"org.db.mp.controller.api","org.db.mp.controller.ui"})
@EnableWebMvc
@PropertySource("classpath:application.properties")
public class AppConfig {

	@Autowired
	private Environment env;

	@Bean
	public DataSource dataSource() {
		BasicDataSource dataSource = new BasicDataSource();

		dataSource.setDriverClassName(env.getProperty("jdbc.driverClassName"));
		dataSource.setUrl(env.getProperty("jdbc.url"));
		dataSource.setUsername(env.getProperty("jdbc.username"));
		dataSource.setPassword(env.getProperty("jdbc.password"));
		return dataSource;
	}

	@Bean
	public SessionFactory sessionFactoryBean() {
		LocalSessionFactoryBuilder sessionFactoryBuilder = new LocalSessionFactoryBuilder(dataSource());
		sessionFactoryBuilder.scanPackages(new String[] { "org.db.mp.model" });
		sessionFactoryBuilder.addProperties(hibernateProperties());
		return sessionFactoryBuilder.buildSessionFactory();
	}

	Properties hibernateProperties() {
		Properties properties = new Properties();
		properties.setProperty("hibernate.dialect", env.getProperty("hibernate.dialect"));
		properties.setProperty("hibernate.current_session_context_class", env.getProperty("hibernate.current_session_context_class"));
		properties.setProperty("hibernate.show_sql", env.getProperty("hibernate.show_sql"));
		return properties;
	}

	@Bean
	public FormDAO formDAO() {
		FormDAO formDAO = new FormDAOImpl();
		formDAO.setSessionFactory(sessionFactoryBean());
		return formDAO;
	}
	
	@Bean
	public SiblingDAO siblingDAO() {
		SiblingDAO siblingDAO = new SiblingDAOImpl();
		siblingDAO.setSessionFactory(sessionFactoryBean());
		return siblingDAO;
	}

	@Bean  
    public UrlBasedViewResolver setupViewResolver() {  
        UrlBasedViewResolver resolver = new UrlBasedViewResolver();  
        resolver.setPrefix("/WEB-INF/views/");  
        resolver.setSuffix(".jsp");  
        resolver.setViewClass(JstlView.class);  
        return resolver;  
    } 
}
