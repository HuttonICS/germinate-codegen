/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables;


import jhi.germinate.server.database.binding.IntArrayBinding;
import jhi.germinate.server.database.binding.SynonymBinding;
import jhi.germinate.server.database.binding.TraitRestrictionBinding;
import jhi.germinate.server.database.codegen.GerminateDb;
import jhi.germinate.server.database.codegen.enums.ViewTableTraitsDataType;
import jhi.germinate.server.database.codegen.tables.records.ViewTableTraitsRecord;
import jhi.germinate.server.database.pojo.TraitRestrictions;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Row18;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


// @formatter:off
/**
 * VIEW
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ViewTableTraits extends TableImpl<ViewTableTraitsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>germinate_db.view_table_traits</code>
     */
    public static final ViewTableTraits VIEW_TABLE_TRAITS = new ViewTableTraits();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ViewTableTraitsRecord> getRecordType() {
        return ViewTableTraitsRecord.class;
    }

    /**
     * The column <code>germinate_db.view_table_traits.trait_id</code>. Primary
     * id for this table. This uniquely identifies the row.
     */
    public final TableField<ViewTableTraitsRecord, Integer> TRAIT_ID = createField(DSL.name("trait_id"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "Primary id for this table. This uniquely identifies the row.");

    /**
     * The column <code>germinate_db.view_table_traits.trait_name</code>.
     * Phenotype full name.
     */
    public final TableField<ViewTableTraitsRecord, String> TRAIT_NAME = createField(DSL.name("trait_name"), SQLDataType.VARCHAR(255).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "Phenotype full name.");

    /**
     * The column <code>germinate_db.view_table_traits.trait_name_short</code>.
     * Shortened name for the phenotype. This is used in table columns where
     * space is an issue.
     */
    public final TableField<ViewTableTraitsRecord, String> TRAIT_NAME_SHORT = createField(DSL.name("trait_name_short"), SQLDataType.CHAR(10), this, "Shortened name for the phenotype. This is used in table columns where space is an issue.");

    /**
     * The column <code>germinate_db.view_table_traits.trait_description</code>.
     * Full description of the phenotype. This should contain enough infomation
     * to accurately identify the phenoytpe and how it was recorded.
     */
    public final TableField<ViewTableTraitsRecord, String> TRAIT_DESCRIPTION = createField(DSL.name("trait_description"), SQLDataType.CLOB, this, "Full description of the phenotype. This should contain enough infomation to accurately identify the phenoytpe and how it was recorded.");

    /**
     * The column <code>germinate_db.view_table_traits.data_type</code>. Defines
     * the data type of the phenotype. This can be of numeric, text, date or
     * categorical types.
     */
    public final TableField<ViewTableTraitsRecord, ViewTableTraitsDataType> DATA_TYPE = createField(DSL.name("data_type"), SQLDataType.VARCHAR(11).nullable(false).defaultValue(DSL.inline("text", SQLDataType.VARCHAR)).asEnumDataType(jhi.germinate.server.database.codegen.enums.ViewTableTraitsDataType.class), this, "Defines the data type of the phenotype. This can be of numeric, text, date or categorical types.");

    /**
     * The column
     * <code>germinate_db.view_table_traits.trait_restrictions</code>. A json
     * object describing the restrictions placed on this trait. It is an object
     * containing a field called "categories" which is an array of arrays, each
     * describing a categorical scale. Each scale must have the same length as
     * they describe the same categories just using different terms or numbers.
     * The other fields are "min" and "max" to specify upper and lower limits
     * for numeric traits.
     */
    public final TableField<ViewTableTraitsRecord, TraitRestrictions> TRAIT_RESTRICTIONS = createField(DSL.name("trait_restrictions"), SQLDataType.JSON, this, "A json object describing the restrictions placed on this trait. It is an object containing a field called \"categories\" which is an array of arrays, each describing a categorical scale. Each scale must have the same length as they describe the same categories just using different terms or numbers. The other fields are \"min\" and \"max\" to specify upper and lower limits for numeric traits.", new TraitRestrictionBinding());

    /**
     * The column <code>germinate_db.view_table_traits.trait_set_size</code>.
     * The number of individual measurements that should be taken for this
     * trait.
     */
    public final TableField<ViewTableTraitsRecord, Integer> TRAIT_SET_SIZE = createField(DSL.name("trait_set_size"), SQLDataType.INTEGER, this, "The number of individual measurements that should be taken for this trait.");

    /**
     * The column
     * <code>germinate_db.view_table_traits.trait_is_timeseries</code>.
     * Determines whether this trait is a time-series trait or not.
     */
    public final TableField<ViewTableTraitsRecord, Boolean> TRAIT_IS_TIMESERIES = createField(DSL.name("trait_is_timeseries"), SQLDataType.BOOLEAN.nullable(false).defaultValue(DSL.inline("1", SQLDataType.BOOLEAN)), this, "Determines whether this trait is a time-series trait or not.");

    /**
     * The column <code>germinate_db.view_table_traits.category_id</code>.
     */
    public final TableField<ViewTableTraitsRecord, Integer> CATEGORY_ID = createField(DSL.name("category_id"), SQLDataType.INTEGER.defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>germinate_db.view_table_traits.category_name</code>.
     */
    public final TableField<ViewTableTraitsRecord, String> CATEGORY_NAME = createField(DSL.name("category_name"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column
     * <code>germinate_db.view_table_traits.category_description</code>.
     */
    public final TableField<ViewTableTraitsRecord, String> CATEGORY_DESCRIPTION = createField(DSL.name("category_description"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>germinate_db.view_table_traits.unit_id</code>. Primary
     * id for this table. This uniquely identifies the row.
     */
    public final TableField<ViewTableTraitsRecord, Integer> UNIT_ID = createField(DSL.name("unit_id"), SQLDataType.INTEGER.defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "Primary id for this table. This uniquely identifies the row.");

    /**
     * The column <code>germinate_db.view_table_traits.unit_name</code>. The
     * name of the unit. This should be the name of the unit in full.
     */
    public final TableField<ViewTableTraitsRecord, String> UNIT_NAME = createField(DSL.name("unit_name"), SQLDataType.VARCHAR(255).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "The name of the unit. This should be the name of the unit in full.");

    /**
     * The column <code>germinate_db.view_table_traits.unit_description</code>.
     * A description of the unit. If the unit is not a standard SI unit then it
     * is beneficial to have a description which explains what the unit it, how
     * it is derived and any other information which would help identifiy it.
     */
    public final TableField<ViewTableTraitsRecord, String> UNIT_DESCRIPTION = createField(DSL.name("unit_description"), SQLDataType.CLOB, this, "A description of the unit. If the unit is not a standard SI unit then it is beneficial to have a description which explains what the unit it, how it is derived and any other information which would help identifiy it.");

    /**
     * The column <code>germinate_db.view_table_traits.unit_abbreviation</code>.
     * This should be the unit abbreviation.
     */
    public final TableField<ViewTableTraitsRecord, String> UNIT_ABBREVIATION = createField(DSL.name("unit_abbreviation"), SQLDataType.CHAR(10), this, "This should be the unit abbreviation.");

    /**
     * The column <code>germinate_db.view_table_traits.synonyms</code>. The
     * synonyms as a json array.
     */
    public final TableField<ViewTableTraitsRecord, String[]> SYNONYMS = createField(DSL.name("synonyms"), SQLDataType.JSON, this, "The synonyms as a json array.", new SynonymBinding());

    /**
     * The column <code>germinate_db.view_table_traits.dataset_ids</code>.
     */
    public final TableField<ViewTableTraitsRecord, Integer[]> DATASET_IDS = createField(DSL.name("dataset_ids"), SQLDataType.JSON, this, "", new IntArrayBinding());

    /**
     * The column <code>germinate_db.view_table_traits.count</code>.
     */
    public final TableField<ViewTableTraitsRecord, Long> COUNT = createField(DSL.name("count"), SQLDataType.BIGINT, this, "");

    private ViewTableTraits(Name alias, Table<ViewTableTraitsRecord> aliased) {
        this(alias, aliased, null);
    }

    private ViewTableTraits(Name alias, Table<ViewTableTraitsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"), TableOptions.view("create view `view_table_traits` as select distinct `germinate_template_4_25_01_23`.`phenotypes`.`id` AS `trait_id`,`germinate_template_4_25_01_23`.`phenotypes`.`name` AS `trait_name`,`germinate_template_4_25_01_23`.`phenotypes`.`short_name` AS `trait_name_short`,`germinate_template_4_25_01_23`.`phenotypes`.`description` AS `trait_description`,`germinate_template_4_25_01_23`.`phenotypes`.`datatype` AS `data_type`,`germinate_template_4_25_01_23`.`phenotypes`.`restrictions` AS `trait_restrictions`,`germinate_template_4_25_01_23`.`phenotypes`.`setsize` AS `trait_set_size`,`germinate_template_4_25_01_23`.`phenotypes`.`is_timeseries` AS `trait_is_timeseries`,`germinate_template_4_25_01_23`.`phenotypecategories`.`id` AS `category_id`,`germinate_template_4_25_01_23`.`phenotypecategories`.`name` AS `category_name`,`germinate_template_4_25_01_23`.`phenotypecategories`.`description` AS `category_description`,`germinate_template_4_25_01_23`.`units`.`id` AS `unit_id`,`germinate_template_4_25_01_23`.`units`.`unit_name` AS `unit_name`,`germinate_template_4_25_01_23`.`units`.`unit_description` AS `unit_description`,`germinate_template_4_25_01_23`.`units`.`unit_abbreviation` AS `unit_abbreviation`,`germinate_template_4_25_01_23`.`synonyms`.`synonyms` AS `synonyms`,(select cast(concat('[',(select group_concat(distinct `germinate_template_4_25_01_23`.`trialsetup`.`dataset_id` separator ',') from (`germinate_template_4_25_01_23`.`phenotypedata` left join `germinate_template_4_25_01_23`.`trialsetup` on((`germinate_template_4_25_01_23`.`trialsetup`.`id` = `germinate_template_4_25_01_23`.`phenotypedata`.`trialsetup_id`))) where (`germinate_template_4_25_01_23`.`phenotypedata`.`phenotype_id` = `germinate_template_4_25_01_23`.`phenotypes`.`id`)),']') as json)) AS `dataset_ids`,(select count(1) from `germinate_template_4_25_01_23`.`phenotypedata` where (`germinate_template_4_25_01_23`.`phenotypedata`.`phenotype_id` = `germinate_template_4_25_01_23`.`phenotypes`.`id`)) AS `count` from (((`germinate_template_4_25_01_23`.`phenotypes` left join `germinate_template_4_25_01_23`.`units` on((`germinate_template_4_25_01_23`.`units`.`id` = `germinate_template_4_25_01_23`.`phenotypes`.`unit_id`))) left join `germinate_template_4_25_01_23`.`phenotypecategories` on((`germinate_template_4_25_01_23`.`phenotypecategories`.`id` = `germinate_template_4_25_01_23`.`phenotypes`.`category_id`))) left join `germinate_template_4_25_01_23`.`synonyms` on(((`germinate_template_4_25_01_23`.`synonyms`.`foreign_id` = `germinate_template_4_25_01_23`.`phenotypes`.`id`) and (`germinate_template_4_25_01_23`.`synonyms`.`synonymtype_id` = 4)))) group by `germinate_template_4_25_01_23`.`phenotypes`.`id`,`germinate_template_4_25_01_23`.`synonyms`.`id`"));
    }

    /**
     * Create an aliased <code>germinate_db.view_table_traits</code> table
     * reference
     */
    public ViewTableTraits(String alias) {
        this(DSL.name(alias), VIEW_TABLE_TRAITS);
    }

    /**
     * Create an aliased <code>germinate_db.view_table_traits</code> table
     * reference
     */
    public ViewTableTraits(Name alias) {
        this(alias, VIEW_TABLE_TRAITS);
    }

    /**
     * Create a <code>germinate_db.view_table_traits</code> table reference
     */
    public ViewTableTraits() {
        this(DSL.name("view_table_traits"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : GerminateDb.GERMINATE_DB;
    }

    @Override
    public ViewTableTraits as(String alias) {
        return new ViewTableTraits(DSL.name(alias), this);
    }

    @Override
    public ViewTableTraits as(Name alias) {
        return new ViewTableTraits(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewTableTraits rename(String name) {
        return new ViewTableTraits(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewTableTraits rename(Name name) {
        return new ViewTableTraits(name, null);
    }

    // -------------------------------------------------------------------------
    // Row18 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row18<Integer, String, String, String, ViewTableTraitsDataType, TraitRestrictions, Integer, Boolean, Integer, String, String, Integer, String, String, String, String[], Integer[], Long> fieldsRow() {
        return (Row18) super.fieldsRow();
    }
    // @formatter:on
}
