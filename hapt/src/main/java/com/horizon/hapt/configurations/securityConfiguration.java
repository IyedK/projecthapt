package com.horizon.hapt.configurations;

import javax.activation.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
/**
 * classe du configuration
 */
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/", "/js/**", "/css/**", "/scss/**", "/vendor/**", "/img/**", "/fonts/**", "/api/**",
                        "/init/**")
                .permitAll().antMatchers("/login", "/index").permitAll().antMatchers("/admin/**").hasRole("ADMIN")/*
                                                                                                                   * l'
                                                                                                                   * admin
                                                                                                                   * w
                                                                                                                   * ili
                                                                                                                   * ta7tou
                                                                                                                   **/
                .anyRequest().authenticated()
                // Login form
                .and().formLogin().loginPage("/login").usernameParameter("tel").passwordParameter("password")
                // Fail, forbidden and Success actions
                .failureUrl("/login?error").defaultSuccessUrl("/account").and().exceptionHandling()
                .accessDeniedPage("/forbidden")
                // Logout listener setting and action
                .and().logout().invalidateHttpSession(true).clearAuthentication(true)
                .logoutRequestMatcher(new AntPathRequestMatcher("/logout")).logoutSuccessUrl("/login?logout")
                .permitAll()
                // CSRF disabling
                .and().csrf().disable();
    }

}