package com.kshrd.service;

import com.kshrd.model.AppUser;
import com.kshrd.payload.request.AppUserReq;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface AppUserService extends UserDetailsService {

    AppUser addNewUser(AppUserReq userReq);

//    AppUser signIn(AppUserSigninReq signInReq);
}
