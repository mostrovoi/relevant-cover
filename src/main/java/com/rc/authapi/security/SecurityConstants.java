package com.rc.authapi.security;

public class SecurityConstants {
    public static final String SECRET = "relevantcoveriscool";
    public static final long EXPIRATION_TIME = 86_400_000; // 1 day
    public static final String TOKEN_PREFIX = "Bearer ";
    public static final String HEADER_STRING = "Authorization";
}