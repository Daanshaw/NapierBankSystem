package com.company;

public class Sir {


    private String header;
    private String sender;
    private String subject;
    private String body;
    private String date;
    private String sortCode;
    private String natureOfIncident;

    public Sir() {
    }


    public Sir(String header, String sender, String subject, String body, String sortCode, String natureOfIncident, String date) {
        this.header = header;
        this.sender = sender;
        this.subject = subject;
        this.body = body;
        this.date = date;
        this.sortCode = sortCode;
        this.natureOfIncident = natureOfIncident;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSortCode() {
        return sortCode;
    }

    public void setSortCode(String sortCode) {
        this.sortCode = sortCode;
    }

    public String getNatureOfIncident() {
        return natureOfIncident;
    }

    public void setNatureOfIncident(String natureOfIncident) {
        this.natureOfIncident = natureOfIncident;
    }


}


