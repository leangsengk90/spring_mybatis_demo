package com.kshrd.service.serviceimp;

import com.kshrd.model.AppUser;
import com.kshrd.payload.request.AppUserReq;
import com.kshrd.payload.response.AppUserSignUpRes;
import com.kshrd.repository.AppUserRepository;
import com.kshrd.service.AppUserService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class AppUserServiceImp implements AppUserService {

    private final AppUserRepository appUserRepository;
    private final PasswordEncoder passwordEncoder;

    public AppUserServiceImp(AppUserRepository appUserRepository, PasswordEncoder passwordEncoder) {
        this.appUserRepository = appUserRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        AppUser appUser = appUserRepository.getUserByEmail(email);
        System.out.println("LOAD_USER:"+appUser);
        return new org.springframework.security.core.userdetails.User(appUser.getUsername(), appUser.getPassword(),
                appUser.getAuthorities());
    }

    @Override
    public AppUserSignUpRes addNewUser(AppUserReq userReq) {
        AppUserSignUpRes appUser = new AppUserSignUpRes();
        String encode = passwordEncoder.encode(userReq.getPassword());
        userReq.setPassword(encode);
        appUser = appUserRepository.addNewUser(userReq);
        System.out.println("USER:"+appUser);
        return appUser;
    }

//    @Override
//    public AppUser signIn(AppUserSigninReq signInReq) {
//        AppUser appUser = appUserRepository.signIn(signInReq);
//        return appUser;
//    }
}
