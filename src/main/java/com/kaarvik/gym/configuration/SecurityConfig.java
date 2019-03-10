package com.kaarvik.gym.configuration;

import com.kaarvik.gym.security.JWTAuthenticationFilter;
import com.kaarvik.gym.security.JWTAuthorizationFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    private static final int BCRYPT_STRENGTH = 12;

    @Override
    protected void configure(final HttpSecurity http) throws Exception {
        http
                .csrf().disable()

                //Endpoint security
                .authorizeRequests()
                .antMatchers("/h2-console/**").permitAll()
                .antMatchers("/api/v1/user/register").permitAll()
                .antMatchers("/api/v1/**").authenticated()
                .anyRequest().authenticated()

                //Add JWT Auth filters
                .and()
                .addFilter(new JWTAuthenticationFilter(authenticationManager()))
                .addFilter(new JWTAuthorizationFilter(authenticationManager()))

                //Disable session creation
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)

                //Must allow frame for H2 console
                .and()
                .headers().frameOptions().sameOrigin();
    }

    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder(BCRYPT_STRENGTH);
    }
}
