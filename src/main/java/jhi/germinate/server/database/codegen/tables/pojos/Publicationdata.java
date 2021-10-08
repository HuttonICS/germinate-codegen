/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;

import jhi.germinate.server.database.codegen.enums.PublicationdataReferenceType;


// @formatter:off
/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Publicationdata implements Serializable {

    private static final long serialVersionUID = 247195355;

    private Integer                      id;
    private Integer                      foreignId;
    private Integer                      publicationId;
    private PublicationdataReferenceType referenceType;
    private Timestamp                    createdOn;
    private Timestamp                    updatedOn;

    public Publicationdata() {}

    public Publicationdata(Publicationdata value) {
        this.id = value.id;
        this.foreignId = value.foreignId;
        this.publicationId = value.publicationId;
        this.referenceType = value.referenceType;
        this.createdOn = value.createdOn;
        this.updatedOn = value.updatedOn;
    }

    public Publicationdata(
        Integer                      id,
        Integer                      foreignId,
        Integer                      publicationId,
        PublicationdataReferenceType referenceType,
        Timestamp                    createdOn,
        Timestamp                    updatedOn
    ) {
        this.id = id;
        this.foreignId = foreignId;
        this.publicationId = publicationId;
        this.referenceType = referenceType;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getForeignId() {
        return this.foreignId;
    }

    public void setForeignId(Integer foreignId) {
        this.foreignId = foreignId;
    }

    public Integer getPublicationId() {
        return this.publicationId;
    }

    public void setPublicationId(Integer publicationId) {
        this.publicationId = publicationId;
    }

    public PublicationdataReferenceType getReferenceType() {
        return this.referenceType;
    }

    public void setReferenceType(PublicationdataReferenceType referenceType) {
        this.referenceType = referenceType;
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
        StringBuilder sb = new StringBuilder("Publicationdata (");

        sb.append(id);
        sb.append(", ").append(foreignId);
        sb.append(", ").append(publicationId);
        sb.append(", ").append(referenceType);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(updatedOn);

        sb.append(")");
        return sb.toString();
    }
// @formatter:on
}
