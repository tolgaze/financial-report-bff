package com.tolgaze.financialreportbff.config;

import java.io.IOException;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.FirestoreOptions;

@Configuration
public class FirestoreConfig {

  @Bean
  Firestore firestore() throws IOException{
		return FirestoreOptions.getDefaultInstance().getService();
  }
  
}
