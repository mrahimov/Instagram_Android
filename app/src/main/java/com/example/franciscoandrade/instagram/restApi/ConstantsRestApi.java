package com.example.franciscoandrade.instagram.restApi;

/**
 * Created by franciscoandrade on 12/26/17.
 */

public final class ConstantsRestApi {

    public static final String VERSION="/v1/";
    public static final String ROOT_URL="https://api.instagram.com"+ VERSION;
    public static final String ACCESS_TOKEN="";
    public static final String KEY_ACCESS_TOKEN="?access_token=";
    public static final String KEY_GET_INFORMATION_USER="users/self/media/recent/";
    public static final String URL_GET_RECENT_MEDIA_USER =  KEY_GET_INFORMATION_USER+
                                                            KEY_ACCESS_TOKEN+
                                                            ACCESS_TOKEN;



//    https://api.instagram.com/v1/users/self/media/recent/?access_token=ACCESS-TOKEN

   // https://api.instagram.com/v1/users/self/?access_token=285348435.c2d73f8.49da2ae0b0c14a0b9c17c930b5ef116c


}


