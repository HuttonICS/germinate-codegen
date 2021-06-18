/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables.records;


import javax.annotation.Generated;

import jhi.germinate.server.database.codegen.tables.ViewTableLicenses;

import org.jooq.Field;
import org.jooq.Record8;
import org.jooq.Row8;
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
public class ViewTableLicensesRecord extends TableRecordImpl<ViewTableLicensesRecord> implements Record8<Integer, String, String, String, String, String, Integer, Integer[]> {

    private static final long serialVersionUID = -467122716;

    /**
     * Setter for <code>germinate_db.view_table_licenses.license_id</code>.
     */
    public void setLicenseId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_licenses.license_id</code>.
     */
    public Integer getLicenseId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>germinate_db.view_table_licenses.license_name</code>.
     */
    public void setLicenseName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_licenses.license_name</code>.
     */
    public String getLicenseName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>germinate_db.view_table_licenses.license_description</code>.
     */
    public void setLicenseDescription(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_licenses.license_description</code>.
     */
    public String getLicenseDescription() {
        return (String) get(2);
    }

    /**
     * Setter for <code>germinate_db.view_table_licenses.license_content</code>.
     */
    public void setLicenseContent(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_licenses.license_content</code>.
     */
    public String getLicenseContent() {
        return (String) get(3);
    }

    /**
     * Setter for <code>germinate_db.view_table_licenses.locale_name</code>.
     */
    public void setLocaleName(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_licenses.locale_name</code>.
     */
    public String getLocaleName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>germinate_db.view_table_licenses.locale_description</code>.
     */
    public void setLocaleDescription(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_licenses.locale_description</code>.
     */
    public String getLocaleDescription() {
        return (String) get(5);
    }

    /**
     * Setter for <code>germinate_db.view_table_licenses.dataset_id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public void setDatasetId(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_licenses.dataset_id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public Integer getDatasetId() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>germinate_db.view_table_licenses.accepted_by</code>.
     */
    public void setAcceptedBy(Integer... value) {
        set(7, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_licenses.accepted_by</code>.
     */
    public Integer[] getAcceptedBy() {
        return (Integer[]) get(7);
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, String, String, String, String, String, Integer, Integer[]> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, String, String, String, String, String, Integer, Integer[]> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return ViewTableLicenses.VIEW_TABLE_LICENSES.LICENSE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return ViewTableLicenses.VIEW_TABLE_LICENSES.LICENSE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return ViewTableLicenses.VIEW_TABLE_LICENSES.LICENSE_DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return ViewTableLicenses.VIEW_TABLE_LICENSES.LICENSE_CONTENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return ViewTableLicenses.VIEW_TABLE_LICENSES.LOCALE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return ViewTableLicenses.VIEW_TABLE_LICENSES.LOCALE_DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return ViewTableLicenses.VIEW_TABLE_LICENSES.DATASET_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer[]> field8() {
        return ViewTableLicenses.VIEW_TABLE_LICENSES.ACCEPTED_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getLicenseId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getLicenseName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getLicenseDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getLicenseContent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getLocaleName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getLocaleDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component7() {
        return getDatasetId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer[] component8() {
        return getAcceptedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getLicenseId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getLicenseName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getLicenseDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getLicenseContent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getLocaleName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getLocaleDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getDatasetId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer[] value8() {
        return getAcceptedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableLicensesRecord value1(Integer value) {
        setLicenseId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableLicensesRecord value2(String value) {
        setLicenseName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableLicensesRecord value3(String value) {
        setLicenseDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableLicensesRecord value4(String value) {
        setLicenseContent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableLicensesRecord value5(String value) {
        setLocaleName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableLicensesRecord value6(String value) {
        setLocaleDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableLicensesRecord value7(Integer value) {
        setDatasetId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableLicensesRecord value8(Integer... value) {
        setAcceptedBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableLicensesRecord values(Integer value1, String value2, String value3, String value4, String value5, String value6, Integer value7, Integer[] value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ViewTableLicensesRecord
     */
    public ViewTableLicensesRecord() {
        super(ViewTableLicenses.VIEW_TABLE_LICENSES);
    }

    /**
     * Create a detached, initialised ViewTableLicensesRecord
     */
    public ViewTableLicensesRecord(Integer licenseId, String licenseName, String licenseDescription, String licenseContent, String localeName, String localeDescription, Integer datasetId, Integer[] acceptedBy) {
        super(ViewTableLicenses.VIEW_TABLE_LICENSES);

        set(0, licenseId);
        set(1, licenseName);
        set(2, licenseDescription);
        set(3, licenseContent);
        set(4, localeName);
        set(5, localeDescription);
        set(6, datasetId);
        set(7, acceptedBy);
    }
// @formatter:on
}
