/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables.records;


import java.sql.Timestamp;

import jhi.germinate.server.database.codegen.tables.Projectgroups;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


// @formatter:off
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ProjectgroupsRecord extends UpdatableRecordImpl<ProjectgroupsRecord> implements Record4<Integer, Integer, Timestamp, Timestamp> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>germinate_db.projectgroups.project_id</code>.
     */
    public void setProjectId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>germinate_db.projectgroups.project_id</code>.
     */
    public Integer getProjectId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>germinate_db.projectgroups.group_id</code>.
     */
    public void setGroupId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>germinate_db.projectgroups.group_id</code>.
     */
    public Integer getGroupId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>germinate_db.projectgroups.created_on</code>.
     */
    public void setCreatedOn(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>germinate_db.projectgroups.created_on</code>.
     */
    public Timestamp getCreatedOn() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>germinate_db.projectgroups.updated_on</code>.
     */
    public void setUpdatedOn(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>germinate_db.projectgroups.updated_on</code>.
     */
    public Timestamp getUpdatedOn() {
        return (Timestamp) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record2<Integer, Integer> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<Integer, Integer, Timestamp, Timestamp> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<Integer, Integer, Timestamp, Timestamp> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Projectgroups.PROJECTGROUPS.PROJECT_ID;
    }

    @Override
    public Field<Integer> field2() {
        return Projectgroups.PROJECTGROUPS.GROUP_ID;
    }

    @Override
    public Field<Timestamp> field3() {
        return Projectgroups.PROJECTGROUPS.CREATED_ON;
    }

    @Override
    public Field<Timestamp> field4() {
        return Projectgroups.PROJECTGROUPS.UPDATED_ON;
    }

    @Override
    public Integer component1() {
        return getProjectId();
    }

    @Override
    public Integer component2() {
        return getGroupId();
    }

    @Override
    public Timestamp component3() {
        return getCreatedOn();
    }

    @Override
    public Timestamp component4() {
        return getUpdatedOn();
    }

    @Override
    public Integer value1() {
        return getProjectId();
    }

    @Override
    public Integer value2() {
        return getGroupId();
    }

    @Override
    public Timestamp value3() {
        return getCreatedOn();
    }

    @Override
    public Timestamp value4() {
        return getUpdatedOn();
    }

    @Override
    public ProjectgroupsRecord value1(Integer value) {
        setProjectId(value);
        return this;
    }

    @Override
    public ProjectgroupsRecord value2(Integer value) {
        setGroupId(value);
        return this;
    }

    @Override
    public ProjectgroupsRecord value3(Timestamp value) {
        setCreatedOn(value);
        return this;
    }

    @Override
    public ProjectgroupsRecord value4(Timestamp value) {
        setUpdatedOn(value);
        return this;
    }

    @Override
    public ProjectgroupsRecord values(Integer value1, Integer value2, Timestamp value3, Timestamp value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ProjectgroupsRecord
     */
    public ProjectgroupsRecord() {
        super(Projectgroups.PROJECTGROUPS);
    }

    /**
     * Create a detached, initialised ProjectgroupsRecord
     */
    public ProjectgroupsRecord(Integer projectId, Integer groupId, Timestamp createdOn, Timestamp updatedOn) {
        super(Projectgroups.PROJECTGROUPS);

        setProjectId(projectId);
        setGroupId(groupId);
        setCreatedOn(createdOn);
        setUpdatedOn(updatedOn);
    }

    /**
     * Create a detached, initialised ProjectgroupsRecord
     */
    public ProjectgroupsRecord(jhi.germinate.server.database.codegen.tables.pojos.Projectgroups value) {
        super(Projectgroups.PROJECTGROUPS);

        if (value != null) {
            setProjectId(value.getProjectId());
            setGroupId(value.getGroupId());
            setCreatedOn(value.getCreatedOn());
            setUpdatedOn(value.getUpdatedOn());
        }
    }
    // @formatter:on
}