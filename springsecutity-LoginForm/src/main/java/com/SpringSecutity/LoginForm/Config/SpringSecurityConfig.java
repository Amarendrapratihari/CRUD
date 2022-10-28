package com.SpringSecutity.LoginForm.Config;


import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@EnableWebSecurity
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http.authorizeRequests().anyRequest().authenticated().and()
		.formLogin().permitAll().loginPage("/login")
				.usernameParameter("username").and().logout()
		.logoutRequestMatcher(new AntPathRequestMatcher("/logout")).permitAll();
		
	}
}

