/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables;


import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jhi.germinate.server.database.codegen.GerminateDb;
import jhi.germinate.server.database.codegen.tables.records.CompoundsRecord;

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
public class Compounds extends TableImpl<CompoundsRecord> {

    private static final long serialVersionUID = -1287668657;

    /**
     * The reference instance of <code>germinate_db.compounds</code>
     */
    public static final Compounds COMPOUNDS = new Compounds();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CompoundsRecord> getRecordType() {
        return CompoundsRecord.class;
    }

    /**
     * The column <code>germinate_db.compounds.id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public final TableField<CompoundsRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "Primary id for this table. This uniquely identifies the row.");

    /**
     * The column <code>germinate_db.compounds.name</code>. Compound full name.
     */
    public final TableField<CompoundsRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "Compound full name.");

    /**
     * The column <code>germinate_db.compounds.description</code>. Full description of the compound. This should contain enough infomation to accurately identify the compound and how it was recorded.
     */
    public final TableField<CompoundsRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR(255), this, "Full description of the compound. This should contain enough infomation to accurately identify the compound and how it was recorded.");

    /**
     * The column <code>germinate_db.compounds.molecular_formula</code>. The molecular formula of the compound.
     */
    public final TableField<CompoundsRecord, String> MOLECULAR_FORMULA = createField("molecular_formula", org.jooq.impl.SQLDataType.VARCHAR(255), this, "The molecular formula of the compound.");

    /**
     * The column <code>germinate_db.compounds.monoisotopic_mass</code>. The monoisotopic mass of the compound.
     */
    public final TableField<CompoundsRecord, BigDecimal> MONOISOTOPIC_MASS = createField("monoisotopic_mass", org.jooq.impl.SQLDataType.DECIMAL(64, 10), this, "The monoisotopic mass of the compound.");

    /**
     * The column <code>germinate_db.compounds.average_mass</code>. The average mass of the compound.
     */
    public final TableField<CompoundsRecord, BigDecimal> AVERAGE_MASS = createField("average_mass", org.jooq.impl.SQLDataType.DECIMAL(64, 10), this, "The average mass of the compound.");

    /**
     * The column <code>germinate_db.compounds.compound_class</code>. A classification of the compound.
     */
    public final TableField<CompoundsRecord, String> COMPOUND_CLASS = createField("compound_class", org.jooq.impl.SQLDataType.VARCHAR(255), this, "A classification of the compound.");

    /**
     * The column <code>germinate_db.compounds.unit_id</code>. Foreign Key to units (units.id).
     */
    public final TableField<CompoundsRecord, Integer> UNIT_ID = createField("unit_id", org.jooq.impl.SQLDataType.INTEGER, this, "Foreign Key to units (units.id).");

    /**
     * The column <code>germinate_db.compounds.created_on</code>. When the record was created.
     */
    public final TableField<CompoundsRecord, Timestamp> CREATED_ON = createField("created_on", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "When the record was created.");

    /**
     * The column <code>germinate_db.compounds.updated_on</code>. When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.
     */
    public final TableField<CompoundsRecord, Timestamp> UPDATED_ON = createField("updated_on", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.");

    /**
     * Create a <code>germinate_db.compounds</code> table reference
     */
    public Compounds() {
        this(DSL.name("compounds"), null);
    }

    /**
     * Create an aliased <code>germinate_db.compounds</code> table reference
     */
    public Compounds(String alias) {
        this(DSL.name(alias), COMPOUNDS);
    }

    /**
     * Create an aliased <code>germinate_db.compounds</code> table reference
     */
    public Compounds(Name alias) {
        this(alias, COMPOUNDS);
    }

    private Compounds(Name alias, Table<CompoundsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Compounds(Name alias, Table<CompoundsRecord> aliased, Field<?>[] parameters) {
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
    public Identity<CompoundsRecord, Integer> getIdentity() {
        return Internal.createIdentity(jhi.germinate.server.database.codegen.tables.Compounds.COMPOUNDS, jhi.germinate.server.database.codegen.tables.Compounds.COMPOUNDS.ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CompoundsRecord> getPrimaryKey() {
        return Internal.createUniqueKey(jhi.germinate.server.database.codegen.tables.Compounds.COMPOUNDS, "KEY_compounds_PRIMARY", jhi.germinate.server.database.codegen.tables.Compounds.COMPOUNDS.ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CompoundsRecord>> getKeys() {
        return Arrays.<UniqueKey<CompoundsRecord>>asList(
              Internal.createUniqueKey(jhi.germinate.server.database.codegen.tables.Compounds.COMPOUNDS, "KEY_compounds_PRIMARY", jhi.germinate.server.database.codegen.tables.Compounds.COMPOUNDS.ID)
        );
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Compounds as(String alias) {
        return new Compounds(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Compounds as(Name alias) {
        return new Compounds(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Compounds rename(String name) {
        return new Compounds(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Compounds rename(Name name) {
        return new Compounds(name, null);
    }
// @formatter:on
}
