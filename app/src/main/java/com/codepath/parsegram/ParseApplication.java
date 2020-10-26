package com.codepath.parsegram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("YTBtIraUM1uVnW0Zqvi0Mkit1UlkdMcLtiI1cUJ7")
                .clientKey("zRGDS8BBR88JWyU7PmUPSmZVoMNGA48Nj6drDx0n")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
