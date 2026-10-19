package br.com.project.universe.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;



@Configuration 
public class SecurityConfig 
{
    @Bean 
    public SecurityFilterChain filterChain(HttpSecurity http)
    {
        

        http.csrf(csrf -> csrf.disable())
        .authorizeHttpRequests(auth -> auth
            .requestMatchers(HttpMethod.GET, "/v1/universe/stars", "/v1/universe/stars/**").permitAll()
            .requestMatchers(HttpMethod.POST, "/v1/universe/stars", "/v1/universe/stars/**").permitAll()
        .requestMatchers(HttpMethod.DELETE, "/v1/universe/**").hasRole("ADMIN"))
        .httpBasic(Customizer.withDefaults());

        return http.build();
    }

    @Bean 
    public UserDetailsService userDetails() 
    {
        UserDetails admin = User.withUsername("admin")
        .password("{noop}admin132")
        .roles("ADMIN")
        .build();

        UserDetails user = User.withUsername("antonio")
        .password("{noop}user123")
        .roles("USER")
        .build();

        return new InMemoryUserDetailsManager(admin, user);
    }
}
