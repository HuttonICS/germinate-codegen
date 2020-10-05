/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import jhi.germinate.server.database.codegen.enums.PhenotypesDatatype;
import jhi.germinate.server.database.codegen.tables.Phenotypes;
import jhi.germinate.server.database.pojo.TraitRestrictions;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;


// @formatter:off
/**
 * Defines phenoytpes which are held in Germinate.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PhenotypesRecord extends UpdatableRecordImpl<PhenotypesRecord> implements Record9<Integer, String, String, String, PhenotypesDatatype, TraitRestrictions, Integer, Timestamp, Timestamp> {

    private static final long serialVersionUID = 1580681489;

    /**
     * Setter for <code>germinate_db.phenotypes.id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>germinate_db.phenotypes.id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>germinate_db.phenotypes.name</code>. Phenotype full name.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>germinate_db.phenotypes.name</code>. Phenotype full name.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>germinate_db.phenotypes.short_name</code>. Shortened name for the phenotype. This is used in table columns where space is an issue.
     */
    public void setShortName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>germinate_db.phenotypes.short_name</code>. Shortened name for the phenotype. This is used in table columns where space is an issue.
     */
    public String getShortName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>germinate_db.phenotypes.description</code>. Full description of the phenotype. This should contain enough infomation to accurately identify the phenoytpe and how it was recorded.
     */
    public void setDescription(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>germinate_db.phenotypes.description</code>. Full description of the phenotype. This should contain enough infomation to accurately identify the phenoytpe and how it was recorded.
     */
    public String getDescription() {
        return (String) get(3);
    }

    /**
     * Setter for <code>germinate_db.phenotypes.datatype</code>. Defines the data type of the phenotype. This can be of numeric, text, date or categorical types.
     */
    public void setDatatype(PhenotypesDatatype value) {
        set(4, value);
    }

    /**
     * Getter for <code>germinate_db.phenotypes.datatype</code>. Defines the data type of the phenotype. This can be of numeric, text, date or categorical types.
     */
    public PhenotypesDatatype getDatatype() {
        return (PhenotypesDatatype) get(4);
    }

    /**
     * Setter for <code>germinate_db.phenotypes.restrictions</code>. A json object describing the restrictions placed on this trait. It is an object containing a field called "categories" which is an array of arrays, each describing a categorical scale. Each scale must have the same length as they describe the same categories just using different terms or numbers. The other fields are "min" and "max" to specify upper and lower limits for numeric traits.
     */
    public void setRestrictions(TraitRestrictions value) {
        set(5, value);
    }

    /**
     * Getter for <code>germinate_db.phenotypes.restrictions</code>. A json object describing the restrictions placed on this trait. It is an object containing a field called "categories" which is an array of arrays, each describing a categorical scale. Each scale must have the same length as they describe the same categories just using different terms or numbers. The other fields are "min" and "max" to specify upper and lower limits for numeric traits.
     */
    public TraitRestrictions getRestrictions() {
        return (TraitRestrictions) get(5);
    }

    /**
     * Setter for <code>germinate_db.phenotypes.unit_id</code>. Foreign Key to units (units.id).
     */
    public void setUnitId(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>germinate_db.phenotypes.unit_id</code>. Foreign Key to units (units.id).
     */
    public Integer getUnitId() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>germinate_db.phenotypes.created_on</code>. When the record was created.
     */
    public void setCreatedOn(Timestamp value) {
        set(7, value);
    }

    /**
     * Getter for <code>germinate_db.phenotypes.created_on</code>. When the record was created.
     */
    public Timestamp getCreatedOn() {
        return (Timestamp) get(7);
    }

    /**
     * Setter for <code>germinate_db.phenotypes.updated_on</code>. When the record was updated. This may be different from the created on date if changes have been made subsequently to the underlying record.
     */
    public void setUpdatedOn(Timestamp value) {
        set(8, value);
    }

    /**
     * Getter for <code>germinate_db.phenotypes.updated_on</code>. When the record was updated. This may be different from the created on date if changes have been made subsequently to the underlying record.
     */
    public Timestamp getUpdatedOn() {
        return (Timestamp) get(8);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Integer, String, String, String, PhenotypesDatatype, TraitRestrictions, Integer, Timestamp, Timestamp> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Integer, String, String, String, PhenotypesDatatype, TraitRestrictions, Integer, Timestamp, Timestamp> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Phenotypes.PHENOTYPES.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Phenotypes.PHENOTYPES.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Phenotypes.PHENOTYPES.SHORT_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Phenotypes.PHENOTYPES.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<PhenotypesDatatype> field5() {
        return Phenotypes.PHENOTYPES.DATATYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<TraitRestrictions> field6() {
        return Phenotypes.PHENOTYPES.RESTRICTIONS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return Phenotypes.PHENOTYPES.UNIT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return Phenotypes.PHENOTYPES.CREATED_ON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field9() {
        return Phenotypes.PHENOTYPES.UPDATED_ON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getShortName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PhenotypesDatatype component5() {
        return getDatatype();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TraitRestrictions component6() {
        return getRestrictions();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component7() {
        return getUnitId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component8() {
        return getCreatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component9() {
        return getUpdatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getShortName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PhenotypesDatatype value5() {
        return getDatatype();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TraitRestrictions value6() {
        return getRestrictions();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getUnitId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value8() {
        return getCreatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value9() {
        return getUpdatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PhenotypesRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PhenotypesRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PhenotypesRecord value3(String value) {
        setShortName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PhenotypesRecord value4(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PhenotypesRecord value5(PhenotypesDatatype value) {
        setDatatype(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PhenotypesRecord value6(TraitRestrictions value) {
        setRestrictions(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PhenotypesRecord value7(Integer value) {
        setUnitId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PhenotypesRecord value8(Timestamp value) {
        setCreatedOn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PhenotypesRecord value9(Timestamp value) {
        setUpdatedOn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PhenotypesRecord values(Integer value1, String value2, String value3, String value4, PhenotypesDatatype value5, TraitRestrictions value6, Integer value7, Timestamp value8, Timestamp value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PhenotypesRecord
     */
    public PhenotypesRecord() {
        super(Phenotypes.PHENOTYPES);
    }

    /**
     * Create a detached, initialised PhenotypesRecord
     */
    public PhenotypesRecord(Integer id, String name, String shortName, String description, PhenotypesDatatype datatype, TraitRestrictions restrictions, Integer unitId, Timestamp createdOn, Timestamp updatedOn) {
        super(Phenotypes.PHENOTYPES);

        set(0, id);
        set(1, name);
        set(2, shortName);
        set(3, description);
        set(4, datatype);
        set(5, restrictions);
        set(6, unitId);
        set(7, createdOn);
        set(8, updatedOn);
    }
// @formatter:on
}
