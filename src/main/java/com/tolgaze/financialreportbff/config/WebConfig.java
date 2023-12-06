package com.tolgaze.financialreportbff.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
  @Override
  public void addInterceptors(InterceptorRegistry registry) {
    registry.addInterceptor(new FirebaseTokenInterceptor())
      .addPathPatterns("/**"); // Apply the interceptor to all endpoints
  }
}
