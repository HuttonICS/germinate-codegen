/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables.records;


import javax.annotation.Generated;

import jhi.germinate.server.database.codegen.tables.ViewStatsPdci;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
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
public class ViewStatsPdciRecord extends TableRecordImpl<ViewStatsPdciRecord> implements Record2<String, Long> {

    private static final long serialVersionUID = -501427610;

    /**
     * Setter for <code>germinate_db.view_stats_pdci.bin</code>.
     */
    public void setBin(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>germinate_db.view_stats_pdci.bin</code>.
     */
    public String getBin() {
        return (String) get(0);
    }

    /**
     * Setter for <code>germinate_db.view_stats_pdci.count</code>.
     */
    public void setCount(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>germinate_db.view_stats_pdci.count</code>.
     */
    public Long getCount() {
        return (Long) get(1);
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<String, Long> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<String, Long> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return ViewStatsPdci.VIEW_STATS_PDCI.BIN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return ViewStatsPdci.VIEW_STATS_PDCI.COUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getBin();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component2() {
        return getCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getBin();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewStatsPdciRecord value1(String value) {
        setBin(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewStatsPdciRecord value2(Long value) {
        setCount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewStatsPdciRecord values(String value1, Long value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ViewStatsPdciRecord
     */
    public ViewStatsPdciRecord() {
        super(ViewStatsPdci.VIEW_STATS_PDCI);
    }

    /**
     * Create a detached, initialised ViewStatsPdciRecord
     */
    public ViewStatsPdciRecord(String bin, Long count) {
        super(ViewStatsPdci.VIEW_STATS_PDCI);

        set(0, bin);
        set(1, count);
    }
// @formatter:on
}
