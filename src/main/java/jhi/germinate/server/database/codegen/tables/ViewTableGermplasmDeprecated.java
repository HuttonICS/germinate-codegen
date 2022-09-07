/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables;


import java.math.BigDecimal;

import jhi.germinate.server.database.binding.GermplasmInstitutionBinding;
import jhi.germinate.server.database.binding.SynonymBinding;
import jhi.germinate.server.database.codegen.GerminateDb;
import jhi.germinate.server.database.codegen.tables.records.ViewTableGermplasmDeprecatedRecord;
import jhi.germinate.server.database.pojo.GermplasmInstitution;

import org.jooq.Field;
import org.jooq.Name;
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
public class ViewTableGermplasmDeprecated extends TableImpl<ViewTableGermplasmDeprecatedRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>germinate_db.view_table_germplasm_deprecated</code>
     */
    public static final ViewTableGermplasmDeprecated VIEW_TABLE_GERMPLASM_DEPRECATED = new ViewTableGermplasmDeprecated();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ViewTableGermplasmDeprecatedRecord> getRecordType() {
        return ViewTableGermplasmDeprecatedRecord.class;
    }

    /**
     * The column
     * <code>germinate_db.view_table_germplasm_deprecated.germplasm_name</code>.
     * A unique name which defines an entry in the germinatbase table.
     */
    public final TableField<ViewTableGermplasmDeprecatedRecord, String> GERMPLASM_NAME = createField(DSL.name("germplasm_name"), SQLDataType.VARCHAR(255).nullable(false), this, "A unique name which defines an entry in the germinatbase table.");

    /**
     * The column
     * <code>germinate_db.view_table_germplasm_deprecated.germplasm_id</code>.
     * Primary id for this table. This uniquely identifies the row.
     */
    public final TableField<ViewTableGermplasmDeprecatedRecord, Integer> GERMPLASM_ID = createField(DSL.name("germplasm_id"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "Primary id for this table. This uniquely identifies the row.");

    /**
     * The column
     * <code>germinate_db.view_table_germplasm_deprecated.germplasm_gid</code>.
     * A unique identifier.
     */
    public final TableField<ViewTableGermplasmDeprecatedRecord, String> GERMPLASM_GID = createField(DSL.name("germplasm_gid"), SQLDataType.VARCHAR(255).nullable(false), this, "A unique identifier.");

    /**
     * The column
     * <code>germinate_db.view_table_germplasm_deprecated.germplasm_number</code>.
     * This is the unique identifier for accessions within a genebank, and is
     * assigned when a sample is
     * entered into the genebank collection (e.g. ‘PI 113869’).
     */
    public final TableField<ViewTableGermplasmDeprecatedRecord, String> GERMPLASM_NUMBER = createField(DSL.name("germplasm_number"), SQLDataType.VARCHAR(255), this, "This is the unique identifier for accessions within a genebank, and is assigned when a sample is\nentered into the genebank collection (e.g. ‘PI 113869’).");

    /**
     * The column
     * <code>germinate_db.view_table_germplasm_deprecated.gerplasm_puid</code>.
     * Any persistent, unique identifier assigned to the accession so it can be
     * unambiguously referenced at the global level and the information
     * associated with it harvested through automated means. Report one PUID for
     * each accession.
     */
    public final TableField<ViewTableGermplasmDeprecatedRecord, String> GERPLASM_PUID = createField(DSL.name("gerplasm_puid"), SQLDataType.CLOB, this, "Any persistent, unique identifier assigned to the accession so it can be unambiguously referenced at the global level and the information associated with it harvested through automated means. Report one PUID for each accession.");

    /**
     * The column
     * <code>germinate_db.view_table_germplasm_deprecated.entity_type_id</code>.
     * Primary id for this table. This uniquely identifies the row.
     */
    public final TableField<ViewTableGermplasmDeprecatedRecord, Integer> ENTITY_TYPE_ID = createField(DSL.name("entity_type_id"), SQLDataType.INTEGER.defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "Primary id for this table. This uniquely identifies the row.");

    /**
     * The column
     * <code>germinate_db.view_table_germplasm_deprecated.entity_type_name</code>.
     * The name of the entity type.
     */
    public final TableField<ViewTableGermplasmDeprecatedRecord, String> ENTITY_TYPE_NAME = createField(DSL.name("entity_type_name"), SQLDataType.VARCHAR(255), this, "The name of the entity type.");

    /**
     * The column
     * <code>germinate_db.view_table_germplasm_deprecated.entity_parent_id</code>.
     * Foreign key to germinatebase (germinatebase.id).
     */
    public final TableField<ViewTableGermplasmDeprecatedRecord, Integer> ENTITY_PARENT_ID = createField(DSL.name("entity_parent_id"), SQLDataType.INTEGER, this, "Foreign key to germinatebase (germinatebase.id).");

    /**
     * The column
     * <code>germinate_db.view_table_germplasm_deprecated.entity_parent_name</code>.
     * A unique name which defines an entry in the germinatbase table.
     */
    public final TableField<ViewTableGermplasmDeprecatedRecord, String> ENTITY_PARENT_NAME = createField(DSL.name("entity_parent_name"), SQLDataType.VARCHAR(255), this, "A unique name which defines an entry in the germinatbase table.");

    /**
     * The column
     * <code>germinate_db.view_table_germplasm_deprecated.entity_parent_general_identifier</code>.
     * A unique identifier.
     */
    public final TableField<ViewTableGermplasmDeprecatedRecord, String> ENTITY_PARENT_GENERAL_IDENTIFIER = createField(DSL.name("entity_parent_general_identifier"), SQLDataType.VARCHAR(255), this, "A unique identifier.");

    /**
     * The column
     * <code>germinate_db.view_table_germplasm_deprecated.biological_status_id</code>.
     * Primary id for this table. This uniquely identifies the row.
     */
    public final TableField<ViewTableGermplasmDeprecatedRecord, Integer> BIOLOGICAL_STATUS_ID = createField(DSL.name("biological_status_id"), SQLDataType.INTEGER.defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "Primary id for this table. This uniquely identifies the row.");

    /**
     * The column
     * <code>germinate_db.view_table_germplasm_deprecated.biological_status_name</code>.
     * Previoulsy known as sampstat.
     */
    public final TableField<ViewTableGermplasmDeprecatedRecord, String> BIOLOGICAL_STATUS_NAME = createField(DSL.name("biological_status_name"), SQLDataType.VARCHAR(255), this, "Previoulsy known as sampstat.");

    /**
     * The column
     * <code>germinate_db.view_table_germplasm_deprecated.synonyms</code>. The
     * synonyms as a json array.
     */
    public final TableField<ViewTableGermplasmDeprecatedRecord, String[]> SYNONYMS = createField(DSL.name("synonyms"), SQLDataType.JSON, this, "The synonyms as a json array.", new SynonymBinding());

    /**
     * The column
     * <code>germinate_db.view_table_germplasm_deprecated.collector_number</code>.
     * Original identifier assigned by the collector(s) of the sample, normally
     * composed of the name or initials of the collector(s) followed by a number
     * (e.g. 'FM9909'). This identifier is essential for identifying duplicates
     * held in different collections.
     */
    public final TableField<ViewTableGermplasmDeprecatedRecord, String> COLLECTOR_NUMBER = createField(DSL.name("collector_number"), SQLDataType.VARCHAR(255), this, "Original identifier assigned by the collector(s) of the sample, normally composed of the name or initials of the collector(s) followed by a number (e.g. 'FM9909'). This identifier is essential for identifying duplicates held in different collections.");

    /**
     * The column
     * <code>germinate_db.view_table_germplasm_deprecated.genus</code>. Genus
     * name for the species.
     */
    public final TableField<ViewTableGermplasmDeprecatedRecord, String> GENUS = createField(DSL.name("genus"), SQLDataType.VARCHAR(255).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "Genus name for the species.");

    /**
     * The column
     * <code>germinate_db.view_table_germplasm_deprecated.species</code>.
     * Species name in lowercase.
     */
    public final TableField<ViewTableGermplasmDeprecatedRecord, String> SPECIES = createField(DSL.name("species"), SQLDataType.VARCHAR(255).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "Species name in lowercase.");

    /**
     * The column
     * <code>germinate_db.view_table_germplasm_deprecated.subtaxa</code>.
     * Subtaxa name.
     */
    public final TableField<ViewTableGermplasmDeprecatedRecord, String> SUBTAXA = createField(DSL.name("subtaxa"), SQLDataType.VARCHAR(255), this, "Subtaxa name.");

    /**
     * The column
     * <code>germinate_db.view_table_germplasm_deprecated.institutions</code>.
     */
    public final TableField<ViewTableGermplasmDeprecatedRecord, GermplasmInstitution[]> INSTITUTIONS = createField(DSL.name("institutions"), SQLDataType.JSON, this, "", new GermplasmInstitutionBinding());

    /**
     * The column
     * <code>germinate_db.view_table_germplasm_deprecated.location</code>. The
     * site name where the location is.
     */
    public final TableField<ViewTableGermplasmDeprecatedRecord, String> LOCATION = createField(DSL.name("location"), SQLDataType.VARCHAR(255).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "The site name where the location is.");

    /**
     * The column
     * <code>germinate_db.view_table_germplasm_deprecated.latitude</code>.
     * Latitude of the location.
     */
    public final TableField<ViewTableGermplasmDeprecatedRecord, BigDecimal> LATITUDE = createField(DSL.name("latitude"), SQLDataType.DECIMAL(64, 10), this, "Latitude of the location.");

    /**
     * The column
     * <code>germinate_db.view_table_germplasm_deprecated.longitude</code>.
     * Longitude of the location.
     */
    public final TableField<ViewTableGermplasmDeprecatedRecord, BigDecimal> LONGITUDE = createField(DSL.name("longitude"), SQLDataType.DECIMAL(64, 10), this, "Longitude of the location.");

    /**
     * The column
     * <code>germinate_db.view_table_germplasm_deprecated.elevation</code>. The
     * elevation of the site in metres.
     */
    public final TableField<ViewTableGermplasmDeprecatedRecord, BigDecimal> ELEVATION = createField(DSL.name("elevation"), SQLDataType.DECIMAL(64, 10), this, "The elevation of the site in metres.");

    /**
     * The column
     * <code>germinate_db.view_table_germplasm_deprecated.country_name</code>.
     * Country name.
     */
    public final TableField<ViewTableGermplasmDeprecatedRecord, String> COUNTRY_NAME = createField(DSL.name("country_name"), SQLDataType.VARCHAR(255).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "Country name.");

    /**
     * The column
     * <code>germinate_db.view_table_germplasm_deprecated.country_code</code>.
     * ISO 2 Code for country.
     */
    public final TableField<ViewTableGermplasmDeprecatedRecord, String> COUNTRY_CODE = createField(DSL.name("country_code"), SQLDataType.CHAR(2).defaultValue(DSL.inline("", SQLDataType.CHAR)), this, "ISO 2 Code for country.");

    /**
     * The column
     * <code>germinate_db.view_table_germplasm_deprecated.coll_date</code>.
     * Collecting date of the sample, where YYYY is the year, MM is the month
     * and DD is the day. Missing data (MM or DD) should be indicated with
     * hyphens or '00' [double zero].
     */
    public final TableField<ViewTableGermplasmDeprecatedRecord, String> COLL_DATE = createField(DSL.name("coll_date"), SQLDataType.VARCHAR(255), this, "Collecting date of the sample, where YYYY is the year, MM is the month and DD is the day. Missing data (MM or DD) should be indicated with hyphens or '00' [double zero].");

    /**
     * The column
     * <code>germinate_db.view_table_germplasm_deprecated.pdci</code>. Passport
     * Data Completeness Index. This is calculated by Germinate. Manual editing
     * of this field will be overwritten.
     */
    public final TableField<ViewTableGermplasmDeprecatedRecord, Double> PDCI = createField(DSL.name("pdci"), SQLDataType.FLOAT, this, "Passport Data Completeness Index. This is calculated by Germinate. Manual editing of this field will be overwritten.");

    /**
     * The column
     * <code>germinate_db.view_table_germplasm_deprecated.image_count</code>.
     */
    public final TableField<ViewTableGermplasmDeprecatedRecord, Long> IMAGE_COUNT = createField(DSL.name("image_count"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>germinate_db.view_table_germplasm_deprecated.first_image_path</code>.
     */
    public final TableField<ViewTableGermplasmDeprecatedRecord, String> FIRST_IMAGE_PATH = createField(DSL.name("first_image_path"), SQLDataType.CLOB, this, "");

    /**
     * The column
     * <code>germinate_db.view_table_germplasm_deprecated.has_trials_data</code>.
     */
    public final TableField<ViewTableGermplasmDeprecatedRecord, Integer> HAS_TRIALS_DATA = createField(DSL.name("has_trials_data"), SQLDataType.INTEGER, this, "");

    /**
     * The column
     * <code>germinate_db.view_table_germplasm_deprecated.has_genotypic_data</code>.
     */
    public final TableField<ViewTableGermplasmDeprecatedRecord, Integer> HAS_GENOTYPIC_DATA = createField(DSL.name("has_genotypic_data"), SQLDataType.INTEGER, this, "");

    /**
     * The column
     * <code>germinate_db.view_table_germplasm_deprecated.has_allelefreq_data</code>.
     */
    public final TableField<ViewTableGermplasmDeprecatedRecord, Integer> HAS_ALLELEFREQ_DATA = createField(DSL.name("has_allelefreq_data"), SQLDataType.INTEGER, this, "");

    /**
     * The column
     * <code>germinate_db.view_table_germplasm_deprecated.has_compound_data</code>.
     */
    public final TableField<ViewTableGermplasmDeprecatedRecord, Integer> HAS_COMPOUND_DATA = createField(DSL.name("has_compound_data"), SQLDataType.INTEGER, this, "");

    private ViewTableGermplasmDeprecated(Name alias, Table<ViewTableGermplasmDeprecatedRecord> aliased) {
        this(alias, aliased, null);
    }

    private ViewTableGermplasmDeprecated(Name alias, Table<ViewTableGermplasmDeprecatedRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"), TableOptions.view("create view `view_table_germplasm_deprecated` as select `germinate_template_4_22_09_02`.`germinatebase`.`name` AS `germplasm_name`,`germinate_template_4_22_09_02`.`germinatebase`.`id` AS `germplasm_id`,`germinate_template_4_22_09_02`.`germinatebase`.`general_identifier` AS `germplasm_gid`,`germinate_template_4_22_09_02`.`germinatebase`.`number` AS `germplasm_number`,`germinate_template_4_22_09_02`.`mcpd`.`puid` AS `gerplasm_puid`,`germinate_template_4_22_09_02`.`entitytypes`.`id` AS `entity_type_id`,`germinate_template_4_22_09_02`.`entitytypes`.`name` AS `entity_type_name`,`germinate_template_4_22_09_02`.`germinatebase`.`entityparent_id` AS `entity_parent_id`,`g`.`name` AS `entity_parent_name`,`g`.`general_identifier` AS `entity_parent_general_identifier`,`germinate_template_4_22_09_02`.`biologicalstatus`.`id` AS `biological_status_id`,`germinate_template_4_22_09_02`.`biologicalstatus`.`sampstat` AS `biological_status_name`,`germinate_template_4_22_09_02`.`synonyms`.`synonyms` AS `synonyms`,`germinate_template_4_22_09_02`.`mcpd`.`collnumb` AS `collector_number`,`germinate_template_4_22_09_02`.`taxonomies`.`genus` AS `genus`,`germinate_template_4_22_09_02`.`taxonomies`.`species` AS `species`,`germinate_template_4_22_09_02`.`taxonomies`.`subtaxa` AS `subtaxa`,(select json_arrayagg(json_object('id',`germinate_template_4_22_09_02`.`institutions`.`id`,'code',`germinate_template_4_22_09_02`.`institutions`.`code`,'name',`germinate_template_4_22_09_02`.`institutions`.`name`,'type',`germinate_template_4_22_09_02`.`germplasminstitutions`.`type`)) from (`germinate_template_4_22_09_02`.`germplasminstitutions` left join `germinate_template_4_22_09_02`.`institutions` on((`germinate_template_4_22_09_02`.`institutions`.`id` = `germinate_template_4_22_09_02`.`germplasminstitutions`.`institution_id`))) where (`germinate_template_4_22_09_02`.`germplasminstitutions`.`germinatebase_id` = `germinate_template_4_22_09_02`.`germinatebase`.`id`) group by `germinate_template_4_22_09_02`.`germplasminstitutions`.`germinatebase_id`) AS `institutions`,`germinate_template_4_22_09_02`.`locations`.`site_name` AS `location`,`germinate_template_4_22_09_02`.`locations`.`latitude` AS `latitude`,`germinate_template_4_22_09_02`.`locations`.`longitude` AS `longitude`,`germinate_template_4_22_09_02`.`locations`.`elevation` AS `elevation`,`germinate_template_4_22_09_02`.`countries`.`country_name` AS `country_name`,`germinate_template_4_22_09_02`.`countries`.`country_code2` AS `country_code`,`germinate_template_4_22_09_02`.`mcpd`.`colldate` AS `coll_date`,`germinate_template_4_22_09_02`.`germinatebase`.`pdci` AS `pdci`,(select count(1) from (`germinate_template_4_22_09_02`.`images` left join `germinate_template_4_22_09_02`.`imagetypes` on((`germinate_template_4_22_09_02`.`imagetypes`.`id` = `germinate_template_4_22_09_02`.`images`.`imagetype_id`))) where ((`germinate_template_4_22_09_02`.`imagetypes`.`reference_table` = 'germinatebase') and (`germinate_template_4_22_09_02`.`images`.`foreign_id` = `germinate_template_4_22_09_02`.`germinatebase`.`id`))) AS `image_count`,(select `germinate_template_4_22_09_02`.`images`.`path` from (`germinate_template_4_22_09_02`.`images` left join `germinate_template_4_22_09_02`.`imagetypes` on((`germinate_template_4_22_09_02`.`imagetypes`.`id` = `germinate_template_4_22_09_02`.`images`.`imagetype_id`))) where ((`germinate_template_4_22_09_02`.`imagetypes`.`reference_table` = 'germinatebase') and (`germinate_template_4_22_09_02`.`images`.`foreign_id` = `germinate_template_4_22_09_02`.`germinatebase`.`id`)) limit 1) AS `first_image_path`,(select 1 from `germinate_template_4_22_09_02`.`phenotypedata` where (`germinate_template_4_22_09_02`.`phenotypedata`.`germinatebase_id` = `germinate_template_4_22_09_02`.`germinatebase`.`id`) limit 1) AS `has_trials_data`,(select 1 from (`germinate_template_4_22_09_02`.`datasetmembers` left join `germinate_template_4_22_09_02`.`datasets` on((`germinate_template_4_22_09_02`.`datasets`.`id` = `germinate_template_4_22_09_02`.`datasetmembers`.`dataset_id`))) where ((`germinate_template_4_22_09_02`.`datasetmembers`.`foreign_id` = `germinate_template_4_22_09_02`.`germinatebase`.`id`) and (`germinate_template_4_22_09_02`.`datasetmembers`.`datasetmembertype_id` = 2) and (`germinate_template_4_22_09_02`.`datasets`.`datasettype_id` = 1)) limit 1) AS `has_genotypic_data`,(select 1 from (`germinate_template_4_22_09_02`.`datasetmembers` left join `germinate_template_4_22_09_02`.`datasets` on((`germinate_template_4_22_09_02`.`datasets`.`id` = `germinate_template_4_22_09_02`.`datasetmembers`.`dataset_id`))) where ((`germinate_template_4_22_09_02`.`datasetmembers`.`foreign_id` = `germinate_template_4_22_09_02`.`germinatebase`.`id`) and (`germinate_template_4_22_09_02`.`datasetmembers`.`datasetmembertype_id` = 2) and (`germinate_template_4_22_09_02`.`datasets`.`datasettype_id` = 4)) limit 1) AS `has_allelefreq_data`,(select 1 from `germinate_template_4_22_09_02`.`compounddata` where (`germinate_template_4_22_09_02`.`compounddata`.`germinatebase_id` = `germinate_template_4_22_09_02`.`germinatebase`.`id`) limit 1) AS `has_compound_data` from ((((((((`germinate_template_4_22_09_02`.`germinatebase` left join `germinate_template_4_22_09_02`.`mcpd` on((`germinate_template_4_22_09_02`.`mcpd`.`germinatebase_id` = `germinate_template_4_22_09_02`.`germinatebase`.`id`))) left join `germinate_template_4_22_09_02`.`germinatebase` `g` on((`g`.`id` = `germinate_template_4_22_09_02`.`germinatebase`.`entityparent_id`))) left join `germinate_template_4_22_09_02`.`entitytypes` on((`germinate_template_4_22_09_02`.`germinatebase`.`entitytype_id` = `germinate_template_4_22_09_02`.`entitytypes`.`id`))) left join `germinate_template_4_22_09_02`.`taxonomies` on((`germinate_template_4_22_09_02`.`germinatebase`.`taxonomy_id` = `germinate_template_4_22_09_02`.`taxonomies`.`id`))) left join `germinate_template_4_22_09_02`.`locations` on((`germinate_template_4_22_09_02`.`germinatebase`.`location_id` = `germinate_template_4_22_09_02`.`locations`.`id`))) left join `germinate_template_4_22_09_02`.`countries` on((`germinate_template_4_22_09_02`.`locations`.`country_id` = `germinate_template_4_22_09_02`.`countries`.`id`))) left join `germinate_template_4_22_09_02`.`biologicalstatus` on((`germinate_template_4_22_09_02`.`biologicalstatus`.`id` = `germinate_template_4_22_09_02`.`mcpd`.`sampstat`))) left join `germinate_template_4_22_09_02`.`synonyms` on(((`germinate_template_4_22_09_02`.`synonyms`.`foreign_id` = `germinate_template_4_22_09_02`.`germinatebase`.`id`) and (`germinate_template_4_22_09_02`.`synonyms`.`synonymtype_id` = 1))))"));
    }

    /**
     * Create an aliased
     * <code>germinate_db.view_table_germplasm_deprecated</code> table reference
     */
    public ViewTableGermplasmDeprecated(String alias) {
        this(DSL.name(alias), VIEW_TABLE_GERMPLASM_DEPRECATED);
    }

    /**
     * Create an aliased
     * <code>germinate_db.view_table_germplasm_deprecated</code> table reference
     */
    public ViewTableGermplasmDeprecated(Name alias) {
        this(alias, VIEW_TABLE_GERMPLASM_DEPRECATED);
    }

    /**
     * Create a <code>germinate_db.view_table_germplasm_deprecated</code> table
     * reference
     */
    public ViewTableGermplasmDeprecated() {
        this(DSL.name("view_table_germplasm_deprecated"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : GerminateDb.GERMINATE_DB;
    }

    @Override
    public ViewTableGermplasmDeprecated as(String alias) {
        return new ViewTableGermplasmDeprecated(DSL.name(alias), this);
    }

    @Override
    public ViewTableGermplasmDeprecated as(Name alias) {
        return new ViewTableGermplasmDeprecated(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewTableGermplasmDeprecated rename(String name) {
        return new ViewTableGermplasmDeprecated(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewTableGermplasmDeprecated rename(Name name) {
        return new ViewTableGermplasmDeprecated(name, null);
    }
    // @formatter:on
}
