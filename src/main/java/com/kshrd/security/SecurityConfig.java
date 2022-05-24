package com.kshrd.security;

import com.kshrd.service.AppUserService;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    private final AppUserService appUserService;
    private final PasswordEncoder passwordEncoder;

    public SecurityConfig(AppUserService appUserService, PasswordEncoder passwordEncoder) {
        this.appUserService = appUserService;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()
                .formLogin().and().logout().and()
                .authorizeRequests()
                .antMatchers(HttpMethod.GET,"/", "/book")
                .permitAll()
                .antMatchers( "/swagger-ui/**")
                .hasAnyRole("ADMIN")
                .antMatchers(HttpMethod.GET,"/author")
                .hasAnyAuthority("ROLE_USER")
                .antMatchers( "/book/**")
                .hasAnyAuthority("ROLE_USER", "ROLE_ADMIN")
                .antMatchers(HttpMethod.POST, "/auth/signup")
                .permitAll()
                .anyRequest()
                .authenticated()
        ;
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(appUserService)
                .passwordEncoder(passwordEncoder);
    }
}
//.hasAnyRole("USER") => hasAnyAuthority("ROLE_USER")
//.formLogin() is use this form back when it need authenticated cuz we overwrite it in this configuration
