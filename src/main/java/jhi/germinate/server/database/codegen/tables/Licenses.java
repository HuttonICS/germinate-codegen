/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables;


import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jhi.germinate.server.database.codegen.GerminateDb;
import jhi.germinate.server.database.codegen.tables.records.LicensesRecord;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;
import org.jooq.impl.TableImpl;


// @formatter:off
/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Licenses extends TableImpl<LicensesRecord> {

    private static final long serialVersionUID = 880097846;

    /**
     * The reference instance of <code>germinate_db.licenses</code>
     */
    public static final Licenses LICENSES = new Licenses();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<LicensesRecord> getRecordType() {
        return LicensesRecord.class;
    }

    /**
     * The column <code>germinate_db.licenses.id</code>.
     */
    public final TableField<LicensesRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>germinate_db.licenses.name</code>.
     */
    public final TableField<LicensesRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>germinate_db.licenses.description</code>.
     */
    public final TableField<LicensesRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>germinate_db.licenses.created_on</code>. When the record was created.
     */
    public final TableField<LicensesRecord, Timestamp> CREATED_ON = createField("created_on", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "When the record was created.");

    /**
     * The column <code>germinate_db.licenses.updated_on</code>. When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.
     */
    public final TableField<LicensesRecord, Timestamp> UPDATED_ON = createField("updated_on", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.");

    /**
     * Create a <code>germinate_db.licenses</code> table reference
     */
    public Licenses() {
        this(DSL.name("licenses"), null);
    }

    /**
     * Create an aliased <code>germinate_db.licenses</code> table reference
     */
    public Licenses(String alias) {
        this(DSL.name(alias), LICENSES);
    }

    /**
     * Create an aliased <code>germinate_db.licenses</code> table reference
     */
    public Licenses(Name alias) {
        this(alias, LICENSES);
    }

    private Licenses(Name alias, Table<LicensesRecord> aliased) {
        this(alias, aliased, null);
    }

    private Licenses(Name alias, Table<LicensesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return GerminateDb.GERMINATE_DB;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<LicensesRecord, Integer> getIdentity() {
        return Internal.createIdentity(jhi.germinate.server.database.codegen.tables.Licenses.LICENSES, jhi.germinate.server.database.codegen.tables.Licenses.LICENSES.ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<LicensesRecord> getPrimaryKey() {
        return Internal.createUniqueKey(jhi.germinate.server.database.codegen.tables.Licenses.LICENSES, "KEY_licenses_PRIMARY", jhi.germinate.server.database.codegen.tables.Licenses.LICENSES.ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<LicensesRecord>> getKeys() {
        return Arrays.<UniqueKey<LicensesRecord>>asList(
              Internal.createUniqueKey(jhi.germinate.server.database.codegen.tables.Licenses.LICENSES, "KEY_licenses_PRIMARY", jhi.germinate.server.database.codegen.tables.Licenses.LICENSES.ID)
        );
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Licenses as(String alias) {
        return new Licenses(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Licenses as(Name alias) {
        return new Licenses(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Licenses rename(String name) {
        return new Licenses(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Licenses rename(Name name) {
        return new Licenses(name, null);
    }
// @formatter:on
}
