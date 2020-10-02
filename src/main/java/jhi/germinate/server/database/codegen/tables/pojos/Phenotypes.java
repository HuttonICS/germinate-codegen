/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;

import jhi.germinate.server.database.codegen.enums.PhenotypesDatatype;
import jhi.germinate.server.database.pojo.TraitRestrictions;


// @formatter:off
/**
 * Defines phenoytpes which are held in Germinate.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Phenotypes implements Serializable {

    private static final long serialVersionUID = 1933864187;

    private Integer            id;
    private String             name;
    private String             shortName;
    private String             description;
    private PhenotypesDatatype datatype;
    private TraitRestrictions  restrictions;
    private Integer            unitId;
    private Timestamp          createdOn;
    private Timestamp          updatedOn;

    public Phenotypes() {}

    public Phenotypes(Phenotypes value) {
        this.id = value.id;
        this.name = value.name;
        this.shortName = value.shortName;
        this.description = value.description;
        this.datatype = value.datatype;
        this.restrictions = value.restrictions;
        this.unitId = value.unitId;
        this.createdOn = value.createdOn;
        this.updatedOn = value.updatedOn;
    }

    public Phenotypes(
        Integer            id,
        String             name,
        String             shortName,
        String             description,
        PhenotypesDatatype datatype,
        TraitRestrictions  restrictions,
        Integer            unitId,
        Timestamp          createdOn,
        Timestamp          updatedOn
    ) {
        this.id = id;
        this.name = name;
        this.shortName = shortName;
        this.description = description;
        this.datatype = datatype;
        this.restrictions = restrictions;
        this.unitId = unitId;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortName() {
        return this.shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PhenotypesDatatype getDatatype() {
        return this.datatype;
    }

    public void setDatatype(PhenotypesDatatype datatype) {
        this.datatype = datatype;
    }

    public TraitRestrictions getRestrictions() {
        return this.restrictions;
    }

    public void setRestrictions(TraitRestrictions restrictions) {
        this.restrictions = restrictions;
    }

    public Integer getUnitId() {
        return this.unitId;
    }

    public void setUnitId(Integer unitId) {
        this.unitId = unitId;
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
        StringBuilder sb = new StringBuilder("Phenotypes (");

        sb.append(id);
        sb.append(", ").append(name);
        sb.append(", ").append(shortName);
        sb.append(", ").append(description);
        sb.append(", ").append(datatype);
        sb.append(", ").append(restrictions);
        sb.append(", ").append(unitId);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(updatedOn);

        sb.append(")");
        return sb.toString();
    }
// @formatter:on
}
