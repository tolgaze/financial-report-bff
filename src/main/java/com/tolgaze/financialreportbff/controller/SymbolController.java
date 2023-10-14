package com.tolgaze.financialreportbff.controller;

import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.Firestore;
import com.tolgaze.financialreportbff.model.SymbolList;

@RestController
public class SymbolController {

  @Autowired
  private Firestore firestore;

  @GetMapping("/")
  ResponseEntity<SymbolList> testMethod() throws InterruptedException, ExecutionException {
    DocumentSnapshot doc = firestore.collection("daily-symbol-prices").document("CRYPTO").get().get();
    SymbolList symbolList = doc.toObject(SymbolList.class);

    if(doc.exists()) {
      return new ResponseEntity<SymbolList>(symbolList, HttpStatus.OK);
    }
    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
  }
}
