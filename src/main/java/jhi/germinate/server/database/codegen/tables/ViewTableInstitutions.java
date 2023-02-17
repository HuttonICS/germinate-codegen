/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables;


import jhi.germinate.server.database.codegen.GerminateDb;
import jhi.germinate.server.database.codegen.tables.records.ViewTableInstitutionsRecord;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Row12;
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
public class ViewTableInstitutions extends TableImpl<ViewTableInstitutionsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>germinate_db.view_table_institutions</code>
     */
    public static final ViewTableInstitutions VIEW_TABLE_INSTITUTIONS = new ViewTableInstitutions();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ViewTableInstitutionsRecord> getRecordType() {
        return ViewTableInstitutionsRecord.class;
    }

    /**
     * The column
     * <code>germinate_db.view_table_institutions.institution_id</code>. Primary
     * id for this table. This uniquely identifies the row.
     */
    public final TableField<ViewTableInstitutionsRecord, Integer> INSTITUTION_ID = createField(DSL.name("institution_id"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "Primary id for this table. This uniquely identifies the row.");

    /**
     * The column
     * <code>germinate_db.view_table_institutions.institution_name</code>. The
     * institute name.
     */
    public final TableField<ViewTableInstitutionsRecord, String> INSTITUTION_NAME = createField(DSL.name("institution_name"), SQLDataType.VARCHAR(255).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "The institute name.");

    /**
     * The column
     * <code>germinate_db.view_table_institutions.institution_code</code>. If
     * there is a defined ISO code for the institute this should be used here.
     */
    public final TableField<ViewTableInstitutionsRecord, String> INSTITUTION_CODE = createField(DSL.name("institution_code"), SQLDataType.VARCHAR(255), this, "If there is a defined ISO code for the institute this should be used here.");

    /**
     * The column
     * <code>germinate_db.view_table_institutions.institution_acronym</code>. If
     * there is an acronym for the institute.
     */
    public final TableField<ViewTableInstitutionsRecord, String> INSTITUTION_ACRONYM = createField(DSL.name("institution_acronym"), SQLDataType.VARCHAR(20), this, "If there is an acronym for the institute.");

    /**
     * The column
     * <code>germinate_db.view_table_institutions.institution_address</code>.
     * The postal address of the institute.
     */
    public final TableField<ViewTableInstitutionsRecord, String> INSTITUTION_ADDRESS = createField(DSL.name("institution_address"), SQLDataType.CLOB, this, "The postal address of the institute.");

    /**
     * The column
     * <code>germinate_db.view_table_institutions.institution_email</code>. The
     * email address to contact the institute.
     */
    public final TableField<ViewTableInstitutionsRecord, String> INSTITUTION_EMAIL = createField(DSL.name("institution_email"), SQLDataType.VARCHAR(255), this, "The email address to contact the institute.");

    /**
     * The column
     * <code>germinate_db.view_table_institutions.institution_contact</code>.
     * The contact at the institute which should be used for correspondence.
     */
    public final TableField<ViewTableInstitutionsRecord, String> INSTITUTION_CONTACT = createField(DSL.name("institution_contact"), SQLDataType.VARCHAR(255), this, "The contact at the institute which should be used for correspondence.");

    /**
     * The column
     * <code>germinate_db.view_table_institutions.institution_phone</code>. The
     * telephone number for the institute.
     */
    public final TableField<ViewTableInstitutionsRecord, String> INSTITUTION_PHONE = createField(DSL.name("institution_phone"), SQLDataType.VARCHAR(255), this, "The telephone number for the institute.");

    /**
     * The column <code>germinate_db.view_table_institutions.country_id</code>.
     * Primary id for this table. This uniquely identifies the row.
     */
    public final TableField<ViewTableInstitutionsRecord, Integer> COUNTRY_ID = createField(DSL.name("country_id"), SQLDataType.INTEGER.defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "Primary id for this table. This uniquely identifies the row.");

    /**
     * The column
     * <code>germinate_db.view_table_institutions.country_name</code>. Country
     * name.
     */
    public final TableField<ViewTableInstitutionsRecord, String> COUNTRY_NAME = createField(DSL.name("country_name"), SQLDataType.VARCHAR(255).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "Country name.");

    /**
     * The column
     * <code>germinate_db.view_table_institutions.country_code</code>. ISO 2
     * Code for country.
     */
    public final TableField<ViewTableInstitutionsRecord, String> COUNTRY_CODE = createField(DSL.name("country_code"), SQLDataType.CHAR(2).defaultValue(DSL.inline("", SQLDataType.CHAR)), this, "ISO 2 Code for country.");

    /**
     * The column
     * <code>germinate_db.view_table_institutions.institution_type</code>.
     */
    public final TableField<ViewTableInstitutionsRecord, String> INSTITUTION_TYPE = createField(DSL.name("institution_type"), SQLDataType.CHAR, this, "");

    private ViewTableInstitutions(Name alias, Table<ViewTableInstitutionsRecord> aliased) {
        this(alias, aliased, null);
    }

    private ViewTableInstitutions(Name alias, Table<ViewTableInstitutionsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"), TableOptions.view("create view `view_table_institutions` as select `germinate_template_4_23_02_16`.`institutions`.`id` AS `institution_id`,`germinate_template_4_23_02_16`.`institutions`.`name` AS `institution_name`,`germinate_template_4_23_02_16`.`institutions`.`code` AS `institution_code`,`germinate_template_4_23_02_16`.`institutions`.`acronym` AS `institution_acronym`,`germinate_template_4_23_02_16`.`institutions`.`address` AS `institution_address`,`germinate_template_4_23_02_16`.`institutions`.`email` AS `institution_email`,`germinate_template_4_23_02_16`.`institutions`.`contact` AS `institution_contact`,`germinate_template_4_23_02_16`.`institutions`.`phone` AS `institution_phone`,`germinate_template_4_23_02_16`.`countries`.`id` AS `country_id`,`germinate_template_4_23_02_16`.`countries`.`country_name` AS `country_name`,`germinate_template_4_23_02_16`.`countries`.`country_code2` AS `country_code`,cast(NULL as char charset utf8mb4) AS `institution_type` from (`germinate_template_4_23_02_16`.`institutions` left join `germinate_template_4_23_02_16`.`countries` on((`germinate_template_4_23_02_16`.`countries`.`id` = `germinate_template_4_23_02_16`.`institutions`.`country_id`)))"));
    }

    /**
     * Create an aliased <code>germinate_db.view_table_institutions</code> table
     * reference
     */
    public ViewTableInstitutions(String alias) {
        this(DSL.name(alias), VIEW_TABLE_INSTITUTIONS);
    }

    /**
     * Create an aliased <code>germinate_db.view_table_institutions</code> table
     * reference
     */
    public ViewTableInstitutions(Name alias) {
        this(alias, VIEW_TABLE_INSTITUTIONS);
    }

    /**
     * Create a <code>germinate_db.view_table_institutions</code> table
     * reference
     */
    public ViewTableInstitutions() {
        this(DSL.name("view_table_institutions"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : GerminateDb.GERMINATE_DB;
    }

    @Override
    public ViewTableInstitutions as(String alias) {
        return new ViewTableInstitutions(DSL.name(alias), this);
    }

    @Override
    public ViewTableInstitutions as(Name alias) {
        return new ViewTableInstitutions(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewTableInstitutions rename(String name) {
        return new ViewTableInstitutions(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewTableInstitutions rename(Name name) {
        return new ViewTableInstitutions(name, null);
    }

    // -------------------------------------------------------------------------
    // Row12 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row12<Integer, String, String, String, String, String, String, String, Integer, String, String, String> fieldsRow() {
        return (Row12) super.fieldsRow();
    }
    // @formatter:on
}
