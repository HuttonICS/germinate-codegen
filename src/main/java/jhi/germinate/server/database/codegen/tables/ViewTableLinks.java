/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables;


import java.sql.Timestamp;

import jhi.germinate.server.database.codegen.GerminateDb;
import jhi.germinate.server.database.codegen.tables.records.ViewTableLinksRecord;

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
public class ViewTableLinks extends TableImpl<ViewTableLinksRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>germinate_db.view_table_links</code>
     */
    public static final ViewTableLinks VIEW_TABLE_LINKS = new ViewTableLinks();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ViewTableLinksRecord> getRecordType() {
        return ViewTableLinksRecord.class;
    }

    /**
     * The column <code>germinate_db.view_table_links.link_id</code>. Primary id
     * for this table. This uniquely identifies the row.
     */
    public final TableField<ViewTableLinksRecord, Integer> LINK_ID = createField(DSL.name("link_id"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "Primary id for this table. This uniquely identifies the row.");

    /**
     * The column <code>germinate_db.view_table_links.link_description</code>. A
     * description of the link.
     */
    public final TableField<ViewTableLinksRecord, String> LINK_DESCRIPTION = createField(DSL.name("link_description"), SQLDataType.VARCHAR(255), this, "A description of the link.");

    /**
     * The column <code>germinate_db.view_table_links.link_visibility</code>.
     * Determines if the link is visible or not: {0, 1}
     */
    public final TableField<ViewTableLinksRecord, Boolean> LINK_VISIBILITY = createField(DSL.name("link_visibility"), SQLDataType.BOOLEAN.defaultValue(DSL.inline("1", SQLDataType.BOOLEAN)), this, "Determines if the link is visible or not: {0, 1}");

    /**
     * The column <code>germinate_db.view_table_links.linktype_id</code>.
     * Primary id for this table. This uniquely identifies the row.
     */
    public final TableField<ViewTableLinksRecord, Integer> LINKTYPE_ID = createField(DSL.name("linktype_id"), SQLDataType.INTEGER.defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "Primary id for this table. This uniquely identifies the row.");

    /**
     * The column
     * <code>germinate_db.view_table_links.linktype_description</code>. A
     * description of the link.
     */
    public final TableField<ViewTableLinksRecord, String> LINKTYPE_DESCRIPTION = createField(DSL.name("linktype_description"), SQLDataType.VARCHAR(255), this, "A description of the link\r.");

    /**
     * The column
     * <code>germinate_db.view_table_links.linktype_target_table</code>. This is
     * the table that the link links to.
     */
    public final TableField<ViewTableLinksRecord, String> LINKTYPE_TARGET_TABLE = createField(DSL.name("linktype_target_table"), SQLDataType.VARCHAR(255), this, "This is the table that the link links to.");

    /**
     * The column
     * <code>germinate_db.view_table_links.linktype_target_column</code>. This
     * is the column that is used to generate the link.
     */
    public final TableField<ViewTableLinksRecord, String> LINKTYPE_TARGET_COLUMN = createField(DSL.name("linktype_target_column"), SQLDataType.VARCHAR(255), this, "This is the column that is used to generate the link.");

    /**
     * The column <code>germinate_db.view_table_links.link_foreign_id</code>.
     */
    public final TableField<ViewTableLinksRecord, Integer> LINK_FOREIGN_ID = createField(DSL.name("link_foreign_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>germinate_db.view_table_links.hyperlink</code>. The
     * actual hyperlink.
     */
    public final TableField<ViewTableLinksRecord, String> HYPERLINK = createField(DSL.name("hyperlink"), SQLDataType.VARCHAR(255), this, "The actual hyperlink.");

    /**
     * The column <code>germinate_db.view_table_links.placeholder</code>. The
     * part of the link that will be replaced by the value of the target column.
     */
    public final TableField<ViewTableLinksRecord, String> PLACEHOLDER = createField(DSL.name("placeholder"), SQLDataType.VARCHAR(255), this, "The part of the link that will be replaced by the value of the target column.");

    /**
     * The column <code>germinate_db.view_table_links.updated_on</code>. When
     * the record was updated. This may be different from the created on date if
     * subsequent changes have been made to the underlying record.
     */
    public final TableField<ViewTableLinksRecord, Timestamp> UPDATED_ON = createField(DSL.name("updated_on"), SQLDataType.TIMESTAMP(0), this, "When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.");

    private ViewTableLinks(Name alias, Table<ViewTableLinksRecord> aliased) {
        this(alias, aliased, null);
    }

    private ViewTableLinks(Name alias, Table<ViewTableLinksRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"), TableOptions.view("create view `view_table_links` as select `germinate_template_4_24_10_07`.`links`.`id` AS `link_id`,`germinate_template_4_24_10_07`.`links`.`description` AS `link_description`,`germinate_template_4_24_10_07`.`links`.`visibility` AS `link_visibility`,`germinate_template_4_24_10_07`.`linktypes`.`id` AS `linktype_id`,`germinate_template_4_24_10_07`.`linktypes`.`description` AS `linktype_description`,`germinate_template_4_24_10_07`.`linktypes`.`target_table` AS `linktype_target_table`,`germinate_template_4_24_10_07`.`linktypes`.`target_column` AS `linktype_target_column`,`germinate_template_4_24_10_07`.`links`.`foreign_id` AS `link_foreign_id`,`germinate_template_4_24_10_07`.`links`.`hyperlink` AS `hyperlink`,`germinate_template_4_24_10_07`.`linktypes`.`placeholder` AS `placeholder`,`germinate_template_4_24_10_07`.`links`.`updated_on` AS `updated_on` from (`germinate_template_4_24_10_07`.`links` left join `germinate_template_4_24_10_07`.`linktypes` on((`germinate_template_4_24_10_07`.`linktypes`.`id` = `germinate_template_4_24_10_07`.`links`.`linktype_id`)))"));
    }

    /**
     * Create an aliased <code>germinate_db.view_table_links</code> table
     * reference
     */
    public ViewTableLinks(String alias) {
        this(DSL.name(alias), VIEW_TABLE_LINKS);
    }

    /**
     * Create an aliased <code>germinate_db.view_table_links</code> table
     * reference
     */
    public ViewTableLinks(Name alias) {
        this(alias, VIEW_TABLE_LINKS);
    }

    /**
     * Create a <code>germinate_db.view_table_links</code> table reference
     */
    public ViewTableLinks() {
        this(DSL.name("view_table_links"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : GerminateDb.GERMINATE_DB;
    }

    @Override
    public ViewTableLinks as(String alias) {
        return new ViewTableLinks(DSL.name(alias), this);
    }

    @Override
    public ViewTableLinks as(Name alias) {
        return new ViewTableLinks(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewTableLinks rename(String name) {
        return new ViewTableLinks(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewTableLinks rename(Name name) {
        return new ViewTableLinks(name, null);
    }

    // -------------------------------------------------------------------------
    // Row11 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row11<Integer, String, Boolean, Integer, String, String, String, Integer, String, String, Timestamp> fieldsRow() {
        return (Row11) super.fieldsRow();
    }
    // @formatter:on
}
