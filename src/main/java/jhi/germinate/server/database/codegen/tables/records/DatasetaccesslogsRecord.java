/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import jhi.germinate.server.database.codegen.tables.Datasetaccesslogs;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;


// @formatter:off
/**
 * If enabled, tracks which user accessed which datasets.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DatasetaccesslogsRecord extends UpdatableRecordImpl<DatasetaccesslogsRecord> implements Record9<Integer, Integer, String, String, String, Integer, String, Timestamp, Timestamp> {

    private static final long serialVersionUID = 1766724994;

    /**
     * Setter for <code>germinate_db.datasetaccesslogs.id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>germinate_db.datasetaccesslogs.id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>germinate_db.datasetaccesslogs.user_id</code>.
     */
    public void setUserId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>germinate_db.datasetaccesslogs.user_id</code>.
     */
    public Integer getUserId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>germinate_db.datasetaccesslogs.user_name</code>.
     */
    public void setUserName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>germinate_db.datasetaccesslogs.user_name</code>.
     */
    public String getUserName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>germinate_db.datasetaccesslogs.user_email</code>.
     */
    public void setUserEmail(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>germinate_db.datasetaccesslogs.user_email</code>.
     */
    public String getUserEmail() {
        return (String) get(3);
    }

    /**
     * Setter for <code>germinate_db.datasetaccesslogs.user_institution</code>.
     */
    public void setUserInstitution(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>germinate_db.datasetaccesslogs.user_institution</code>.
     */
    public String getUserInstitution() {
        return (String) get(4);
    }

    /**
     * Setter for <code>germinate_db.datasetaccesslogs.dataset_id</code>.
     */
    public void setDatasetId(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>germinate_db.datasetaccesslogs.dataset_id</code>.
     */
    public Integer getDatasetId() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>germinate_db.datasetaccesslogs.reason</code>.
     */
    public void setReason(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>germinate_db.datasetaccesslogs.reason</code>.
     */
    public String getReason() {
        return (String) get(6);
    }

    /**
     * Setter for <code>germinate_db.datasetaccesslogs.created_on</code>. When the record was created.
     */
    public void setCreatedOn(Timestamp value) {
        set(7, value);
    }

    /**
     * Getter for <code>germinate_db.datasetaccesslogs.created_on</code>. When the record was created.
     */
    public Timestamp getCreatedOn() {
        return (Timestamp) get(7);
    }

    /**
     * Setter for <code>germinate_db.datasetaccesslogs.updated_on</code>. When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.
     */
    public void setUpdatedOn(Timestamp value) {
        set(8, value);
    }

    /**
     * Getter for <code>germinate_db.datasetaccesslogs.updated_on</code>. When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.
     */
    public Timestamp getUpdatedOn() {
        return (Timestamp) get(8);
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
    // Record9 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Integer, Integer, String, String, String, Integer, String, Timestamp, Timestamp> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Integer, Integer, String, String, String, Integer, String, Timestamp, Timestamp> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Datasetaccesslogs.DATASETACCESSLOGS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Datasetaccesslogs.DATASETACCESSLOGS.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Datasetaccesslogs.DATASETACCESSLOGS.USER_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Datasetaccesslogs.DATASETACCESSLOGS.USER_EMAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Datasetaccesslogs.DATASETACCESSLOGS.USER_INSTITUTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return Datasetaccesslogs.DATASETACCESSLOGS.DATASET_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return Datasetaccesslogs.DATASETACCESSLOGS.REASON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return Datasetaccesslogs.DATASETACCESSLOGS.CREATED_ON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field9() {
        return Datasetaccesslogs.DATASETACCESSLOGS.UPDATED_ON;
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
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getUserName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getUserEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getUserInstitution();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getDatasetId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getReason();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component8() {
        return getCreatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component9() {
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
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getUserName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getUserEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getUserInstitution();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getDatasetId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getReason();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value8() {
        return getCreatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value9() {
        return getUpdatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DatasetaccesslogsRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DatasetaccesslogsRecord value2(Integer value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DatasetaccesslogsRecord value3(String value) {
        setUserName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DatasetaccesslogsRecord value4(String value) {
        setUserEmail(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DatasetaccesslogsRecord value5(String value) {
        setUserInstitution(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DatasetaccesslogsRecord value6(Integer value) {
        setDatasetId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DatasetaccesslogsRecord value7(String value) {
        setReason(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DatasetaccesslogsRecord value8(Timestamp value) {
        setCreatedOn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DatasetaccesslogsRecord value9(Timestamp value) {
        setUpdatedOn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DatasetaccesslogsRecord values(Integer value1, Integer value2, String value3, String value4, String value5, Integer value6, String value7, Timestamp value8, Timestamp value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached DatasetaccesslogsRecord
     */
    public DatasetaccesslogsRecord() {
        super(Datasetaccesslogs.DATASETACCESSLOGS);
    }

    /**
     * Create a detached, initialised DatasetaccesslogsRecord
     */
    public DatasetaccesslogsRecord(Integer id, Integer userId, String userName, String userEmail, String userInstitution, Integer datasetId, String reason, Timestamp createdOn, Timestamp updatedOn) {
        super(Datasetaccesslogs.DATASETACCESSLOGS);

        set(0, id);
        set(1, userId);
        set(2, userName);
        set(3, userEmail);
        set(4, userInstitution);
        set(5, datasetId);
        set(6, reason);
        set(7, createdOn);
        set(8, updatedOn);
    }
// @formatter:on
}
