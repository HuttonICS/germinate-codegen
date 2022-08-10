/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables;


import jhi.germinate.server.database.codegen.GerminateDb;
import jhi.germinate.server.database.codegen.enums.ViewTablePedigreesRelationshipType;
import jhi.germinate.server.database.codegen.tables.records.ViewTablePedigreesRecord;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Row14;
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
public class ViewTablePedigrees extends TableImpl<ViewTablePedigreesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>germinate_db.view_table_pedigrees</code>
     */
    public static final ViewTablePedigrees VIEW_TABLE_PEDIGREES = new ViewTablePedigrees();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ViewTablePedigreesRecord> getRecordType() {
        return ViewTablePedigreesRecord.class;
    }

    /**
     * The column <code>germinate_db.view_table_pedigrees.parent_id</code>.
     * Primary id for this table. This uniquely identifies the row.
     */
    public final TableField<ViewTablePedigreesRecord, Integer> PARENT_ID = createField(DSL.name("parent_id"), SQLDataType.INTEGER.defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "Primary id for this table. This uniquely identifies the row.");

    /**
     * The column <code>germinate_db.view_table_pedigrees.parent_gid</code>. A
     * unique identifier.
     */
    public final TableField<ViewTablePedigreesRecord, String> PARENT_GID = createField(DSL.name("parent_gid"), SQLDataType.VARCHAR(255), this, "A unique identifier.");

    /**
     * The column <code>germinate_db.view_table_pedigrees.parent_name</code>. A
     * unique name which defines an entry in the germinatbase table.
     */
    public final TableField<ViewTablePedigreesRecord, String> PARENT_NAME = createField(DSL.name("parent_name"), SQLDataType.VARCHAR(255), this, "A unique name which defines an entry in the germinatbase table.");

    /**
     * The column <code>germinate_db.view_table_pedigrees.child_id</code>.
     * Primary id for this table. This uniquely identifies the row.
     */
    public final TableField<ViewTablePedigreesRecord, Integer> CHILD_ID = createField(DSL.name("child_id"), SQLDataType.INTEGER.defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "Primary id for this table. This uniquely identifies the row.");

    /**
     * The column <code>germinate_db.view_table_pedigrees.child_gid</code>. A
     * unique identifier.
     */
    public final TableField<ViewTablePedigreesRecord, String> CHILD_GID = createField(DSL.name("child_gid"), SQLDataType.VARCHAR(255), this, "A unique identifier.");

    /**
     * The column <code>germinate_db.view_table_pedigrees.child_name</code>. A
     * unique name which defines an entry in the germinatbase table.
     */
    public final TableField<ViewTablePedigreesRecord, String> CHILD_NAME = createField(DSL.name("child_name"), SQLDataType.VARCHAR(255), this, "A unique name which defines an entry in the germinatbase table.");

    /**
     * The column <code>germinate_db.view_table_pedigrees.dataset_id</code>.
     * Primary id for this table. This uniquely identifies the row.
     */
    public final TableField<ViewTablePedigreesRecord, Integer> DATASET_ID = createField(DSL.name("dataset_id"), SQLDataType.INTEGER.defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "Primary id for this table. This uniquely identifies the row.");

    /**
     * The column <code>germinate_db.view_table_pedigrees.dataset_name</code>.
     * Describes the dataset.
     */
    public final TableField<ViewTablePedigreesRecord, String> DATASET_NAME = createField(DSL.name("dataset_name"), SQLDataType.CLOB, this, "Describes the dataset.");

    /**
     * The column <code>germinate_db.view_table_pedigrees.experiment_id</code>.
     * Primary id for this table. This uniquely identifies the row.
     */
    public final TableField<ViewTablePedigreesRecord, Integer> EXPERIMENT_ID = createField(DSL.name("experiment_id"), SQLDataType.INTEGER.defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "Primary id for this table. This uniquely identifies the row.");

    /**
     * The column
     * <code>germinate_db.view_table_pedigrees.experiment_name</code>. The name
     * of the experiment.
     */
    public final TableField<ViewTablePedigreesRecord, String> EXPERIMENT_NAME = createField(DSL.name("experiment_name"), SQLDataType.VARCHAR(255), this, "The name of the experiment.");

    /**
     * The column
     * <code>germinate_db.view_table_pedigrees.relationship_type</code>. Male or
     * Female parent. Should be recorded as 'M' (male) or 'F' (female).
     */
    public final TableField<ViewTablePedigreesRecord, ViewTablePedigreesRelationshipType> RELATIONSHIP_TYPE = createField(DSL.name("relationship_type"), SQLDataType.VARCHAR(5).nullable(false).defaultValue(DSL.inline("OTHER", SQLDataType.VARCHAR)).asEnumDataType(jhi.germinate.server.database.codegen.enums.ViewTablePedigreesRelationshipType.class), this, "Male or Female parent. Should be recorded as 'M' (male) or 'F' (female).");

    /**
     * The column
     * <code>germinate_db.view_table_pedigrees.relationship_description</code>.
     * Can be used as a meta-data field to describe the relationships if a
     * complex rellationship is required. Examples may include, 'is a complex
     * cross containing', 'F4 generation' and so on. This is used by the Helium
     * pedigree visualiztion tool.
     */
    public final TableField<ViewTablePedigreesRecord, String> RELATIONSHIP_DESCRIPTION = createField(DSL.name("relationship_description"), SQLDataType.CLOB, this, "Can be used as a meta-data field to describe the relationships if a complex rellationship is required. Examples may include, 'is a complex cross containing', 'F4 generation' and so on. This is used by the Helium pedigree visualiztion tool.");

    /**
     * The column
     * <code>germinate_db.view_table_pedigrees.pedigree_description</code>. The
     * name of the pedigree.
     */
    public final TableField<ViewTablePedigreesRecord, String> PEDIGREE_DESCRIPTION = createField(DSL.name("pedigree_description"), SQLDataType.VARCHAR(255), this, "The name of the pedigree.");

    /**
     * The column
     * <code>germinate_db.view_table_pedigrees.pedigree_author</code>. Who is
     * responsible for the creation of the pedigree. Attribution should be
     * included in here for pedigree sources.
     */
    public final TableField<ViewTablePedigreesRecord, String> PEDIGREE_AUTHOR = createField(DSL.name("pedigree_author"), SQLDataType.VARCHAR(255), this, "Who is responsible for the creation of the pedigree. Attribution should be included in here for pedigree sources.");

    private ViewTablePedigrees(Name alias, Table<ViewTablePedigreesRecord> aliased) {
        this(alias, aliased, null);
    }

    private ViewTablePedigrees(Name alias, Table<ViewTablePedigreesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"), TableOptions.view("create view `view_table_pedigrees` as select `parent`.`id` AS `parent_id`,`parent`.`general_identifier` AS `parent_gid`,`parent`.`name` AS `parent_name`,`child`.`id` AS `child_id`,`child`.`general_identifier` AS `child_gid`,`child`.`name` AS `child_name`,`germinate_template_4_22_08_10`.`datasets`.`id` AS `dataset_id`,`germinate_template_4_22_08_10`.`datasets`.`name` AS `dataset_name`,`germinate_template_4_22_08_10`.`experiments`.`id` AS `experiment_id`,`germinate_template_4_22_08_10`.`experiments`.`experiment_name` AS `experiment_name`,`germinate_template_4_22_08_10`.`pedigrees`.`relationship_type` AS `relationship_type`,`germinate_template_4_22_08_10`.`pedigrees`.`relationship_description` AS `relationship_description`,`germinate_template_4_22_08_10`.`pedigreedescriptions`.`name` AS `pedigree_description`,`germinate_template_4_22_08_10`.`pedigreedescriptions`.`author` AS `pedigree_author` from (((((`germinate_template_4_22_08_10`.`pedigrees` left join `germinate_template_4_22_08_10`.`germinatebase` `parent` on((`parent`.`id` = `germinate_template_4_22_08_10`.`pedigrees`.`parent_id`))) left join `germinate_template_4_22_08_10`.`germinatebase` `child` on((`child`.`id` = `germinate_template_4_22_08_10`.`pedigrees`.`germinatebase_id`))) left join `germinate_template_4_22_08_10`.`pedigreedescriptions` on((`germinate_template_4_22_08_10`.`pedigreedescriptions`.`id` = `germinate_template_4_22_08_10`.`pedigrees`.`pedigreedescription_id`))) left join `germinate_template_4_22_08_10`.`datasets` on((`germinate_template_4_22_08_10`.`datasets`.`id` = `germinate_template_4_22_08_10`.`pedigrees`.`dataset_id`))) left join `germinate_template_4_22_08_10`.`experiments` on((`germinate_template_4_22_08_10`.`experiments`.`id` = `germinate_template_4_22_08_10`.`datasets`.`experiment_id`)))"));
    }

    /**
     * Create an aliased <code>germinate_db.view_table_pedigrees</code> table
     * reference
     */
    public ViewTablePedigrees(String alias) {
        this(DSL.name(alias), VIEW_TABLE_PEDIGREES);
    }

    /**
     * Create an aliased <code>germinate_db.view_table_pedigrees</code> table
     * reference
     */
    public ViewTablePedigrees(Name alias) {
        this(alias, VIEW_TABLE_PEDIGREES);
    }

    /**
     * Create a <code>germinate_db.view_table_pedigrees</code> table reference
     */
    public ViewTablePedigrees() {
        this(DSL.name("view_table_pedigrees"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : GerminateDb.GERMINATE_DB;
    }

    @Override
    public ViewTablePedigrees as(String alias) {
        return new ViewTablePedigrees(DSL.name(alias), this);
    }

    @Override
    public ViewTablePedigrees as(Name alias) {
        return new ViewTablePedigrees(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewTablePedigrees rename(String name) {
        return new ViewTablePedigrees(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewTablePedigrees rename(Name name) {
        return new ViewTablePedigrees(name, null);
    }

    // -------------------------------------------------------------------------
    // Row14 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row14<Integer, String, String, Integer, String, String, Integer, String, Integer, String, ViewTablePedigreesRelationshipType, String, String, String> fieldsRow() {
        return (Row14) super.fieldsRow();
    }
    // @formatter:on
}
