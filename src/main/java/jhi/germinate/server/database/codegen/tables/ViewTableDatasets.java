/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables;


import java.sql.Date;
import java.sql.Timestamp;

import jhi.germinate.server.database.binding.DatasetLocationBinding;
import jhi.germinate.server.database.binding.DublinCoreBinding;
import jhi.germinate.server.database.binding.IntArrayBinding;
import jhi.germinate.server.database.codegen.GerminateDb;
import jhi.germinate.server.database.codegen.tables.pojos.ViewTableLocations;
import jhi.germinate.server.database.codegen.tables.records.ViewTableDatasetsRecord;
import jhi.germinate.server.database.pojo.DublinCore;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;
import org.jooq.types.ULong;


// @formatter:off
/**
 * VIEW
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ViewTableDatasets extends TableImpl<ViewTableDatasetsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>germinate_db.view_table_datasets</code>
     */
    public static final ViewTableDatasets VIEW_TABLE_DATASETS = new ViewTableDatasets();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ViewTableDatasetsRecord> getRecordType() {
        return ViewTableDatasetsRecord.class;
    }

    /**
     * The column <code>germinate_db.view_table_datasets.dataset_id</code>.
     * Primary id for this table. This uniquely identifies the row.
     */
    public final TableField<ViewTableDatasetsRecord, Integer> DATASET_ID = createField(DSL.name("dataset_id"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "Primary id for this table. This uniquely identifies the row.");

    /**
     * The column <code>germinate_db.view_table_datasets.dataset_name</code>.
     * Describes the dataset.
     */
    public final TableField<ViewTableDatasetsRecord, String> DATASET_NAME = createField(DSL.name("dataset_name"), SQLDataType.CLOB.nullable(false), this, "Describes the dataset.");

    /**
     * The column
     * <code>germinate_db.view_table_datasets.dataset_description</code>. The
     * name of this dataset.
     */
    public final TableField<ViewTableDatasetsRecord, String> DATASET_DESCRIPTION = createField(DSL.name("dataset_description"), SQLDataType.CLOB, this, "The name of this dataset.");

    /**
     * The column <code>germinate_db.view_table_datasets.hyperlink</code>. Link
     * to access the external dasets.
     */
    public final TableField<ViewTableDatasetsRecord, String> HYPERLINK = createField(DSL.name("hyperlink"), SQLDataType.VARCHAR(255), this, "Link to access the external dasets.");

    /**
     * The column <code>germinate_db.view_table_datasets.source_file</code>.
     */
    public final TableField<ViewTableDatasetsRecord, String> SOURCE_FILE = createField(DSL.name("source_file"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>germinate_db.view_table_datasets.version</code>. Dataset
     * version if this exists.
     */
    public final TableField<ViewTableDatasetsRecord, String> VERSION = createField(DSL.name("version"), SQLDataType.CHAR(10), this, "Dataset version if this exists.");

    /**
     * The column <code>germinate_db.view_table_datasets.dataset_type</code>.
     * Describes the experiment type.
     */
    public final TableField<ViewTableDatasetsRecord, String> DATASET_TYPE = createField(DSL.name("dataset_type"), SQLDataType.VARCHAR(255), this, "Describes the experiment type.");

    /**
     * The column <code>germinate_db.view_table_datasets.experiment_id</code>.
     * Primary id for this table. This uniquely identifies the row.
     */
    public final TableField<ViewTableDatasetsRecord, Integer> EXPERIMENT_ID = createField(DSL.name("experiment_id"), SQLDataType.INTEGER.defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "Primary id for this table. This uniquely identifies the row.");

    /**
     * The column <code>germinate_db.view_table_datasets.experiment_name</code>.
     * The name of the experiment.
     */
    public final TableField<ViewTableDatasetsRecord, String> EXPERIMENT_NAME = createField(DSL.name("experiment_name"), SQLDataType.VARCHAR(255), this, "The name of the experiment.");

    /**
     * The column
     * <code>germinate_db.view_table_datasets.experiment_description</code>.
     * Describes the experiment.
     */
    public final TableField<ViewTableDatasetsRecord, String> EXPERIMENT_DESCRIPTION = createField(DSL.name("experiment_description"), SQLDataType.CLOB, this, "Describes the experiment.");

    /**
     * The column <code>germinate_db.view_table_datasets.project_id</code>.
     */
    public final TableField<ViewTableDatasetsRecord, Integer> PROJECT_ID = createField(DSL.name("project_id"), SQLDataType.INTEGER.defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>germinate_db.view_table_datasets.project_name</code>.
     */
    public final TableField<ViewTableDatasetsRecord, String> PROJECT_NAME = createField(DSL.name("project_name"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column
     * <code>germinate_db.view_table_datasets.project_description</code>.
     */
    public final TableField<ViewTableDatasetsRecord, String> PROJECT_DESCRIPTION = createField(DSL.name("project_description"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>germinate_db.view_table_datasets.datatype</code>. A
     * description of the data type of the contained data. Examples might be:
     * "raw data", "BLUPs", etc.
     */
    public final TableField<ViewTableDatasetsRecord, String> DATATYPE = createField(DSL.name("datatype"), SQLDataType.VARCHAR(255), this, "A description of the data type of the contained data. Examples might be: \"raw data\", \"BLUPs\", etc.");

    /**
     * The column <code>germinate_db.view_table_datasets.dataset_state</code>.
     * Defines the datasetstate.
     */
    public final TableField<ViewTableDatasetsRecord, String> DATASET_STATE = createField(DSL.name("dataset_state"), SQLDataType.VARCHAR(255), this, "Defines the datasetstate.");

    /**
     * The column <code>germinate_db.view_table_datasets.locations</code>.
     */
    public final TableField<ViewTableDatasetsRecord, ViewTableLocations[]> LOCATIONS = createField(DSL.name("locations"), SQLDataType.JSON, this, "", new DatasetLocationBinding());

    /**
     * The column <code>germinate_db.view_table_datasets.license_id</code>.
     */
    public final TableField<ViewTableDatasetsRecord, Integer> LICENSE_ID = createField(DSL.name("license_id"), SQLDataType.INTEGER.defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>germinate_db.view_table_datasets.license_name</code>.
     */
    public final TableField<ViewTableDatasetsRecord, String> LICENSE_NAME = createField(DSL.name("license_name"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>germinate_db.view_table_datasets.contact</code>. The
     * contact to get more information about this dataset.
     */
    public final TableField<ViewTableDatasetsRecord, String> CONTACT = createField(DSL.name("contact"), SQLDataType.VARCHAR(255), this, "The contact to get more information about this dataset.");

    /**
     * The column <code>germinate_db.view_table_datasets.start_date</code>. Date
     * that the dataset was generated.
     */
    public final TableField<ViewTableDatasetsRecord, Date> START_DATE = createField(DSL.name("start_date"), SQLDataType.DATE, this, "Date that the dataset was generated.");

    /**
     * The column <code>germinate_db.view_table_datasets.end_date</code>. Date
     * at which the dataset recording ended.
     */
    public final TableField<ViewTableDatasetsRecord, Date> END_DATE = createField(DSL.name("end_date"), SQLDataType.DATE, this, "Date at which the dataset recording ended.");

    /**
     * The column <code>germinate_db.view_table_datasets.dublin_core</code>.
     */
    public final TableField<ViewTableDatasetsRecord, DublinCore> DUBLIN_CORE = createField(DSL.name("dublin_core"), SQLDataType.JSON, this, "", new DublinCoreBinding());

    /**
     * The column <code>germinate_db.view_table_datasets.created_on</code>. When
     * the record was created.

     */
    public final TableField<ViewTableDatasetsRecord, Timestamp> CREATED_ON = createField(DSL.name("created_on"), SQLDataType.TIMESTAMP(0), this, "When the record was created.\n");

    /**
     * The column <code>germinate_db.view_table_datasets.updated_on</code>. When
     * the record was updated. This may be different from the created on date if
     * subsequent changes have been made to the underlying record.
     */
    public final TableField<ViewTableDatasetsRecord, Timestamp> UPDATED_ON = createField(DSL.name("updated_on"), SQLDataType.TIMESTAMP(0), this, "When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.");

    /**
     * The column
     * <code>germinate_db.view_table_datasets.data_object_count</code>. The
     * number of data objects contained in this dataset.
     */
    public final TableField<ViewTableDatasetsRecord, ULong> DATA_OBJECT_COUNT = createField(DSL.name("data_object_count"), SQLDataType.BIGINTUNSIGNED, this, "The number of data objects contained in this dataset.");

    /**
     * The column
     * <code>germinate_db.view_table_datasets.data_point_count</code>. The
     * number of individual data points contained in this dataset.
     */
    public final TableField<ViewTableDatasetsRecord, ULong> DATA_POINT_COUNT = createField(DSL.name("data_point_count"), SQLDataType.BIGINTUNSIGNED, this, "The number of individual data points contained in this dataset.");

    /**
     * The column <code>germinate_db.view_table_datasets.is_external</code>.
     * Defines if the dataset is contained within Germinate or from an external
     * source and not stored in the database.
     */
    public final TableField<ViewTableDatasetsRecord, Boolean> IS_EXTERNAL = createField(DSL.name("is_external"), SQLDataType.BOOLEAN.defaultValue(DSL.inline("0", SQLDataType.BOOLEAN)), this, "Defines if the dataset is contained within Germinate or from an external source and not stored in the database.");

    /**
     * The column <code>germinate_db.view_table_datasets.publications</code>.
     */
    public final TableField<ViewTableDatasetsRecord, Long> PUBLICATIONS = createField(DSL.name("publications"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>germinate_db.view_table_datasets.fileresource_ids</code>.
     */
    public final TableField<ViewTableDatasetsRecord, Integer[]> FILERESOURCE_IDS = createField(DSL.name("fileresource_ids"), SQLDataType.JSON, this, "", new IntArrayBinding());

    /**
     * The column <code>germinate_db.view_table_datasets.collaborators</code>.
     */
    public final TableField<ViewTableDatasetsRecord, Long> COLLABORATORS = createField(DSL.name("collaborators"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>germinate_db.view_table_datasets.attributes</code>.
     */
    public final TableField<ViewTableDatasetsRecord, Long> ATTRIBUTES = createField(DSL.name("attributes"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>germinate_db.view_table_datasets.accepted_by</code>.
     */
    public final TableField<ViewTableDatasetsRecord, Integer[]> ACCEPTED_BY = createField(DSL.name("accepted_by"), SQLDataType.JSON, this, "", new IntArrayBinding());

    private ViewTableDatasets(Name alias, Table<ViewTableDatasetsRecord> aliased) {
        this(alias, aliased, null);
    }

    private ViewTableDatasets(Name alias, Table<ViewTableDatasetsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"), TableOptions.view("create view `view_table_datasets` as select `germinate_template_4_24_10_07`.`datasets`.`id` AS `dataset_id`,`germinate_template_4_24_10_07`.`datasets`.`name` AS `dataset_name`,`germinate_template_4_24_10_07`.`datasets`.`description` AS `dataset_description`,`germinate_template_4_24_10_07`.`datasets`.`hyperlink` AS `hyperlink`,`germinate_template_4_24_10_07`.`datasets`.`source_file` AS `source_file`,`germinate_template_4_24_10_07`.`datasets`.`version` AS `version`,`germinate_template_4_24_10_07`.`datasettypes`.`description` AS `dataset_type`,`germinate_template_4_24_10_07`.`experiments`.`id` AS `experiment_id`,`germinate_template_4_24_10_07`.`experiments`.`experiment_name` AS `experiment_name`,`germinate_template_4_24_10_07`.`experiments`.`description` AS `experiment_description`,`germinate_template_4_24_10_07`.`projects`.`id` AS `project_id`,`germinate_template_4_24_10_07`.`projects`.`name` AS `project_name`,`germinate_template_4_24_10_07`.`projects`.`description` AS `project_description`,`germinate_template_4_24_10_07`.`datasets`.`datatype` AS `datatype`,`germinate_template_4_24_10_07`.`datasetstates`.`name` AS `dataset_state`,(select json_arrayagg(json_object('locationId',`germinate_template_4_24_10_07`.`locations`.`id`,'locationName',`germinate_template_4_24_10_07`.`locations`.`site_name`,'locationLatitude',`germinate_template_4_24_10_07`.`locations`.`latitude`,'locationLongitude',`germinate_template_4_24_10_07`.`locations`.`longitude`,'countryId',`germinate_template_4_24_10_07`.`countries`.`id`,'countryName',`germinate_template_4_24_10_07`.`countries`.`country_code2`)) from ((`germinate_template_4_24_10_07`.`datasetlocations` left join `germinate_template_4_24_10_07`.`locations` on((`germinate_template_4_24_10_07`.`locations`.`id` = `germinate_template_4_24_10_07`.`datasetlocations`.`location_id`))) left join `germinate_template_4_24_10_07`.`countries` on((`germinate_template_4_24_10_07`.`countries`.`id` = `germinate_template_4_24_10_07`.`locations`.`country_id`))) where ((`germinate_template_4_24_10_07`.`datasetlocations`.`dataset_id` = `germinate_template_4_24_10_07`.`datasets`.`id`) and (`germinate_template_4_24_10_07`.`locations`.`id` is not null)) group by `germinate_template_4_24_10_07`.`datasets`.`id`) AS `locations`,`germinate_template_4_24_10_07`.`licenses`.`id` AS `license_id`,`germinate_template_4_24_10_07`.`licenses`.`name` AS `license_name`,`germinate_template_4_24_10_07`.`datasets`.`contact` AS `contact`,`germinate_template_4_24_10_07`.`datasets`.`date_start` AS `start_date`,`germinate_template_4_24_10_07`.`datasets`.`date_end` AS `end_date`,`germinate_template_4_24_10_07`.`datasets`.`dublin_core` AS `dublin_core`,`germinate_template_4_24_10_07`.`datasets`.`created_on` AS `created_on`,`germinate_template_4_24_10_07`.`datasets`.`updated_on` AS `updated_on`,`germinate_template_4_24_10_07`.`datasetmeta`.`nr_of_data_objects` AS `data_object_count`,`germinate_template_4_24_10_07`.`datasetmeta`.`nr_of_data_points` AS `data_point_count`,`germinate_template_4_24_10_07`.`datasets`.`is_external` AS `is_external`,(select count(1) from `germinate_template_4_24_10_07`.`publicationdata` where ((`germinate_template_4_24_10_07`.`publicationdata`.`foreign_id` = `germinate_template_4_24_10_07`.`datasets`.`id`) and (`germinate_template_4_24_10_07`.`publicationdata`.`reference_type` = 'dataset'))) AS `publications`,(select json_arrayagg(`germinate_template_4_24_10_07`.`datasetfileresources`.`fileresource_id`) from `germinate_template_4_24_10_07`.`datasetfileresources` where (`germinate_template_4_24_10_07`.`datasetfileresources`.`dataset_id` = `germinate_template_4_24_10_07`.`datasets`.`id`)) AS `fileresource_ids`,(select count(1) from (`germinate_template_4_24_10_07`.`collaborators` left join `germinate_template_4_24_10_07`.`datasetcollaborators` on((`germinate_template_4_24_10_07`.`collaborators`.`id` = `germinate_template_4_24_10_07`.`datasetcollaborators`.`collaborator_id`))) where (`germinate_template_4_24_10_07`.`datasetcollaborators`.`dataset_id` = `germinate_template_4_24_10_07`.`datasets`.`id`)) AS `collaborators`,(select count(1) from (`germinate_template_4_24_10_07`.`attributes` left join `germinate_template_4_24_10_07`.`attributedata` on((`germinate_template_4_24_10_07`.`attributedata`.`attribute_id` = `germinate_template_4_24_10_07`.`attributes`.`id`))) where ((`germinate_template_4_24_10_07`.`attributes`.`target_table` = 'datasets') and (`germinate_template_4_24_10_07`.`attributedata`.`foreign_id` = `germinate_template_4_24_10_07`.`datasets`.`id`))) AS `attributes`,json_arrayagg(`germinate_template_4_24_10_07`.`licenselogs`.`user_id`) AS `accepted_by` from ((((((((`germinate_template_4_24_10_07`.`datasets` left join `germinate_template_4_24_10_07`.`experiments` on((`germinate_template_4_24_10_07`.`experiments`.`id` = `germinate_template_4_24_10_07`.`datasets`.`experiment_id`))) left join `germinate_template_4_24_10_07`.`projects` on((`germinate_template_4_24_10_07`.`projects`.`id` = `germinate_template_4_24_10_07`.`experiments`.`project_id`))) left join `germinate_template_4_24_10_07`.`datasettypes` on((`germinate_template_4_24_10_07`.`datasettypes`.`id` = `germinate_template_4_24_10_07`.`datasets`.`datasettype_id`))) left join `germinate_template_4_24_10_07`.`licenses` on((`germinate_template_4_24_10_07`.`licenses`.`id` = `germinate_template_4_24_10_07`.`datasets`.`license_id`))) left join `germinate_template_4_24_10_07`.`datasetmeta` on((`germinate_template_4_24_10_07`.`datasetmeta`.`dataset_id` = `germinate_template_4_24_10_07`.`datasets`.`id`))) left join `germinate_template_4_24_10_07`.`datasetstates` on((`germinate_template_4_24_10_07`.`datasetstates`.`id` = `germinate_template_4_24_10_07`.`datasets`.`dataset_state_id`))) left join `germinate_template_4_24_10_07`.`licenselogs` on((`germinate_template_4_24_10_07`.`licenselogs`.`license_id` = `germinate_template_4_24_10_07`.`licenses`.`id`))) left join `germinate_template_4_24_10_07`.`datasetfileresources` on((`germinate_template_4_24_10_07`.`datasetfileresources`.`dataset_id` = `germinate_template_4_24_10_07`.`datasets`.`id`))) group by `germinate_template_4_24_10_07`.`datasets`.`id`,`germinate_template_4_24_10_07`.`datasetmeta`.`id`"));
    }

    /**
     * Create an aliased <code>germinate_db.view_table_datasets</code> table
     * reference
     */
    public ViewTableDatasets(String alias) {
        this(DSL.name(alias), VIEW_TABLE_DATASETS);
    }

    /**
     * Create an aliased <code>germinate_db.view_table_datasets</code> table
     * reference
     */
    public ViewTableDatasets(Name alias) {
        this(alias, VIEW_TABLE_DATASETS);
    }

    /**
     * Create a <code>germinate_db.view_table_datasets</code> table reference
     */
    public ViewTableDatasets() {
        this(DSL.name("view_table_datasets"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : GerminateDb.GERMINATE_DB;
    }

    @Override
    public ViewTableDatasets as(String alias) {
        return new ViewTableDatasets(DSL.name(alias), this);
    }

    @Override
    public ViewTableDatasets as(Name alias) {
        return new ViewTableDatasets(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewTableDatasets rename(String name) {
        return new ViewTableDatasets(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewTableDatasets rename(Name name) {
        return new ViewTableDatasets(name, null);
    }
    // @formatter:on
}
