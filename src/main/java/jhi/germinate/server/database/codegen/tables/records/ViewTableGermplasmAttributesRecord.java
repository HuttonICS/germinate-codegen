/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import jhi.germinate.server.database.codegen.enums.ViewTableGermplasmAttributesAttributeType;
import jhi.germinate.server.database.codegen.tables.ViewTableGermplasmAttributes;

import org.jooq.Field;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.TableRecordImpl;


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
public class ViewTableGermplasmAttributesRecord extends TableRecordImpl<ViewTableGermplasmAttributesRecord> implements Record12<Integer, Integer, String, String, Integer, String, String, ViewTableGermplasmAttributesAttributeType, String, Integer, Timestamp, String> {

    private static final long serialVersionUID = 805073874;

    /**
     * Setter for <code>germinate_db.view_table_germplasm_attributes.attribute_value_id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public void setAttributeValueId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_germplasm_attributes.attribute_value_id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public Integer getAttributeValueId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>germinate_db.view_table_germplasm_attributes.germplasm_id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public void setGermplasmId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_germplasm_attributes.germplasm_id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public Integer getGermplasmId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>germinate_db.view_table_germplasm_attributes.germplasm_gid</code>. A unique identifier.
     */
    public void setGermplasmGid(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_germplasm_attributes.germplasm_gid</code>. A unique identifier.
     */
    public String getGermplasmGid() {
        return (String) get(2);
    }

    /**
     * Setter for <code>germinate_db.view_table_germplasm_attributes.germplasm_name</code>. A unique name which defines an entry in the germinatbase table.
     */
    public void setGermplasmName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_germplasm_attributes.germplasm_name</code>. A unique name which defines an entry in the germinatbase table.
     */
    public String getGermplasmName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>germinate_db.view_table_germplasm_attributes.attribute_id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public void setAttributeId(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_germplasm_attributes.attribute_id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public Integer getAttributeId() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>germinate_db.view_table_germplasm_attributes.attribute_name</code>. Defines the name of the attribute.
     */
    public void setAttributeName(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_germplasm_attributes.attribute_name</code>. Defines the name of the attribute.
     */
    public String getAttributeName() {
        return (String) get(5);
    }

    /**
     * Setter for <code>germinate_db.view_table_germplasm_attributes.attribute_description</code>. Describes the attribute. This should expand on the name to make it clear what the attribute actually is.
     */
    public void setAttributeDescription(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_germplasm_attributes.attribute_description</code>. Describes the attribute. This should expand on the name to make it clear what the attribute actually is.
     */
    public String getAttributeDescription() {
        return (String) get(6);
    }

    /**
     * Setter for <code>germinate_db.view_table_germplasm_attributes.attribute_type</code>. Describes the data type of the attribute. This can be INT, FLOAT or CHAR type.
     */
    public void setAttributeType(ViewTableGermplasmAttributesAttributeType value) {
        set(7, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_germplasm_attributes.attribute_type</code>. Describes the data type of the attribute. This can be INT, FLOAT or CHAR type.
     */
    public ViewTableGermplasmAttributesAttributeType getAttributeType() {
        return (ViewTableGermplasmAttributesAttributeType) get(7);
    }

    /**
     * Setter for <code>germinate_db.view_table_germplasm_attributes.target_table</code>.
     */
    public void setTargetTable(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_germplasm_attributes.target_table</code>.
     */
    public String getTargetTable() {
        return (String) get(8);
    }

    /**
     * Setter for <code>germinate_db.view_table_germplasm_attributes.foreign_id</code>. Foreign key to germinatebase (germinatebase.id).
     */
    public void setForeignId(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_germplasm_attributes.foreign_id</code>. Foreign key to germinatebase (germinatebase.id).
     */
    public Integer getForeignId() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>germinate_db.view_table_germplasm_attributes.created_on</code>. When the record was created.
     */
    public void setCreatedOn(Timestamp value) {
        set(10, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_germplasm_attributes.created_on</code>. When the record was created.
     */
    public Timestamp getCreatedOn() {
        return (Timestamp) get(10);
    }

    /**
     * Setter for <code>germinate_db.view_table_germplasm_attributes.attribute_value</code>. The value of the attribute.
     */
    public void setAttributeValue(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_germplasm_attributes.attribute_value</code>. The value of the attribute.
     */
    public String getAttributeValue() {
        return (String) get(11);
    }

    // -------------------------------------------------------------------------
    // Record12 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Integer, Integer, String, String, Integer, String, String, ViewTableGermplasmAttributesAttributeType, String, Integer, Timestamp, String> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Integer, Integer, String, String, Integer, String, String, ViewTableGermplasmAttributesAttributeType, String, Integer, Timestamp, String> valuesRow() {
        return (Row12) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return ViewTableGermplasmAttributes.VIEW_TABLE_GERMPLASM_ATTRIBUTES.ATTRIBUTE_VALUE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return ViewTableGermplasmAttributes.VIEW_TABLE_GERMPLASM_ATTRIBUTES.GERMPLASM_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return ViewTableGermplasmAttributes.VIEW_TABLE_GERMPLASM_ATTRIBUTES.GERMPLASM_GID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return ViewTableGermplasmAttributes.VIEW_TABLE_GERMPLASM_ATTRIBUTES.GERMPLASM_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return ViewTableGermplasmAttributes.VIEW_TABLE_GERMPLASM_ATTRIBUTES.ATTRIBUTE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return ViewTableGermplasmAttributes.VIEW_TABLE_GERMPLASM_ATTRIBUTES.ATTRIBUTE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return ViewTableGermplasmAttributes.VIEW_TABLE_GERMPLASM_ATTRIBUTES.ATTRIBUTE_DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ViewTableGermplasmAttributesAttributeType> field8() {
        return ViewTableGermplasmAttributes.VIEW_TABLE_GERMPLASM_ATTRIBUTES.ATTRIBUTE_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return ViewTableGermplasmAttributes.VIEW_TABLE_GERMPLASM_ATTRIBUTES.TARGET_TABLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field10() {
        return ViewTableGermplasmAttributes.VIEW_TABLE_GERMPLASM_ATTRIBUTES.FOREIGN_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field11() {
        return ViewTableGermplasmAttributes.VIEW_TABLE_GERMPLASM_ATTRIBUTES.CREATED_ON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return ViewTableGermplasmAttributes.VIEW_TABLE_GERMPLASM_ATTRIBUTES.ATTRIBUTE_VALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getAttributeValueId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getGermplasmId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getGermplasmGid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getGermplasmName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getAttributeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getAttributeName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getAttributeDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableGermplasmAttributesAttributeType component8() {
        return getAttributeType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getTargetTable();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component10() {
        return getForeignId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component11() {
        return getCreatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component12() {
        return getAttributeValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getAttributeValueId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getGermplasmId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getGermplasmGid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getGermplasmName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getAttributeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getAttributeName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getAttributeDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableGermplasmAttributesAttributeType value8() {
        return getAttributeType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getTargetTable();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value10() {
        return getForeignId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value11() {
        return getCreatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getAttributeValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableGermplasmAttributesRecord value1(Integer value) {
        setAttributeValueId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableGermplasmAttributesRecord value2(Integer value) {
        setGermplasmId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableGermplasmAttributesRecord value3(String value) {
        setGermplasmGid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableGermplasmAttributesRecord value4(String value) {
        setGermplasmName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableGermplasmAttributesRecord value5(Integer value) {
        setAttributeId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableGermplasmAttributesRecord value6(String value) {
        setAttributeName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableGermplasmAttributesRecord value7(String value) {
        setAttributeDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableGermplasmAttributesRecord value8(ViewTableGermplasmAttributesAttributeType value) {
        setAttributeType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableGermplasmAttributesRecord value9(String value) {
        setTargetTable(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableGermplasmAttributesRecord value10(Integer value) {
        setForeignId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableGermplasmAttributesRecord value11(Timestamp value) {
        setCreatedOn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableGermplasmAttributesRecord value12(String value) {
        setAttributeValue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableGermplasmAttributesRecord values(Integer value1, Integer value2, String value3, String value4, Integer value5, String value6, String value7, ViewTableGermplasmAttributesAttributeType value8, String value9, Integer value10, Timestamp value11, String value12) {
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
        value12(value12);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ViewTableGermplasmAttributesRecord
     */
    public ViewTableGermplasmAttributesRecord() {
        super(ViewTableGermplasmAttributes.VIEW_TABLE_GERMPLASM_ATTRIBUTES);
    }

    /**
     * Create a detached, initialised ViewTableGermplasmAttributesRecord
     */
    public ViewTableGermplasmAttributesRecord(Integer attributeValueId, Integer germplasmId, String germplasmGid, String germplasmName, Integer attributeId, String attributeName, String attributeDescription, ViewTableGermplasmAttributesAttributeType attributeType, String targetTable, Integer foreignId, Timestamp createdOn, String attributeValue) {
        super(ViewTableGermplasmAttributes.VIEW_TABLE_GERMPLASM_ATTRIBUTES);

        set(0, attributeValueId);
        set(1, germplasmId);
        set(2, germplasmGid);
        set(3, germplasmName);
        set(4, attributeId);
        set(5, attributeName);
        set(6, attributeDescription);
        set(7, attributeType);
        set(8, targetTable);
        set(9, foreignId);
        set(10, createdOn);
        set(11, attributeValue);
    }
// @formatter:on
}
