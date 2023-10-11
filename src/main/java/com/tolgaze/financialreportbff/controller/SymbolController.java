package com.tolgaze.financialreportbff.controller;

import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.Firestore;
import com.tolgaze.financialreportbff.model.SymbolList;

@RestController
public class SymbolController {

  // @Autowired
  // private Firestore firestore;

  @GetMapping("/")
  String testMethod() throws InterruptedException, ExecutionException {
    return "hello world!";
    // DocumentSnapshot doc = firestore.collection("daily-symbol-prices").document("CRYPTO").get().get();

    // SymbolList test = doc.toObject(SymbolList.class);
    // if(doc.exists()) {
    //   return test;
    // }
    // return null;
  }
  
}
