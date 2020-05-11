package com.example.android.newsapp;

import java.util.List;

public class Article {
    String title;
    String sectionName;
    String publicationDateTime;
    String url;
    List<String> authorName;

    public Article(String title, String sectionName, String publicationDateTime, String url,List<String> name) {
        this.title = title;
        this.sectionName = sectionName;
        this.publicationDateTime = publicationDateTime;
        this.url = url;
        this.authorName=name;
    }

    public String getTitle() {
        return title;
    }

    public String getSectionName() {
        return sectionName;
    }

    public String getPublicationDateTime() {
        return publicationDateTime;
    }

    public String getUrl() {
        return url;
    }
    public List<String> getAuthorName(){ return authorName;}
}
