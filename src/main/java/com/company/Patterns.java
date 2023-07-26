package com.company;

public class Patterns {

    private final String twitterIdPattern =
            "(?<=^|(?<=[^a-zA-Z0-9-_\\.]))@([A-Za-z]+[A-Za-z0-9-_]+)";
    private final String hashtagPattern = "(#[A-Za-z0-9-_]+)";
    private final int tweetBodyCount = 140;

    private final int smsBodyCount = 140;
    private final int telephoneNumberCount = 12;

    private final String emailPattern =
            "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                    + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    private final String sortCodePattern = "^[1-9]{2}\\s?\\-?[1-9]{2}\\s?\\-?[1-9]{2}$";
    private final String urlPattern = "((https?|ftp|gopher|telnet|file):((//)|(\\\\))+[\\w\\d:#@%/;$()~_?\\+-=\\\\\\.&]*)";
    private final int emailBodyCount = 1028;

    public String getTwitterIdPattern() {
        return twitterIdPattern;
    }

    public String getHashtagPattern() {
        return hashtagPattern;
    }

    public int getTweetBodyCount() {
        return tweetBodyCount;
    }
    public int getSmsBodyCount() {
        return smsBodyCount;
    }

    public int getTelephoneNumberCount() {
        return telephoneNumberCount;
    }

    public String getEmailPattern() {
        return emailPattern;
    }


    public String getUrlPattern() {
        return urlPattern;
    }

    public int getEmailBodyCount() {
        return emailBodyCount;
    }
    public String getSortCodePattern() {
        return sortCodePattern;
    }
}
