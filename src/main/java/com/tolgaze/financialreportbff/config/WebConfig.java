package com.tolgaze.financialreportbff.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.tolgaze.financialreportbff.config.interceptor.AuthorizationInterceptor;

@Configuration
public class WebConfig implements WebMvcConfigurer {

  @Bean
  public AuthorizationInterceptor firebaseTokenInterceptor() {
    return new AuthorizationInterceptor();
  }

  @Override
  public void addInterceptors(InterceptorRegistry registry) {
    registry.addInterceptor((firebaseTokenInterceptor()))
      .addPathPatterns("/**");
  }
}
