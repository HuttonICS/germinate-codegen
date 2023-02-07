/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import jhi.germinate.server.database.codegen.enums.ViewTableTraitAttributesAttributeType;


import lombok.*;
import lombok.experimental.Accessors;

// @formatter:off
/**
 * VIEW
 */
@Getter
@Setter
@Accessors(chain = true)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ViewTableTraitAttributes implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer                               attributeValueId;
    private Integer                               traitId;
    private String                                traitName;
    private Integer                               attributeId;
    private String                                attributeName;
    private String                                attributeDescription;
    private ViewTableTraitAttributesAttributeType attributeType;
    private String                                targetTable;
    private Integer                               foreignId;
    private Timestamp                             createdOn;
    private String                                attributeValue;

    public ViewTableTraitAttributes() {}

    public ViewTableTraitAttributes(ViewTableTraitAttributes value) {
        this.attributeValueId = value.attributeValueId;
        this.traitId = value.traitId;
        this.traitName = value.traitName;
        this.attributeId = value.attributeId;
        this.attributeName = value.attributeName;
        this.attributeDescription = value.attributeDescription;
        this.attributeType = value.attributeType;
        this.targetTable = value.targetTable;
        this.foreignId = value.foreignId;
        this.createdOn = value.createdOn;
        this.attributeValue = value.attributeValue;
    }

    public ViewTableTraitAttributes(
        Integer                               attributeValueId,
        Integer                               traitId,
        String                                traitName,
        Integer                               attributeId,
        String                                attributeName,
        String                                attributeDescription,
        ViewTableTraitAttributesAttributeType attributeType,
        String                                targetTable,
        Integer                               foreignId,
        Timestamp                             createdOn,
        String                                attributeValue
    ) {
        this.attributeValueId = attributeValueId;
        this.traitId = traitId;
        this.traitName = traitName;
        this.attributeId = attributeId;
        this.attributeName = attributeName;
        this.attributeDescription = attributeDescription;
        this.attributeType = attributeType;
        this.targetTable = targetTable;
        this.foreignId = foreignId;
        this.createdOn = createdOn;
        this.attributeValue = attributeValue;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ViewTableTraitAttributes (");

        sb.append(attributeValueId);
        sb.append(", ").append(traitId);
        sb.append(", ").append(traitName);
        sb.append(", ").append(attributeId);
        sb.append(", ").append(attributeName);
        sb.append(", ").append(attributeDescription);
        sb.append(", ").append(attributeType);
        sb.append(", ").append(targetTable);
        sb.append(", ").append(foreignId);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(attributeValue);

        sb.append(")");
        return sb.toString();
    }
    // @formatter:on
}