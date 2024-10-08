/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;


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
public class Projectpublications implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer   projectId;
    private Integer   publicationId;
    private Timestamp createdOn;
    private Timestamp updatedOn;

    public Projectpublications() {}

    public Projectpublications(Projectpublications value) {
        this.projectId = value.projectId;
        this.publicationId = value.publicationId;
        this.createdOn = value.createdOn;
        this.updatedOn = value.updatedOn;
    }

    public Projectpublications(
        Integer   projectId,
        Integer   publicationId,
        Timestamp createdOn,
        Timestamp updatedOn
    ) {
        this.projectId = projectId;
        this.publicationId = publicationId;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Projectpublications (");

        sb.append(projectId);
        sb.append(", ").append(publicationId);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(updatedOn);

        sb.append(")");
        return sb.toString();
    }
    // @formatter:on
}
