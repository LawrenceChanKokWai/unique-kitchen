package com.uniquekitchen.constant;

public class SecurityConstant {

    public static final long EXPIRATION_TIME = 432_000_000;
    public static final String TOKEN_PREFIX = "Bearer ";
    public static final String JWT_TOKEN_HEADER = "Jwt-Token";
    public static final String TOKEN_CANNOT_BE_VERIFIED = "Token cannot be verified";
    public static final String GET_ARRAYS_LLC = "Get Array LLC";
    public static final String GET_ARRAYS_ADMINISTRATION = "Unique Kitchen Portal";
    public static final String AUTHORITIES = "Authorities";
    public static final String FORBIDDEN_MESSAGE = "You will need to log in to access the page";
    public static final String ACCESS_DENIED_MESSAGE = "You do not have the permission in accessing the page";
    public static final String OPTIONS_HTTP_METHOD = "OPTIONS";
    public static final String[] PUBLIC_URLS = {"/user/login", "/user/register", "/user/resetpassword/**", "/user/image/**"};
}
