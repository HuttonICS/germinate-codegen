/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables;


import java.sql.Timestamp;

import jhi.germinate.server.database.codegen.GerminateDb;
import jhi.germinate.server.database.codegen.tables.records.ProjectsRecord;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Row10;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


// @formatter:off
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Projects extends TableImpl<ProjectsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>germinate_db.projects</code>
     */
    public static final Projects PROJECTS = new Projects();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ProjectsRecord> getRecordType() {
        return ProjectsRecord.class;
    }

    /**
     * The column <code>germinate_db.projects.id</code>.
     */
    public final TableField<ProjectsRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>germinate_db.projects.name</code>.
     */
    public final TableField<ProjectsRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>germinate_db.projects.description</code>.
     */
    public final TableField<ProjectsRecord, String> DESCRIPTION = createField(DSL.name("description"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>germinate_db.projects.page_content</code>.
     */
    public final TableField<ProjectsRecord, String> PAGE_CONTENT = createField(DSL.name("page_content"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>germinate_db.projects.external_url</code>.
     */
    public final TableField<ProjectsRecord, String> EXTERNAL_URL = createField(DSL.name("external_url"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>germinate_db.projects.image_id</code>.
     */
    public final TableField<ProjectsRecord, Integer> IMAGE_ID = createField(DSL.name("image_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>germinate_db.projects.start_date</code>.
     */
    public final TableField<ProjectsRecord, Timestamp> START_DATE = createField(DSL.name("start_date"), SQLDataType.TIMESTAMP(0), this, "");

    /**
     * The column <code>germinate_db.projects.end_date</code>.
     */
    public final TableField<ProjectsRecord, Timestamp> END_DATE = createField(DSL.name("end_date"), SQLDataType.TIMESTAMP(0), this, "");

    /**
     * The column <code>germinate_db.projects.created_on</code>.
     */
    public final TableField<ProjectsRecord, Timestamp> CREATED_ON = createField(DSL.name("created_on"), SQLDataType.TIMESTAMP(0).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>germinate_db.projects.updated_on</code>.
     */
    public final TableField<ProjectsRecord, Timestamp> UPDATED_ON = createField(DSL.name("updated_on"), SQLDataType.TIMESTAMP(0).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.TIMESTAMP)), this, "");

    private Projects(Name alias, Table<ProjectsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Projects(Name alias, Table<ProjectsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>germinate_db.projects</code> table reference
     */
    public Projects(String alias) {
        this(DSL.name(alias), PROJECTS);
    }

    /**
     * Create an aliased <code>germinate_db.projects</code> table reference
     */
    public Projects(Name alias) {
        this(alias, PROJECTS);
    }

    /**
     * Create a <code>germinate_db.projects</code> table reference
     */
    public Projects() {
        this(DSL.name("projects"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : GerminateDb.GERMINATE_DB;
    }

    @Override
    public Identity<ProjectsRecord, Integer> getIdentity() {
        return (Identity<ProjectsRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<ProjectsRecord> getPrimaryKey() {
        return Internal.createUniqueKey(Projects.PROJECTS, DSL.name("KEY_projects_PRIMARY"), new TableField[] { Projects.PROJECTS.ID }, true);
    }

    @Override
    public Projects as(String alias) {
        return new Projects(DSL.name(alias), this);
    }

    @Override
    public Projects as(Name alias) {
        return new Projects(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Projects rename(String name) {
        return new Projects(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Projects rename(Name name) {
        return new Projects(name, null);
    }

    // -------------------------------------------------------------------------
    // Row10 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row10<Integer, String, String, String, String, Integer, Timestamp, Timestamp, Timestamp, Timestamp> fieldsRow() {
        return (Row10) super.fieldsRow();
    }
    // @formatter:on
}
