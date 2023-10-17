package com.tolgaze.financialreportbff.model.entity;

import java.util.ArrayList;

import com.google.cloud.spring.data.firestore.Document;
import com.tolgaze.financialreportbff.model.Symbol;

import lombok.Getter;
import lombok.Setter;

@Document(collectionName = "daily-symbol-prices")
public class Market {
  @Getter @Setter private String date;
  @Getter @Setter private String currency;
  @Getter @Setter private ArrayList<Symbol> symbols;
}
