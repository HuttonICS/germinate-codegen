/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables;


import jhi.germinate.server.database.codegen.GerminateDb;
import jhi.germinate.server.database.codegen.tables.records.ViewTableEntitiesRecord;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Row10;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


// @formatter:off
/**
 * VIEW
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ViewTableEntities extends TableImpl<ViewTableEntitiesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>germinate_db.view_table_entities</code>
     */
    public static final ViewTableEntities VIEW_TABLE_ENTITIES = new ViewTableEntities();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ViewTableEntitiesRecord> getRecordType() {
        return ViewTableEntitiesRecord.class;
    }

    /**
     * The column
     * <code>germinate_db.view_table_entities.entity_parent_id</code>. Primary
     * id for this table. This uniquely identifies the row.
     */
    public final TableField<ViewTableEntitiesRecord, Integer> ENTITY_PARENT_ID = createField(DSL.name("entity_parent_id"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "Primary id for this table. This uniquely identifies the row.");

    /**
     * The column
     * <code>germinate_db.view_table_entities.entity_parent_gid</code>. A unique
     * identifier.
     */
    public final TableField<ViewTableEntitiesRecord, String> ENTITY_PARENT_GID = createField(DSL.name("entity_parent_gid"), SQLDataType.VARCHAR(255).nullable(false), this, "A unique identifier.");

    /**
     * The column
     * <code>germinate_db.view_table_entities.entity_parent_name</code>. A
     * unique name which defines an entry in the germinatbase table.
     */
    public final TableField<ViewTableEntitiesRecord, String> ENTITY_PARENT_NAME = createField(DSL.name("entity_parent_name"), SQLDataType.VARCHAR(255).nullable(false), this, "A unique name which defines an entry in the germinatbase table.");

    /**
     * The column
     * <code>germinate_db.view_table_entities.entity_parent_display_name</code>.
     * The name to be displayed on user interfaces and to be exported to
     * external tools like Flapjack and Helium.
     */
    public final TableField<ViewTableEntitiesRecord, String> ENTITY_PARENT_DISPLAY_NAME = createField(DSL.name("entity_parent_display_name"), SQLDataType.VARCHAR(255).nullable(false), this, "The name to be displayed on user interfaces and to be exported to external tools like Flapjack and Helium.");

    /**
     * The column
     * <code>germinate_db.view_table_entities.entity_parent_type</code>. The
     * name of the entity type.
     */
    public final TableField<ViewTableEntitiesRecord, String> ENTITY_PARENT_TYPE = createField(DSL.name("entity_parent_type"), SQLDataType.VARCHAR(255), this, "The name of the entity type.");

    /**
     * The column <code>germinate_db.view_table_entities.entity_child_id</code>.
     * Primary id for this table. This uniquely identifies the row.
     */
    public final TableField<ViewTableEntitiesRecord, Integer> ENTITY_CHILD_ID = createField(DSL.name("entity_child_id"), SQLDataType.INTEGER.defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "Primary id for this table. This uniquely identifies the row.");

    /**
     * The column
     * <code>germinate_db.view_table_entities.entity_child_gid</code>. A unique
     * identifier.
     */
    public final TableField<ViewTableEntitiesRecord, String> ENTITY_CHILD_GID = createField(DSL.name("entity_child_gid"), SQLDataType.VARCHAR(255), this, "A unique identifier.");

    /**
     * The column
     * <code>germinate_db.view_table_entities.entity_child_name</code>. A unique
     * name which defines an entry in the germinatbase table.
     */
    public final TableField<ViewTableEntitiesRecord, String> ENTITY_CHILD_NAME = createField(DSL.name("entity_child_name"), SQLDataType.VARCHAR(255), this, "A unique name which defines an entry in the germinatbase table.");

    /**
     * The column
     * <code>germinate_db.view_table_entities.entity_child_display_name</code>.
     * The name to be displayed on user interfaces and to be exported to
     * external tools like Flapjack and Helium.
     */
    public final TableField<ViewTableEntitiesRecord, String> ENTITY_CHILD_DISPLAY_NAME = createField(DSL.name("entity_child_display_name"), SQLDataType.VARCHAR(255), this, "The name to be displayed on user interfaces and to be exported to external tools like Flapjack and Helium.");

    /**
     * The column
     * <code>germinate_db.view_table_entities.entity_child_type</code>. The name
     * of the entity type.
     */
    public final TableField<ViewTableEntitiesRecord, String> ENTITY_CHILD_TYPE = createField(DSL.name("entity_child_type"), SQLDataType.VARCHAR(255), this, "The name of the entity type.");

    private ViewTableEntities(Name alias, Table<ViewTableEntitiesRecord> aliased) {
        this(alias, aliased, null);
    }

    private ViewTableEntities(Name alias, Table<ViewTableEntitiesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"), TableOptions.view("create view `view_table_entities` as select `parent`.`id` AS `entity_parent_id`,`parent`.`general_identifier` AS `entity_parent_gid`,`parent`.`name` AS `entity_parent_name`,`parent`.`display_name` AS `entity_parent_display_name`,`parententity`.`name` AS `entity_parent_type`,`child`.`id` AS `entity_child_id`,`child`.`general_identifier` AS `entity_child_gid`,`child`.`name` AS `entity_child_name`,`child`.`display_name` AS `entity_child_display_name`,`childentity`.`name` AS `entity_child_type` from (((`germinate_template_4_25_01_23`.`germinatebase` `parent` left join `germinate_template_4_25_01_23`.`germinatebase` `child` on((`parent`.`id` = `child`.`entityparent_id`))) left join `germinate_template_4_25_01_23`.`entitytypes` `parententity` on((`parententity`.`id` = `parent`.`entitytype_id`))) left join `germinate_template_4_25_01_23`.`entitytypes` `childentity` on((`childentity`.`id` = `child`.`entitytype_id`))) where ((`parent`.`id` is not null) and (`child`.`id` is not null))"));
    }

    /**
     * Create an aliased <code>germinate_db.view_table_entities</code> table
     * reference
     */
    public ViewTableEntities(String alias) {
        this(DSL.name(alias), VIEW_TABLE_ENTITIES);
    }

    /**
     * Create an aliased <code>germinate_db.view_table_entities</code> table
     * reference
     */
    public ViewTableEntities(Name alias) {
        this(alias, VIEW_TABLE_ENTITIES);
    }

    /**
     * Create a <code>germinate_db.view_table_entities</code> table reference
     */
    public ViewTableEntities() {
        this(DSL.name("view_table_entities"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : GerminateDb.GERMINATE_DB;
    }

    @Override
    public ViewTableEntities as(String alias) {
        return new ViewTableEntities(DSL.name(alias), this);
    }

    @Override
    public ViewTableEntities as(Name alias) {
        return new ViewTableEntities(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewTableEntities rename(String name) {
        return new ViewTableEntities(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewTableEntities rename(Name name) {
        return new ViewTableEntities(name, null);
    }

    // -------------------------------------------------------------------------
    // Row10 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row10<Integer, String, String, String, String, Integer, String, String, String, String> fieldsRow() {
        return (Row10) super.fieldsRow();
    }
    // @formatter:on
}
