package com.example.bishal.wallpaperapp;

/**
 * Created by Bishal on 4/2/2016.
 */
public class MyURL {

    private String URL = "https://pixabay.com/api/?key=2294725-957b806b5da5fbf556ee9ac72&q=";
    private String LINK = "https://pixabay.com/api/?key=";
    private String API_KEY = "2294725-957b806b5da5fbf556ee9ac72";
    private String CONNECTOR = "&q=";

    public void MyURL(){

    }
    public String getURL() {
        return URL;
    }
    public void setURL(String SEARCH_KEYWORDS){
        this.URL = LINK + API_KEY + CONNECTOR + SEARCH_KEYWORDS;
    }
}
