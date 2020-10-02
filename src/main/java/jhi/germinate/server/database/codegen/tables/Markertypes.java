/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables;


import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jhi.germinate.server.database.codegen.GerminateDb;
import jhi.germinate.server.database.codegen.tables.records.MarkertypesRecord;

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
 * Describes the marker type. Markers (markers) have a defined type. This 
 * could be AFLP, MicroSat, SNP and so on. Used to differentiate markers within 
 * the markers table and alllows for mixing of marker types on genetic and 
 * physical maps.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Markertypes extends TableImpl<MarkertypesRecord> {

    private static final long serialVersionUID = 472436425;

    /**
     * The reference instance of <code>germinate_db.markertypes</code>
     */
    public static final Markertypes MARKERTYPES = new Markertypes();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MarkertypesRecord> getRecordType() {
        return MarkertypesRecord.class;
    }

    /**
     * The column <code>germinate_db.markertypes.id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public final TableField<MarkertypesRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "Primary id for this table. This uniquely identifies the row.");

    /**
     * The column <code>germinate_db.markertypes.description</code>. Describes the marker type. Markers (markers) have a defined type. This could be AFLP, MicroSat, SNP and so on.
     */
    public final TableField<MarkertypesRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "Describes the marker type. Markers (markers) have a defined type. This could be AFLP, MicroSat, SNP and so on.");

    /**
     * The column <code>germinate_db.markertypes.created_on</code>. When the record was created.
     */
    public final TableField<MarkertypesRecord, Timestamp> CREATED_ON = createField("created_on", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "When the record was created.");

    /**
     * The column <code>germinate_db.markertypes.updated_on</code>. When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.
     */
    public final TableField<MarkertypesRecord, Timestamp> UPDATED_ON = createField("updated_on", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.");

    /**
     * Create a <code>germinate_db.markertypes</code> table reference
     */
    public Markertypes() {
        this(DSL.name("markertypes"), null);
    }

    /**
     * Create an aliased <code>germinate_db.markertypes</code> table reference
     */
    public Markertypes(String alias) {
        this(DSL.name(alias), MARKERTYPES);
    }

    /**
     * Create an aliased <code>germinate_db.markertypes</code> table reference
     */
    public Markertypes(Name alias) {
        this(alias, MARKERTYPES);
    }

    private Markertypes(Name alias, Table<MarkertypesRecord> aliased) {
        this(alias, aliased, null);
    }

    private Markertypes(Name alias, Table<MarkertypesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Describes the marker type. Markers (markers) have a defined type. This could be AFLP, MicroSat, SNP and so on. Used to differentiate markers within the markers table and alllows for mixing of marker types on genetic and physical maps."));
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
    public Identity<MarkertypesRecord, Integer> getIdentity() {
        return Internal.createIdentity(jhi.germinate.server.database.codegen.tables.Markertypes.MARKERTYPES, jhi.germinate.server.database.codegen.tables.Markertypes.MARKERTYPES.ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<MarkertypesRecord> getPrimaryKey() {
        return Internal.createUniqueKey(jhi.germinate.server.database.codegen.tables.Markertypes.MARKERTYPES, "KEY_markertypes_PRIMARY", jhi.germinate.server.database.codegen.tables.Markertypes.MARKERTYPES.ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<MarkertypesRecord>> getKeys() {
        return Arrays.<UniqueKey<MarkertypesRecord>>asList(
              Internal.createUniqueKey(jhi.germinate.server.database.codegen.tables.Markertypes.MARKERTYPES, "KEY_markertypes_PRIMARY", jhi.germinate.server.database.codegen.tables.Markertypes.MARKERTYPES.ID)
        );
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Markertypes as(String alias) {
        return new Markertypes(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Markertypes as(Name alias) {
        return new Markertypes(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Markertypes rename(String name) {
        return new Markertypes(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Markertypes rename(Name name) {
        return new Markertypes(name, null);
    }
// @formatter:on
}
