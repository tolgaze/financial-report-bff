package com.tolgaze.financialreportbff.model;

import java.util.ArrayList;

import lombok.Getter;
import lombok.Setter;

public class SymbolList {
  @Getter @Setter private String date;
  @Getter @Setter private String currency;
  @Getter @Setter private ArrayList<Symbol> symbols;
}
