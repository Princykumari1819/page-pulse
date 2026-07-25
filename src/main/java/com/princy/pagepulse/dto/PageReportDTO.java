package com.princy.pagepulse.dto;
public class PageReportDTO {

    private int status;
    private long responseTime;
    private String title;
    private String metaDescription;
    private int h1Count;
    private int imageCount;
    private int altTextCount;
    private int wordCount;

    public int getStatus() {
        return status;
    }

    public void setStatus (int status) {
        this.status = status;
    }
    public long getResponseTime() {
        return responseTime;
    }
    public void setResponseTime(long responseTime) {
        this.responseTime = responseTime;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getMetaDescription() {
        return metaDescription;
    }
    public void setMetaDescription(String metaDescription) {
        this.metaDescription = metaDescription;
    }
    public int getH1Count() {
        return h1Count;
    }
    public void setH1Count(int h1Count) {
        this.h1Count = h1Count;
    }
    public int getImageCount() {
        return imageCount;
    }
    public void setImageCount(int imageCount) {
        this.imageCount = imageCount;
    }
    public int getAltTextCount() {
        return altTextCount;
    }
    public void setAltTextCount(int altTextCount) {
        this.altTextCount = altTextCount;
    }
    public int getWordCount() {
        return wordCount;
    }
    public void setWordCount(int wordCount) {
        this.wordCount = wordCount;
    }
}
