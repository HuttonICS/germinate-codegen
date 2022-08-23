/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables;


import jhi.germinate.server.database.binding.IntArrayBinding;
import jhi.germinate.server.database.codegen.GerminateDb;
import jhi.germinate.server.database.codegen.tables.records.ViewTableLicensesRecord;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Row8;
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
public class ViewTableLicenses extends TableImpl<ViewTableLicensesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>germinate_db.view_table_licenses</code>
     */
    public static final ViewTableLicenses VIEW_TABLE_LICENSES = new ViewTableLicenses();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ViewTableLicensesRecord> getRecordType() {
        return ViewTableLicensesRecord.class;
    }

    /**
     * The column <code>germinate_db.view_table_licenses.license_id</code>.
     */
    public final TableField<ViewTableLicensesRecord, Integer> LICENSE_ID = createField(DSL.name("license_id"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>germinate_db.view_table_licenses.license_name</code>.
     */
    public final TableField<ViewTableLicensesRecord, String> LICENSE_NAME = createField(DSL.name("license_name"), SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column
     * <code>germinate_db.view_table_licenses.license_description</code>.
     */
    public final TableField<ViewTableLicensesRecord, String> LICENSE_DESCRIPTION = createField(DSL.name("license_description"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>germinate_db.view_table_licenses.license_content</code>.
     */
    public final TableField<ViewTableLicensesRecord, String> LICENSE_CONTENT = createField(DSL.name("license_content"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>germinate_db.view_table_licenses.locale_name</code>.
     */
    public final TableField<ViewTableLicensesRecord, String> LOCALE_NAME = createField(DSL.name("locale_name"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column
     * <code>germinate_db.view_table_licenses.locale_description</code>.
     */
    public final TableField<ViewTableLicensesRecord, String> LOCALE_DESCRIPTION = createField(DSL.name("locale_description"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>germinate_db.view_table_licenses.dataset_id</code>.
     * Primary id for this table. This uniquely identifies the row.
     */
    public final TableField<ViewTableLicensesRecord, Integer> DATASET_ID = createField(DSL.name("dataset_id"), SQLDataType.INTEGER.defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "Primary id for this table. This uniquely identifies the row.");

    /**
     * The column <code>germinate_db.view_table_licenses.accepted_by</code>.
     */
    public final TableField<ViewTableLicensesRecord, Integer[]> ACCEPTED_BY = createField(DSL.name("accepted_by"), SQLDataType.JSON, this, "", new IntArrayBinding());

    private ViewTableLicenses(Name alias, Table<ViewTableLicensesRecord> aliased) {
        this(alias, aliased, null);
    }

    private ViewTableLicenses(Name alias, Table<ViewTableLicensesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"), TableOptions.view("create view `view_table_licenses` as select `germinate_template_4_22_08_23`.`licenses`.`id` AS `license_id`,`germinate_template_4_22_08_23`.`licenses`.`name` AS `license_name`,`germinate_template_4_22_08_23`.`licenses`.`description` AS `license_description`,`germinate_template_4_22_08_23`.`licensedata`.`content` AS `license_content`,`germinate_template_4_22_08_23`.`locales`.`name` AS `locale_name`,`germinate_template_4_22_08_23`.`locales`.`description` AS `locale_description`,`germinate_template_4_22_08_23`.`datasets`.`id` AS `dataset_id`,json_arrayagg(`germinate_template_4_22_08_23`.`licenselogs`.`user_id`) AS `accepted_by` from ((((`germinate_template_4_22_08_23`.`licenses` left join `germinate_template_4_22_08_23`.`licensedata` on((`germinate_template_4_22_08_23`.`licensedata`.`license_id` = `germinate_template_4_22_08_23`.`licenses`.`id`))) left join `germinate_template_4_22_08_23`.`locales` on((`germinate_template_4_22_08_23`.`locales`.`id` = `germinate_template_4_22_08_23`.`licensedata`.`locale_id`))) left join `germinate_template_4_22_08_23`.`datasets` on((`germinate_template_4_22_08_23`.`datasets`.`license_id` = `germinate_template_4_22_08_23`.`licenses`.`id`))) left join `germinate_template_4_22_08_23`.`licenselogs` on((`germinate_template_4_22_08_23`.`licenselogs`.`license_id` = `germinate_template_4_22_08_23`.`licenses`.`id`))) group by `germinate_template_4_22_08_23`.`licenses`.`id`,`germinate_template_4_22_08_23`.`locales`.`id`,`germinate_template_4_22_08_23`.`licensedata`.`id`,`germinate_template_4_22_08_23`.`datasets`.`id`"));
    }

    /**
     * Create an aliased <code>germinate_db.view_table_licenses</code> table
     * reference
     */
    public ViewTableLicenses(String alias) {
        this(DSL.name(alias), VIEW_TABLE_LICENSES);
    }

    /**
     * Create an aliased <code>germinate_db.view_table_licenses</code> table
     * reference
     */
    public ViewTableLicenses(Name alias) {
        this(alias, VIEW_TABLE_LICENSES);
    }

    /**
     * Create a <code>germinate_db.view_table_licenses</code> table reference
     */
    public ViewTableLicenses() {
        this(DSL.name("view_table_licenses"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : GerminateDb.GERMINATE_DB;
    }

    @Override
    public ViewTableLicenses as(String alias) {
        return new ViewTableLicenses(DSL.name(alias), this);
    }

    @Override
    public ViewTableLicenses as(Name alias) {
        return new ViewTableLicenses(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewTableLicenses rename(String name) {
        return new ViewTableLicenses(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewTableLicenses rename(Name name) {
        return new ViewTableLicenses(name, null);
    }

    // -------------------------------------------------------------------------
    // Row8 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row8<Integer, String, String, String, String, String, Integer, Integer[]> fieldsRow() {
        return (Row8) super.fieldsRow();
    }
    // @formatter:on
}
