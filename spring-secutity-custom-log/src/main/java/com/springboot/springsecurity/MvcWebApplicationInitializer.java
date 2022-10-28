package com.springboot.springsecurity;

	import org.springframework.boot.autoconfigure.web.reactive.WebFluxAutoConfiguration.WebFluxConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;    
	public class MvcWebApplicationInitializer extends    
	        AbstractAnnotationConfigDispatcherServletInitializer {    
	    protected Class<?>[] getRootConfigClasses() {    
	        return new Class[] { WebFluxConfig.class };    
	    }    
	    protected Class<?>[] getServletConfigClasses() {    
	        // TODO Auto-generated method stub    
	        return null;    
	    }    
	    protected String[] getServletMappings() {    
	        return new String[] { "/" };    
	    }    
	}  


