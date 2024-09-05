/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables;


import java.sql.Timestamp;

import jhi.germinate.server.database.binding.IntArrayBinding;
import jhi.germinate.server.database.codegen.GerminateDb;
import jhi.germinate.server.database.codegen.tables.records.ViewTableFileresourcesRecord;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Row11;
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
public class ViewTableFileresources extends TableImpl<ViewTableFileresourcesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>germinate_db.view_table_fileresources</code>
     */
    public static final ViewTableFileresources VIEW_TABLE_FILERESOURCES = new ViewTableFileresources();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ViewTableFileresourcesRecord> getRecordType() {
        return ViewTableFileresourcesRecord.class;
    }

    /**
     * The column
     * <code>germinate_db.view_table_fileresources.fileresource_id</code>. The
     * primary id.
     */
    public final TableField<ViewTableFileresourcesRecord, Integer> FILERESOURCE_ID = createField(DSL.name("fileresource_id"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "The primary id.");

    /**
     * The column
     * <code>germinate_db.view_table_fileresources.fileresource_name</code>. The
     * name of the file resource.
     */
    public final TableField<ViewTableFileresourcesRecord, String> FILERESOURCE_NAME = createField(DSL.name("fileresource_name"), SQLDataType.VARCHAR(255).nullable(false), this, "The name of the file resource.");

    /**
     * The column
     * <code>germinate_db.view_table_fileresources.fileresource_path</code>. The
     * file name of the actual data file.
     */
    public final TableField<ViewTableFileresourcesRecord, String> FILERESOURCE_PATH = createField(DSL.name("fileresource_path"), SQLDataType.CLOB, this, "The file name of the actual data file.");

    /**
     * The column
     * <code>germinate_db.view_table_fileresources.fileresource_description</code>.
     * A description of the file contents.
     */
    public final TableField<ViewTableFileresourcesRecord, String> FILERESOURCE_DESCRIPTION = createField(DSL.name("fileresource_description"), SQLDataType.CLOB, this, "A description of the file contents.");

    /**
     * The column
     * <code>germinate_db.view_table_fileresources.fileresource_size</code>. The
     * file size in bytes.
     */
    public final TableField<ViewTableFileresourcesRecord, Long> FILERESOURCE_SIZE = createField(DSL.name("fileresource_size"), SQLDataType.BIGINT, this, "The file size in bytes.");

    /**
     * The column
     * <code>germinate_db.view_table_fileresources.fileresource_created_on</code>.
     * When this record was created.
     */
    public final TableField<ViewTableFileresourcesRecord, Timestamp> FILERESOURCE_CREATED_ON = createField(DSL.name("fileresource_created_on"), SQLDataType.TIMESTAMP(0), this, "When this record was created.");

    /**
     * The column
     * <code>germinate_db.view_table_fileresources.fileresource_updated_on</code>.
     * When this record was last updated.
     */
    public final TableField<ViewTableFileresourcesRecord, Timestamp> FILERESOURCE_UPDATED_ON = createField(DSL.name("fileresource_updated_on"), SQLDataType.TIMESTAMP(0), this, "When this record was last updated.");

    /**
     * The column
     * <code>germinate_db.view_table_fileresources.fileresourcetype_id</code>.
     * The primary id.
     */
    public final TableField<ViewTableFileresourcesRecord, Integer> FILERESOURCETYPE_ID = createField(DSL.name("fileresourcetype_id"), SQLDataType.INTEGER.defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "The primary id.");

    /**
     * The column
     * <code>germinate_db.view_table_fileresources.fileresourcetype_name</code>.
     * The name of the file type.
     */
    public final TableField<ViewTableFileresourcesRecord, String> FILERESOURCETYPE_NAME = createField(DSL.name("fileresourcetype_name"), SQLDataType.VARCHAR(255), this, "The name of the file type.");

    /**
     * The column
     * <code>germinate_db.view_table_fileresources.fileresourcetype_description</code>.
     * The description of the file type.
     */
    public final TableField<ViewTableFileresourcesRecord, String> FILERESOURCETYPE_DESCRIPTION = createField(DSL.name("fileresourcetype_description"), SQLDataType.CLOB, this, "The description of the file type.");

    /**
     * The column
     * <code>germinate_db.view_table_fileresources.dataset_ids</code>.
     */
    public final TableField<ViewTableFileresourcesRecord, Integer[]> DATASET_IDS = createField(DSL.name("dataset_ids"), SQLDataType.JSON, this, "", new IntArrayBinding());

    private ViewTableFileresources(Name alias, Table<ViewTableFileresourcesRecord> aliased) {
        this(alias, aliased, null);
    }

    private ViewTableFileresources(Name alias, Table<ViewTableFileresourcesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"), TableOptions.view("create view `view_table_fileresources` as select `germinate_template_4_24_09_04`.`fileresources`.`id` AS `fileresource_id`,`germinate_template_4_24_09_04`.`fileresources`.`name` AS `fileresource_name`,`germinate_template_4_24_09_04`.`fileresources`.`path` AS `fileresource_path`,`germinate_template_4_24_09_04`.`fileresources`.`description` AS `fileresource_description`,`germinate_template_4_24_09_04`.`fileresources`.`filesize` AS `fileresource_size`,`germinate_template_4_24_09_04`.`fileresources`.`created_on` AS `fileresource_created_on`,`germinate_template_4_24_09_04`.`fileresources`.`updated_on` AS `fileresource_updated_on`,`germinate_template_4_24_09_04`.`fileresourcetypes`.`id` AS `fileresourcetype_id`,`germinate_template_4_24_09_04`.`fileresourcetypes`.`name` AS `fileresourcetype_name`,`germinate_template_4_24_09_04`.`fileresourcetypes`.`description` AS `fileresourcetype_description`,(select json_arrayagg(`germinate_template_4_24_09_04`.`datasetfileresources`.`dataset_id`) from `germinate_template_4_24_09_04`.`datasetfileresources` where (`germinate_template_4_24_09_04`.`datasetfileresources`.`fileresource_id` = `germinate_template_4_24_09_04`.`fileresources`.`id`)) AS `dataset_ids` from ((`germinate_template_4_24_09_04`.`fileresources` left join `germinate_template_4_24_09_04`.`fileresourcetypes` on((`germinate_template_4_24_09_04`.`fileresources`.`fileresourcetype_id` = `germinate_template_4_24_09_04`.`fileresourcetypes`.`id`))) left join `germinate_template_4_24_09_04`.`datasetfileresources` on((`germinate_template_4_24_09_04`.`datasetfileresources`.`fileresource_id` = `germinate_template_4_24_09_04`.`fileresources`.`id`))) group by `germinate_template_4_24_09_04`.`fileresources`.`id`"));
    }

    /**
     * Create an aliased <code>germinate_db.view_table_fileresources</code>
     * table reference
     */
    public ViewTableFileresources(String alias) {
        this(DSL.name(alias), VIEW_TABLE_FILERESOURCES);
    }

    /**
     * Create an aliased <code>germinate_db.view_table_fileresources</code>
     * table reference
     */
    public ViewTableFileresources(Name alias) {
        this(alias, VIEW_TABLE_FILERESOURCES);
    }

    /**
     * Create a <code>germinate_db.view_table_fileresources</code> table
     * reference
     */
    public ViewTableFileresources() {
        this(DSL.name("view_table_fileresources"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : GerminateDb.GERMINATE_DB;
    }

    @Override
    public ViewTableFileresources as(String alias) {
        return new ViewTableFileresources(DSL.name(alias), this);
    }

    @Override
    public ViewTableFileresources as(Name alias) {
        return new ViewTableFileresources(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewTableFileresources rename(String name) {
        return new ViewTableFileresources(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewTableFileresources rename(Name name) {
        return new ViewTableFileresources(name, null);
    }

    // -------------------------------------------------------------------------
    // Row11 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row11<Integer, String, String, String, Long, Timestamp, Timestamp, Integer, String, String, Integer[]> fieldsRow() {
        return (Row11) super.fieldsRow();
    }
    // @formatter:on
}
