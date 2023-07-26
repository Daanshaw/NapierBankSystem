package com.company;

public class SirList {

    private String sortCode;
    private String natureOfIncident;

    public SirList(String sortCode, String natureOfIncident) {
        this.sortCode = sortCode;
        this.natureOfIncident = natureOfIncident;
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
