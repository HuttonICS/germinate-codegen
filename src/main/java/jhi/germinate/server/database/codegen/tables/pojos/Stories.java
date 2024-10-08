/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import jhi.germinate.server.database.pojo.StoryRequirements;


import lombok.*;
import lombok.experimental.Accessors;

// @formatter:off
/**
 * This class is generated by jOOQ.
 */
@Getter
@Setter
@Accessors(chain = true)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Stories implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer           id;
    private String            name;
    private String            description;
    private Integer           imageId;
    private StoryRequirements requirements;
    private Integer           publicationId;
    private Integer           projectId;
    private Boolean           featured;
    private Boolean           visibility;
    private Integer           userId;
    private Timestamp         createdOn;
    private Timestamp         updatedOn;

    public Stories() {}

    public Stories(Stories value) {
        this.id = value.id;
        this.name = value.name;
        this.description = value.description;
        this.imageId = value.imageId;
        this.requirements = value.requirements;
        this.publicationId = value.publicationId;
        this.projectId = value.projectId;
        this.featured = value.featured;
        this.visibility = value.visibility;
        this.userId = value.userId;
        this.createdOn = value.createdOn;
        this.updatedOn = value.updatedOn;
    }

    public Stories(
        Integer           id,
        String            name,
        String            description,
        Integer           imageId,
        StoryRequirements requirements,
        Integer           publicationId,
        Integer           projectId,
        Boolean           featured,
        Boolean           visibility,
        Integer           userId,
        Timestamp         createdOn,
        Timestamp         updatedOn
    ) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.imageId = imageId;
        this.requirements = requirements;
        this.publicationId = publicationId;
        this.projectId = projectId;
        this.featured = featured;
        this.visibility = visibility;
        this.userId = userId;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Stories (");

        sb.append(id);
        sb.append(", ").append(name);
        sb.append(", ").append(description);
        sb.append(", ").append(imageId);
        sb.append(", ").append(requirements);
        sb.append(", ").append(publicationId);
        sb.append(", ").append(projectId);
        sb.append(", ").append(featured);
        sb.append(", ").append(visibility);
        sb.append(", ").append(userId);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(updatedOn);

        sb.append(")");
        return sb.toString();
    }
    // @formatter:on
}
