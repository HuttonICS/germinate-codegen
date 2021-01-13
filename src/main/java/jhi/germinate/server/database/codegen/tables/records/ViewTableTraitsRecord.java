/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables.records;


import com.google.gson.JsonArray;

import javax.annotation.Generated;

import jhi.germinate.server.database.codegen.enums.ViewTableTraitsDataType;
import jhi.germinate.server.database.codegen.tables.ViewTableTraits;
import jhi.germinate.server.database.pojo.TraitRestrictions;

import org.jooq.Field;
import org.jooq.Record13;
import org.jooq.Row13;
import org.jooq.impl.TableRecordImpl;


// @formatter:off
/**
 * VIEW
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ViewTableTraitsRecord extends TableRecordImpl<ViewTableTraitsRecord> implements Record13<Integer, String, String, String, ViewTableTraitsDataType, TraitRestrictions, Integer, String, String, String, JsonArray, JsonArray, Long> {

    private static final long serialVersionUID = 401654394;

    /**
     * Setter for <code>germinate_db.view_table_traits.trait_id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public void setTraitId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_traits.trait_id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public Integer getTraitId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>germinate_db.view_table_traits.trait_name</code>. Phenotype full name.
     */
    public void setTraitName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_traits.trait_name</code>. Phenotype full name.
     */
    public String getTraitName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>germinate_db.view_table_traits.trait_name_short</code>. Shortened name for the phenotype. This is used in table columns where space is an issue.
     */
    public void setTraitNameShort(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_traits.trait_name_short</code>. Shortened name for the phenotype. This is used in table columns where space is an issue.
     */
    public String getTraitNameShort() {
        return (String) get(2);
    }

    /**
     * Setter for <code>germinate_db.view_table_traits.trait_description</code>. Full description of the phenotype. This should contain enough infomation to accurately identify the phenoytpe and how it was recorded.
     */
    public void setTraitDescription(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_traits.trait_description</code>. Full description of the phenotype. This should contain enough infomation to accurately identify the phenoytpe and how it was recorded.
     */
    public String getTraitDescription() {
        return (String) get(3);
    }

    /**
     * Setter for <code>germinate_db.view_table_traits.data_type</code>. Defines the data type of the phenotype. This can be of numeric, text, date or categorical types.
     */
    public void setDataType(ViewTableTraitsDataType value) {
        set(4, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_traits.data_type</code>. Defines the data type of the phenotype. This can be of numeric, text, date or categorical types.
     */
    public ViewTableTraitsDataType getDataType() {
        return (ViewTableTraitsDataType) get(4);
    }

    /**
     * Setter for <code>germinate_db.view_table_traits.trait_restrictions</code>. A json object describing the restrictions placed on this trait. It is an object containing a field called "categories" which is an array of arrays, each describing a categorical scale. Each scale must have the same length as they describe the same categories just using different terms or numbers. The other fields are "min" and "max" to specify upper and lower limits for numeric traits.
     */
    public void setTraitRestrictions(TraitRestrictions value) {
        set(5, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_traits.trait_restrictions</code>. A json object describing the restrictions placed on this trait. It is an object containing a field called "categories" which is an array of arrays, each describing a categorical scale. Each scale must have the same length as they describe the same categories just using different terms or numbers. The other fields are "min" and "max" to specify upper and lower limits for numeric traits.
     */
    public TraitRestrictions getTraitRestrictions() {
        return (TraitRestrictions) get(5);
    }

    /**
     * Setter for <code>germinate_db.view_table_traits.unit_id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public void setUnitId(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_traits.unit_id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public Integer getUnitId() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>germinate_db.view_table_traits.unit_name</code>. The name of the unit. This should be the name of the unit in full.
     */
    public void setUnitName(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_traits.unit_name</code>. The name of the unit. This should be the name of the unit in full.
     */
    public String getUnitName() {
        return (String) get(7);
    }

    /**
     * Setter for <code>germinate_db.view_table_traits.unit_description</code>. A description of the unit. If the unit is not a standard SI unit then it is beneficial to have a description which explains what the unit it, how it is derived and any other information which would help identifiy it.
     */
    public void setUnitDescription(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_traits.unit_description</code>. A description of the unit. If the unit is not a standard SI unit then it is beneficial to have a description which explains what the unit it, how it is derived and any other information which would help identifiy it.
     */
    public String getUnitDescription() {
        return (String) get(8);
    }

    /**
     * Setter for <code>germinate_db.view_table_traits.unit_abbreviation</code>. This should be the unit abbreviation.
     */
    public void setUnitAbbreviation(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_traits.unit_abbreviation</code>. This should be the unit abbreviation.
     */
    public String getUnitAbbreviation() {
        return (String) get(9);
    }

    /**
     * Setter for <code>germinate_db.view_table_traits.synonyms</code>. The synonyms as a json array.
     */
    public void setSynonyms(JsonArray value) {
        set(10, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_traits.synonyms</code>. The synonyms as a json array.
     */
    public JsonArray getSynonyms() {
        return (JsonArray) get(10);
    }

    /**
     * Setter for <code>germinate_db.view_table_traits.dataset_ids</code>.
     */
    public void setDatasetIds(JsonArray value) {
        set(11, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_traits.dataset_ids</code>.
     */
    public JsonArray getDatasetIds() {
        return (JsonArray) get(11);
    }

    /**
     * Setter for <code>germinate_db.view_table_traits.count</code>.
     */
    public void setCount(Long value) {
        set(12, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_traits.count</code>.
     */
    public Long getCount() {
        return (Long) get(12);
    }

    // -------------------------------------------------------------------------
    // Record13 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<Integer, String, String, String, ViewTableTraitsDataType, TraitRestrictions, Integer, String, String, String, JsonArray, JsonArray, Long> fieldsRow() {
        return (Row13) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<Integer, String, String, String, ViewTableTraitsDataType, TraitRestrictions, Integer, String, String, String, JsonArray, JsonArray, Long> valuesRow() {
        return (Row13) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return ViewTableTraits.VIEW_TABLE_TRAITS.TRAIT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return ViewTableTraits.VIEW_TABLE_TRAITS.TRAIT_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return ViewTableTraits.VIEW_TABLE_TRAITS.TRAIT_NAME_SHORT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return ViewTableTraits.VIEW_TABLE_TRAITS.TRAIT_DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ViewTableTraitsDataType> field5() {
        return ViewTableTraits.VIEW_TABLE_TRAITS.DATA_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<TraitRestrictions> field6() {
        return ViewTableTraits.VIEW_TABLE_TRAITS.TRAIT_RESTRICTIONS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return ViewTableTraits.VIEW_TABLE_TRAITS.UNIT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return ViewTableTraits.VIEW_TABLE_TRAITS.UNIT_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return ViewTableTraits.VIEW_TABLE_TRAITS.UNIT_DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return ViewTableTraits.VIEW_TABLE_TRAITS.UNIT_ABBREVIATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<JsonArray> field11() {
        return ViewTableTraits.VIEW_TABLE_TRAITS.SYNONYMS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<JsonArray> field12() {
        return ViewTableTraits.VIEW_TABLE_TRAITS.DATASET_IDS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field13() {
        return ViewTableTraits.VIEW_TABLE_TRAITS.COUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getTraitId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getTraitName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getTraitNameShort();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getTraitDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableTraitsDataType component5() {
        return getDataType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TraitRestrictions component6() {
        return getTraitRestrictions();
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
    public String component8() {
        return getUnitName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getUnitDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getUnitAbbreviation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonArray component11() {
        return getSynonyms();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonArray component12() {
        return getDatasetIds();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component13() {
        return getCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getTraitId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getTraitName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getTraitNameShort();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getTraitDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableTraitsDataType value5() {
        return getDataType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TraitRestrictions value6() {
        return getTraitRestrictions();
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
    public String value8() {
        return getUnitName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getUnitDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getUnitAbbreviation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonArray value11() {
        return getSynonyms();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonArray value12() {
        return getDatasetIds();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value13() {
        return getCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableTraitsRecord value1(Integer value) {
        setTraitId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableTraitsRecord value2(String value) {
        setTraitName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableTraitsRecord value3(String value) {
        setTraitNameShort(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableTraitsRecord value4(String value) {
        setTraitDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableTraitsRecord value5(ViewTableTraitsDataType value) {
        setDataType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableTraitsRecord value6(TraitRestrictions value) {
        setTraitRestrictions(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableTraitsRecord value7(Integer value) {
        setUnitId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableTraitsRecord value8(String value) {
        setUnitName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableTraitsRecord value9(String value) {
        setUnitDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableTraitsRecord value10(String value) {
        setUnitAbbreviation(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableTraitsRecord value11(JsonArray value) {
        setSynonyms(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableTraitsRecord value12(JsonArray value) {
        setDatasetIds(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableTraitsRecord value13(Long value) {
        setCount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableTraitsRecord values(Integer value1, String value2, String value3, String value4, ViewTableTraitsDataType value5, TraitRestrictions value6, Integer value7, String value8, String value9, String value10, JsonArray value11, JsonArray value12, Long value13) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ViewTableTraitsRecord
     */
    public ViewTableTraitsRecord() {
        super(ViewTableTraits.VIEW_TABLE_TRAITS);
    }

    /**
     * Create a detached, initialised ViewTableTraitsRecord
     */
    public ViewTableTraitsRecord(Integer traitId, String traitName, String traitNameShort, String traitDescription, ViewTableTraitsDataType dataType, TraitRestrictions traitRestrictions, Integer unitId, String unitName, String unitDescription, String unitAbbreviation, JsonArray synonyms, JsonArray datasetIds, Long count) {
        super(ViewTableTraits.VIEW_TABLE_TRAITS);

        set(0, traitId);
        set(1, traitName);
        set(2, traitNameShort);
        set(3, traitDescription);
        set(4, dataType);
        set(5, traitRestrictions);
        set(6, unitId);
        set(7, unitName);
        set(8, unitDescription);
        set(9, unitAbbreviation);
        set(10, synonyms);
        set(11, datasetIds);
        set(12, count);
    }
// @formatter:on
}
