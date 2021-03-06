package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;

public class ParseApplication extends Application {

    //Initialize Parse SDK as soon as the application is created
    @Override
    public void onCreate() {
        super.onCreate();

        //Register Parse Models
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("gfHEf6qk0j002c8VpCF0dbayZgZGRyr7W1huPpwX")
                .clientKey("odEsKGrD1dfDI5ggGInDcXClL83XCrdYV2xu5RfX")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
