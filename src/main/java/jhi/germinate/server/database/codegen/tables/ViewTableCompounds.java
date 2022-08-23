/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables;


import jhi.germinate.server.database.binding.SynonymBinding;
import jhi.germinate.server.database.codegen.GerminateDb;
import jhi.germinate.server.database.codegen.tables.records.ViewTableCompoundsRecord;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Row9;
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
public class ViewTableCompounds extends TableImpl<ViewTableCompoundsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>germinate_db.view_table_compounds</code>
     */
    public static final ViewTableCompounds VIEW_TABLE_COMPOUNDS = new ViewTableCompounds();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ViewTableCompoundsRecord> getRecordType() {
        return ViewTableCompoundsRecord.class;
    }

    /**
     * The column <code>germinate_db.view_table_compounds.compound_id</code>.
     * Primary id for this table. This uniquely identifies the row.
     */
    public final TableField<ViewTableCompoundsRecord, Integer> COMPOUND_ID = createField(DSL.name("compound_id"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "Primary id for this table. This uniquely identifies the row.");

    /**
     * The column <code>germinate_db.view_table_compounds.compound_name</code>.
     * Compound full name.
     */
    public final TableField<ViewTableCompoundsRecord, String> COMPOUND_NAME = createField(DSL.name("compound_name"), SQLDataType.VARCHAR(255).nullable(false), this, "Compound full name.");

    /**
     * The column
     * <code>germinate_db.view_table_compounds.compound_description</code>. Full
     * description of the compound. This should contain enough infomation to
     * accurately identify the compound and how it was recorded.
     */
    public final TableField<ViewTableCompoundsRecord, String> COMPOUND_DESCRIPTION = createField(DSL.name("compound_description"), SQLDataType.VARCHAR(255), this, "Full description of the compound. This should contain enough infomation to accurately identify the compound and how it was recorded.");

    /**
     * The column <code>germinate_db.view_table_compounds.unit_id</code>.
     * Primary id for this table. This uniquely identifies the row.
     */
    public final TableField<ViewTableCompoundsRecord, Integer> UNIT_ID = createField(DSL.name("unit_id"), SQLDataType.INTEGER.defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "Primary id for this table. This uniquely identifies the row.");

    /**
     * The column <code>germinate_db.view_table_compounds.unit_name</code>. The
     * name of the unit. This should be the name of the unit in full.
     */
    public final TableField<ViewTableCompoundsRecord, String> UNIT_NAME = createField(DSL.name("unit_name"), SQLDataType.VARCHAR(255).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "The name of the unit. This should be the name of the unit in full.");

    /**
     * The column
     * <code>germinate_db.view_table_compounds.unit_description</code>. A
     * description of the unit. If the unit is not a standard SI unit then it is
     * beneficial to have a description which explains what the unit it, how it
     * is derived and any other information which would help identifiy it.
     */
    public final TableField<ViewTableCompoundsRecord, String> UNIT_DESCRIPTION = createField(DSL.name("unit_description"), SQLDataType.CLOB, this, "A description of the unit. If the unit is not a standard SI unit then it is beneficial to have a description which explains what the unit it, how it is derived and any other information which would help identifiy it.");

    /**
     * The column
     * <code>germinate_db.view_table_compounds.unit_abbreviation</code>. This
     * should be the unit abbreviation.
     */
    public final TableField<ViewTableCompoundsRecord, String> UNIT_ABBREVIATION = createField(DSL.name("unit_abbreviation"), SQLDataType.CHAR(10), this, "This should be the unit abbreviation.");

    /**
     * The column <code>germinate_db.view_table_compounds.synonyms</code>. The
     * synonyms as a json array.
     */
    public final TableField<ViewTableCompoundsRecord, String[]> SYNONYMS = createField(DSL.name("synonyms"), SQLDataType.JSON, this, "The synonyms as a json array.", new SynonymBinding());

    /**
     * The column <code>germinate_db.view_table_compounds.count</code>.
     */
    public final TableField<ViewTableCompoundsRecord, Long> COUNT = createField(DSL.name("count"), SQLDataType.BIGINT, this, "");

    private ViewTableCompounds(Name alias, Table<ViewTableCompoundsRecord> aliased) {
        this(alias, aliased, null);
    }

    private ViewTableCompounds(Name alias, Table<ViewTableCompoundsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"), TableOptions.view("create view `view_table_compounds` as select `germinate_template_4_22_08_23`.`compounds`.`id` AS `compound_id`,`germinate_template_4_22_08_23`.`compounds`.`name` AS `compound_name`,`germinate_template_4_22_08_23`.`compounds`.`description` AS `compound_description`,`germinate_template_4_22_08_23`.`units`.`id` AS `unit_id`,`germinate_template_4_22_08_23`.`units`.`unit_name` AS `unit_name`,`germinate_template_4_22_08_23`.`units`.`unit_description` AS `unit_description`,`germinate_template_4_22_08_23`.`units`.`unit_abbreviation` AS `unit_abbreviation`,`germinate_template_4_22_08_23`.`synonyms`.`synonyms` AS `synonyms`,(select count(1) from `germinate_template_4_22_08_23`.`compounddata` where (`germinate_template_4_22_08_23`.`compounddata`.`compound_id` = `germinate_template_4_22_08_23`.`compounds`.`id`)) AS `count` from ((`germinate_template_4_22_08_23`.`compounds` left join `germinate_template_4_22_08_23`.`units` on((`germinate_template_4_22_08_23`.`units`.`id` = `germinate_template_4_22_08_23`.`compounds`.`unit_id`))) left join `germinate_template_4_22_08_23`.`synonyms` on(((`germinate_template_4_22_08_23`.`synonyms`.`foreign_id` = `germinate_template_4_22_08_23`.`compounds`.`id`) and (`germinate_template_4_22_08_23`.`synonyms`.`synonymtype_id` = 3)))) group by `germinate_template_4_22_08_23`.`compounds`.`id`,`germinate_template_4_22_08_23`.`synonyms`.`id`"));
    }

    /**
     * Create an aliased <code>germinate_db.view_table_compounds</code> table
     * reference
     */
    public ViewTableCompounds(String alias) {
        this(DSL.name(alias), VIEW_TABLE_COMPOUNDS);
    }

    /**
     * Create an aliased <code>germinate_db.view_table_compounds</code> table
     * reference
     */
    public ViewTableCompounds(Name alias) {
        this(alias, VIEW_TABLE_COMPOUNDS);
    }

    /**
     * Create a <code>germinate_db.view_table_compounds</code> table reference
     */
    public ViewTableCompounds() {
        this(DSL.name("view_table_compounds"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : GerminateDb.GERMINATE_DB;
    }

    @Override
    public ViewTableCompounds as(String alias) {
        return new ViewTableCompounds(DSL.name(alias), this);
    }

    @Override
    public ViewTableCompounds as(Name alias) {
        return new ViewTableCompounds(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewTableCompounds rename(String name) {
        return new ViewTableCompounds(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewTableCompounds rename(Name name) {
        return new ViewTableCompounds(name, null);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row9<Integer, String, String, Integer, String, String, String, String[], Long> fieldsRow() {
        return (Row9) super.fieldsRow();
    }
    // @formatter:on
}
