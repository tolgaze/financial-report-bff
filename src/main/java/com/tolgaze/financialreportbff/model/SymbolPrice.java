package com.tolgaze.financialreportbff.model;

import lombok.Getter;
import lombok.Setter;

public class SymbolPrice {
  @Getter @Setter private String code;
  @Getter @Setter private Double price;
  @Getter @Setter private String title;
}
