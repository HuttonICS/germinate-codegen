/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables.records;


import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import jhi.germinate.server.database.codegen.tables.ViewTableClimateData;

import org.jooq.Field;
import org.jooq.Record20;
import org.jooq.Row20;
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
public class ViewTableClimateDataRecord extends TableRecordImpl<ViewTableClimateDataRecord> implements Record20<Integer, String, String, String, String, BigDecimal, BigDecimal, BigDecimal, String, String, String, Integer, String, String, Integer, String, String, String, Timestamp, Double> {

    private static final long serialVersionUID = -1268802086;

    /**
     * Setter for <code>germinate_db.view_table_climate_data.location_id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public void setLocationId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_climate_data.location_id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public Integer getLocationId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>germinate_db.view_table_climate_data.location_name</code>. The site name where the location is.
     */
    public void setLocationName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_climate_data.location_name</code>. The site name where the location is.
     */
    public String getLocationName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>germinate_db.view_table_climate_data.location_region</code>. The region where the location is if this exists.
     */
    public void setLocationRegion(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_climate_data.location_region</code>. The region where the location is if this exists.
     */
    public String getLocationRegion() {
        return (String) get(2);
    }

    /**
     * Setter for <code>germinate_db.view_table_climate_data.location_state</code>. The state where the location is if this exists.
     */
    public void setLocationState(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_climate_data.location_state</code>. The state where the location is if this exists.
     */
    public String getLocationState() {
        return (String) get(3);
    }

    /**
     * Setter for <code>germinate_db.view_table_climate_data.location_type</code>. The name of the location type. 
     */
    public void setLocationType(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_climate_data.location_type</code>. The name of the location type. 
     */
    public String getLocationType() {
        return (String) get(4);
    }

    /**
     * Setter for <code>germinate_db.view_table_climate_data.location_latitude</code>. Latitude of the location.
     */
    public void setLocationLatitude(BigDecimal value) {
        set(5, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_climate_data.location_latitude</code>. Latitude of the location.
     */
    public BigDecimal getLocationLatitude() {
        return (BigDecimal) get(5);
    }

    /**
     * Setter for <code>germinate_db.view_table_climate_data.location_longitude</code>. Longitude of the location.
     */
    public void setLocationLongitude(BigDecimal value) {
        set(6, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_climate_data.location_longitude</code>. Longitude of the location.
     */
    public BigDecimal getLocationLongitude() {
        return (BigDecimal) get(6);
    }

    /**
     * Setter for <code>germinate_db.view_table_climate_data.location_elevation</code>. The elevation of the site in metres.
     */
    public void setLocationElevation(BigDecimal value) {
        set(7, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_climate_data.location_elevation</code>. The elevation of the site in metres.
     */
    public BigDecimal getLocationElevation() {
        return (BigDecimal) get(7);
    }

    /**
     * Setter for <code>germinate_db.view_table_climate_data.country_name</code>. Country name.
     */
    public void setCountryName(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_climate_data.country_name</code>. Country name.
     */
    public String getCountryName() {
        return (String) get(8);
    }

    /**
     * Setter for <code>germinate_db.view_table_climate_data.country_code2</code>. ISO 2 Code for country.
     */
    public void setCountryCode2(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_climate_data.country_code2</code>. ISO 2 Code for country.
     */
    public String getCountryCode2() {
        return (String) get(9);
    }

    /**
     * Setter for <code>germinate_db.view_table_climate_data.country_code3</code>. ISO 3 Code for country.
     */
    public void setCountryCode3(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_climate_data.country_code3</code>. ISO 3 Code for country.
     */
    public String getCountryCode3() {
        return (String) get(10);
    }

    /**
     * Setter for <code>germinate_db.view_table_climate_data.dataset_id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public void setDatasetId(Integer value) {
        set(11, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_climate_data.dataset_id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public Integer getDatasetId() {
        return (Integer) get(11);
    }

    /**
     * Setter for <code>germinate_db.view_table_climate_data.dataset_name</code>. Describes the dataset.
     */
    public void setDatasetName(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_climate_data.dataset_name</code>. Describes the dataset.
     */
    public String getDatasetName() {
        return (String) get(12);
    }

    /**
     * Setter for <code>germinate_db.view_table_climate_data.dataset_description</code>. The name of this dataset.
     */
    public void setDatasetDescription(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_climate_data.dataset_description</code>. The name of this dataset.
     */
    public String getDatasetDescription() {
        return (String) get(13);
    }

    /**
     * Setter for <code>germinate_db.view_table_climate_data.climate_id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public void setClimateId(Integer value) {
        set(14, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_climate_data.climate_id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public Integer getClimateId() {
        return (Integer) get(14);
    }

    /**
     * Setter for <code>germinate_db.view_table_climate_data.climate_name</code>. Describes the climate.
     */
    public void setClimateName(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_climate_data.climate_name</code>. Describes the climate.
     */
    public String getClimateName() {
        return (String) get(15);
    }

    /**
     * Setter for <code>germinate_db.view_table_climate_data.climate_name_short</code>. Shortened version of the climate name which is used in some table headers.
     */
    public void setClimateNameShort(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_climate_data.climate_name_short</code>. Shortened version of the climate name which is used in some table headers.
     */
    public String getClimateNameShort() {
        return (String) get(16);
    }

    /**
     * Setter for <code>germinate_db.view_table_climate_data.unit_name</code>. The name of the unit. This should be the name of the unit in full.
     */
    public void setUnitName(String value) {
        set(17, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_climate_data.unit_name</code>. The name of the unit. This should be the name of the unit in full.
     */
    public String getUnitName() {
        return (String) get(17);
    }

    /**
     * Setter for <code>germinate_db.view_table_climate_data.recording_date</code>. The date at which this data point was recorded.
     */
    public void setRecordingDate(Timestamp value) {
        set(18, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_climate_data.recording_date</code>. The date at which this data point was recorded.
     */
    public Timestamp getRecordingDate() {
        return (Timestamp) get(18);
    }

    /**
     * Setter for <code>germinate_db.view_table_climate_data.climate_value</code>. Value for the specific climate attribute. These are monthly averages and not daily. Monthly data is required for the current Germinate climate viisualizations and interface.
     */
    public void setClimateValue(Double value) {
        set(19, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_climate_data.climate_value</code>. Value for the specific climate attribute. These are monthly averages and not daily. Monthly data is required for the current Germinate climate viisualizations and interface.
     */
    public Double getClimateValue() {
        return (Double) get(19);
    }

    // -------------------------------------------------------------------------
    // Record20 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row20<Integer, String, String, String, String, BigDecimal, BigDecimal, BigDecimal, String, String, String, Integer, String, String, Integer, String, String, String, Timestamp, Double> fieldsRow() {
        return (Row20) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row20<Integer, String, String, String, String, BigDecimal, BigDecimal, BigDecimal, String, String, String, Integer, String, String, Integer, String, String, String, Timestamp, Double> valuesRow() {
        return (Row20) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return ViewTableClimateData.VIEW_TABLE_CLIMATE_DATA.LOCATION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return ViewTableClimateData.VIEW_TABLE_CLIMATE_DATA.LOCATION_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return ViewTableClimateData.VIEW_TABLE_CLIMATE_DATA.LOCATION_REGION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return ViewTableClimateData.VIEW_TABLE_CLIMATE_DATA.LOCATION_STATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return ViewTableClimateData.VIEW_TABLE_CLIMATE_DATA.LOCATION_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field6() {
        return ViewTableClimateData.VIEW_TABLE_CLIMATE_DATA.LOCATION_LATITUDE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field7() {
        return ViewTableClimateData.VIEW_TABLE_CLIMATE_DATA.LOCATION_LONGITUDE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field8() {
        return ViewTableClimateData.VIEW_TABLE_CLIMATE_DATA.LOCATION_ELEVATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return ViewTableClimateData.VIEW_TABLE_CLIMATE_DATA.COUNTRY_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return ViewTableClimateData.VIEW_TABLE_CLIMATE_DATA.COUNTRY_CODE2;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return ViewTableClimateData.VIEW_TABLE_CLIMATE_DATA.COUNTRY_CODE3;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field12() {
        return ViewTableClimateData.VIEW_TABLE_CLIMATE_DATA.DATASET_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return ViewTableClimateData.VIEW_TABLE_CLIMATE_DATA.DATASET_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field14() {
        return ViewTableClimateData.VIEW_TABLE_CLIMATE_DATA.DATASET_DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field15() {
        return ViewTableClimateData.VIEW_TABLE_CLIMATE_DATA.CLIMATE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field16() {
        return ViewTableClimateData.VIEW_TABLE_CLIMATE_DATA.CLIMATE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field17() {
        return ViewTableClimateData.VIEW_TABLE_CLIMATE_DATA.CLIMATE_NAME_SHORT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field18() {
        return ViewTableClimateData.VIEW_TABLE_CLIMATE_DATA.UNIT_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field19() {
        return ViewTableClimateData.VIEW_TABLE_CLIMATE_DATA.RECORDING_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field20() {
        return ViewTableClimateData.VIEW_TABLE_CLIMATE_DATA.CLIMATE_VALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getLocationId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getLocationName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getLocationRegion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getLocationState();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getLocationType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component6() {
        return getLocationLatitude();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component7() {
        return getLocationLongitude();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component8() {
        return getLocationElevation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getCountryName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getCountryCode2();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getCountryCode3();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component12() {
        return getDatasetId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component13() {
        return getDatasetName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component14() {
        return getDatasetDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component15() {
        return getClimateId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component16() {
        return getClimateName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component17() {
        return getClimateNameShort();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component18() {
        return getUnitName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component19() {
        return getRecordingDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component20() {
        return getClimateValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getLocationId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getLocationName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getLocationRegion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getLocationState();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getLocationType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value6() {
        return getLocationLatitude();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value7() {
        return getLocationLongitude();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value8() {
        return getLocationElevation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getCountryName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getCountryCode2();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getCountryCode3();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value12() {
        return getDatasetId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getDatasetName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value14() {
        return getDatasetDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value15() {
        return getClimateId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value16() {
        return getClimateName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value17() {
        return getClimateNameShort();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value18() {
        return getUnitName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value19() {
        return getRecordingDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value20() {
        return getClimateValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableClimateDataRecord value1(Integer value) {
        setLocationId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableClimateDataRecord value2(String value) {
        setLocationName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableClimateDataRecord value3(String value) {
        setLocationRegion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableClimateDataRecord value4(String value) {
        setLocationState(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableClimateDataRecord value5(String value) {
        setLocationType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableClimateDataRecord value6(BigDecimal value) {
        setLocationLatitude(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableClimateDataRecord value7(BigDecimal value) {
        setLocationLongitude(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableClimateDataRecord value8(BigDecimal value) {
        setLocationElevation(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableClimateDataRecord value9(String value) {
        setCountryName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableClimateDataRecord value10(String value) {
        setCountryCode2(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableClimateDataRecord value11(String value) {
        setCountryCode3(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableClimateDataRecord value12(Integer value) {
        setDatasetId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableClimateDataRecord value13(String value) {
        setDatasetName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableClimateDataRecord value14(String value) {
        setDatasetDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableClimateDataRecord value15(Integer value) {
        setClimateId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableClimateDataRecord value16(String value) {
        setClimateName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableClimateDataRecord value17(String value) {
        setClimateNameShort(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableClimateDataRecord value18(String value) {
        setUnitName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableClimateDataRecord value19(Timestamp value) {
        setRecordingDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableClimateDataRecord value20(Double value) {
        setClimateValue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableClimateDataRecord values(Integer value1, String value2, String value3, String value4, String value5, BigDecimal value6, BigDecimal value7, BigDecimal value8, String value9, String value10, String value11, Integer value12, String value13, String value14, Integer value15, String value16, String value17, String value18, Timestamp value19, Double value20) {
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
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        value18(value18);
        value19(value19);
        value20(value20);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ViewTableClimateDataRecord
     */
    public ViewTableClimateDataRecord() {
        super(ViewTableClimateData.VIEW_TABLE_CLIMATE_DATA);
    }

    /**
     * Create a detached, initialised ViewTableClimateDataRecord
     */
    public ViewTableClimateDataRecord(Integer locationId, String locationName, String locationRegion, String locationState, String locationType, BigDecimal locationLatitude, BigDecimal locationLongitude, BigDecimal locationElevation, String countryName, String countryCode2, String countryCode3, Integer datasetId, String datasetName, String datasetDescription, Integer climateId, String climateName, String climateNameShort, String unitName, Timestamp recordingDate, Double climateValue) {
        super(ViewTableClimateData.VIEW_TABLE_CLIMATE_DATA);

        set(0, locationId);
        set(1, locationName);
        set(2, locationRegion);
        set(3, locationState);
        set(4, locationType);
        set(5, locationLatitude);
        set(6, locationLongitude);
        set(7, locationElevation);
        set(8, countryName);
        set(9, countryCode2);
        set(10, countryCode3);
        set(11, datasetId);
        set(12, datasetName);
        set(13, datasetDescription);
        set(14, climateId);
        set(15, climateName);
        set(16, climateNameShort);
        set(17, unitName);
        set(18, recordingDate);
        set(19, climateValue);
    }
// @formatter:on
}
