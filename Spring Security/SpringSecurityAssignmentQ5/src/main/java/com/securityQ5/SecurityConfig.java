package com.securityQ5;


import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	DataSource dataSource;

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	
		auth.jdbcAuthentication()
		    .dataSource(dataSource);		 
	}
	
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http
		    .authorizeRequests()
		    .antMatchers("/admin").hasRole("ADMIN")
		    .antMatchers("/").permitAll()
		    .anyRequest().authenticated()
			.and()
			.formLogin()
			.loginPage("/login")
			.permitAll()
			.and()
			.rememberMe().key("PRADRISHGHAD123456789")
						 .tokenValiditySeconds(3 * 20 * 60 * 60);
		}



	@Bean
	public PasswordEncoder passwordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}
}