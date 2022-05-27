package com.example.ezpark.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public WebSecurityCustomizer webSecurityCustomizer() {
        return (web) -> web.ignoring().antMatchers("/h2/**");
    }


    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/").permitAll()
                .antMatchers("/h2/**").permitAll()
                .and()
                .csrf()
                .ignoringAntMatchers("/h2/**").disable()
                .httpBasic();
        //http.authorizeRequests().antMatchers("/admin/**").hasAnyRole("ADMIN");
        //http.authorizeRequests().antMatchers("/main/**").hasAnyRole("USER");
        //http.formLogin().loginPage("/login-page");
        //http.formLogin().loginProcessingUrl("/login-process");
        return http.build();
    }
}
