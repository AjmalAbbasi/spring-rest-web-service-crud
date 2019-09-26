package com.tutorialspedia.springrest.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {	
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] {FrontController.class};
	}

	@Override
	protected String[] getServletMappings() {
		return new String [] {"/"};
	}

}
