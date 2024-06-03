package org.deep.deepnews;


import java.text.SimpleDateFormat;
import java.util.Date;

public class News {
    private String title;
    private String content;
    private String category;
    private Date createdAt;

    public News(String title, String content, String category, Date createdAt) {
        this.title = title;
        this.content = content;
        this.category = category;
        this.createdAt = createdAt;
    }

    // Getters and setters

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getTimeSinceCreation() {
        long diffInMillis = new Date().getTime() - createdAt.getTime();
        long diffInMinutes = diffInMillis / (1000 * 60);
        long diffInHours = diffInMillis / (1000 * 60 * 60);
        long diffInDays = diffInMillis / (1000 * 60 * 60 * 24);

        if (diffInMinutes < 60) {
            return diffInMinutes + " хвилин назад";
        } else if (diffInHours < 24) {
            return diffInHours + " годин назад";
        } else {
            return diffInDays + " днів назад";
        }
    }
}
