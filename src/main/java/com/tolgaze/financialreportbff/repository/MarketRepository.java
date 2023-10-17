package com.tolgaze.financialreportbff.repository;

import org.springframework.stereotype.Repository;

import com.google.cloud.spring.data.firestore.FirestoreReactiveRepository;
import com.tolgaze.financialreportbff.model.entity.Market;

import reactor.core.publisher.Flux;

@Repository
public interface MarketRepository extends FirestoreReactiveRepository<Market> {
  Flux<Market> findAll();
}
