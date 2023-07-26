package com.company;

public class Sms {


    private String header;
    private String sender;
    private String body;




    public Sms() {
    }


    public Sms(String header, String sender, String body) {
        this.header = header;
        this.sender = sender;
        this.body = body;

    }


    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }


    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }



}
