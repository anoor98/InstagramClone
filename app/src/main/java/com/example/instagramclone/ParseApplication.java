package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    //Initialize Parse SDK as soon as the application is created
    @Override
    public void onCreate() {
        super.onCreate();

        //register your parse models
        ParseObject.registerSubclass(Post.class);

        //Register Parse Models
        //set applicationID, and server server based on the values in the Back4app settings
        //clientKey is not needed unless explicitly configured
        //any network interceptors must be added with the configuration builder given this
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("gfHEf6qk0j002c8VpCF0dbayZgZGRyr7W1huPpwX") //should correspond to APP_ID env variable
                .clientKey("odEsKGrD1dfDI5ggGInDcXClL83XCrdYV2xu5RfX") //set explicitly unless clientKey is expl
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
