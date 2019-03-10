package com.kaarvik.gym.security;

import com.kaarvik.gym.controller.UserController;

public class SecurityConstants {

    public static final String SECRET = "TESTJWTSECRET";    //TODO: Replace with real token, don't store this here!
    public static final long EXPIRATION_TIME = 864_000_000; // 10 days
    public static final String TOKEN_PREFIX = "Bearer ";
    public static final String HEADER_STRING = "Authorization";
    public static final String REGISTER_URL = UserController.REQUEST_MAPPING + UserController.ENDPOINT_REGISTER;

}
