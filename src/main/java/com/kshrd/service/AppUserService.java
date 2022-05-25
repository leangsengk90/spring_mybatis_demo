package com.kshrd.service;

import com.kshrd.model.AppUser;
import com.kshrd.payload.request.AppUserReq;
import com.kshrd.payload.response.AppUserSignUpRes;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface AppUserService extends UserDetailsService {

    AppUserSignUpRes addNewUser(AppUserReq userReq);

//    AppUser signIn(AppUserSigninReq signInReq);
}
