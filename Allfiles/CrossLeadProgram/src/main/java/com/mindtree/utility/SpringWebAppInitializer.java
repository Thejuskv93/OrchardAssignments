package com.mindtree.utility;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

/**
 * @author M1044323
 * @description An implementation of the WebApplicationInitializer interface
 *              configures the ServletContext programmatically. In particular,
 *              it allows for the creation, configuration, and registration of
 *              the DispatcherServlet programmatically. Thereby allowing the
 *              web.xml file to be removed from modern Spring MVC applications.
 *              Here SpringWebAppInitializer implements
 *              WebApplicationInitializer, we can also extend from
 *              AbstractDispatcherServletInitializer.
 *
 */
public class SpringWebAppInitializer implements WebApplicationInitializer {

	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext appContext = new AnnotationConfigWebApplicationContext();
		appContext.register(HibernateConfig.class);
		servletContext.addListener(new ContextLoaderListener(appContext));
		appContext.setServletContext(servletContext);
		ServletRegistration.Dynamic dispatcher = servletContext.addServlet("SpringDispatcher",
				new DispatcherServlet(appContext));
		dispatcher.setLoadOnStartup(1);
		dispatcher.addMapping("/");
	             
	}
}
