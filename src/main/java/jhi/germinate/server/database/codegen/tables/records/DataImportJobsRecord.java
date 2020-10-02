/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import jhi.germinate.server.database.codegen.enums.DataImportJobsDatatype;
import jhi.germinate.server.database.codegen.enums.DataImportJobsStatus;
import jhi.germinate.server.database.codegen.tables.DataImportJobs;
import jhi.germinate.server.database.pojo.ImportResult;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record13;
import org.jooq.Row13;
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
public class DataImportJobsRecord extends UpdatableRecordImpl<DataImportJobsRecord> implements Record13<Integer, String, String, Integer, String, Boolean, DataImportJobsDatatype, DataImportJobsStatus, Boolean, Boolean, ImportResult[], Timestamp, Timestamp> {

    private static final long serialVersionUID = 425487395;

    /**
     * Setter for <code>germinate_db.data_import_jobs.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>germinate_db.data_import_jobs.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>germinate_db.data_import_jobs.uuid</code>.
     */
    public void setUuid(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>germinate_db.data_import_jobs.uuid</code>.
     */
    public String getUuid() {
        return (String) get(1);
    }

    /**
     * Setter for <code>germinate_db.data_import_jobs.job_id</code>.
     */
    public void setJobId(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>germinate_db.data_import_jobs.job_id</code>.
     */
    public String getJobId() {
        return (String) get(2);
    }

    /**
     * Setter for <code>germinate_db.data_import_jobs.user_id</code>.
     */
    public void setUserId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>germinate_db.data_import_jobs.user_id</code>.
     */
    public Integer getUserId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>germinate_db.data_import_jobs.original_filename</code>.
     */
    public void setOriginalFilename(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>germinate_db.data_import_jobs.original_filename</code>.
     */
    public String getOriginalFilename() {
        return (String) get(4);
    }

    /**
     * Setter for <code>germinate_db.data_import_jobs.is_update</code>.
     */
    public void setIsUpdate(Boolean value) {
        set(5, value);
    }

    /**
     * Getter for <code>germinate_db.data_import_jobs.is_update</code>.
     */
    public Boolean getIsUpdate() {
        return (Boolean) get(5);
    }

    /**
     * Setter for <code>germinate_db.data_import_jobs.datatype</code>.
     */
    public void setDatatype(DataImportJobsDatatype value) {
        set(6, value);
    }

    /**
     * Getter for <code>germinate_db.data_import_jobs.datatype</code>.
     */
    public DataImportJobsDatatype getDatatype() {
        return (DataImportJobsDatatype) get(6);
    }

    /**
     * Setter for <code>germinate_db.data_import_jobs.status</code>.
     */
    public void setStatus(DataImportJobsStatus value) {
        set(7, value);
    }

    /**
     * Getter for <code>germinate_db.data_import_jobs.status</code>.
     */
    public DataImportJobsStatus getStatus() {
        return (DataImportJobsStatus) get(7);
    }

    /**
     * Setter for <code>germinate_db.data_import_jobs.imported</code>.
     */
    public void setImported(Boolean value) {
        set(8, value);
    }

    /**
     * Getter for <code>germinate_db.data_import_jobs.imported</code>.
     */
    public Boolean getImported() {
        return (Boolean) get(8);
    }

    /**
     * Setter for <code>germinate_db.data_import_jobs.visibility</code>.
     */
    public void setVisibility(Boolean value) {
        set(9, value);
    }

    /**
     * Getter for <code>germinate_db.data_import_jobs.visibility</code>.
     */
    public Boolean getVisibility() {
        return (Boolean) get(9);
    }

    /**
     * Setter for <code>germinate_db.data_import_jobs.feedback</code>.
     */
    public void setFeedback(ImportResult... value) {
        set(10, value);
    }

    /**
     * Getter for <code>germinate_db.data_import_jobs.feedback</code>.
     */
    public ImportResult[] getFeedback() {
        return (ImportResult[]) get(10);
    }

    /**
     * Setter for <code>germinate_db.data_import_jobs.created_on</code>.
     */
    public void setCreatedOn(Timestamp value) {
        set(11, value);
    }

    /**
     * Getter for <code>germinate_db.data_import_jobs.created_on</code>.
     */
    public Timestamp getCreatedOn() {
        return (Timestamp) get(11);
    }

    /**
     * Setter for <code>germinate_db.data_import_jobs.updated_on</code>.
     */
    public void setUpdatedOn(Timestamp value) {
        set(12, value);
    }

    /**
     * Getter for <code>germinate_db.data_import_jobs.updated_on</code>.
     */
    public Timestamp getUpdatedOn() {
        return (Timestamp) get(12);
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
    // Record13 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<Integer, String, String, Integer, String, Boolean, DataImportJobsDatatype, DataImportJobsStatus, Boolean, Boolean, ImportResult[], Timestamp, Timestamp> fieldsRow() {
        return (Row13) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<Integer, String, String, Integer, String, Boolean, DataImportJobsDatatype, DataImportJobsStatus, Boolean, Boolean, ImportResult[], Timestamp, Timestamp> valuesRow() {
        return (Row13) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return DataImportJobs.DATA_IMPORT_JOBS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return DataImportJobs.DATA_IMPORT_JOBS.UUID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return DataImportJobs.DATA_IMPORT_JOBS.JOB_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return DataImportJobs.DATA_IMPORT_JOBS.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return DataImportJobs.DATA_IMPORT_JOBS.ORIGINAL_FILENAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field6() {
        return DataImportJobs.DATA_IMPORT_JOBS.IS_UPDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<DataImportJobsDatatype> field7() {
        return DataImportJobs.DATA_IMPORT_JOBS.DATATYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<DataImportJobsStatus> field8() {
        return DataImportJobs.DATA_IMPORT_JOBS.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field9() {
        return DataImportJobs.DATA_IMPORT_JOBS.IMPORTED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field10() {
        return DataImportJobs.DATA_IMPORT_JOBS.VISIBILITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ImportResult[]> field11() {
        return DataImportJobs.DATA_IMPORT_JOBS.FEEDBACK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field12() {
        return DataImportJobs.DATA_IMPORT_JOBS.CREATED_ON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field13() {
        return DataImportJobs.DATA_IMPORT_JOBS.UPDATED_ON;
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
        return getUuid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getJobId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getOriginalFilename();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component6() {
        return getIsUpdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DataImportJobsDatatype component7() {
        return getDatatype();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DataImportJobsStatus component8() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component9() {
        return getImported();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component10() {
        return getVisibility();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImportResult[] component11() {
        return getFeedback();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component12() {
        return getCreatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component13() {
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
        return getUuid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getJobId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getOriginalFilename();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value6() {
        return getIsUpdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DataImportJobsDatatype value7() {
        return getDatatype();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DataImportJobsStatus value8() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value9() {
        return getImported();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value10() {
        return getVisibility();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImportResult[] value11() {
        return getFeedback();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value12() {
        return getCreatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value13() {
        return getUpdatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DataImportJobsRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DataImportJobsRecord value2(String value) {
        setUuid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DataImportJobsRecord value3(String value) {
        setJobId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DataImportJobsRecord value4(Integer value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DataImportJobsRecord value5(String value) {
        setOriginalFilename(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DataImportJobsRecord value6(Boolean value) {
        setIsUpdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DataImportJobsRecord value7(DataImportJobsDatatype value) {
        setDatatype(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DataImportJobsRecord value8(DataImportJobsStatus value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DataImportJobsRecord value9(Boolean value) {
        setImported(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DataImportJobsRecord value10(Boolean value) {
        setVisibility(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DataImportJobsRecord value11(ImportResult... value) {
        setFeedback(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DataImportJobsRecord value12(Timestamp value) {
        setCreatedOn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DataImportJobsRecord value13(Timestamp value) {
        setUpdatedOn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DataImportJobsRecord values(Integer value1, String value2, String value3, Integer value4, String value5, Boolean value6, DataImportJobsDatatype value7, DataImportJobsStatus value8, Boolean value9, Boolean value10, ImportResult[] value11, Timestamp value12, Timestamp value13) {
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
        value13(value13);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached DataImportJobsRecord
     */
    public DataImportJobsRecord() {
        super(DataImportJobs.DATA_IMPORT_JOBS);
    }

    /**
     * Create a detached, initialised DataImportJobsRecord
     */
    public DataImportJobsRecord(Integer id, String uuid, String jobId, Integer userId, String originalFilename, Boolean isUpdate, DataImportJobsDatatype datatype, DataImportJobsStatus status, Boolean imported, Boolean visibility, ImportResult[] feedback, Timestamp createdOn, Timestamp updatedOn) {
        super(DataImportJobs.DATA_IMPORT_JOBS);

        set(0, id);
        set(1, uuid);
        set(2, jobId);
        set(3, userId);
        set(4, originalFilename);
        set(5, isUpdate);
        set(6, datatype);
        set(7, status);
        set(8, imported);
        set(9, visibility);
        set(10, feedback);
        set(11, createdOn);
        set(12, updatedOn);
    }
// @formatter:on
}
