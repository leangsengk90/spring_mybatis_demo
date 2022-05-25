package com.kshrd.controller;

import com.kshrd.model.AppUser;
import com.kshrd.payload.request.AppUserReq;
import com.kshrd.service.AppUserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class UserController {

    private final AppUserService appUserService;

    public UserController(AppUserService appUserService) {
        this.appUserService = appUserService;
    }

//    @PostMapping("/signup")
//    public AppUser addNewUser(@RequestBody AppUserReq userReq){
//        AppUser appUser = new AppUser();
//        appUser = appUserService.addNewUser(userReq);
//        return appUser;
//    }

//    @GetMapping("/signin")
//    public AppUser signIn(@RequestBody AppUserSigninReq signInReq){
//        AppUser appUser = appUserService.signIn(signInReq);
//        return appUser;
//    }

}
