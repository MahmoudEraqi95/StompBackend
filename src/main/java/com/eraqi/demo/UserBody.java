package com.eraqi.demo;

import javax.jws.soap.SOAPBinding;

public class UserBody {
    String userId;

    public UserBody() {
    }

    public UserBody(String userId){
        this.userId = userId;
    }


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
