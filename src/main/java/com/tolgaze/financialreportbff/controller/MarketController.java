package com.tolgaze.financialreportbff.controller;

import java.util.List;
import java.util.concurrent.ExecutionException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tolgaze.financialreportbff.model.entity.Market;
import com.tolgaze.financialreportbff.service.market.MarketService;

@RestController
public class MarketController {
  private final MarketService marketService;

  MarketController(MarketService marketService) {
      this.marketService = marketService;
  }

  @GetMapping("/")
  ResponseEntity<List<Market>> getAllMarkets() throws InterruptedException, ExecutionException {
    List<Market> markets = marketService.getAllMarkets();
    
    return new ResponseEntity<>(markets, HttpStatus.OK);
  }
}
