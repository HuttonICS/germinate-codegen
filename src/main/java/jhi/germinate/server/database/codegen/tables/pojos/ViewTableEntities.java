/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables.pojos;


import java.io.Serializable;

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
public class ViewTableEntities implements Serializable {

    private static final long serialVersionUID = 729284035;

    private Integer entityParentId;
    private String  entityParentGid;
    private String  entityParentName;
    private String  entityParentType;
    private Integer entityChildId;
    private String  entityChildGid;
    private String  entityChildName;
    private String  entityChildType;

    public ViewTableEntities() {}

    public ViewTableEntities(ViewTableEntities value) {
        this.entityParentId = value.entityParentId;
        this.entityParentGid = value.entityParentGid;
        this.entityParentName = value.entityParentName;
        this.entityParentType = value.entityParentType;
        this.entityChildId = value.entityChildId;
        this.entityChildGid = value.entityChildGid;
        this.entityChildName = value.entityChildName;
        this.entityChildType = value.entityChildType;
    }

    public ViewTableEntities(
        Integer entityParentId,
        String  entityParentGid,
        String  entityParentName,
        String  entityParentType,
        Integer entityChildId,
        String  entityChildGid,
        String  entityChildName,
        String  entityChildType
    ) {
        this.entityParentId = entityParentId;
        this.entityParentGid = entityParentGid;
        this.entityParentName = entityParentName;
        this.entityParentType = entityParentType;
        this.entityChildId = entityChildId;
        this.entityChildGid = entityChildGid;
        this.entityChildName = entityChildName;
        this.entityChildType = entityChildType;
    }

    public Integer getEntityParentId() {
        return this.entityParentId;
    }

    public void setEntityParentId(Integer entityParentId) {
        this.entityParentId = entityParentId;
    }

    public String getEntityParentGid() {
        return this.entityParentGid;
    }

    public void setEntityParentGid(String entityParentGid) {
        this.entityParentGid = entityParentGid;
    }

    public String getEntityParentName() {
        return this.entityParentName;
    }

    public void setEntityParentName(String entityParentName) {
        this.entityParentName = entityParentName;
    }

    public String getEntityParentType() {
        return this.entityParentType;
    }

    public void setEntityParentType(String entityParentType) {
        this.entityParentType = entityParentType;
    }

    public Integer getEntityChildId() {
        return this.entityChildId;
    }

    public void setEntityChildId(Integer entityChildId) {
        this.entityChildId = entityChildId;
    }

    public String getEntityChildGid() {
        return this.entityChildGid;
    }

    public void setEntityChildGid(String entityChildGid) {
        this.entityChildGid = entityChildGid;
    }

    public String getEntityChildName() {
        return this.entityChildName;
    }

    public void setEntityChildName(String entityChildName) {
        this.entityChildName = entityChildName;
    }

    public String getEntityChildType() {
        return this.entityChildType;
    }

    public void setEntityChildType(String entityChildType) {
        this.entityChildType = entityChildType;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ViewTableEntities (");

        sb.append(entityParentId);
        sb.append(", ").append(entityParentGid);
        sb.append(", ").append(entityParentName);
        sb.append(", ").append(entityParentType);
        sb.append(", ").append(entityChildId);
        sb.append(", ").append(entityChildGid);
        sb.append(", ").append(entityChildName);
        sb.append(", ").append(entityChildType);

        sb.append(")");
        return sb.toString();
    }
// @formatter:on
}
