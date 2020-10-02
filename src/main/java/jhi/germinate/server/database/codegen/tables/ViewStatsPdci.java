/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables;


import javax.annotation.Generated;

import jhi.germinate.server.database.codegen.GerminateDb;
import jhi.germinate.server.database.codegen.tables.records.ViewStatsPdciRecord;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class ViewStatsPdci extends TableImpl<ViewStatsPdciRecord> {

    private static final long serialVersionUID = -1996846073;

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
    public final TableField<ViewStatsPdciRecord, String> BIN = createField("bin", org.jooq.impl.SQLDataType.VARCHAR(4).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>germinate_db.view_stats_pdci.count</code>.
     */
    public final TableField<ViewStatsPdciRecord, Long> COUNT = createField("count", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * Create a <code>germinate_db.view_stats_pdci</code> table reference
     */
    public ViewStatsPdci() {
        this(DSL.name("view_stats_pdci"), null);
    }

    /**
     * Create an aliased <code>germinate_db.view_stats_pdci</code> table reference
     */
    public ViewStatsPdci(String alias) {
        this(DSL.name(alias), VIEW_STATS_PDCI);
    }

    /**
     * Create an aliased <code>germinate_db.view_stats_pdci</code> table reference
     */
    public ViewStatsPdci(Name alias) {
        this(alias, VIEW_STATS_PDCI);
    }

    private ViewStatsPdci(Name alias, Table<ViewStatsPdciRecord> aliased) {
        this(alias, aliased, null);
    }

    private ViewStatsPdci(Name alias, Table<ViewStatsPdciRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"));
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
    public ViewStatsPdci as(String alias) {
        return new ViewStatsPdci(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
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
// @formatter:on
}
