/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


// @formatter:off
/**
 * VIEW
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ViewTableNews implements Serializable {

    private static final long serialVersionUID = 1602537983;

    private Integer   newsId;
    private String    newsTitle;
    private String    newsContent;
    private String    newsHyperlink;
    private String    newsImage;
    private Integer   newstypeId;
    private String    newstypeName;
    private String    newstypeDescription;
    private Timestamp createdOn;
    private Timestamp updatedOn;

    public ViewTableNews() {}

    public ViewTableNews(ViewTableNews value) {
        this.newsId = value.newsId;
        this.newsTitle = value.newsTitle;
        this.newsContent = value.newsContent;
        this.newsHyperlink = value.newsHyperlink;
        this.newsImage = value.newsImage;
        this.newstypeId = value.newstypeId;
        this.newstypeName = value.newstypeName;
        this.newstypeDescription = value.newstypeDescription;
        this.createdOn = value.createdOn;
        this.updatedOn = value.updatedOn;
    }

    public ViewTableNews(
        Integer   newsId,
        String    newsTitle,
        String    newsContent,
        String    newsHyperlink,
        String    newsImage,
        Integer   newstypeId,
        String    newstypeName,
        String    newstypeDescription,
        Timestamp createdOn,
        Timestamp updatedOn
    ) {
        this.newsId = newsId;
        this.newsTitle = newsTitle;
        this.newsContent = newsContent;
        this.newsHyperlink = newsHyperlink;
        this.newsImage = newsImage;
        this.newstypeId = newstypeId;
        this.newstypeName = newstypeName;
        this.newstypeDescription = newstypeDescription;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
    }

    public Integer getNewsId() {
        return this.newsId;
    }

    public void setNewsId(Integer newsId) {
        this.newsId = newsId;
    }

    public String getNewsTitle() {
        return this.newsTitle;
    }

    public void setNewsTitle(String newsTitle) {
        this.newsTitle = newsTitle;
    }

    public String getNewsContent() {
        return this.newsContent;
    }

    public void setNewsContent(String newsContent) {
        this.newsContent = newsContent;
    }

    public String getNewsHyperlink() {
        return this.newsHyperlink;
    }

    public void setNewsHyperlink(String newsHyperlink) {
        this.newsHyperlink = newsHyperlink;
    }

    public String getNewsImage() {
        return this.newsImage;
    }

    public void setNewsImage(String newsImage) {
        this.newsImage = newsImage;
    }

    public Integer getNewstypeId() {
        return this.newstypeId;
    }

    public void setNewstypeId(Integer newstypeId) {
        this.newstypeId = newstypeId;
    }

    public String getNewstypeName() {
        return this.newstypeName;
    }

    public void setNewstypeName(String newstypeName) {
        this.newstypeName = newstypeName;
    }

    public String getNewstypeDescription() {
        return this.newstypeDescription;
    }

    public void setNewstypeDescription(String newstypeDescription) {
        this.newstypeDescription = newstypeDescription;
    }

    public Timestamp getCreatedOn() {
        return this.createdOn;
    }

    public void setCreatedOn(Timestamp createdOn) {
        this.createdOn = createdOn;
    }

    public Timestamp getUpdatedOn() {
        return this.updatedOn;
    }

    public void setUpdatedOn(Timestamp updatedOn) {
        this.updatedOn = updatedOn;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ViewTableNews (");

        sb.append(newsId);
        sb.append(", ").append(newsTitle);
        sb.append(", ").append(newsContent);
        sb.append(", ").append(newsHyperlink);
        sb.append(", ").append(newsImage);
        sb.append(", ").append(newstypeId);
        sb.append(", ").append(newstypeName);
        sb.append(", ").append(newstypeDescription);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(updatedOn);

        sb.append(")");
        return sb.toString();
    }
// @formatter:on
}
