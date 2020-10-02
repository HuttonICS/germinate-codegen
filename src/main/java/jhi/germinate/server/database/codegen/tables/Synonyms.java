/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables;


import com.google.gson.JsonArray;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jhi.germinate.server.database.binding.SynonymBinding;
import jhi.germinate.server.database.codegen.GerminateDb;
import jhi.germinate.server.database.codegen.tables.records.SynonymsRecord;

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
 * Allows the definition of synonyms for entries such as germinatebase entries 
 * or marker names.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Synonyms extends TableImpl<SynonymsRecord> {

    private static final long serialVersionUID = 25880102;

    /**
     * The reference instance of <code>germinate_db.synonyms</code>
     */
    public static final Synonyms SYNONYMS = new Synonyms();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SynonymsRecord> getRecordType() {
        return SynonymsRecord.class;
    }

    /**
     * The column <code>germinate_db.synonyms.id</code>. Primary id for this table. This uniquely identifies the row.

     */
    public final TableField<SynonymsRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "Primary id for this table. This uniquely identifies the row.\n");

    /**
     * The column <code>germinate_db.synonyms.foreign_id</code>. Foreign key to target table (l[targettable].id).
     */
    public final TableField<SynonymsRecord, Integer> FOREIGN_ID = createField("foreign_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "Foreign key to target table (l[targettable].id).");

    /**
     * The column <code>germinate_db.synonyms.synonymtype_id</code>. Foreign key to synonymtypes (synonymnstypes.id).
     */
    public final TableField<SynonymsRecord, Integer> SYNONYMTYPE_ID = createField("synonymtype_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "Foreign key to synonymtypes (synonymnstypes.id).");

    /**
     * The column <code>germinate_db.synonyms.synonyms</code>. The synonyms as a json array.
     */
    public final TableField<SynonymsRecord, JsonArray> SYNONYMS_ = createField("synonyms", org.jooq.impl.DefaultDataType.getDefaultDataType("\"germinate_template_4_20_10_02\".\"synonyms_synonyms\""), this, "The synonyms as a json array.", new SynonymBinding());

    /**
     * The column <code>germinate_db.synonyms.created_on</code>. When the record was created.
     */
    public final TableField<SynonymsRecord, Timestamp> CREATED_ON = createField("created_on", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "When the record was created.");

    /**
     * The column <code>germinate_db.synonyms.updated_on</code>. When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.
     */
    public final TableField<SynonymsRecord, Timestamp> UPDATED_ON = createField("updated_on", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.");

    /**
     * Create a <code>germinate_db.synonyms</code> table reference
     */
    public Synonyms() {
        this(DSL.name("synonyms"), null);
    }

    /**
     * Create an aliased <code>germinate_db.synonyms</code> table reference
     */
    public Synonyms(String alias) {
        this(DSL.name(alias), SYNONYMS);
    }

    /**
     * Create an aliased <code>germinate_db.synonyms</code> table reference
     */
    public Synonyms(Name alias) {
        this(alias, SYNONYMS);
    }

    private Synonyms(Name alias, Table<SynonymsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Synonyms(Name alias, Table<SynonymsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Allows the definition of synonyms for entries such as germinatebase entries or marker names."));
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
    public Identity<SynonymsRecord, Integer> getIdentity() {
        return Internal.createIdentity(jhi.germinate.server.database.codegen.tables.Synonyms.SYNONYMS, jhi.germinate.server.database.codegen.tables.Synonyms.SYNONYMS.ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<SynonymsRecord> getPrimaryKey() {
        return Internal.createUniqueKey(jhi.germinate.server.database.codegen.tables.Synonyms.SYNONYMS, "KEY_synonyms_PRIMARY", jhi.germinate.server.database.codegen.tables.Synonyms.SYNONYMS.ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<SynonymsRecord>> getKeys() {
        return Arrays.<UniqueKey<SynonymsRecord>>asList(
              Internal.createUniqueKey(jhi.germinate.server.database.codegen.tables.Synonyms.SYNONYMS, "KEY_synonyms_PRIMARY", jhi.germinate.server.database.codegen.tables.Synonyms.SYNONYMS.ID)
        );
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Synonyms as(String alias) {
        return new Synonyms(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Synonyms as(Name alias) {
        return new Synonyms(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Synonyms rename(String name) {
        return new Synonyms(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Synonyms rename(Name name) {
        return new Synonyms(name, null);
    }
// @formatter:on
}
