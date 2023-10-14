package com.tolgaze.financialreportbff.config;

import java.io.IOException;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.Firestore;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.cloud.FirestoreClient;

@Configuration
public class FirestoreConfig {

  @Bean
  Firestore firestore() throws IOException{
    GoogleCredentials credentials = GoogleCredentials.getApplicationDefault();
    FirebaseOptions options = FirebaseOptions.builder()
      .setCredentials(credentials)
      .setProjectId("ageless-thought-400117")
      .build();
    FirebaseApp.initializeApp(options);

		return FirestoreClient.getFirestore();
  }
  
}
