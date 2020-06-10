package cn.wangslip.config;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@EnableWebSecurity
public class MySecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        // 设定角色的权限  (角色和资源的对应关系)
        http.authorizeRequests().antMatchers("/").permitAll()
                .antMatchers("/vip/**").hasRole("VIP0")
                .antMatchers("/admin/**").hasRole("VIP1")
                .antMatchers("/manage/**").hasRole("VIP2");


        // 开启自动配置的登录功能
        http.formLogin().usernameParameter("username").passwordParameter("password")
                .loginPage("/login");
//        super.configure(http);
    }


    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

        // 设定 用户 密码 及角色的关联关系
        // security要求用户登录时  密码必须加密
        String pwd = new BCryptPasswordEncoder().encode("123456");
        auth.inMemoryAuthentication().passwordEncoder(new BCryptPasswordEncoder())
                .withUser("root").password(pwd).roles("VIP0","VIP1","VIP2")
                .and()
                .withUser("admin").password(pwd).roles("VIP0","VIP1")
                .and()
                .withUser("guest").password(pwd).roles("VIP0");

//        super.configure(auth);
    }
}
