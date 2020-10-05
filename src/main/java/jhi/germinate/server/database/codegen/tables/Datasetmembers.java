/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables;


import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jhi.germinate.server.database.codegen.GerminateDb;
import jhi.germinate.server.database.codegen.tables.records.DatasetmembersRecord;

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
public class Datasetmembers extends TableImpl<DatasetmembersRecord> {

    private static final long serialVersionUID = 1155027802;

    /**
     * The reference instance of <code>germinate_db.datasetmembers</code>
     */
    public static final Datasetmembers DATASETMEMBERS = new Datasetmembers();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DatasetmembersRecord> getRecordType() {
        return DatasetmembersRecord.class;
    }

    /**
     * The column <code>germinate_db.datasetmembers.id</code>.
     */
    public final TableField<DatasetmembersRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>germinate_db.datasetmembers.dataset_id</code>.
     */
    public final TableField<DatasetmembersRecord, Integer> DATASET_ID = createField("dataset_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>germinate_db.datasetmembers.foreign_id</code>.
     */
    public final TableField<DatasetmembersRecord, Integer> FOREIGN_ID = createField("foreign_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>germinate_db.datasetmembers.datasetmembertype_id</code>.
     */
    public final TableField<DatasetmembersRecord, Integer> DATASETMEMBERTYPE_ID = createField("datasetmembertype_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>germinate_db.datasetmembers.created_on</code>. When the record was created.
     */
    public final TableField<DatasetmembersRecord, Timestamp> CREATED_ON = createField("created_on", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "When the record was created.");

    /**
     * The column <code>germinate_db.datasetmembers.updated_on</code>. When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.
     */
    public final TableField<DatasetmembersRecord, Timestamp> UPDATED_ON = createField("updated_on", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.");

    /**
     * Create a <code>germinate_db.datasetmembers</code> table reference
     */
    public Datasetmembers() {
        this(DSL.name("datasetmembers"), null);
    }

    /**
     * Create an aliased <code>germinate_db.datasetmembers</code> table reference
     */
    public Datasetmembers(String alias) {
        this(DSL.name(alias), DATASETMEMBERS);
    }

    /**
     * Create an aliased <code>germinate_db.datasetmembers</code> table reference
     */
    public Datasetmembers(Name alias) {
        this(alias, DATASETMEMBERS);
    }

    private Datasetmembers(Name alias, Table<DatasetmembersRecord> aliased) {
        this(alias, aliased, null);
    }

    private Datasetmembers(Name alias, Table<DatasetmembersRecord> aliased, Field<?>[] parameters) {
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
    public Identity<DatasetmembersRecord, Integer> getIdentity() {
        return Internal.createIdentity(jhi.germinate.server.database.codegen.tables.Datasetmembers.DATASETMEMBERS, jhi.germinate.server.database.codegen.tables.Datasetmembers.DATASETMEMBERS.ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<DatasetmembersRecord> getPrimaryKey() {
        return Internal.createUniqueKey(jhi.germinate.server.database.codegen.tables.Datasetmembers.DATASETMEMBERS, "KEY_datasetmembers_PRIMARY", jhi.germinate.server.database.codegen.tables.Datasetmembers.DATASETMEMBERS.ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<DatasetmembersRecord>> getKeys() {
        return Arrays.<UniqueKey<DatasetmembersRecord>>asList(
              Internal.createUniqueKey(jhi.germinate.server.database.codegen.tables.Datasetmembers.DATASETMEMBERS, "KEY_datasetmembers_PRIMARY", jhi.germinate.server.database.codegen.tables.Datasetmembers.DATASETMEMBERS.ID)
        );
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Datasetmembers as(String alias) {
        return new Datasetmembers(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Datasetmembers as(Name alias) {
        return new Datasetmembers(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Datasetmembers rename(String name) {
        return new Datasetmembers(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Datasetmembers rename(Name name) {
        return new Datasetmembers(name, null);
    }
// @formatter:on
}