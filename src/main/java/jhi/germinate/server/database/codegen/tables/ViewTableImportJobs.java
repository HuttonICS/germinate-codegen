/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables;


import java.sql.Timestamp;

import jhi.germinate.server.database.binding.ImportJobStatsBinding;
import jhi.germinate.server.database.codegen.GerminateDb;
import jhi.germinate.server.database.codegen.enums.ViewTableImportJobsDatatype;
import jhi.germinate.server.database.codegen.enums.ViewTableImportJobsStatus;
import jhi.germinate.server.database.codegen.tables.records.ViewTableImportJobsRecord;
import jhi.germinate.server.database.pojo.ImportJobStats;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Row7;
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
public class ViewTableImportJobs extends TableImpl<ViewTableImportJobsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>germinate_db.view_table_import_jobs</code>
     */
    public static final ViewTableImportJobs VIEW_TABLE_IMPORT_JOBS = new ViewTableImportJobs();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ViewTableImportJobsRecord> getRecordType() {
        return ViewTableImportJobsRecord.class;
    }

    /**
     * The column <code>germinate_db.view_table_import_jobs.id</code>.
     */
    public final TableField<ViewTableImportJobsRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>germinate_db.view_table_import_jobs.is_update</code>.
     */
    public final TableField<ViewTableImportJobsRecord, Boolean> IS_UPDATE = createField(DSL.name("is_update"), SQLDataType.BOOLEAN.nullable(false).defaultValue(DSL.inline("0", SQLDataType.BOOLEAN)), this, "");

    /**
     * The column
     * <code>germinate_db.view_table_import_jobs.datasetstate_id</code>.
     */
    public final TableField<ViewTableImportJobsRecord, Integer> DATASETSTATE_ID = createField(DSL.name("datasetstate_id"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("1", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>germinate_db.view_table_import_jobs.datatype</code>.
     */
    public final TableField<ViewTableImportJobsRecord, ViewTableImportJobsDatatype> DATATYPE = createField(DSL.name("datatype"), SQLDataType.VARCHAR(9).nullable(false).defaultValue(DSL.inline("mcpd", SQLDataType.VARCHAR)).asEnumDataType(jhi.germinate.server.database.codegen.enums.ViewTableImportJobsDatatype.class), this, "");

    /**
     * The column <code>germinate_db.view_table_import_jobs.status</code>.
     */
    public final TableField<ViewTableImportJobsRecord, ViewTableImportJobsStatus> STATUS = createField(DSL.name("status"), SQLDataType.VARCHAR(9).nullable(false).defaultValue(DSL.inline("waiting", SQLDataType.VARCHAR)).asEnumDataType(jhi.germinate.server.database.codegen.enums.ViewTableImportJobsStatus.class), this, "");

    /**
     * The column <code>germinate_db.view_table_import_jobs.stats</code>.
     */
    public final TableField<ViewTableImportJobsRecord, ImportJobStats> STATS = createField(DSL.name("stats"), SQLDataType.JSON, this, "", new ImportJobStatsBinding());

    /**
     * The column <code>germinate_db.view_table_import_jobs.created_on</code>.
     */
    public final TableField<ViewTableImportJobsRecord, Timestamp> CREATED_ON = createField(DSL.name("created_on"), SQLDataType.TIMESTAMP(0), this, "");

    private ViewTableImportJobs(Name alias, Table<ViewTableImportJobsRecord> aliased) {
        this(alias, aliased, null);
    }

    private ViewTableImportJobs(Name alias, Table<ViewTableImportJobsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"), TableOptions.view("create view `view_table_import_jobs` as select `germinate_template_4_24_10_07`.`data_import_jobs`.`id` AS `id`,`germinate_template_4_24_10_07`.`data_import_jobs`.`is_update` AS `is_update`,`germinate_template_4_24_10_07`.`data_import_jobs`.`datasetstate_id` AS `datasetstate_id`,`germinate_template_4_24_10_07`.`data_import_jobs`.`datatype` AS `datatype`,`germinate_template_4_24_10_07`.`data_import_jobs`.`status` AS `status`,`germinate_template_4_24_10_07`.`data_import_jobs`.`stats` AS `stats`,`germinate_template_4_24_10_07`.`data_import_jobs`.`created_on` AS `created_on` from `germinate_template_4_24_10_07`.`data_import_jobs` where ((`germinate_template_4_24_10_07`.`data_import_jobs`.`stats` is not null) and (`germinate_template_4_24_10_07`.`data_import_jobs`.`status` = 'completed') and (`germinate_template_4_24_10_07`.`data_import_jobs`.`imported` = 1))"));
    }

    /**
     * Create an aliased <code>germinate_db.view_table_import_jobs</code> table
     * reference
     */
    public ViewTableImportJobs(String alias) {
        this(DSL.name(alias), VIEW_TABLE_IMPORT_JOBS);
    }

    /**
     * Create an aliased <code>germinate_db.view_table_import_jobs</code> table
     * reference
     */
    public ViewTableImportJobs(Name alias) {
        this(alias, VIEW_TABLE_IMPORT_JOBS);
    }

    /**
     * Create a <code>germinate_db.view_table_import_jobs</code> table reference
     */
    public ViewTableImportJobs() {
        this(DSL.name("view_table_import_jobs"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : GerminateDb.GERMINATE_DB;
    }

    @Override
    public ViewTableImportJobs as(String alias) {
        return new ViewTableImportJobs(DSL.name(alias), this);
    }

    @Override
    public ViewTableImportJobs as(Name alias) {
        return new ViewTableImportJobs(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewTableImportJobs rename(String name) {
        return new ViewTableImportJobs(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewTableImportJobs rename(Name name) {
        return new ViewTableImportJobs(name, null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row7<Integer, Boolean, Integer, ViewTableImportJobsDatatype, ViewTableImportJobsStatus, ImportJobStats, Timestamp> fieldsRow() {
        return (Row7) super.fieldsRow();
    }
    // @formatter:on
}
