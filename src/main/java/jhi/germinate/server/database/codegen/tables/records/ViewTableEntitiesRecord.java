/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables.records;


import jhi.germinate.server.database.codegen.tables.ViewTableEntities;

import org.jooq.Field;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.TableRecordImpl;


// @formatter:off
/**
 * VIEW
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ViewTableEntitiesRecord extends TableRecordImpl<ViewTableEntitiesRecord> implements Record10<Integer, String, String, String, String, Integer, String, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>germinate_db.view_table_entities.entity_parent_id</code>. Primary
     * id for this table. This uniquely identifies the row.
     */
    public void setEntityParentId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>germinate_db.view_table_entities.entity_parent_id</code>. Primary
     * id for this table. This uniquely identifies the row.
     */
    public Integer getEntityParentId() {
        return (Integer) get(0);
    }

    /**
     * Setter for
     * <code>germinate_db.view_table_entities.entity_parent_gid</code>. A unique
     * identifier.
     */
    public void setEntityParentGid(String value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>germinate_db.view_table_entities.entity_parent_gid</code>. A unique
     * identifier.
     */
    public String getEntityParentGid() {
        return (String) get(1);
    }

    /**
     * Setter for
     * <code>germinate_db.view_table_entities.entity_parent_name</code>. A
     * unique name which defines an entry in the germinatbase table.
     */
    public void setEntityParentName(String value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>germinate_db.view_table_entities.entity_parent_name</code>. A
     * unique name which defines an entry in the germinatbase table.
     */
    public String getEntityParentName() {
        return (String) get(2);
    }

    /**
     * Setter for
     * <code>germinate_db.view_table_entities.entity_parent_display_name</code>.
     * The name to be displayed on user interfaces and to be exported to
     * external tools like Flapjack and Helium.
     */
    public void setEntityParentDisplayName(String value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>germinate_db.view_table_entities.entity_parent_display_name</code>.
     * The name to be displayed on user interfaces and to be exported to
     * external tools like Flapjack and Helium.
     */
    public String getEntityParentDisplayName() {
        return (String) get(3);
    }

    /**
     * Setter for
     * <code>germinate_db.view_table_entities.entity_parent_type</code>. The
     * name of the entity type.
     */
    public void setEntityParentType(String value) {
        set(4, value);
    }

    /**
     * Getter for
     * <code>germinate_db.view_table_entities.entity_parent_type</code>. The
     * name of the entity type.
     */
    public String getEntityParentType() {
        return (String) get(4);
    }

    /**
     * Setter for <code>germinate_db.view_table_entities.entity_child_id</code>.
     * Primary id for this table. This uniquely identifies the row.
     */
    public void setEntityChildId(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_entities.entity_child_id</code>.
     * Primary id for this table. This uniquely identifies the row.
     */
    public Integer getEntityChildId() {
        return (Integer) get(5);
    }

    /**
     * Setter for
     * <code>germinate_db.view_table_entities.entity_child_gid</code>. A unique
     * identifier.
     */
    public void setEntityChildGid(String value) {
        set(6, value);
    }

    /**
     * Getter for
     * <code>germinate_db.view_table_entities.entity_child_gid</code>. A unique
     * identifier.
     */
    public String getEntityChildGid() {
        return (String) get(6);
    }

    /**
     * Setter for
     * <code>germinate_db.view_table_entities.entity_child_name</code>. A unique
     * name which defines an entry in the germinatbase table.
     */
    public void setEntityChildName(String value) {
        set(7, value);
    }

    /**
     * Getter for
     * <code>germinate_db.view_table_entities.entity_child_name</code>. A unique
     * name which defines an entry in the germinatbase table.
     */
    public String getEntityChildName() {
        return (String) get(7);
    }

    /**
     * Setter for
     * <code>germinate_db.view_table_entities.entity_child_display_name</code>.
     * The name to be displayed on user interfaces and to be exported to
     * external tools like Flapjack and Helium.
     */
    public void setEntityChildDisplayName(String value) {
        set(8, value);
    }

    /**
     * Getter for
     * <code>germinate_db.view_table_entities.entity_child_display_name</code>.
     * The name to be displayed on user interfaces and to be exported to
     * external tools like Flapjack and Helium.
     */
    public String getEntityChildDisplayName() {
        return (String) get(8);
    }

    /**
     * Setter for
     * <code>germinate_db.view_table_entities.entity_child_type</code>. The name
     * of the entity type.
     */
    public void setEntityChildType(String value) {
        set(9, value);
    }

    /**
     * Getter for
     * <code>germinate_db.view_table_entities.entity_child_type</code>. The name
     * of the entity type.
     */
    public String getEntityChildType() {
        return (String) get(9);
    }

    // -------------------------------------------------------------------------
    // Record10 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row10<Integer, String, String, String, String, Integer, String, String, String, String> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    @Override
    public Row10<Integer, String, String, String, String, Integer, String, String, String, String> valuesRow() {
        return (Row10) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return ViewTableEntities.VIEW_TABLE_ENTITIES.ENTITY_PARENT_ID;
    }

    @Override
    public Field<String> field2() {
        return ViewTableEntities.VIEW_TABLE_ENTITIES.ENTITY_PARENT_GID;
    }

    @Override
    public Field<String> field3() {
        return ViewTableEntities.VIEW_TABLE_ENTITIES.ENTITY_PARENT_NAME;
    }

    @Override
    public Field<String> field4() {
        return ViewTableEntities.VIEW_TABLE_ENTITIES.ENTITY_PARENT_DISPLAY_NAME;
    }

    @Override
    public Field<String> field5() {
        return ViewTableEntities.VIEW_TABLE_ENTITIES.ENTITY_PARENT_TYPE;
    }

    @Override
    public Field<Integer> field6() {
        return ViewTableEntities.VIEW_TABLE_ENTITIES.ENTITY_CHILD_ID;
    }

    @Override
    public Field<String> field7() {
        return ViewTableEntities.VIEW_TABLE_ENTITIES.ENTITY_CHILD_GID;
    }

    @Override
    public Field<String> field8() {
        return ViewTableEntities.VIEW_TABLE_ENTITIES.ENTITY_CHILD_NAME;
    }

    @Override
    public Field<String> field9() {
        return ViewTableEntities.VIEW_TABLE_ENTITIES.ENTITY_CHILD_DISPLAY_NAME;
    }

    @Override
    public Field<String> field10() {
        return ViewTableEntities.VIEW_TABLE_ENTITIES.ENTITY_CHILD_TYPE;
    }

    @Override
    public Integer component1() {
        return getEntityParentId();
    }

    @Override
    public String component2() {
        return getEntityParentGid();
    }

    @Override
    public String component3() {
        return getEntityParentName();
    }

    @Override
    public String component4() {
        return getEntityParentDisplayName();
    }

    @Override
    public String component5() {
        return getEntityParentType();
    }

    @Override
    public Integer component6() {
        return getEntityChildId();
    }

    @Override
    public String component7() {
        return getEntityChildGid();
    }

    @Override
    public String component8() {
        return getEntityChildName();
    }

    @Override
    public String component9() {
        return getEntityChildDisplayName();
    }

    @Override
    public String component10() {
        return getEntityChildType();
    }

    @Override
    public Integer value1() {
        return getEntityParentId();
    }

    @Override
    public String value2() {
        return getEntityParentGid();
    }

    @Override
    public String value3() {
        return getEntityParentName();
    }

    @Override
    public String value4() {
        return getEntityParentDisplayName();
    }

    @Override
    public String value5() {
        return getEntityParentType();
    }

    @Override
    public Integer value6() {
        return getEntityChildId();
    }

    @Override
    public String value7() {
        return getEntityChildGid();
    }

    @Override
    public String value8() {
        return getEntityChildName();
    }

    @Override
    public String value9() {
        return getEntityChildDisplayName();
    }

    @Override
    public String value10() {
        return getEntityChildType();
    }

    @Override
    public ViewTableEntitiesRecord value1(Integer value) {
        setEntityParentId(value);
        return this;
    }

    @Override
    public ViewTableEntitiesRecord value2(String value) {
        setEntityParentGid(value);
        return this;
    }

    @Override
    public ViewTableEntitiesRecord value3(String value) {
        setEntityParentName(value);
        return this;
    }

    @Override
    public ViewTableEntitiesRecord value4(String value) {
        setEntityParentDisplayName(value);
        return this;
    }

    @Override
    public ViewTableEntitiesRecord value5(String value) {
        setEntityParentType(value);
        return this;
    }

    @Override
    public ViewTableEntitiesRecord value6(Integer value) {
        setEntityChildId(value);
        return this;
    }

    @Override
    public ViewTableEntitiesRecord value7(String value) {
        setEntityChildGid(value);
        return this;
    }

    @Override
    public ViewTableEntitiesRecord value8(String value) {
        setEntityChildName(value);
        return this;
    }

    @Override
    public ViewTableEntitiesRecord value9(String value) {
        setEntityChildDisplayName(value);
        return this;
    }

    @Override
    public ViewTableEntitiesRecord value10(String value) {
        setEntityChildType(value);
        return this;
    }

    @Override
    public ViewTableEntitiesRecord values(Integer value1, String value2, String value3, String value4, String value5, Integer value6, String value7, String value8, String value9, String value10) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ViewTableEntitiesRecord
     */
    public ViewTableEntitiesRecord() {
        super(ViewTableEntities.VIEW_TABLE_ENTITIES);
    }

    /**
     * Create a detached, initialised ViewTableEntitiesRecord
     */
    public ViewTableEntitiesRecord(Integer entityParentId, String entityParentGid, String entityParentName, String entityParentDisplayName, String entityParentType, Integer entityChildId, String entityChildGid, String entityChildName, String entityChildDisplayName, String entityChildType) {
        super(ViewTableEntities.VIEW_TABLE_ENTITIES);

        setEntityParentId(entityParentId);
        setEntityParentGid(entityParentGid);
        setEntityParentName(entityParentName);
        setEntityParentDisplayName(entityParentDisplayName);
        setEntityParentType(entityParentType);
        setEntityChildId(entityChildId);
        setEntityChildGid(entityChildGid);
        setEntityChildName(entityChildName);
        setEntityChildDisplayName(entityChildDisplayName);
        setEntityChildType(entityChildType);
    }

    /**
     * Create a detached, initialised ViewTableEntitiesRecord
     */
    public ViewTableEntitiesRecord(jhi.germinate.server.database.codegen.tables.pojos.ViewTableEntities value) {
        super(ViewTableEntities.VIEW_TABLE_ENTITIES);

        if (value != null) {
            setEntityParentId(value.getEntityParentId());
            setEntityParentGid(value.getEntityParentGid());
            setEntityParentName(value.getEntityParentName());
            setEntityParentDisplayName(value.getEntityParentDisplayName());
            setEntityParentType(value.getEntityParentType());
            setEntityChildId(value.getEntityChildId());
            setEntityChildGid(value.getEntityChildGid());
            setEntityChildName(value.getEntityChildName());
            setEntityChildDisplayName(value.getEntityChildDisplayName());
            setEntityChildType(value.getEntityChildType());
        }
    }
    // @formatter:on
}
