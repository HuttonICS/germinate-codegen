/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


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
public class Imagetypes implements Serializable {

    private static final long serialVersionUID = 1323252804;

    private Integer   id;
    private String    description;
    private String    referenceTable;
    private Timestamp createdOn;
    private Timestamp updatedOn;

    public Imagetypes() {}

    public Imagetypes(Imagetypes value) {
        this.id = value.id;
        this.description = value.description;
        this.referenceTable = value.referenceTable;
        this.createdOn = value.createdOn;
        this.updatedOn = value.updatedOn;
    }

    public Imagetypes(
        Integer   id,
        String    description,
        String    referenceTable,
        Timestamp createdOn,
        Timestamp updatedOn
    ) {
        this.id = id;
        this.description = description;
        this.referenceTable = referenceTable;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getReferenceTable() {
        return this.referenceTable;
    }

    public void setReferenceTable(String referenceTable) {
        this.referenceTable = referenceTable;
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
        StringBuilder sb = new StringBuilder("Imagetypes (");

        sb.append(id);
        sb.append(", ").append(description);
        sb.append(", ").append(referenceTable);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(updatedOn);

        sb.append(")");
        return sb.toString();
    }
// @formatter:on
}
