/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import jhi.germinate.server.database.codegen.tables.Imagetypes;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


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
public class ImagetypesRecord extends UpdatableRecordImpl<ImagetypesRecord> implements Record5<Integer, String, String, Timestamp, Timestamp> {

    private static final long serialVersionUID = 1926060001;

    /**
     * Setter for <code>germinate_db.imagetypes.id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>germinate_db.imagetypes.id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>germinate_db.imagetypes.description</code>. A description of the image type. This would usually be a description of what the image was showing in general terms such as 'field image' or 'insitu hybridisation images'.
     */
    public void setDescription(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>germinate_db.imagetypes.description</code>. A description of the image type. This would usually be a description of what the image was showing in general terms such as 'field image' or 'insitu hybridisation images'.
     */
    public String getDescription() {
        return (String) get(1);
    }

    /**
     * Setter for <code>germinate_db.imagetypes.reference_table</code>. The table which the image type relates to.
     */
    public void setReferenceTable(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>germinate_db.imagetypes.reference_table</code>. The table which the image type relates to.
     */
    public String getReferenceTable() {
        return (String) get(2);
    }

    /**
     * Setter for <code>germinate_db.imagetypes.created_on</code>. When the record was created.
     */
    public void setCreatedOn(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>germinate_db.imagetypes.created_on</code>. When the record was created.
     */
    public Timestamp getCreatedOn() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>germinate_db.imagetypes.updated_on</code>. When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.
     */
    public void setUpdatedOn(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>germinate_db.imagetypes.updated_on</code>. When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.
     */
    public Timestamp getUpdatedOn() {
        return (Timestamp) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, String, String, Timestamp, Timestamp> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, String, String, Timestamp, Timestamp> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Imagetypes.IMAGETYPES.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Imagetypes.IMAGETYPES.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Imagetypes.IMAGETYPES.REFERENCE_TABLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return Imagetypes.IMAGETYPES.CREATED_ON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return Imagetypes.IMAGETYPES.UPDATED_ON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getReferenceTable();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component4() {
        return getCreatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component5() {
        return getUpdatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getReferenceTable();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getCreatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getUpdatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImagetypesRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImagetypesRecord value2(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImagetypesRecord value3(String value) {
        setReferenceTable(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImagetypesRecord value4(Timestamp value) {
        setCreatedOn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImagetypesRecord value5(Timestamp value) {
        setUpdatedOn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImagetypesRecord values(Integer value1, String value2, String value3, Timestamp value4, Timestamp value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ImagetypesRecord
     */
    public ImagetypesRecord() {
        super(Imagetypes.IMAGETYPES);
    }

    /**
     * Create a detached, initialised ImagetypesRecord
     */
    public ImagetypesRecord(Integer id, String description, String referenceTable, Timestamp createdOn, Timestamp updatedOn) {
        super(Imagetypes.IMAGETYPES);

        set(0, id);
        set(1, description);
        set(2, referenceTable);
        set(3, createdOn);
        set(4, updatedOn);
    }
// @formatter:on
}
