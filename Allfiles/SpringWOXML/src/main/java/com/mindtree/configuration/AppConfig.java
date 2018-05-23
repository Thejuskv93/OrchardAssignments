package com.mindtree.configuration;

import org.hibernate.SessionFactory;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import com.mindtree.dao.DTHDao;
import com.mindtree.dao.DTHDaoImpl;
import com.mindtree.service.DTHService;
import com.mindtree.service.ServiceImpl;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.mindtree")
public class AppConfig {
     
    @Bean
    public ViewResolver viewResolver() {
    	System.out.println("inside view resolver");
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setViewClass(JstlView.class);
        viewResolver.setPrefix("/WEB-INF/jsp/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }
    
    
    
    
    
    
   /* @Bean
    public SessionFactory getSessionFactory()
    {
    	return new org.hibernate.cfg.Configuration().configure().buildSessionFactory();
    }*/
    
   /* @Bean
    public DTHService getService()
    {
    	return new ServiceImpl();
    }
    
    @Bean
    public DTHDao getDao()
    {
    	return new DTHDaoImpl();
    }
     */
   /* @Bean
    public MessageSource messageSource() {
        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
        messageSource.setBasename("messages");
        return messageSource;
    }*/
}