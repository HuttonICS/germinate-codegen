/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables;


import java.sql.Timestamp;

import jhi.germinate.server.database.codegen.GerminateDb;
import jhi.germinate.server.database.codegen.enums.ViewTableTraitAttributesAttributeType;
import jhi.germinate.server.database.codegen.tables.records.ViewTableTraitAttributesRecord;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Row11;
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
public class ViewTableTraitAttributes extends TableImpl<ViewTableTraitAttributesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>germinate_db.view_table_trait_attributes</code>
     */
    public static final ViewTableTraitAttributes VIEW_TABLE_TRAIT_ATTRIBUTES = new ViewTableTraitAttributes();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ViewTableTraitAttributesRecord> getRecordType() {
        return ViewTableTraitAttributesRecord.class;
    }

    /**
     * The column
     * <code>germinate_db.view_table_trait_attributes.attribute_value_id</code>.
     * Primary id for this table. This uniquely identifies the row.
     */
    public final TableField<ViewTableTraitAttributesRecord, Integer> ATTRIBUTE_VALUE_ID = createField(DSL.name("attribute_value_id"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "Primary id for this table. This uniquely identifies the row.");

    /**
     * The column
     * <code>germinate_db.view_table_trait_attributes.trait_id</code>. Primary
     * id for this table. This uniquely identifies the row.
     */
    public final TableField<ViewTableTraitAttributesRecord, Integer> TRAIT_ID = createField(DSL.name("trait_id"), SQLDataType.INTEGER.defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "Primary id for this table. This uniquely identifies the row.");

    /**
     * The column
     * <code>germinate_db.view_table_trait_attributes.trait_name</code>.
     * Phenotype full name.
     */
    public final TableField<ViewTableTraitAttributesRecord, String> TRAIT_NAME = createField(DSL.name("trait_name"), SQLDataType.VARCHAR(255).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "Phenotype full name.");

    /**
     * The column
     * <code>germinate_db.view_table_trait_attributes.attribute_id</code>.
     * Primary id for this table. This uniquely identifies the row.
     */
    public final TableField<ViewTableTraitAttributesRecord, Integer> ATTRIBUTE_ID = createField(DSL.name("attribute_id"), SQLDataType.INTEGER.defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "Primary id for this table. This uniquely identifies the row.");

    /**
     * The column
     * <code>germinate_db.view_table_trait_attributes.attribute_name</code>.
     * Defines the name of the attribute.
     */
    public final TableField<ViewTableTraitAttributesRecord, String> ATTRIBUTE_NAME = createField(DSL.name("attribute_name"), SQLDataType.VARCHAR(255), this, "Defines the name of the attribute.");

    /**
     * The column
     * <code>germinate_db.view_table_trait_attributes.attribute_description</code>.
     * Describes the attribute. This should expand on the name to make it clear
     * what the attribute actually is.
     */
    public final TableField<ViewTableTraitAttributesRecord, String> ATTRIBUTE_DESCRIPTION = createField(DSL.name("attribute_description"), SQLDataType.VARCHAR(255), this, "Describes the attribute. This should expand on the name to make it clear what the attribute actually is.");

    /**
     * The column
     * <code>germinate_db.view_table_trait_attributes.attribute_type</code>.
     * Defines the data type of the attribute. This can be of numeric, text,
     * date or categorical types.
     */
    public final TableField<ViewTableTraitAttributesRecord, ViewTableTraitAttributesAttributeType> ATTRIBUTE_TYPE = createField(DSL.name("attribute_type"), SQLDataType.VARCHAR(11).defaultValue(DSL.inline("text", SQLDataType.VARCHAR)).asEnumDataType(jhi.germinate.server.database.codegen.enums.ViewTableTraitAttributesAttributeType.class), this, "Defines the data type of the attribute. This can be of numeric, text, date or categorical types.");

    /**
     * The column
     * <code>germinate_db.view_table_trait_attributes.target_table</code>.
     */
    public final TableField<ViewTableTraitAttributesRecord, String> TARGET_TABLE = createField(DSL.name("target_table"), SQLDataType.VARCHAR(255).defaultValue(DSL.inline("germinatebase", SQLDataType.VARCHAR)), this, "");

    /**
     * The column
     * <code>germinate_db.view_table_trait_attributes.foreign_id</code>. Foreign
     * key to germinatebase (germinatebase.id).
     */
    public final TableField<ViewTableTraitAttributesRecord, Integer> FOREIGN_ID = createField(DSL.name("foreign_id"), SQLDataType.INTEGER.nullable(false), this, "Foreign key to germinatebase (germinatebase.id).");

    /**
     * The column
     * <code>germinate_db.view_table_trait_attributes.created_on</code>. When
     * the record was created.
     */
    public final TableField<ViewTableTraitAttributesRecord, Timestamp> CREATED_ON = createField(DSL.name("created_on"), SQLDataType.TIMESTAMP(0), this, "When the record was created.");

    /**
     * The column
     * <code>germinate_db.view_table_trait_attributes.attribute_value</code>.
     * The value of the attribute.
     */
    public final TableField<ViewTableTraitAttributesRecord, String> ATTRIBUTE_VALUE = createField(DSL.name("attribute_value"), SQLDataType.CLOB.nullable(false), this, "The value of the attribute.");

    private ViewTableTraitAttributes(Name alias, Table<ViewTableTraitAttributesRecord> aliased) {
        this(alias, aliased, null);
    }

    private ViewTableTraitAttributes(Name alias, Table<ViewTableTraitAttributesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"), TableOptions.view("create view `view_table_trait_attributes` as select `germinate_template_4_23_01_09`.`attributedata`.`id` AS `attribute_value_id`,`germinate_template_4_23_01_09`.`phenotypes`.`id` AS `trait_id`,`germinate_template_4_23_01_09`.`phenotypes`.`name` AS `trait_name`,`germinate_template_4_23_01_09`.`attributes`.`id` AS `attribute_id`,`germinate_template_4_23_01_09`.`attributes`.`name` AS `attribute_name`,`germinate_template_4_23_01_09`.`attributes`.`description` AS `attribute_description`,`germinate_template_4_23_01_09`.`attributes`.`datatype` AS `attribute_type`,`germinate_template_4_23_01_09`.`attributes`.`target_table` AS `target_table`,`germinate_template_4_23_01_09`.`attributedata`.`foreign_id` AS `foreign_id`,`germinate_template_4_23_01_09`.`attributedata`.`created_on` AS `created_on`,`germinate_template_4_23_01_09`.`attributedata`.`value` AS `attribute_value` from ((`germinate_template_4_23_01_09`.`attributedata` left join `germinate_template_4_23_01_09`.`phenotypes` on((`germinate_template_4_23_01_09`.`attributedata`.`foreign_id` = `germinate_template_4_23_01_09`.`phenotypes`.`id`))) left join `germinate_template_4_23_01_09`.`attributes` on((`germinate_template_4_23_01_09`.`attributes`.`id` = `germinate_template_4_23_01_09`.`attributedata`.`attribute_id`))) where (`germinate_template_4_23_01_09`.`attributes`.`target_table` = 'phenotypes')"));
    }

    /**
     * Create an aliased <code>germinate_db.view_table_trait_attributes</code>
     * table reference
     */
    public ViewTableTraitAttributes(String alias) {
        this(DSL.name(alias), VIEW_TABLE_TRAIT_ATTRIBUTES);
    }

    /**
     * Create an aliased <code>germinate_db.view_table_trait_attributes</code>
     * table reference
     */
    public ViewTableTraitAttributes(Name alias) {
        this(alias, VIEW_TABLE_TRAIT_ATTRIBUTES);
    }

    /**
     * Create a <code>germinate_db.view_table_trait_attributes</code> table
     * reference
     */
    public ViewTableTraitAttributes() {
        this(DSL.name("view_table_trait_attributes"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : GerminateDb.GERMINATE_DB;
    }

    @Override
    public ViewTableTraitAttributes as(String alias) {
        return new ViewTableTraitAttributes(DSL.name(alias), this);
    }

    @Override
    public ViewTableTraitAttributes as(Name alias) {
        return new ViewTableTraitAttributes(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewTableTraitAttributes rename(String name) {
        return new ViewTableTraitAttributes(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewTableTraitAttributes rename(Name name) {
        return new ViewTableTraitAttributes(name, null);
    }

    // -------------------------------------------------------------------------
    // Row11 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row11<Integer, Integer, String, Integer, String, String, ViewTableTraitAttributesAttributeType, String, Integer, Timestamp, String> fieldsRow() {
        return (Row11) super.fieldsRow();
    }
    // @formatter:on
}