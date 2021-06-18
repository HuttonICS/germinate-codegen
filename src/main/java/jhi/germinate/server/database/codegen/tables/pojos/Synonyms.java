/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Arrays;

import javax.annotation.Generated;


// @formatter:off
/**
 * Allows the definition of synonyms for entries such as germinatebase entries 
 * or marker names.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Synonyms implements Serializable {

    private static final long serialVersionUID = 1624081305;

    private Integer   id;
    private Integer   foreignId;
    private Integer   synonymtypeId;
    private String[]  synonyms;
    private Timestamp createdOn;
    private Timestamp updatedOn;

    public Synonyms() {}

    public Synonyms(Synonyms value) {
        this.id = value.id;
        this.foreignId = value.foreignId;
        this.synonymtypeId = value.synonymtypeId;
        this.synonyms = value.synonyms;
        this.createdOn = value.createdOn;
        this.updatedOn = value.updatedOn;
    }

    public Synonyms(
        Integer   id,
        Integer   foreignId,
        Integer   synonymtypeId,
        String[]  synonyms,
        Timestamp createdOn,
        Timestamp updatedOn
    ) {
        this.id = id;
        this.foreignId = foreignId;
        this.synonymtypeId = synonymtypeId;
        this.synonyms = synonyms;
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

    public Integer getSynonymtypeId() {
        return this.synonymtypeId;
    }

    public void setSynonymtypeId(Integer synonymtypeId) {
        this.synonymtypeId = synonymtypeId;
    }

    public String[] getSynonyms() {
        return this.synonyms;
    }

    public void setSynonyms(String... synonyms) {
        this.synonyms = synonyms;
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
        StringBuilder sb = new StringBuilder("Synonyms (");

        sb.append(id);
        sb.append(", ").append(foreignId);
        sb.append(", ").append(synonymtypeId);
        sb.append(", ").append(Arrays.toString(synonyms));
        sb.append(", ").append(createdOn);
        sb.append(", ").append(updatedOn);

        sb.append(")");
        return sb.toString();
    }
// @formatter:on
}
