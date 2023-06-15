package com.mogli.mealroulette.security;

import com.mogli.microservicebase.security.ParentSecurityConfig;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.session.SessionRegistryImpl;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.session.RegisterSessionAuthenticationStrategy;
import org.springframework.security.web.authentication.session.SessionAuthenticationStrategy;

@RequiredArgsConstructor
@Configuration
@EnableWebSecurity
class SecurityConfig extends ParentSecurityConfig {

//    private final KeycloakLogoutHandler keycloakLogoutHandler;

    @Bean
    protected SessionAuthenticationStrategy sessionAuthenticationStrategy() {
        return new RegisterSessionAuthenticationStrategy(new SessionRegistryImpl());
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//        http.authorizeHttpRequests().requestMatchers("/**").hasRole("admin");
//        http.authorizeHttpRequests().requestMatchers(HttpMethod.GET).authenticated();
        super.buildDefaultFilterChain(http);
        return http.build();
    }
}