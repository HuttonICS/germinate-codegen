/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables;


import jhi.germinate.server.database.codegen.GerminateDb;
import jhi.germinate.server.database.codegen.tables.records.ViewStatsPdciRecord;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Row2;
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
public class ViewStatsPdci extends TableImpl<ViewStatsPdciRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>germinate_db.view_stats_pdci</code>
     */
    public static final ViewStatsPdci VIEW_STATS_PDCI = new ViewStatsPdci();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ViewStatsPdciRecord> getRecordType() {
        return ViewStatsPdciRecord.class;
    }

    /**
     * The column <code>germinate_db.view_stats_pdci.bin</code>.
     */
    public final TableField<ViewStatsPdciRecord, String> BIN = createField(DSL.name("bin"), SQLDataType.VARCHAR(4).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>germinate_db.view_stats_pdci.count</code>.
     */
    public final TableField<ViewStatsPdciRecord, Long> COUNT = createField(DSL.name("count"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.inline("0", SQLDataType.BIGINT)), this, "");

    private ViewStatsPdci(Name alias, Table<ViewStatsPdciRecord> aliased) {
        this(alias, aliased, null);
    }

    private ViewStatsPdci(Name alias, Table<ViewStatsPdciRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"), TableOptions.view("create view `view_stats_pdci` as select '0-1' AS `bin`,count(1) AS `count` from `germinate_template_4_24_09_04`.`germinatebase` where ((`germinate_template_4_24_09_04`.`germinatebase`.`pdci` >= 0) and (`germinate_template_4_24_09_04`.`germinatebase`.`pdci` < 1) and (`germinate_template_4_24_09_04`.`germinatebase`.`entitytype_id` = 1)) union select '1-2' AS `bin`,count(1) AS `count` from `germinate_template_4_24_09_04`.`germinatebase` where ((`germinate_template_4_24_09_04`.`germinatebase`.`pdci` >= 1) and (`germinate_template_4_24_09_04`.`germinatebase`.`pdci` < 2) and (`germinate_template_4_24_09_04`.`germinatebase`.`entitytype_id` = 1)) union select '2-3' AS `bin`,count(1) AS `count` from `germinate_template_4_24_09_04`.`germinatebase` where ((`germinate_template_4_24_09_04`.`germinatebase`.`pdci` >= 2) and (`germinate_template_4_24_09_04`.`germinatebase`.`pdci` < 3) and (`germinate_template_4_24_09_04`.`germinatebase`.`entitytype_id` = 1)) union select '3-4' AS `bin`,count(1) AS `count` from `germinate_template_4_24_09_04`.`germinatebase` where ((`germinate_template_4_24_09_04`.`germinatebase`.`pdci` >= 3) and (`germinate_template_4_24_09_04`.`germinatebase`.`pdci` < 4) and (`germinate_template_4_24_09_04`.`germinatebase`.`entitytype_id` = 1)) union select '4-5' AS `bin`,count(1) AS `count` from `germinate_template_4_24_09_04`.`germinatebase` where ((`germinate_template_4_24_09_04`.`germinatebase`.`pdci` >= 4) and (`germinate_template_4_24_09_04`.`germinatebase`.`pdci` < 5) and (`germinate_template_4_24_09_04`.`germinatebase`.`entitytype_id` = 1)) union select '5-6' AS `bin`,count(1) AS `count` from `germinate_template_4_24_09_04`.`germinatebase` where ((`germinate_template_4_24_09_04`.`germinatebase`.`pdci` >= 5) and (`germinate_template_4_24_09_04`.`germinatebase`.`pdci` < 6) and (`germinate_template_4_24_09_04`.`germinatebase`.`entitytype_id` = 1)) union select '6-7' AS `bin`,count(1) AS `count` from `germinate_template_4_24_09_04`.`germinatebase` where ((`germinate_template_4_24_09_04`.`germinatebase`.`pdci` >= 6) and (`germinate_template_4_24_09_04`.`germinatebase`.`pdci` < 7) and (`germinate_template_4_24_09_04`.`germinatebase`.`entitytype_id` = 1)) union select '7-8' AS `bin`,count(1) AS `count` from `germinate_template_4_24_09_04`.`germinatebase` where ((`germinate_template_4_24_09_04`.`germinatebase`.`pdci` >= 7) and (`germinate_template_4_24_09_04`.`germinatebase`.`pdci` < 8) and (`germinate_template_4_24_09_04`.`germinatebase`.`entitytype_id` = 1)) union select '8-9' AS `bin`,count(1) AS `count` from `germinate_template_4_24_09_04`.`germinatebase` where ((`germinate_template_4_24_09_04`.`germinatebase`.`pdci` >= 8) and (`germinate_template_4_24_09_04`.`germinatebase`.`pdci` < 9) and (`germinate_template_4_24_09_04`.`germinatebase`.`entitytype_id` = 1)) union select '9-10' AS `bin`,count(1) AS `count` from `germinate_template_4_24_09_04`.`germinatebase` where ((`germinate_template_4_24_09_04`.`germinatebase`.`pdci` >= 9) and (`germinate_template_4_24_09_04`.`germinatebase`.`pdci` <= 10) and (`germinate_template_4_24_09_04`.`germinatebase`.`entitytype_id` = 1))"));
    }

    /**
     * Create an aliased <code>germinate_db.view_stats_pdci</code> table
     * reference
     */
    public ViewStatsPdci(String alias) {
        this(DSL.name(alias), VIEW_STATS_PDCI);
    }

    /**
     * Create an aliased <code>germinate_db.view_stats_pdci</code> table
     * reference
     */
    public ViewStatsPdci(Name alias) {
        this(alias, VIEW_STATS_PDCI);
    }

    /**
     * Create a <code>germinate_db.view_stats_pdci</code> table reference
     */
    public ViewStatsPdci() {
        this(DSL.name("view_stats_pdci"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : GerminateDb.GERMINATE_DB;
    }

    @Override
    public ViewStatsPdci as(String alias) {
        return new ViewStatsPdci(DSL.name(alias), this);
    }

    @Override
    public ViewStatsPdci as(Name alias) {
        return new ViewStatsPdci(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewStatsPdci rename(String name) {
        return new ViewStatsPdci(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewStatsPdci rename(Name name) {
        return new ViewStatsPdci(name, null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<String, Long> fieldsRow() {
        return (Row2) super.fieldsRow();
    }
    // @formatter:on
}
