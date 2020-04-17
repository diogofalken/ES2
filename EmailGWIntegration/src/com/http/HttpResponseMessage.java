package com.http;

public class HttpResponseMessage {
    private int code;
    private String message;

    public HttpResponseMessage(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
