package com.mindtree.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import com.mindtree.dao.RestDao;
import com.mindtree.daoImpl.RestDaoImpl;
import com.mindtree.service.RestService;
import com.mindtree.serviceImpl.RestServiceImpl;

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
          
//   @Bean
//    public RestService getService()
//    {
//    	return new RestServiceImpl();
//    }
//    
//    @Bean
//    public RestDao getDao()
//    {
//    	return new RestDaoImpl();
//    }
     
/*    @Bean
    public MessageSource messageSource() {
        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
        messageSource.setBasename("messages");
        return messageSource;
    }
*/}