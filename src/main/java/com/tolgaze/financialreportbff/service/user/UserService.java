package com.tolgaze.financialreportbff.service.user;

import com.tolgaze.financialreportbff.model.entity.UserData;

public interface UserService {
  public UserData getUserData(String userId);
  public void updateUserData(String userId, UserData userData);
}