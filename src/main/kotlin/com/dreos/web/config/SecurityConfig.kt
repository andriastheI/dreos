package com.dreos.web.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.web.SecurityFilterChain

@Configuration
class SecurityConfig {

    @Bean
    fun securityFilterChain(http: HttpSecurity): SecurityFilterChain {
        http
            // allow all requests for now
            .authorizeHttpRequests { auth ->
                auth.anyRequest().permitAll()
            }
            // disable login form + basic auth
            .formLogin { it.disable() }
            .httpBasic { it.disable() }
            // if you're using POST forms later, you can turn this back on
            .csrf { it.disable() }

        return http.build()
    }
}
