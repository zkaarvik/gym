package com.kaarvik.gym.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(final HttpSecurity http) throws Exception {
        http
                .csrf().disable()

                .authorizeRequests()
                .antMatchers("/api/v1/**").permitAll() //Temporarily allow access to all
                .antMatchers("/h2-console/**").permitAll()
                .anyRequest().authenticated()

                .and().headers().frameOptions().sameOrigin();
    }
}
