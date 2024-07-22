package com.ceyline.group.config;

import com.ceyline.group.service.OurUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Autowired
    private OurUserDetailsService ourUserDetailsService;
    @Autowired
    private JWTAuthFilter jwtAuthFilter;


    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception{
        httpSecurity.csrf(AbstractHttpConfigurer::disable)
                .cors(Customizer.withDefaults())
                .authorizeHttpRequests(request-> request.requestMatchers("/auth/**", "/public/**").permitAll()
                        .requestMatchers("/admin/**").hasAnyAuthority("ADMIN", "CTL", "ONL", "CMS", "CML", "MSTS", "CLL", "STL", "CCS", "CSL", "MCM", "CMA", "CSV", "CWS", "CES", "CAL", "NVOCC", "CHE")
                        .requestMatchers("/cms/**").hasAnyAuthority("CMS")
                        .requestMatchers("/ctl/**").hasAnyAuthority("CTL")
                        .requestMatchers("/onl/**").hasAnyAuthority("ONL")
                        .requestMatchers("/cml/**").hasAnyAuthority("CML")
                        .requestMatchers("/msts/**").hasAnyAuthority("MSTS")
                        .requestMatchers("/cll/**").hasAnyAuthority("CLL")
                        .requestMatchers("/stl/**").hasAnyAuthority("STL")
                        .requestMatchers("/ccs/**").hasAnyAuthority("CCS")
                        .requestMatchers("/csl/**").hasAnyAuthority("CSL")
                        .requestMatchers("/mcm/**").hasAnyAuthority("MCM")
                        .requestMatchers("/cma/**").hasAnyAuthority("CMA")
                        .requestMatchers("/csv/**").hasAnyAuthority("CSV")
                        .requestMatchers("/cws/**").hasAnyAuthority("CWS")
                        .requestMatchers("/cal/**").hasAnyAuthority("CAL")
                        .requestMatchers("/ces/**").hasAnyAuthority("CES")
                        .requestMatchers("/nvocc/**").hasAnyAuthority("NVOCC")
                        .requestMatchers("/che/**").hasAnyAuthority("CHE")
                        .requestMatchers("/super/**").hasAnyAuthority("SUPER")


                        .anyRequest().authenticated())
                .sessionManagement(manager->manager.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                .authenticationProvider(authenticationProvider()).addFilterBefore(
                        jwtAuthFilter, UsernamePasswordAuthenticationFilter.class
                );
        return httpSecurity.build();
    }
    @Bean
    public AuthenticationProvider authenticationProvider(){
        DaoAuthenticationProvider daoAuthenticationProvider = new DaoAuthenticationProvider();
        daoAuthenticationProvider.setUserDetailsService(ourUserDetailsService);
        daoAuthenticationProvider.setPasswordEncoder(passwordEncoder());
        return daoAuthenticationProvider;
    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration authenticationConfiguration) throws Exception{
        return authenticationConfiguration.getAuthenticationManager();
    }

}