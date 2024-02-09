/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables;


import java.math.BigDecimal;

import jhi.germinate.server.database.codegen.GerminateDb;
import jhi.germinate.server.database.codegen.tables.records.ViewTableLocationsRecord;

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
public class ViewTableLocations extends TableImpl<ViewTableLocationsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>germinate_db.view_table_locations</code>
     */
    public static final ViewTableLocations VIEW_TABLE_LOCATIONS = new ViewTableLocations();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ViewTableLocationsRecord> getRecordType() {
        return ViewTableLocationsRecord.class;
    }

    /**
     * The column <code>germinate_db.view_table_locations.location_id</code>.
     * Primary id for this table. This uniquely identifies the row.
     */
    public final TableField<ViewTableLocationsRecord, Integer> LOCATION_ID = createField(DSL.name("location_id"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "Primary id for this table. This uniquely identifies the row.");

    /**
     * The column <code>germinate_db.view_table_locations.location_name</code>.
     * The site name where the location is.
     */
    public final TableField<ViewTableLocationsRecord, String> LOCATION_NAME = createField(DSL.name("location_name"), SQLDataType.VARCHAR(255).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "The site name where the location is.");

    /**
     * The column
     * <code>germinate_db.view_table_locations.location_name_short</code>.
     * Shortened site name which can be used in tables within Germinate.
     */
    public final TableField<ViewTableLocationsRecord, String> LOCATION_NAME_SHORT = createField(DSL.name("location_name_short"), SQLDataType.VARCHAR(22), this, "Shortened site name which can be used in tables within Germinate.");

    /**
     * The column
     * <code>germinate_db.view_table_locations.location_region</code>. The
     * region where the location is if this exists.
     */
    public final TableField<ViewTableLocationsRecord, String> LOCATION_REGION = createField(DSL.name("location_region"), SQLDataType.VARCHAR(255), this, "The region where the location is if this exists.");

    /**
     * The column <code>germinate_db.view_table_locations.location_state</code>.
     * The state where the location is if this exists.
     */
    public final TableField<ViewTableLocationsRecord, String> LOCATION_STATE = createField(DSL.name("location_state"), SQLDataType.VARCHAR(255), this, "The state where the location is if this exists.");

    /**
     * The column <code>germinate_db.view_table_locations.location_type</code>.
     * The name of the location type. 
     */
    public final TableField<ViewTableLocationsRecord, String> LOCATION_TYPE = createField(DSL.name("location_type"), SQLDataType.VARCHAR(255), this, "The name of the location type. ");

    /**
     * The column
     * <code>germinate_db.view_table_locations.location_latitude</code>.
     * Latitude of the location.
     */
    public final TableField<ViewTableLocationsRecord, BigDecimal> LOCATION_LATITUDE = createField(DSL.name("location_latitude"), SQLDataType.DECIMAL(64, 10), this, "Latitude of the location.");

    /**
     * The column
     * <code>germinate_db.view_table_locations.location_longitude</code>.
     * Longitude of the location.
     */
    public final TableField<ViewTableLocationsRecord, BigDecimal> LOCATION_LONGITUDE = createField(DSL.name("location_longitude"), SQLDataType.DECIMAL(64, 10), this, "Longitude of the location.");

    /**
     * The column
     * <code>germinate_db.view_table_locations.location_elevation</code>. The
     * elevation of the site in metres.
     */
    public final TableField<ViewTableLocationsRecord, BigDecimal> LOCATION_ELEVATION = createField(DSL.name("location_elevation"), SQLDataType.DECIMAL(64, 10), this, "The elevation of the site in metres.");

    /**
     * The column
     * <code>germinate_db.view_table_locations.location_coordinate_uncertainty</code>.
     * Uncertainty associated with the coordinates in metres. Leave the value
     * empty if the uncertainty is unknown. 
     */
    public final TableField<ViewTableLocationsRecord, Integer> LOCATION_COORDINATE_UNCERTAINTY = createField(DSL.name("location_coordinate_uncertainty"), SQLDataType.INTEGER, this, "Uncertainty associated with the coordinates in metres. Leave the value empty if the uncertainty is unknown. ");

    /**
     * The column <code>germinate_db.view_table_locations.country_id</code>.
     * Primary id for this table. This uniquely identifies the row.
     */
    public final TableField<ViewTableLocationsRecord, Integer> COUNTRY_ID = createField(DSL.name("country_id"), SQLDataType.INTEGER.defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "Primary id for this table. This uniquely identifies the row.");

    /**
     * The column <code>germinate_db.view_table_locations.country_name</code>.
     * Country name.
     */
    public final TableField<ViewTableLocationsRecord, String> COUNTRY_NAME = createField(DSL.name("country_name"), SQLDataType.VARCHAR(255).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "Country name.");

    /**
     * The column <code>germinate_db.view_table_locations.country_code2</code>.
     * ISO 2 Code for country.
     */
    public final TableField<ViewTableLocationsRecord, String> COUNTRY_CODE2 = createField(DSL.name("country_code2"), SQLDataType.CHAR(2).defaultValue(DSL.inline("", SQLDataType.CHAR)), this, "ISO 2 Code for country.");

    /**
     * The column <code>germinate_db.view_table_locations.country_code3</code>.
     * ISO 3 Code for country.
     */
    public final TableField<ViewTableLocationsRecord, String> COUNTRY_CODE3 = createField(DSL.name("country_code3"), SQLDataType.CHAR(3).defaultValue(DSL.inline("", SQLDataType.CHAR)), this, "ISO 3 Code for country.");

    private ViewTableLocations(Name alias, Table<ViewTableLocationsRecord> aliased) {
        this(alias, aliased, null);
    }

    private ViewTableLocations(Name alias, Table<ViewTableLocationsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"), TableOptions.view("create view `view_table_locations` as select `germinate_template_4_24_02_09`.`locations`.`id` AS `location_id`,`germinate_template_4_24_02_09`.`locations`.`site_name` AS `location_name`,`germinate_template_4_24_02_09`.`locations`.`site_name_short` AS `location_name_short`,`germinate_template_4_24_02_09`.`locations`.`region` AS `location_region`,`germinate_template_4_24_02_09`.`locations`.`state` AS `location_state`,`germinate_template_4_24_02_09`.`locationtypes`.`name` AS `location_type`,`germinate_template_4_24_02_09`.`locations`.`latitude` AS `location_latitude`,`germinate_template_4_24_02_09`.`locations`.`longitude` AS `location_longitude`,`germinate_template_4_24_02_09`.`locations`.`elevation` AS `location_elevation`,`germinate_template_4_24_02_09`.`locations`.`coordinate_uncertainty` AS `location_coordinate_uncertainty`,`germinate_template_4_24_02_09`.`countries`.`id` AS `country_id`,`germinate_template_4_24_02_09`.`countries`.`country_name` AS `country_name`,`germinate_template_4_24_02_09`.`countries`.`country_code2` AS `country_code2`,`germinate_template_4_24_02_09`.`countries`.`country_code3` AS `country_code3` from ((`germinate_template_4_24_02_09`.`locations` left join `germinate_template_4_24_02_09`.`countries` on((`germinate_template_4_24_02_09`.`countries`.`id` = `germinate_template_4_24_02_09`.`locations`.`country_id`))) left join `germinate_template_4_24_02_09`.`locationtypes` on((`germinate_template_4_24_02_09`.`locationtypes`.`id` = `germinate_template_4_24_02_09`.`locations`.`locationtype_id`)))"));
    }

    /**
     * Create an aliased <code>germinate_db.view_table_locations</code> table
     * reference
     */
    public ViewTableLocations(String alias) {
        this(DSL.name(alias), VIEW_TABLE_LOCATIONS);
    }

    /**
     * Create an aliased <code>germinate_db.view_table_locations</code> table
     * reference
     */
    public ViewTableLocations(Name alias) {
        this(alias, VIEW_TABLE_LOCATIONS);
    }

    /**
     * Create a <code>germinate_db.view_table_locations</code> table reference
     */
    public ViewTableLocations() {
        this(DSL.name("view_table_locations"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : GerminateDb.GERMINATE_DB;
    }

    @Override
    public ViewTableLocations as(String alias) {
        return new ViewTableLocations(DSL.name(alias), this);
    }

    @Override
    public ViewTableLocations as(Name alias) {
        return new ViewTableLocations(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewTableLocations rename(String name) {
        return new ViewTableLocations(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewTableLocations rename(Name name) {
        return new ViewTableLocations(name, null);
    }

    // -------------------------------------------------------------------------
    // Row14 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row14<Integer, String, String, String, String, String, BigDecimal, BigDecimal, BigDecimal, Integer, Integer, String, String, String> fieldsRow() {
        return (Row14) super.fieldsRow();
    }
    // @formatter:on
}
