package com.example.security.filters;


import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

public class DefaultSecurityChain {

    @Bean
    @Order(2)
    SecurityFilterChain defaultSecurityChain(HttpSecurity httpSecurity){
        httpSecurity.authorizeHttpRequests(authorize ->
                        authorize
                                .anyRequest()
                                .authenticated())
                .formLogin(Customizer.withDefaults());

        return httpSecurity.build();
    }
}
