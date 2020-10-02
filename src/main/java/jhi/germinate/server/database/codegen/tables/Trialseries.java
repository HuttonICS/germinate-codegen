/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables;


import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jhi.germinate.server.database.codegen.GerminateDb;
import jhi.germinate.server.database.codegen.tables.records.TrialseriesRecord;

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
 * Holds the names of trial series. Trial series define the name of the trial 
 * to which trials data is associated. Examples would include the overarching 
 * project.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Trialseries extends TableImpl<TrialseriesRecord> {

    private static final long serialVersionUID = -169505669;

    /**
     * The reference instance of <code>germinate_db.trialseries</code>
     */
    public static final Trialseries TRIALSERIES = new Trialseries();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TrialseriesRecord> getRecordType() {
        return TrialseriesRecord.class;
    }

    /**
     * The column <code>germinate_db.trialseries.id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public final TableField<TrialseriesRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "Primary id for this table. This uniquely identifies the row.");

    /**
     * The column <code>germinate_db.trialseries.seriesname</code>. The description of the trial series name.
     */
    public final TableField<TrialseriesRecord, String> SERIESNAME = createField("seriesname", org.jooq.impl.SQLDataType.VARCHAR(255), this, "The description of the trial series name.");

    /**
     * The column <code>germinate_db.trialseries.created_on</code>. When the record was created.
     */
    public final TableField<TrialseriesRecord, Timestamp> CREATED_ON = createField("created_on", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "When the record was created.");

    /**
     * The column <code>germinate_db.trialseries.updated_on</code>. When the record was updated. This may be different from the created on date if changes have been made subsequently to the underlying record.
     */
    public final TableField<TrialseriesRecord, Timestamp> UPDATED_ON = createField("updated_on", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "When the record was updated. This may be different from the created on date if changes have been made subsequently to the underlying record.");

    /**
     * Create a <code>germinate_db.trialseries</code> table reference
     */
    public Trialseries() {
        this(DSL.name("trialseries"), null);
    }

    /**
     * Create an aliased <code>germinate_db.trialseries</code> table reference
     */
    public Trialseries(String alias) {
        this(DSL.name(alias), TRIALSERIES);
    }

    /**
     * Create an aliased <code>germinate_db.trialseries</code> table reference
     */
    public Trialseries(Name alias) {
        this(alias, TRIALSERIES);
    }

    private Trialseries(Name alias, Table<TrialseriesRecord> aliased) {
        this(alias, aliased, null);
    }

    private Trialseries(Name alias, Table<TrialseriesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Holds the names of trial series. Trial series define the name of the trial to which trials data is associated. Examples would include the overarching project."));
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
    public Identity<TrialseriesRecord, Integer> getIdentity() {
        return Internal.createIdentity(jhi.germinate.server.database.codegen.tables.Trialseries.TRIALSERIES, jhi.germinate.server.database.codegen.tables.Trialseries.TRIALSERIES.ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TrialseriesRecord> getPrimaryKey() {
        return Internal.createUniqueKey(jhi.germinate.server.database.codegen.tables.Trialseries.TRIALSERIES, "KEY_trialseries_PRIMARY", jhi.germinate.server.database.codegen.tables.Trialseries.TRIALSERIES.ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TrialseriesRecord>> getKeys() {
        return Arrays.<UniqueKey<TrialseriesRecord>>asList(
              Internal.createUniqueKey(jhi.germinate.server.database.codegen.tables.Trialseries.TRIALSERIES, "KEY_trialseries_PRIMARY", jhi.germinate.server.database.codegen.tables.Trialseries.TRIALSERIES.ID)
        );
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Trialseries as(String alias) {
        return new Trialseries(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Trialseries as(Name alias) {
        return new Trialseries(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Trialseries rename(String name) {
        return new Trialseries(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Trialseries rename(Name name) {
        return new Trialseries(name, null);
    }
// @formatter:on
}
