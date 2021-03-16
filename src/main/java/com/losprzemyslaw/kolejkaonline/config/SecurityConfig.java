package com.losprzemyslaw.kolejkaonline.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    public void configure(HttpSecurity security) throws Exception{

        security
                .csrf().disable()
                .authorizeRequests()
                .antMatchers("/home").permitAll()
                .antMatchers("/for-you/**").hasAnyRole("USER","ADMIN")
                .antMatchers("/for-your-business/**").hasAnyRole("USER2","ADMIN")
                .antMatchers("/clients/**", "/checkout/**").hasAnyRole("ADMIN")
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .loginPage("/login").permitAll()
                .defaultSuccessUrl("/",true);
    }

    @Autowired
    public void securityUsers(AuthenticationManagerBuilder auth) throws Exception{
        auth.inMemoryAuthentication()
                .withUser("user1").password("{noop}user1").roles("USER")
                .and()
                .withUser("user2").password("{noop}user2").roles("USER2")
                .and()
                .withUser("admin").password("{noop}admin").roles("ADMIN");

    }

}
