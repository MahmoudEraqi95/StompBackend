package com.eraqi.demo;

public class Response {
    public Response(boolean success){
        this.success = success;
    }
    public Response(){

    }
    boolean success;

    public boolean getSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}
