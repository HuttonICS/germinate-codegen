/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables;


import jhi.germinate.server.database.codegen.GerminateDb;
import jhi.germinate.server.database.codegen.tables.records.ViewTableCollaboratorsRecord;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Row15;
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
public class ViewTableCollaborators extends TableImpl<ViewTableCollaboratorsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>germinate_db.view_table_collaborators</code>
     */
    public static final ViewTableCollaborators VIEW_TABLE_COLLABORATORS = new ViewTableCollaborators();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ViewTableCollaboratorsRecord> getRecordType() {
        return ViewTableCollaboratorsRecord.class;
    }

    /**
     * The column
     * <code>germinate_db.view_table_collaborators.collaborator_id</code>.
     */
    public final TableField<ViewTableCollaboratorsRecord, Integer> COLLABORATOR_ID = createField(DSL.name("collaborator_id"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "");

    /**
     * The column
     * <code>germinate_db.view_table_collaborators.collaborator_first_name</code>.
     * Last name (surname) of the author(s), researcher(s), scientist(s),
     * student(s) responsible for producing the information product.
     */
    public final TableField<ViewTableCollaboratorsRecord, String> COLLABORATOR_FIRST_NAME = createField(DSL.name("collaborator_first_name"), SQLDataType.VARCHAR(255).nullable(false), this, "Last name (surname) of the author(s), researcher(s), scientist(s), student(s) responsible for producing the information product.");

    /**
     * The column
     * <code>germinate_db.view_table_collaborators.collaborator_last_name</code>.
     * First name (and middle name if available) of the author(s),
     * researcher(s), scientist(s), student(s) responsible for producing the
     * information product.
     */
    public final TableField<ViewTableCollaboratorsRecord, String> COLLABORATOR_LAST_NAME = createField(DSL.name("collaborator_last_name"), SQLDataType.VARCHAR(255).nullable(false), this, "First name (and middle name if available) of the author(s), researcher(s), scientist(s), student(s) responsible for producing the information product.");

    /**
     * The column
     * <code>germinate_db.view_table_collaborators.collaborator_external_id</code>.
     * An identifier for the data submitter. If that submitter is an individual,
     * ORCID identifiers are recommended.
     */
    public final TableField<ViewTableCollaboratorsRecord, String> COLLABORATOR_EXTERNAL_ID = createField(DSL.name("collaborator_external_id"), SQLDataType.VARCHAR(255), this, "An identifier for the data submitter. If that submitter is an individual, ORCID identifiers are recommended.");

    /**
     * The column
     * <code>germinate_db.view_table_collaborators.collaborator_email</code>.
     * E-mail address of the author(s), researcher(s), scientist(s), student(s)
     * responsible for producing the information product.
     */
    public final TableField<ViewTableCollaboratorsRecord, String> COLLABORATOR_EMAIL = createField(DSL.name("collaborator_email"), SQLDataType.VARCHAR(255), this, "E-mail address of the author(s), researcher(s), scientist(s), student(s) responsible for producing the information product.");

    /**
     * The column
     * <code>germinate_db.view_table_collaborators.collaborator_phone</code>.
     * Phone number of the author(s), researcher(s), scientist(s), student(s)
     * responsible for producing the information product.
     */
    public final TableField<ViewTableCollaboratorsRecord, String> COLLABORATOR_PHONE = createField(DSL.name("collaborator_phone"), SQLDataType.VARCHAR(255), this, "Phone number of the author(s), researcher(s), scientist(s), student(s) responsible for producing the information product.");

    /**
     * The column
     * <code>germinate_db.view_table_collaborators.collaborator_roles</code>.
     * Type of contribution of the person to the investigation (e.g. data
     * submitter; author; corresponding author)
     */
    public final TableField<ViewTableCollaboratorsRecord, String> COLLABORATOR_ROLES = createField(DSL.name("collaborator_roles"), SQLDataType.VARCHAR(255), this, "Type of contribution of the person to the investigation (e.g. data submitter; author; corresponding author)");

    /**
     * The column
     * <code>germinate_db.view_table_collaborators.institution_id</code>.
     * Primary id for this table. This uniquely identifies the row.
     */
    public final TableField<ViewTableCollaboratorsRecord, Integer> INSTITUTION_ID = createField(DSL.name("institution_id"), SQLDataType.INTEGER.defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "Primary id for this table. This uniquely identifies the row.");

    /**
     * The column
     * <code>germinate_db.view_table_collaborators.institution_name</code>. The
     * institute name.
     */
    public final TableField<ViewTableCollaboratorsRecord, String> INSTITUTION_NAME = createField(DSL.name("institution_name"), SQLDataType.VARCHAR(255).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "The institute name.");

    /**
     * The column
     * <code>germinate_db.view_table_collaborators.institution_address</code>.
     * The postal address of the institute.
     */
    public final TableField<ViewTableCollaboratorsRecord, String> INSTITUTION_ADDRESS = createField(DSL.name("institution_address"), SQLDataType.CLOB, this, "The postal address of the institute.");

    /**
     * The column <code>germinate_db.view_table_collaborators.dataset_id</code>.
     * Primary id for this table. This uniquely identifies the row.
     */
    public final TableField<ViewTableCollaboratorsRecord, Integer> DATASET_ID = createField(DSL.name("dataset_id"), SQLDataType.INTEGER.defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "Primary id for this table. This uniquely identifies the row.");

    /**
     * The column <code>germinate_db.view_table_collaborators.country_id</code>.
     * Primary id for this table. This uniquely identifies the row.
     */
    public final TableField<ViewTableCollaboratorsRecord, Integer> COUNTRY_ID = createField(DSL.name("country_id"), SQLDataType.INTEGER.defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "Primary id for this table. This uniquely identifies the row.");

    /**
     * The column
     * <code>germinate_db.view_table_collaborators.country_name</code>. Country
     * name.
     */
    public final TableField<ViewTableCollaboratorsRecord, String> COUNTRY_NAME = createField(DSL.name("country_name"), SQLDataType.VARCHAR(255).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "Country name.");

    /**
     * The column
     * <code>germinate_db.view_table_collaborators.country_code2</code>. ISO 2
     * Code for country.
     */
    public final TableField<ViewTableCollaboratorsRecord, String> COUNTRY_CODE2 = createField(DSL.name("country_code2"), SQLDataType.CHAR(2).defaultValue(DSL.inline("", SQLDataType.CHAR)), this, "ISO 2 Code for country.");

    /**
     * The column
     * <code>germinate_db.view_table_collaborators.country_code3</code>. ISO 3
     * Code for country.
     */
    public final TableField<ViewTableCollaboratorsRecord, String> COUNTRY_CODE3 = createField(DSL.name("country_code3"), SQLDataType.CHAR(3).defaultValue(DSL.inline("", SQLDataType.CHAR)), this, "ISO 3 Code for country.");

    private ViewTableCollaborators(Name alias, Table<ViewTableCollaboratorsRecord> aliased) {
        this(alias, aliased, null);
    }

    private ViewTableCollaborators(Name alias, Table<ViewTableCollaboratorsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"), TableOptions.view("create view `view_table_collaborators` as select `germinate_template_4_22_08_18`.`collaborators`.`id` AS `collaborator_id`,`germinate_template_4_22_08_18`.`collaborators`.`first_name` AS `collaborator_first_name`,`germinate_template_4_22_08_18`.`collaborators`.`last_name` AS `collaborator_last_name`,`germinate_template_4_22_08_18`.`collaborators`.`external_id` AS `collaborator_external_id`,`germinate_template_4_22_08_18`.`collaborators`.`email` AS `collaborator_email`,`germinate_template_4_22_08_18`.`collaborators`.`phone` AS `collaborator_phone`,`germinate_template_4_22_08_18`.`datasetcollaborators`.`collaborator_roles` AS `collaborator_roles`,`germinate_template_4_22_08_18`.`institutions`.`id` AS `institution_id`,`germinate_template_4_22_08_18`.`institutions`.`name` AS `institution_name`,`germinate_template_4_22_08_18`.`institutions`.`address` AS `institution_address`,`germinate_template_4_22_08_18`.`datasets`.`id` AS `dataset_id`,`germinate_template_4_22_08_18`.`countries`.`id` AS `country_id`,`germinate_template_4_22_08_18`.`countries`.`country_name` AS `country_name`,`germinate_template_4_22_08_18`.`countries`.`country_code2` AS `country_code2`,`germinate_template_4_22_08_18`.`countries`.`country_code3` AS `country_code3` from ((((`germinate_template_4_22_08_18`.`collaborators` left join `germinate_template_4_22_08_18`.`institutions` on((`germinate_template_4_22_08_18`.`institutions`.`id` = `germinate_template_4_22_08_18`.`collaborators`.`institution_id`))) left join `germinate_template_4_22_08_18`.`countries` on((`germinate_template_4_22_08_18`.`countries`.`id` = `germinate_template_4_22_08_18`.`institutions`.`country_id`))) left join `germinate_template_4_22_08_18`.`datasetcollaborators` on((`germinate_template_4_22_08_18`.`datasetcollaborators`.`collaborator_id` = `germinate_template_4_22_08_18`.`collaborators`.`id`))) left join `germinate_template_4_22_08_18`.`datasets` on((`germinate_template_4_22_08_18`.`datasets`.`id` = `germinate_template_4_22_08_18`.`datasetcollaborators`.`dataset_id`)))"));
    }

    /**
     * Create an aliased <code>germinate_db.view_table_collaborators</code>
     * table reference
     */
    public ViewTableCollaborators(String alias) {
        this(DSL.name(alias), VIEW_TABLE_COLLABORATORS);
    }

    /**
     * Create an aliased <code>germinate_db.view_table_collaborators</code>
     * table reference
     */
    public ViewTableCollaborators(Name alias) {
        this(alias, VIEW_TABLE_COLLABORATORS);
    }

    /**
     * Create a <code>germinate_db.view_table_collaborators</code> table
     * reference
     */
    public ViewTableCollaborators() {
        this(DSL.name("view_table_collaborators"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : GerminateDb.GERMINATE_DB;
    }

    @Override
    public ViewTableCollaborators as(String alias) {
        return new ViewTableCollaborators(DSL.name(alias), this);
    }

    @Override
    public ViewTableCollaborators as(Name alias) {
        return new ViewTableCollaborators(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewTableCollaborators rename(String name) {
        return new ViewTableCollaborators(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewTableCollaborators rename(Name name) {
        return new ViewTableCollaborators(name, null);
    }

    // -------------------------------------------------------------------------
    // Row15 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row15<Integer, String, String, String, String, String, String, Integer, String, String, Integer, Integer, String, String, String> fieldsRow() {
        return (Row15) super.fieldsRow();
    }
    // @formatter:on
}
