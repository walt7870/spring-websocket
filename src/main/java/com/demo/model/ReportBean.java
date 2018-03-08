package com.demo.model;

import java.util.Date;

public class ReportBean {
    Long id;
    String date;
    String content;
    String title;
    ReportBean(){
    }

    public ReportBean(Long id, String date, String content, String title) {
        this.id = id;
        this.date = date;
        this.content = content;
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
