package com.tolgaze.financialreportbff.config;

import java.io.IOException;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.FirestoreOptions;

@Configuration
public class FirestoreConfig {

  @Bean
  Firestore firestore() throws IOException{
    FirestoreOptions firestoreOptions = FirestoreOptions.getDefaultInstance()
      .toBuilder()
      .setProjectId("ageless-thought-400117")
      .setCredentials(GoogleCredentials.getApplicationDefault())
      .build();

    return firestoreOptions.getService();
  }
  
}
