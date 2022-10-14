/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables;


import java.sql.Timestamp;

import jhi.germinate.server.database.codegen.GerminateDb;
import jhi.germinate.server.database.codegen.tables.records.FileresourcetypesRecord;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Row6;
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
public class Fileresourcetypes extends TableImpl<FileresourcetypesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>germinate_db.fileresourcetypes</code>
     */
    public static final Fileresourcetypes FILERESOURCETYPES = new Fileresourcetypes();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FileresourcetypesRecord> getRecordType() {
        return FileresourcetypesRecord.class;
    }

    /**
     * The column <code>germinate_db.fileresourcetypes.id</code>. The primary
     * id.
     */
    public final TableField<FileresourcetypesRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "The primary id.");

    /**
     * The column <code>germinate_db.fileresourcetypes.name</code>. The name of
     * the file type.
     */
    public final TableField<FileresourcetypesRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(255).nullable(false), this, "The name of the file type.");

    /**
     * The column <code>germinate_db.fileresourcetypes.description</code>. The
     * description of the file type.
     */
    public final TableField<FileresourcetypesRecord, String> DESCRIPTION = createField(DSL.name("description"), SQLDataType.CLOB, this, "The description of the file type.");

    /**
     * The column <code>germinate_db.fileresourcetypes.public_visibility</code>.
     * Determines whether this type is visible to non-admins.
     */
    public final TableField<FileresourcetypesRecord, Boolean> PUBLIC_VISIBILITY = createField(DSL.name("public_visibility"), SQLDataType.BOOLEAN.nullable(false).defaultValue(DSL.inline("1", SQLDataType.BOOLEAN)), this, "Determines whether this type is visible to non-admins.");

    /**
     * The column <code>germinate_db.fileresourcetypes.created_on</code>. When
     * this record was created.
     */
    public final TableField<FileresourcetypesRecord, Timestamp> CREATED_ON = createField(DSL.name("created_on"), SQLDataType.TIMESTAMP(0).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.TIMESTAMP)), this, "When this record was created.");

    /**
     * The column <code>germinate_db.fileresourcetypes.updated_on</code>. When
     * this record was last updated.
     */
    public final TableField<FileresourcetypesRecord, Timestamp> UPDATED_ON = createField(DSL.name("updated_on"), SQLDataType.TIMESTAMP(0).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.TIMESTAMP)), this, "When this record was last updated.");

    private Fileresourcetypes(Name alias, Table<FileresourcetypesRecord> aliased) {
        this(alias, aliased, null);
    }

    private Fileresourcetypes(Name alias, Table<FileresourcetypesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>germinate_db.fileresourcetypes</code> table
     * reference
     */
    public Fileresourcetypes(String alias) {
        this(DSL.name(alias), FILERESOURCETYPES);
    }

    /**
     * Create an aliased <code>germinate_db.fileresourcetypes</code> table
     * reference
     */
    public Fileresourcetypes(Name alias) {
        this(alias, FILERESOURCETYPES);
    }

    /**
     * Create a <code>germinate_db.fileresourcetypes</code> table reference
     */
    public Fileresourcetypes() {
        this(DSL.name("fileresourcetypes"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : GerminateDb.GERMINATE_DB;
    }

    @Override
    public Identity<FileresourcetypesRecord, Integer> getIdentity() {
        return (Identity<FileresourcetypesRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<FileresourcetypesRecord> getPrimaryKey() {
        return Internal.createUniqueKey(Fileresourcetypes.FILERESOURCETYPES, DSL.name("KEY_fileresourcetypes_PRIMARY"), new TableField[] { Fileresourcetypes.FILERESOURCETYPES.ID }, true);
    }

    @Override
    public Fileresourcetypes as(String alias) {
        return new Fileresourcetypes(DSL.name(alias), this);
    }

    @Override
    public Fileresourcetypes as(Name alias) {
        return new Fileresourcetypes(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Fileresourcetypes rename(String name) {
        return new Fileresourcetypes(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Fileresourcetypes rename(Name name) {
        return new Fileresourcetypes(name, null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<Integer, String, String, Boolean, Timestamp, Timestamp> fieldsRow() {
        return (Row6) super.fieldsRow();
    }
    // @formatter:on
}
