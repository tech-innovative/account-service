package com.techinnovative.beauty.account.web.controllers;


import com.techinnovative.beauty.generated.v1.api.SignupApi;
import com.techinnovative.beauty.generated.v1.model.SignupRequest;
import org.slf4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController implements SignupApi {

    private final Logger logger;

    public UserController(Logger logger) {
        this.logger = logger;
    }

    @Override
    public ResponseEntity<Void> signup(SignupRequest signupRequest) {
        logger.info("Sign up a user");
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }
}
