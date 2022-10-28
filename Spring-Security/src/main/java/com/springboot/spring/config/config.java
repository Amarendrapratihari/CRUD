package com.springboot.spring.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
  

@Configuration
public class config extends WebSecurityConfigurerAdapter {
  
    // Adding the roles
	
	  @Override
	    protected void configure(HttpSecurity http) throws Exception {
	        http.
	                httpBasic()
	                .and()
	                .authorizeRequests()
	                .antMatchers("/delete").hasRole("admin_role")
	                .antMatchers("/details").hasAnyRole("admin_role","student")
	                .and()
	                .formLogin();
	    }
	  
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("Amarendra")
                .password("aaaa")
                .roles("admin_role")
                .and()
                .withUser("XYZ")
                .password("bbbb")
                .roles("student");
    }
  
    // Configuring the api
    // according to the roles.
    
    
  
    // Function to encode the password
    // assign to the particular roles.
    
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}