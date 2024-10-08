/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables.records;


import java.sql.Timestamp;

import jhi.germinate.server.database.codegen.tables.ViewTableGroups;

import org.jooq.Field;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.TableRecordImpl;


// @formatter:off
/**
 * VIEW
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ViewTableGroupsRecord extends TableRecordImpl<ViewTableGroupsRecord> implements Record12<Integer, String, String, Integer, String, String, Integer, Boolean, Timestamp, Timestamp, Integer[], Long> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>germinate_db.view_table_groups.group_id</code>. Primary
     * id for this table. This uniquely identifies the row.
     */
    public void setGroupId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_groups.group_id</code>. Primary
     * id for this table. This uniquely identifies the row.
     */
    public Integer getGroupId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>germinate_db.view_table_groups.group_name</code>. The
     * name of the group which can be used to identify it.
     */
    public void setGroupName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_groups.group_name</code>. The
     * name of the group which can be used to identify it.
     */
    public String getGroupName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>germinate_db.view_table_groups.group_description</code>.
     * A free text description of the group. This has no length limitations.
     */
    public void setGroupDescription(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_groups.group_description</code>.
     * A free text description of the group. This has no length limitations.
     */
    public String getGroupDescription() {
        return (String) get(2);
    }

    /**
     * Setter for <code>germinate_db.view_table_groups.group_type_id</code>.
     */
    public void setGroupTypeId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_groups.group_type_id</code>.
     */
    public Integer getGroupTypeId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>germinate_db.view_table_groups.group_type</code>.
     */
    public void setGroupType(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_groups.group_type</code>.
     */
    public String getGroupType() {
        return (String) get(4);
    }

    /**
     * Setter for <code>germinate_db.view_table_groups.user_name</code>.
     */
    public void setUserName(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_groups.user_name</code>.
     */
    public String getUserName() {
        return (String) get(5);
    }

    /**
     * Setter for <code>germinate_db.view_table_groups.user_id</code>. Defines
     * who created the group. Foreign key to Gatekeeper users (Gatekeeper
     * users.id).
     */
    public void setUserId(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_groups.user_id</code>. Defines
     * who created the group. Foreign key to Gatekeeper users (Gatekeeper
     * users.id).
     */
    public Integer getUserId() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>germinate_db.view_table_groups.group_visibility</code>.
     * Defines if the group is visuble or hidden from the Germinate user
     * interface.
     */
    public void setGroupVisibility(Boolean value) {
        set(7, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_groups.group_visibility</code>.
     * Defines if the group is visuble or hidden from the Germinate user
     * interface.
     */
    public Boolean getGroupVisibility() {
        return (Boolean) get(7);
    }

    /**
     * Setter for <code>germinate_db.view_table_groups.created_on</code>.
     * Foreign key to locations (locations.id).
     */
    public void setCreatedOn(Timestamp value) {
        set(8, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_groups.created_on</code>.
     * Foreign key to locations (locations.id).
     */
    public Timestamp getCreatedOn() {
        return (Timestamp) get(8);
    }

    /**
     * Setter for <code>germinate_db.view_table_groups.updated_on</code>. When
     * the record was updated. This may be different from the created on date if
     * subsequent changes have been made to the underlying record.
     */
    public void setUpdatedOn(Timestamp value) {
        set(9, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_groups.updated_on</code>. When
     * the record was updated. This may be different from the created on date if
     * subsequent changes have been made to the underlying record.
     */
    public Timestamp getUpdatedOn() {
        return (Timestamp) get(9);
    }

    /**
     * Setter for <code>germinate_db.view_table_groups.project_ids</code>.
     */
    public void setProjectIds(Integer[] value) {
        set(10, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_groups.project_ids</code>.
     */
    public Integer[] getProjectIds() {
        return (Integer[]) get(10);
    }

    /**
     * Setter for <code>germinate_db.view_table_groups.count</code>.
     */
    public void setCount(Long value) {
        set(11, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_groups.count</code>.
     */
    public Long getCount() {
        return (Long) get(11);
    }

    // -------------------------------------------------------------------------
    // Record12 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row12<Integer, String, String, Integer, String, String, Integer, Boolean, Timestamp, Timestamp, Integer[], Long> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    @Override
    public Row12<Integer, String, String, Integer, String, String, Integer, Boolean, Timestamp, Timestamp, Integer[], Long> valuesRow() {
        return (Row12) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return ViewTableGroups.VIEW_TABLE_GROUPS.GROUP_ID;
    }

    @Override
    public Field<String> field2() {
        return ViewTableGroups.VIEW_TABLE_GROUPS.GROUP_NAME;
    }

    @Override
    public Field<String> field3() {
        return ViewTableGroups.VIEW_TABLE_GROUPS.GROUP_DESCRIPTION;
    }

    @Override
    public Field<Integer> field4() {
        return ViewTableGroups.VIEW_TABLE_GROUPS.GROUP_TYPE_ID;
    }

    @Override
    public Field<String> field5() {
        return ViewTableGroups.VIEW_TABLE_GROUPS.GROUP_TYPE;
    }

    @Override
    public Field<String> field6() {
        return ViewTableGroups.VIEW_TABLE_GROUPS.USER_NAME;
    }

    @Override
    public Field<Integer> field7() {
        return ViewTableGroups.VIEW_TABLE_GROUPS.USER_ID;
    }

    @Override
    public Field<Boolean> field8() {
        return ViewTableGroups.VIEW_TABLE_GROUPS.GROUP_VISIBILITY;
    }

    @Override
    public Field<Timestamp> field9() {
        return ViewTableGroups.VIEW_TABLE_GROUPS.CREATED_ON;
    }

    @Override
    public Field<Timestamp> field10() {
        return ViewTableGroups.VIEW_TABLE_GROUPS.UPDATED_ON;
    }

    @Override
    public Field<Integer[]> field11() {
        return ViewTableGroups.VIEW_TABLE_GROUPS.PROJECT_IDS;
    }

    @Override
    public Field<Long> field12() {
        return ViewTableGroups.VIEW_TABLE_GROUPS.COUNT;
    }

    @Override
    public Integer component1() {
        return getGroupId();
    }

    @Override
    public String component2() {
        return getGroupName();
    }

    @Override
    public String component3() {
        return getGroupDescription();
    }

    @Override
    public Integer component4() {
        return getGroupTypeId();
    }

    @Override
    public String component5() {
        return getGroupType();
    }

    @Override
    public String component6() {
        return getUserName();
    }

    @Override
    public Integer component7() {
        return getUserId();
    }

    @Override
    public Boolean component8() {
        return getGroupVisibility();
    }

    @Override
    public Timestamp component9() {
        return getCreatedOn();
    }

    @Override
    public Timestamp component10() {
        return getUpdatedOn();
    }

    @Override
    public Integer[] component11() {
        return getProjectIds();
    }

    @Override
    public Long component12() {
        return getCount();
    }

    @Override
    public Integer value1() {
        return getGroupId();
    }

    @Override
    public String value2() {
        return getGroupName();
    }

    @Override
    public String value3() {
        return getGroupDescription();
    }

    @Override
    public Integer value4() {
        return getGroupTypeId();
    }

    @Override
    public String value5() {
        return getGroupType();
    }

    @Override
    public String value6() {
        return getUserName();
    }

    @Override
    public Integer value7() {
        return getUserId();
    }

    @Override
    public Boolean value8() {
        return getGroupVisibility();
    }

    @Override
    public Timestamp value9() {
        return getCreatedOn();
    }

    @Override
    public Timestamp value10() {
        return getUpdatedOn();
    }

    @Override
    public Integer[] value11() {
        return getProjectIds();
    }

    @Override
    public Long value12() {
        return getCount();
    }

    @Override
    public ViewTableGroupsRecord value1(Integer value) {
        setGroupId(value);
        return this;
    }

    @Override
    public ViewTableGroupsRecord value2(String value) {
        setGroupName(value);
        return this;
    }

    @Override
    public ViewTableGroupsRecord value3(String value) {
        setGroupDescription(value);
        return this;
    }

    @Override
    public ViewTableGroupsRecord value4(Integer value) {
        setGroupTypeId(value);
        return this;
    }

    @Override
    public ViewTableGroupsRecord value5(String value) {
        setGroupType(value);
        return this;
    }

    @Override
    public ViewTableGroupsRecord value6(String value) {
        setUserName(value);
        return this;
    }

    @Override
    public ViewTableGroupsRecord value7(Integer value) {
        setUserId(value);
        return this;
    }

    @Override
    public ViewTableGroupsRecord value8(Boolean value) {
        setGroupVisibility(value);
        return this;
    }

    @Override
    public ViewTableGroupsRecord value9(Timestamp value) {
        setCreatedOn(value);
        return this;
    }

    @Override
    public ViewTableGroupsRecord value10(Timestamp value) {
        setUpdatedOn(value);
        return this;
    }

    @Override
    public ViewTableGroupsRecord value11(Integer[] value) {
        setProjectIds(value);
        return this;
    }

    @Override
    public ViewTableGroupsRecord value12(Long value) {
        setCount(value);
        return this;
    }

    @Override
    public ViewTableGroupsRecord values(Integer value1, String value2, String value3, Integer value4, String value5, String value6, Integer value7, Boolean value8, Timestamp value9, Timestamp value10, Integer[] value11, Long value12) {
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
     * Create a detached ViewTableGroupsRecord
     */
    public ViewTableGroupsRecord() {
        super(ViewTableGroups.VIEW_TABLE_GROUPS);
    }

    /**
     * Create a detached, initialised ViewTableGroupsRecord
     */
    public ViewTableGroupsRecord(Integer groupId, String groupName, String groupDescription, Integer groupTypeId, String groupType, String userName, Integer userId, Boolean groupVisibility, Timestamp createdOn, Timestamp updatedOn, Integer[] projectIds, Long count) {
        super(ViewTableGroups.VIEW_TABLE_GROUPS);

        setGroupId(groupId);
        setGroupName(groupName);
        setGroupDescription(groupDescription);
        setGroupTypeId(groupTypeId);
        setGroupType(groupType);
        setUserName(userName);
        setUserId(userId);
        setGroupVisibility(groupVisibility);
        setCreatedOn(createdOn);
        setUpdatedOn(updatedOn);
        setProjectIds(projectIds);
        setCount(count);
    }

    /**
     * Create a detached, initialised ViewTableGroupsRecord
     */
    public ViewTableGroupsRecord(jhi.germinate.server.database.codegen.tables.pojos.ViewTableGroups value) {
        super(ViewTableGroups.VIEW_TABLE_GROUPS);

        if (value != null) {
            setGroupId(value.getGroupId());
            setGroupName(value.getGroupName());
            setGroupDescription(value.getGroupDescription());
            setGroupTypeId(value.getGroupTypeId());
            setGroupType(value.getGroupType());
            setUserName(value.getUserName());
            setUserId(value.getUserId());
            setGroupVisibility(value.getGroupVisibility());
            setCreatedOn(value.getCreatedOn());
            setUpdatedOn(value.getUpdatedOn());
            setProjectIds(value.getProjectIds());
            setCount(value.getCount());
        }
    }
    // @formatter:on
}
