package com.example.springbootsecurity;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.proxy.NoOp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

//    @Autowired
//    public void configureGlobal(AuthenticationManagerBuilder authenticationMgr) throws Exception {
//        authenticationMgr.inMemoryAuthentication()
//                .withUser("ash").password("ash@123").authorities("USER")
//                .and()
//                .withUser("fox").password("fox@123").authorities("ADMIN");
//    }

//    @Bean
//    public PasswordEncoder getPasswordEncoder() {
//        return NoOpPasswordEncoder.getInstance();
//    }
@Bean
public PasswordEncoder passwordEncoder() {
    return new BCryptPasswordEncoder();
}

    @Bean
    @Override
    protected UserDetailsService userDetailsService() {
        UserDetails user1 = User
                .withUsername("namhm")
                .password("$2a$12$IBj4jFHjcORxfnZGf01F3O7LEvSs5Q9wJramED4gLV6litJVhF3Tu")
                .roles("USER")
                .build();
        UserDetails user2 = User
                .withUsername("admin")
                .password("$2a$12$IBj4jFHjcORxfnZGf01F3O7LEvSs5Q9wJramED4gLV6litJVhF3Tu")
                .roles("ADMIN")
                .build();

        return new InMemoryUserDetailsManager(user1, user2);
    }
    @Override
    protected void configure(HttpSecurity http)throws Exception{
        http.authorizeRequests()
                .antMatchers("/").hasAnyRole("ADMIN","USER")
                .and().formLogin();
    }
}