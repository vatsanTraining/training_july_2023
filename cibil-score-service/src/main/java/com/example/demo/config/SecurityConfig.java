package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import lombok.AllArgsConstructor;

@Configuration
@AllArgsConstructor
public class SecurityConfig {

	
	private BCryptPasswordEncoder encoder;
	
	
	@Bean
	public UserDetailsManager detailsManager() {
		
		UserDetails indiaUser = User.withUsername("india")
				       .password(encoder.encode("india"))
				       .authorities("ADMIN").build();
		
		
		UserDetails nepalUser = User.withUsername("nepal")
			       .password(encoder.encode("nepal"))
			       .authorities("GUEST").build();
	
		return new InMemoryUserDetailsManager(indiaUser,nepalUser);
		

	}
	
	@Bean
	public SecurityFilterChain  chain(HttpSecurity http) throws Exception {
		
		http
		.authorizeHttpRequests().requestMatchers("/actuator","/actuator/**")
		.permitAll()
		.requestMatchers("/api/v1/**")
		 .authenticated()
		 .and()
		 .httpBasic();
		
		return http.build();
	}
}
