/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables;


import java.sql.Timestamp;
import java.util.Map;

import jhi.germinate.server.database.binding.LicenseContentBinding;
import jhi.germinate.server.database.codegen.GerminateDb;
import jhi.germinate.server.database.codegen.tables.records.ViewTableLicenseDefinitionsRecord;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Row5;
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
public class ViewTableLicenseDefinitions extends TableImpl<ViewTableLicenseDefinitionsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>germinate_db.view_table_license_definitions</code>
     */
    public static final ViewTableLicenseDefinitions VIEW_TABLE_LICENSE_DEFINITIONS = new ViewTableLicenseDefinitions();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ViewTableLicenseDefinitionsRecord> getRecordType() {
        return ViewTableLicenseDefinitionsRecord.class;
    }

    /**
     * The column
     * <code>germinate_db.view_table_license_definitions.license_id</code>.
     */
    public final TableField<ViewTableLicenseDefinitionsRecord, Integer> LICENSE_ID = createField(DSL.name("license_id"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "");

    /**
     * The column
     * <code>germinate_db.view_table_license_definitions.license_name</code>.
     */
    public final TableField<ViewTableLicenseDefinitionsRecord, String> LICENSE_NAME = createField(DSL.name("license_name"), SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column
     * <code>germinate_db.view_table_license_definitions.license_description</code>.
     */
    public final TableField<ViewTableLicenseDefinitionsRecord, String> LICENSE_DESCRIPTION = createField(DSL.name("license_description"), SQLDataType.CLOB, this, "");

    /**
     * The column
     * <code>germinate_db.view_table_license_definitions.created_on</code>. When
     * the record was created.
     */
    public final TableField<ViewTableLicenseDefinitionsRecord, Timestamp> CREATED_ON = createField(DSL.name("created_on"), SQLDataType.TIMESTAMP(0), this, "When the record was created.");

    /**
     * The column
     * <code>germinate_db.view_table_license_definitions.license_data</code>.
     */
    public final TableField<ViewTableLicenseDefinitionsRecord, Map<String,String>> LICENSE_DATA = createField(DSL.name("license_data"), SQLDataType.JSON, this, "", new LicenseContentBinding());

    private ViewTableLicenseDefinitions(Name alias, Table<ViewTableLicenseDefinitionsRecord> aliased) {
        this(alias, aliased, null);
    }

    private ViewTableLicenseDefinitions(Name alias, Table<ViewTableLicenseDefinitionsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"), TableOptions.view("create view `view_table_license_definitions` as select `germinate_template_4_22_10_12`.`licenses`.`id` AS `license_id`,`germinate_template_4_22_10_12`.`licenses`.`name` AS `license_name`,`germinate_template_4_22_10_12`.`licenses`.`description` AS `license_description`,`germinate_template_4_22_10_12`.`licenses`.`created_on` AS `created_on`,(select json_objectagg(`germinate_template_4_22_10_12`.`locales`.`name`,`germinate_template_4_22_10_12`.`licensedata`.`content`) from (`germinate_template_4_22_10_12`.`licensedata` left join `germinate_template_4_22_10_12`.`locales` on((`germinate_template_4_22_10_12`.`locales`.`id` = `germinate_template_4_22_10_12`.`licensedata`.`locale_id`))) where (`germinate_template_4_22_10_12`.`licensedata`.`license_id` = `germinate_template_4_22_10_12`.`licenses`.`id`) group by `germinate_template_4_22_10_12`.`licensedata`.`license_id`) AS `license_data` from `germinate_template_4_22_10_12`.`licenses`"));
    }

    /**
     * Create an aliased
     * <code>germinate_db.view_table_license_definitions</code> table reference
     */
    public ViewTableLicenseDefinitions(String alias) {
        this(DSL.name(alias), VIEW_TABLE_LICENSE_DEFINITIONS);
    }

    /**
     * Create an aliased
     * <code>germinate_db.view_table_license_definitions</code> table reference
     */
    public ViewTableLicenseDefinitions(Name alias) {
        this(alias, VIEW_TABLE_LICENSE_DEFINITIONS);
    }

    /**
     * Create a <code>germinate_db.view_table_license_definitions</code> table
     * reference
     */
    public ViewTableLicenseDefinitions() {
        this(DSL.name("view_table_license_definitions"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : GerminateDb.GERMINATE_DB;
    }

    @Override
    public ViewTableLicenseDefinitions as(String alias) {
        return new ViewTableLicenseDefinitions(DSL.name(alias), this);
    }

    @Override
    public ViewTableLicenseDefinitions as(Name alias) {
        return new ViewTableLicenseDefinitions(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewTableLicenseDefinitions rename(String name) {
        return new ViewTableLicenseDefinitions(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewTableLicenseDefinitions rename(Name name) {
        return new ViewTableLicenseDefinitions(name, null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<Integer, String, String, Timestamp, Map<String,String>> fieldsRow() {
        return (Row5) super.fieldsRow();
    }
    // @formatter:on
}
