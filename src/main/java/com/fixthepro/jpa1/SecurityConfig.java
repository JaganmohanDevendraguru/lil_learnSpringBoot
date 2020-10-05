package com.fixthepro.jpa1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{

	@Autowired
	public void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication()
			.withUser("admin")
			.password(passwordEncoder().encode("admin"))
			.roles("ADMIN")
			.and()
			.withUser("user")
			.password(passwordEncoder().encode("user"))
			.roles("USER");
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
		.authorizeRequests()
        .antMatchers("/resources/**", "/webjars/**").permitAll()
        .antMatchers( "/availability","/reservations").hasRole("USER")
        .antMatchers("/api/**").hasRole("ADMIN")
        .and()
        .formLogin();
		/*
		 * .antMatchers("/reservations").permitAll()
		 * .antMatchers("/api/**").authenticated() .and() .formLogin()
		 * .loginPage("/login") .loginProcessingUrl("/login")
		 * .defaultSuccessUrl("/admin", true) .and() .logout() .logoutUrl("/logout")
		 * .deleteCookies("JSESSIONID");
		 */
	}
	
	@Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/resources/**");
    }
	
	@Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
