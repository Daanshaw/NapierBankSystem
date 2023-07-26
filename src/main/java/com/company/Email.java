package com.company;

public class Email {


    private String header;
    private String sender;
    private String subject;
    private String body;



    public Email() {
    }


    public Email(String header, String sender, String subject, String body) {
        this.header = header;
        this.sender = sender;
        this.subject = subject;
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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }


}
