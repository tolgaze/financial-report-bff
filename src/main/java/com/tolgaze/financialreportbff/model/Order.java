package com.tolgaze.financialreportbff.model;

import lombok.Getter;
import lombok.Setter;

public class Order {
  @Getter @Setter private Integer id;
  @Getter @Setter private String date;
  @Getter @Setter private Double price;
  @Getter @Setter private Double priceUsd;
  @Getter @Setter private Double amount;
}