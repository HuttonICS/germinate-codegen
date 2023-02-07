/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables.records;


import java.sql.Timestamp;

import jhi.germinate.server.database.codegen.enums.ViewTableTraitAttributesAttributeType;
import jhi.germinate.server.database.codegen.tables.ViewTableTraitAttributes;

import org.jooq.Field;
import org.jooq.Record11;
import org.jooq.Row11;
import org.jooq.impl.TableRecordImpl;


// @formatter:off
/**
 * VIEW
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ViewTableTraitAttributesRecord extends TableRecordImpl<ViewTableTraitAttributesRecord> implements Record11<Integer, Integer, String, Integer, String, String, ViewTableTraitAttributesAttributeType, String, Integer, Timestamp, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>germinate_db.view_table_trait_attributes.attribute_value_id</code>.
     * Primary id for this table. This uniquely identifies the row.
     */
    public void setAttributeValueId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>germinate_db.view_table_trait_attributes.attribute_value_id</code>.
     * Primary id for this table. This uniquely identifies the row.
     */
    public Integer getAttributeValueId() {
        return (Integer) get(0);
    }

    /**
     * Setter for
     * <code>germinate_db.view_table_trait_attributes.trait_id</code>. Primary
     * id for this table. This uniquely identifies the row.
     */
    public void setTraitId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>germinate_db.view_table_trait_attributes.trait_id</code>. Primary
     * id for this table. This uniquely identifies the row.
     */
    public Integer getTraitId() {
        return (Integer) get(1);
    }

    /**
     * Setter for
     * <code>germinate_db.view_table_trait_attributes.trait_name</code>.
     * Phenotype full name.
     */
    public void setTraitName(String value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>germinate_db.view_table_trait_attributes.trait_name</code>.
     * Phenotype full name.
     */
    public String getTraitName() {
        return (String) get(2);
    }

    /**
     * Setter for
     * <code>germinate_db.view_table_trait_attributes.attribute_id</code>.
     * Primary id for this table. This uniquely identifies the row.
     */
    public void setAttributeId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>germinate_db.view_table_trait_attributes.attribute_id</code>.
     * Primary id for this table. This uniquely identifies the row.
     */
    public Integer getAttributeId() {
        return (Integer) get(3);
    }

    /**
     * Setter for
     * <code>germinate_db.view_table_trait_attributes.attribute_name</code>.
     * Defines the name of the attribute.
     */
    public void setAttributeName(String value) {
        set(4, value);
    }

    /**
     * Getter for
     * <code>germinate_db.view_table_trait_attributes.attribute_name</code>.
     * Defines the name of the attribute.
     */
    public String getAttributeName() {
        return (String) get(4);
    }

    /**
     * Setter for
     * <code>germinate_db.view_table_trait_attributes.attribute_description</code>.
     * Describes the attribute. This should expand on the name to make it clear
     * what the attribute actually is.
     */
    public void setAttributeDescription(String value) {
        set(5, value);
    }

    /**
     * Getter for
     * <code>germinate_db.view_table_trait_attributes.attribute_description</code>.
     * Describes the attribute. This should expand on the name to make it clear
     * what the attribute actually is.
     */
    public String getAttributeDescription() {
        return (String) get(5);
    }

    /**
     * Setter for
     * <code>germinate_db.view_table_trait_attributes.attribute_type</code>.
     * Defines the data type of the attribute. This can be of numeric, text,
     * date or categorical types.
     */
    public void setAttributeType(ViewTableTraitAttributesAttributeType value) {
        set(6, value);
    }

    /**
     * Getter for
     * <code>germinate_db.view_table_trait_attributes.attribute_type</code>.
     * Defines the data type of the attribute. This can be of numeric, text,
     * date or categorical types.
     */
    public ViewTableTraitAttributesAttributeType getAttributeType() {
        return (ViewTableTraitAttributesAttributeType) get(6);
    }

    /**
     * Setter for
     * <code>germinate_db.view_table_trait_attributes.target_table</code>.
     */
    public void setTargetTable(String value) {
        set(7, value);
    }

    /**
     * Getter for
     * <code>germinate_db.view_table_trait_attributes.target_table</code>.
     */
    public String getTargetTable() {
        return (String) get(7);
    }

    /**
     * Setter for
     * <code>germinate_db.view_table_trait_attributes.foreign_id</code>. Foreign
     * key to germinatebase (germinatebase.id).
     */
    public void setForeignId(Integer value) {
        set(8, value);
    }

    /**
     * Getter for
     * <code>germinate_db.view_table_trait_attributes.foreign_id</code>. Foreign
     * key to germinatebase (germinatebase.id).
     */
    public Integer getForeignId() {
        return (Integer) get(8);
    }

    /**
     * Setter for
     * <code>germinate_db.view_table_trait_attributes.created_on</code>. When
     * the record was created.
     */
    public void setCreatedOn(Timestamp value) {
        set(9, value);
    }

    /**
     * Getter for
     * <code>germinate_db.view_table_trait_attributes.created_on</code>. When
     * the record was created.
     */
    public Timestamp getCreatedOn() {
        return (Timestamp) get(9);
    }

    /**
     * Setter for
     * <code>germinate_db.view_table_trait_attributes.attribute_value</code>.
     * The value of the attribute.
     */
    public void setAttributeValue(String value) {
        set(10, value);
    }

    /**
     * Getter for
     * <code>germinate_db.view_table_trait_attributes.attribute_value</code>.
     * The value of the attribute.
     */
    public String getAttributeValue() {
        return (String) get(10);
    }

    // -------------------------------------------------------------------------
    // Record11 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row11<Integer, Integer, String, Integer, String, String, ViewTableTraitAttributesAttributeType, String, Integer, Timestamp, String> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    @Override
    public Row11<Integer, Integer, String, Integer, String, String, ViewTableTraitAttributesAttributeType, String, Integer, Timestamp, String> valuesRow() {
        return (Row11) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return ViewTableTraitAttributes.VIEW_TABLE_TRAIT_ATTRIBUTES.ATTRIBUTE_VALUE_ID;
    }

    @Override
    public Field<Integer> field2() {
        return ViewTableTraitAttributes.VIEW_TABLE_TRAIT_ATTRIBUTES.TRAIT_ID;
    }

    @Override
    public Field<String> field3() {
        return ViewTableTraitAttributes.VIEW_TABLE_TRAIT_ATTRIBUTES.TRAIT_NAME;
    }

    @Override
    public Field<Integer> field4() {
        return ViewTableTraitAttributes.VIEW_TABLE_TRAIT_ATTRIBUTES.ATTRIBUTE_ID;
    }

    @Override
    public Field<String> field5() {
        return ViewTableTraitAttributes.VIEW_TABLE_TRAIT_ATTRIBUTES.ATTRIBUTE_NAME;
    }

    @Override
    public Field<String> field6() {
        return ViewTableTraitAttributes.VIEW_TABLE_TRAIT_ATTRIBUTES.ATTRIBUTE_DESCRIPTION;
    }

    @Override
    public Field<ViewTableTraitAttributesAttributeType> field7() {
        return ViewTableTraitAttributes.VIEW_TABLE_TRAIT_ATTRIBUTES.ATTRIBUTE_TYPE;
    }

    @Override
    public Field<String> field8() {
        return ViewTableTraitAttributes.VIEW_TABLE_TRAIT_ATTRIBUTES.TARGET_TABLE;
    }

    @Override
    public Field<Integer> field9() {
        return ViewTableTraitAttributes.VIEW_TABLE_TRAIT_ATTRIBUTES.FOREIGN_ID;
    }

    @Override
    public Field<Timestamp> field10() {
        return ViewTableTraitAttributes.VIEW_TABLE_TRAIT_ATTRIBUTES.CREATED_ON;
    }

    @Override
    public Field<String> field11() {
        return ViewTableTraitAttributes.VIEW_TABLE_TRAIT_ATTRIBUTES.ATTRIBUTE_VALUE;
    }

    @Override
    public Integer component1() {
        return getAttributeValueId();
    }

    @Override
    public Integer component2() {
        return getTraitId();
    }

    @Override
    public String component3() {
        return getTraitName();
    }

    @Override
    public Integer component4() {
        return getAttributeId();
    }

    @Override
    public String component5() {
        return getAttributeName();
    }

    @Override
    public String component6() {
        return getAttributeDescription();
    }

    @Override
    public ViewTableTraitAttributesAttributeType component7() {
        return getAttributeType();
    }

    @Override
    public String component8() {
        return getTargetTable();
    }

    @Override
    public Integer component9() {
        return getForeignId();
    }

    @Override
    public Timestamp component10() {
        return getCreatedOn();
    }

    @Override
    public String component11() {
        return getAttributeValue();
    }

    @Override
    public Integer value1() {
        return getAttributeValueId();
    }

    @Override
    public Integer value2() {
        return getTraitId();
    }

    @Override
    public String value3() {
        return getTraitName();
    }

    @Override
    public Integer value4() {
        return getAttributeId();
    }

    @Override
    public String value5() {
        return getAttributeName();
    }

    @Override
    public String value6() {
        return getAttributeDescription();
    }

    @Override
    public ViewTableTraitAttributesAttributeType value7() {
        return getAttributeType();
    }

    @Override
    public String value8() {
        return getTargetTable();
    }

    @Override
    public Integer value9() {
        return getForeignId();
    }

    @Override
    public Timestamp value10() {
        return getCreatedOn();
    }

    @Override
    public String value11() {
        return getAttributeValue();
    }

    @Override
    public ViewTableTraitAttributesRecord value1(Integer value) {
        setAttributeValueId(value);
        return this;
    }

    @Override
    public ViewTableTraitAttributesRecord value2(Integer value) {
        setTraitId(value);
        return this;
    }

    @Override
    public ViewTableTraitAttributesRecord value3(String value) {
        setTraitName(value);
        return this;
    }

    @Override
    public ViewTableTraitAttributesRecord value4(Integer value) {
        setAttributeId(value);
        return this;
    }

    @Override
    public ViewTableTraitAttributesRecord value5(String value) {
        setAttributeName(value);
        return this;
    }

    @Override
    public ViewTableTraitAttributesRecord value6(String value) {
        setAttributeDescription(value);
        return this;
    }

    @Override
    public ViewTableTraitAttributesRecord value7(ViewTableTraitAttributesAttributeType value) {
        setAttributeType(value);
        return this;
    }

    @Override
    public ViewTableTraitAttributesRecord value8(String value) {
        setTargetTable(value);
        return this;
    }

    @Override
    public ViewTableTraitAttributesRecord value9(Integer value) {
        setForeignId(value);
        return this;
    }

    @Override
    public ViewTableTraitAttributesRecord value10(Timestamp value) {
        setCreatedOn(value);
        return this;
    }

    @Override
    public ViewTableTraitAttributesRecord value11(String value) {
        setAttributeValue(value);
        return this;
    }

    @Override
    public ViewTableTraitAttributesRecord values(Integer value1, Integer value2, String value3, Integer value4, String value5, String value6, ViewTableTraitAttributesAttributeType value7, String value8, Integer value9, Timestamp value10, String value11) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ViewTableTraitAttributesRecord
     */
    public ViewTableTraitAttributesRecord() {
        super(ViewTableTraitAttributes.VIEW_TABLE_TRAIT_ATTRIBUTES);
    }

    /**
     * Create a detached, initialised ViewTableTraitAttributesRecord
     */
    public ViewTableTraitAttributesRecord(Integer attributeValueId, Integer traitId, String traitName, Integer attributeId, String attributeName, String attributeDescription, ViewTableTraitAttributesAttributeType attributeType, String targetTable, Integer foreignId, Timestamp createdOn, String attributeValue) {
        super(ViewTableTraitAttributes.VIEW_TABLE_TRAIT_ATTRIBUTES);

        setAttributeValueId(attributeValueId);
        setTraitId(traitId);
        setTraitName(traitName);
        setAttributeId(attributeId);
        setAttributeName(attributeName);
        setAttributeDescription(attributeDescription);
        setAttributeType(attributeType);
        setTargetTable(targetTable);
        setForeignId(foreignId);
        setCreatedOn(createdOn);
        setAttributeValue(attributeValue);
    }

    /**
     * Create a detached, initialised ViewTableTraitAttributesRecord
     */
    public ViewTableTraitAttributesRecord(jhi.germinate.server.database.codegen.tables.pojos.ViewTableTraitAttributes value) {
        super(ViewTableTraitAttributes.VIEW_TABLE_TRAIT_ATTRIBUTES);

        if (value != null) {
            setAttributeValueId(value.getAttributeValueId());
            setTraitId(value.getTraitId());
            setTraitName(value.getTraitName());
            setAttributeId(value.getAttributeId());
            setAttributeName(value.getAttributeName());
            setAttributeDescription(value.getAttributeDescription());
            setAttributeType(value.getAttributeType());
            setTargetTable(value.getTargetTable());
            setForeignId(value.getForeignId());
            setCreatedOn(value.getCreatedOn());
            setAttributeValue(value.getAttributeValue());
        }
    }
    // @formatter:on
}