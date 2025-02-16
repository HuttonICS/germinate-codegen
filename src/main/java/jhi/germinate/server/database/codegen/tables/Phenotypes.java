/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables;


import java.sql.Timestamp;

import jhi.germinate.server.database.binding.TraitRestrictionBinding;
import jhi.germinate.server.database.codegen.GerminateDb;
import jhi.germinate.server.database.codegen.enums.PhenotypesDatatype;
import jhi.germinate.server.database.codegen.tables.records.PhenotypesRecord;
import jhi.germinate.server.database.pojo.TraitRestrictions;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Row12;
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
 * Defines phenoytpes which are held in Germinate.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Phenotypes extends TableImpl<PhenotypesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>germinate_db.phenotypes</code>
     */
    public static final Phenotypes PHENOTYPES = new Phenotypes();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PhenotypesRecord> getRecordType() {
        return PhenotypesRecord.class;
    }

    /**
     * The column <code>germinate_db.phenotypes.id</code>. Primary id for this
     * table. This uniquely identifies the row.
     */
    public final TableField<PhenotypesRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "Primary id for this table. This uniquely identifies the row.");

    /**
     * The column <code>germinate_db.phenotypes.name</code>. Phenotype full
     * name.
     */
    public final TableField<PhenotypesRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(255).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "Phenotype full name.");

    /**
     * The column <code>germinate_db.phenotypes.short_name</code>. Shortened
     * name for the phenotype. This is used in table columns where space is an
     * issue.
     */
    public final TableField<PhenotypesRecord, String> SHORT_NAME = createField(DSL.name("short_name"), SQLDataType.CHAR(10), this, "Shortened name for the phenotype. This is used in table columns where space is an issue.");

    /**
     * The column <code>germinate_db.phenotypes.description</code>. Full
     * description of the phenotype. This should contain enough infomation to
     * accurately identify the phenoytpe and how it was recorded.
     */
    public final TableField<PhenotypesRecord, String> DESCRIPTION = createField(DSL.name("description"), SQLDataType.CLOB, this, "Full description of the phenotype. This should contain enough infomation to accurately identify the phenoytpe and how it was recorded.");

    /**
     * The column <code>germinate_db.phenotypes.datatype</code>. Defines the
     * data type of the phenotype. This can be of numeric, text, date or
     * categorical types.
     */
    public final TableField<PhenotypesRecord, PhenotypesDatatype> DATATYPE = createField(DSL.name("datatype"), SQLDataType.VARCHAR(11).nullable(false).defaultValue(DSL.inline("text", SQLDataType.VARCHAR)).asEnumDataType(jhi.germinate.server.database.codegen.enums.PhenotypesDatatype.class), this, "Defines the data type of the phenotype. This can be of numeric, text, date or categorical types.");

    /**
     * The column <code>germinate_db.phenotypes.restrictions</code>. A json
     * object describing the restrictions placed on this trait. It is an object
     * containing a field called "categories" which is an array of arrays, each
     * describing a categorical scale. Each scale must have the same length as
     * they describe the same categories just using different terms or numbers.
     * The other fields are "min" and "max" to specify upper and lower limits
     * for numeric traits.
     */
    public final TableField<PhenotypesRecord, TraitRestrictions> RESTRICTIONS = createField(DSL.name("restrictions"), SQLDataType.JSON, this, "A json object describing the restrictions placed on this trait. It is an object containing a field called \"categories\" which is an array of arrays, each describing a categorical scale. Each scale must have the same length as they describe the same categories just using different terms or numbers. The other fields are \"min\" and \"max\" to specify upper and lower limits for numeric traits.", new TraitRestrictionBinding());

    /**
     * The column <code>germinate_db.phenotypes.unit_id</code>. Foreign Key to
     * units (units.id).
     */
    public final TableField<PhenotypesRecord, Integer> UNIT_ID = createField(DSL.name("unit_id"), SQLDataType.INTEGER, this, "Foreign Key to units (units.id).");

    /**
     * The column <code>germinate_db.phenotypes.category_id</code>. Foreign key
     * to phenotypecategories (phenotypecategories.id)
     */
    public final TableField<PhenotypesRecord, Integer> CATEGORY_ID = createField(DSL.name("category_id"), SQLDataType.INTEGER, this, "Foreign key to phenotypecategories (phenotypecategories.id)");

    /**
     * The column <code>germinate_db.phenotypes.setsize</code>. The number of
     * individual measurements that should be taken for this trait.
     */
    public final TableField<PhenotypesRecord, Integer> SETSIZE = createField(DSL.name("setsize"), SQLDataType.INTEGER, this, "The number of individual measurements that should be taken for this trait.");

    /**
     * The column <code>germinate_db.phenotypes.is_timeseries</code>. Determines
     * whether this trait is a time-series trait or not.
     */
    public final TableField<PhenotypesRecord, Boolean> IS_TIMESERIES = createField(DSL.name("is_timeseries"), SQLDataType.BOOLEAN.nullable(false).defaultValue(DSL.inline("1", SQLDataType.BOOLEAN)), this, "Determines whether this trait is a time-series trait or not.");

    /**
     * The column <code>germinate_db.phenotypes.created_on</code>. When the
     * record was created.
     */
    public final TableField<PhenotypesRecord, Timestamp> CREATED_ON = createField(DSL.name("created_on"), SQLDataType.TIMESTAMP(0).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.TIMESTAMP)), this, "When the record was created.");

    /**
     * The column <code>germinate_db.phenotypes.updated_on</code>. When the
     * record was updated. This may be different from the created on date if
     * changes have been made subsequently to the underlying record.
     */
    public final TableField<PhenotypesRecord, Timestamp> UPDATED_ON = createField(DSL.name("updated_on"), SQLDataType.TIMESTAMP(0).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.TIMESTAMP)), this, "When the record was updated. This may be different from the created on date if changes have been made subsequently to the underlying record.");

    private Phenotypes(Name alias, Table<PhenotypesRecord> aliased) {
        this(alias, aliased, null);
    }

    private Phenotypes(Name alias, Table<PhenotypesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Defines phenoytpes which are held in Germinate."), TableOptions.table());
    }

    /**
     * Create an aliased <code>germinate_db.phenotypes</code> table reference
     */
    public Phenotypes(String alias) {
        this(DSL.name(alias), PHENOTYPES);
    }

    /**
     * Create an aliased <code>germinate_db.phenotypes</code> table reference
     */
    public Phenotypes(Name alias) {
        this(alias, PHENOTYPES);
    }

    /**
     * Create a <code>germinate_db.phenotypes</code> table reference
     */
    public Phenotypes() {
        this(DSL.name("phenotypes"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : GerminateDb.GERMINATE_DB;
    }

    @Override
    public Identity<PhenotypesRecord, Integer> getIdentity() {
        return (Identity<PhenotypesRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<PhenotypesRecord> getPrimaryKey() {
        return Internal.createUniqueKey(Phenotypes.PHENOTYPES, DSL.name("KEY_phenotypes_PRIMARY"), new TableField[] { Phenotypes.PHENOTYPES.ID }, true);
    }

    @Override
    public Phenotypes as(String alias) {
        return new Phenotypes(DSL.name(alias), this);
    }

    @Override
    public Phenotypes as(Name alias) {
        return new Phenotypes(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Phenotypes rename(String name) {
        return new Phenotypes(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Phenotypes rename(Name name) {
        return new Phenotypes(name, null);
    }

    // -------------------------------------------------------------------------
    // Row12 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row12<Integer, String, String, String, PhenotypesDatatype, TraitRestrictions, Integer, Integer, Integer, Boolean, Timestamp, Timestamp> fieldsRow() {
        return (Row12) super.fieldsRow();
    }
    // @formatter:on
}
