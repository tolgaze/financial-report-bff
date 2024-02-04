package com.tolgaze.financialreportbff.model;

import java.util.ArrayList;

import lombok.Getter;
import lombok.Setter;

public class SymbolData {
  @Getter @Setter private String id;
  @Getter @Setter private String label;
  @Getter @Setter private String tag;
  @Getter @Setter private String group;
  @Getter @Setter private String currency;
  @Getter @Setter private Double price;
  @Getter @Setter private Double priceUsd;
  @Getter @Setter private Double holding;
  @Getter @Setter private Double avgPrice;
  @Getter @Setter private Double avgPriceUsd;
  @Getter @Setter private Double investment;
  @Getter @Setter private Double investmentUsd;
  @Getter @Setter private Double pl;
  @Getter @Setter private Double plUsd;
  @Getter @Setter private Double plPercent;
  @Getter @Setter private Double plUsdPercent;
  @Getter @Setter private Double currentValue;
  @Getter @Setter private Double currentValueUsd;
  @Getter @Setter private String color;
  @Getter @Setter private Integer precision;
  @Getter @Setter private ArrayList<Order> purchases;
  @Getter @Setter private ArrayList<Order> sales;
}