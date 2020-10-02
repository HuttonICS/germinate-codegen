/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import jhi.germinate.server.database.codegen.tables.Storagedata;

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
public class StoragedataRecord extends UpdatableRecordImpl<StoragedataRecord> implements Record5<Integer, Integer, Integer, Timestamp, Timestamp> {

    private static final long serialVersionUID = 119411903;

    /**
     * Setter for <code>germinate_db.storagedata.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>germinate_db.storagedata.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>germinate_db.storagedata.germinatebase_id</code>.
     */
    public void setGerminatebaseId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>germinate_db.storagedata.germinatebase_id</code>.
     */
    public Integer getGerminatebaseId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>germinate_db.storagedata.storage_id</code>.
     */
    public void setStorageId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>germinate_db.storagedata.storage_id</code>.
     */
    public Integer getStorageId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>germinate_db.storagedata.created_on</code>. When the record was created.
     */
    public void setCreatedOn(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>germinate_db.storagedata.created_on</code>. When the record was created.
     */
    public Timestamp getCreatedOn() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>germinate_db.storagedata.updated_on</code>. When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.
     */
    public void setUpdatedOn(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>germinate_db.storagedata.updated_on</code>. When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.
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
    public Row5<Integer, Integer, Integer, Timestamp, Timestamp> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, Integer, Integer, Timestamp, Timestamp> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Storagedata.STORAGEDATA.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Storagedata.STORAGEDATA.GERMINATEBASE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return Storagedata.STORAGEDATA.STORAGE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return Storagedata.STORAGEDATA.CREATED_ON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return Storagedata.STORAGEDATA.UPDATED_ON;
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
    public Integer component2() {
        return getGerminatebaseId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getStorageId();
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
    public Integer value2() {
        return getGerminatebaseId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getStorageId();
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
    public StoragedataRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StoragedataRecord value2(Integer value) {
        setGerminatebaseId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StoragedataRecord value3(Integer value) {
        setStorageId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StoragedataRecord value4(Timestamp value) {
        setCreatedOn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StoragedataRecord value5(Timestamp value) {
        setUpdatedOn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StoragedataRecord values(Integer value1, Integer value2, Integer value3, Timestamp value4, Timestamp value5) {
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
     * Create a detached StoragedataRecord
     */
    public StoragedataRecord() {
        super(Storagedata.STORAGEDATA);
    }

    /**
     * Create a detached, initialised StoragedataRecord
     */
    public StoragedataRecord(Integer id, Integer germinatebaseId, Integer storageId, Timestamp createdOn, Timestamp updatedOn) {
        super(Storagedata.STORAGEDATA);

        set(0, id);
        set(1, germinatebaseId);
        set(2, storageId);
        set(3, createdOn);
        set(4, updatedOn);
    }
// @formatter:on
}
