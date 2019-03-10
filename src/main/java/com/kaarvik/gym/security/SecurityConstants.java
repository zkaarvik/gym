package com.kaarvik.gym.security;

class SecurityConstants {

    static final String SECRET = System.getenv("GYM_JWT_SECRET");
    static final long EXPIRATION_TIME = 864_000_000; // 10 days
    static final String TOKEN_PREFIX = "Bearer ";
    static final String HEADER_STRING = "Authorization";

}
