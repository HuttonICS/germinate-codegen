/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Arrays;

import javax.annotation.Generated;

import jhi.germinate.server.database.pojo.ImageTag;


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
public class ViewTableImages implements Serializable {

    private static final long serialVersionUID = -256100424;

    private Integer    imageId;
    private String     imageDescription;
    private Integer    imageForeignId;
    private String     imagePath;
    private String     imageType;
    private String     imageRefTable;
    private String     referenceName;
    private Timestamp  createdOn;
    private ImageTag[] tags;

    public ViewTableImages() {}

    public ViewTableImages(ViewTableImages value) {
        this.imageId = value.imageId;
        this.imageDescription = value.imageDescription;
        this.imageForeignId = value.imageForeignId;
        this.imagePath = value.imagePath;
        this.imageType = value.imageType;
        this.imageRefTable = value.imageRefTable;
        this.referenceName = value.referenceName;
        this.createdOn = value.createdOn;
        this.tags = value.tags;
    }

    public ViewTableImages(
        Integer    imageId,
        String     imageDescription,
        Integer    imageForeignId,
        String     imagePath,
        String     imageType,
        String     imageRefTable,
        String     referenceName,
        Timestamp  createdOn,
        ImageTag[] tags
    ) {
        this.imageId = imageId;
        this.imageDescription = imageDescription;
        this.imageForeignId = imageForeignId;
        this.imagePath = imagePath;
        this.imageType = imageType;
        this.imageRefTable = imageRefTable;
        this.referenceName = referenceName;
        this.createdOn = createdOn;
        this.tags = tags;
    }

    public Integer getImageId() {
        return this.imageId;
    }

    public void setImageId(Integer imageId) {
        this.imageId = imageId;
    }

    public String getImageDescription() {
        return this.imageDescription;
    }

    public void setImageDescription(String imageDescription) {
        this.imageDescription = imageDescription;
    }

    public Integer getImageForeignId() {
        return this.imageForeignId;
    }

    public void setImageForeignId(Integer imageForeignId) {
        this.imageForeignId = imageForeignId;
    }

    public String getImagePath() {
        return this.imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getImageType() {
        return this.imageType;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    public String getImageRefTable() {
        return this.imageRefTable;
    }

    public void setImageRefTable(String imageRefTable) {
        this.imageRefTable = imageRefTable;
    }

    public String getReferenceName() {
        return this.referenceName;
    }

    public void setReferenceName(String referenceName) {
        this.referenceName = referenceName;
    }

    public Timestamp getCreatedOn() {
        return this.createdOn;
    }

    public void setCreatedOn(Timestamp createdOn) {
        this.createdOn = createdOn;
    }

    public ImageTag[] getTags() {
        return this.tags;
    }

    public void setTags(ImageTag... tags) {
        this.tags = tags;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ViewTableImages (");

        sb.append(imageId);
        sb.append(", ").append(imageDescription);
        sb.append(", ").append(imageForeignId);
        sb.append(", ").append(imagePath);
        sb.append(", ").append(imageType);
        sb.append(", ").append(imageRefTable);
        sb.append(", ").append(referenceName);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(Arrays.toString(tags));

        sb.append(")");
        return sb.toString();
    }
// @formatter:on
}