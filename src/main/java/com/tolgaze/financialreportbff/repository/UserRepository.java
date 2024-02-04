package com.tolgaze.financialreportbff.repository;

import org.springframework.stereotype.Repository;

import com.google.cloud.spring.data.firestore.FirestoreReactiveRepository;
import com.tolgaze.financialreportbff.model.entity.UserData;

@Repository
public interface UserRepository extends FirestoreReactiveRepository<UserData> {}
