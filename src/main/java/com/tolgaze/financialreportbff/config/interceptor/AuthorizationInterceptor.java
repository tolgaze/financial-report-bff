package com.tolgaze.financialreportbff.config.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;

import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthException;
import com.google.firebase.auth.FirebaseToken;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AuthorizationInterceptor implements HandlerInterceptor {

  @Autowired
  private FirebaseApp firebaseApp;

  @Override
  public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
    String idToken = extractTokenFromHeader(request.getHeader("Authorization"));
    
    if (idToken != null) {
      try {
        FirebaseToken decodedToken = FirebaseAuth.getInstance(firebaseApp).verifyIdToken(idToken);
        // Perform actions based on the decodedToken (e.g., extracting user information)
        // If token verification is successful, you can proceed with the request
        return true;
      } catch (FirebaseAuthException e) {
          // Token verification failed
          response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Invalid or expired token");
          return false;
      }
    } else {
      // No token found in the header
      response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Missing authorization token");
      return false;
    }
  }

  private String extractTokenFromHeader(String header) {
    if (header != null && header.startsWith("Bearer ")) {
      return header.substring(7); // Remove "Bearer " to extract the token
    }
    return null;
  }
}
