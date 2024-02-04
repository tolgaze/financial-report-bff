package com.tolgaze.financialreportbff.model.entity;

import java.util.ArrayList;

import com.google.cloud.firestore.annotation.DocumentId;
import com.google.cloud.spring.data.firestore.Document;
import com.tolgaze.financialreportbff.model.SymbolData;

import lombok.Getter;
import lombok.Setter;

@Document(collectionName = "user-data")
public class UserData {
  @DocumentId @Getter @Setter private String id;
  @Getter @Setter private Double totalInvestment = Double.valueOf(0);
  @Getter @Setter private Double currentValue = Double.valueOf(0);
  @Getter @Setter private Double profitLossPercent = Double.valueOf(0);
  @Getter @Setter private Double initialInvestment = Double.valueOf(0);
  @Getter @Setter private Double realizedProfit = Double.valueOf(0);
  @Getter @Setter private ArrayList<SymbolData> symbols = new ArrayList<>();
}
