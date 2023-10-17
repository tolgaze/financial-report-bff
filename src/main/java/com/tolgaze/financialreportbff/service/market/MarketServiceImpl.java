package com.tolgaze.financialreportbff.service.market;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tolgaze.financialreportbff.model.entity.Market;
import com.tolgaze.financialreportbff.repository.MarketRepository;

@Service 
class MarketServiceImpl implements MarketService {
  private final MarketRepository marketRepository;

  MarketServiceImpl(MarketRepository marketRepository){
    this.marketRepository = marketRepository;
  }

  @Override
  public List<Market> getAllMarkets() {
    List<Market> markets = marketRepository.findAll().collectList().block();

    return markets;
  }
}