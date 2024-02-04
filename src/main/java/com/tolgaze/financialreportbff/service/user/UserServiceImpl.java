package com.tolgaze.financialreportbff.service.user;

import org.springframework.stereotype.Service;

import com.tolgaze.financialreportbff.model.entity.UserData;
import com.tolgaze.financialreportbff.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
  private final UserRepository userRepository;

  UserServiceImpl(UserRepository userRepository){
    this.userRepository = userRepository;
  }

  @Override
  public UserData getUserData(String userId) {
    UserData userData = userRepository.findById(userId).block();
    userData = userData != null ? userData : new UserData();

    return userData;
  }

  @Override
  public void updateUserData(String userId, UserData userData) {
    userData.setId(userId);
    userRepository.save(userData).block();
  }
  
}
