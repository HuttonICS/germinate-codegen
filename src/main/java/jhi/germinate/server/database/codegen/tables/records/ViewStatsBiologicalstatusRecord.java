/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables.records;


import javax.annotation.Generated;

import jhi.germinate.server.database.codegen.tables.ViewStatsBiologicalstatus;

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
public class ViewStatsBiologicalstatusRecord extends TableRecordImpl<ViewStatsBiologicalstatusRecord> implements Record2<String, Long> {

    private static final long serialVersionUID = -1621341014;

    /**
     * Setter for <code>germinate_db.view_stats_biologicalstatus.biologicalstatus</code>.
     */
    public void setBiologicalstatus(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>germinate_db.view_stats_biologicalstatus.biologicalstatus</code>.
     */
    public String getBiologicalstatus() {
        return (String) get(0);
    }

    /**
     * Setter for <code>germinate_db.view_stats_biologicalstatus.count</code>.
     */
    public void setCount(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>germinate_db.view_stats_biologicalstatus.count</code>.
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
        return ViewStatsBiologicalstatus.VIEW_STATS_BIOLOGICALSTATUS.BIOLOGICALSTATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return ViewStatsBiologicalstatus.VIEW_STATS_BIOLOGICALSTATUS.COUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getBiologicalstatus();
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
        return getBiologicalstatus();
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
    public ViewStatsBiologicalstatusRecord value1(String value) {
        setBiologicalstatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewStatsBiologicalstatusRecord value2(Long value) {
        setCount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewStatsBiologicalstatusRecord values(String value1, Long value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ViewStatsBiologicalstatusRecord
     */
    public ViewStatsBiologicalstatusRecord() {
        super(ViewStatsBiologicalstatus.VIEW_STATS_BIOLOGICALSTATUS);
    }

    /**
     * Create a detached, initialised ViewStatsBiologicalstatusRecord
     */
    public ViewStatsBiologicalstatusRecord(String biologicalstatus, Long count) {
        super(ViewStatsBiologicalstatus.VIEW_STATS_BIOLOGICALSTATUS);

        set(0, biologicalstatus);
        set(1, count);
    }
// @formatter:on
}
