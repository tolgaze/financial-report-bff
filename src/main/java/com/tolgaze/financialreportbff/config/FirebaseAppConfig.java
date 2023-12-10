package com.tolgaze.financialreportbff.config;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;

@Configuration
public class FirebaseAppConfig {

  @Value("${firebase.projectId}")
  private String firebaseProjectId;

  @Bean
  public FirebaseApp firebaseApp() throws IOException {
    FirebaseOptions options = FirebaseOptions.builder()
      .setCredentials(GoogleCredentials.getApplicationDefault())
      .setProjectId(firebaseProjectId)
      .build();
    FirebaseApp app = FirebaseApp.initializeApp(options);
    
    return app;
  }

}
