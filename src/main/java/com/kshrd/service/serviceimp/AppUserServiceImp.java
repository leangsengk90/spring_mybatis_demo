package com.kshrd.service.serviceimp;

import com.kshrd.configuration.EmailValidator;
import com.kshrd.model.AppUser;
import com.kshrd.payload.request.AppUserReq;
import com.kshrd.payload.response.AppUserSignUpRes;
import com.kshrd.repository.AppUserRepository;
import com.kshrd.service.AppUserService;
import com.kshrd.service.EmailService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AppUserServiceImp implements AppUserService {

    private final AppUserRepository appUserRepository;
    private final PasswordEncoder passwordEncoder;
    private final EmailValidator emailValidator;
    private final EmailService emailService;

    public AppUserServiceImp(AppUserRepository appUserRepository, PasswordEncoder passwordEncoder, EmailValidator emailValidator, EmailService emailService) {
        this.appUserRepository = appUserRepository;
        this.passwordEncoder = passwordEncoder;
        this.emailValidator = emailValidator;
        this.emailService = emailService;
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
        emailService.sendByMail("leangsengk90@gmail.com", "Hello");
//        emailService.send("xg.group.info@gmail.com", "Hello");
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
