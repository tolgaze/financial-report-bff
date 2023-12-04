package com.tolgaze.financialreportbff.controller;

import java.util.List;
import java.util.concurrent.ExecutionException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tolgaze.financialreportbff.model.entity.Market;
import com.tolgaze.financialreportbff.service.market.MarketService;

import jakarta.servlet.http.HttpServletResponse;

@RestController
public class MarketController {
  private final MarketService marketService;

  MarketController(MarketService marketService) {
      this.marketService = marketService;
  }

  @GetMapping("/")
  ResponseEntity<List<Market>> testMethod(HttpServletResponse response) throws InterruptedException, ExecutionException {
    List<Market> markets = marketService.getAllMarkets();
    response.setHeader("Access-Control-Allow-Origin", "*");
    
    return new ResponseEntity<>(markets, HttpStatus.OK);
  }
}
