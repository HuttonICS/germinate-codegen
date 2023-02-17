/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables;


import java.sql.Timestamp;

import jhi.germinate.server.database.binding.ExifBinding;
import jhi.germinate.server.database.binding.ImageTagBinding;
import jhi.germinate.server.database.codegen.GerminateDb;
import jhi.germinate.server.database.codegen.tables.records.ViewTableImagesRecord;
import jhi.germinate.server.database.pojo.Exif;
import jhi.germinate.server.database.pojo.ImageTag;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Row10;
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
public class ViewTableImages extends TableImpl<ViewTableImagesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>germinate_db.view_table_images</code>
     */
    public static final ViewTableImages VIEW_TABLE_IMAGES = new ViewTableImages();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ViewTableImagesRecord> getRecordType() {
        return ViewTableImagesRecord.class;
    }

    /**
     * The column <code>germinate_db.view_table_images.image_id</code>.
     */
    public final TableField<ViewTableImagesRecord, Integer> IMAGE_ID = createField(DSL.name("image_id"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>germinate_db.view_table_images.image_description</code>.
     */
    public final TableField<ViewTableImagesRecord, String> IMAGE_DESCRIPTION = createField(DSL.name("image_description"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>germinate_db.view_table_images.image_foreign_id</code>.
     */
    public final TableField<ViewTableImagesRecord, Integer> IMAGE_FOREIGN_ID = createField(DSL.name("image_foreign_id"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>germinate_db.view_table_images.image_path</code>.
     */
    public final TableField<ViewTableImagesRecord, String> IMAGE_PATH = createField(DSL.name("image_path"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>germinate_db.view_table_images.image_exif</code>.
     */
    public final TableField<ViewTableImagesRecord, Exif> IMAGE_EXIF = createField(DSL.name("image_exif"), SQLDataType.JSON, this, "", new ExifBinding());

    /**
     * The column <code>germinate_db.view_table_images.image_type</code>.
     */
    public final TableField<ViewTableImagesRecord, String> IMAGE_TYPE = createField(DSL.name("image_type"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>germinate_db.view_table_images.image_ref_table</code>.
     */
    public final TableField<ViewTableImagesRecord, String> IMAGE_REF_TABLE = createField(DSL.name("image_ref_table"), SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>germinate_db.view_table_images.reference_name</code>.
     */
    public final TableField<ViewTableImagesRecord, String> REFERENCE_NAME = createField(DSL.name("reference_name"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>germinate_db.view_table_images.created_on</code>.
     */
    public final TableField<ViewTableImagesRecord, Timestamp> CREATED_ON = createField(DSL.name("created_on"), SQLDataType.TIMESTAMP(0), this, "");

    /**
     * The column <code>germinate_db.view_table_images.tags</code>.
     */
    public final TableField<ViewTableImagesRecord, ImageTag[]> TAGS = createField(DSL.name("tags"), SQLDataType.JSON, this, "", new ImageTagBinding());

    private ViewTableImages(Name alias, Table<ViewTableImagesRecord> aliased) {
        this(alias, aliased, null);
    }

    private ViewTableImages(Name alias, Table<ViewTableImagesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"), TableOptions.view("create view `view_table_images` as select `images`.`image_id` AS `image_id`,`images`.`image_description` AS `image_description`,`images`.`image_foreign_id` AS `image_foreign_id`,`images`.`image_path` AS `image_path`,cast(`images`.`image_exif` as json) AS `image_exif`,`images`.`image_type` AS `image_type`,`images`.`image_ref_table` AS `image_ref_table`,`images`.`reference_name` AS `reference_name`,`images`.`created_on` AS `created_on`,(select json_arrayagg(json_object('tagId',`germinate_template_4_23_02_16`.`imagetags`.`id`,'tagName',`germinate_template_4_23_02_16`.`imagetags`.`tag_name`)) from (`germinate_template_4_23_02_16`.`image_to_tags` left join `germinate_template_4_23_02_16`.`imagetags` on((`germinate_template_4_23_02_16`.`imagetags`.`id` = `germinate_template_4_23_02_16`.`image_to_tags`.`imagetag_id`))) where ((`germinate_template_4_23_02_16`.`image_to_tags`.`image_id` = `images`.`image_id`) and (`germinate_template_4_23_02_16`.`image_to_tags`.`imagetag_id` is not null)) group by `germinate_template_4_23_02_16`.`image_to_tags`.`image_id`) AS `tags` from (select `germinate_template_4_23_02_16`.`images`.`id` AS `image_id`,`germinate_template_4_23_02_16`.`images`.`description` AS `image_description`,`germinate_template_4_23_02_16`.`images`.`foreign_id` AS `image_foreign_id`,`germinate_template_4_23_02_16`.`images`.`path` AS `image_path`,`germinate_template_4_23_02_16`.`images`.`exif` AS `image_exif`,`germinate_template_4_23_02_16`.`imagetypes`.`description` AS `image_type`,`germinate_template_4_23_02_16`.`imagetypes`.`reference_table` AS `image_ref_table`,`germinate_template_4_23_02_16`.`germinatebase`.`name` AS `reference_name`,`germinate_template_4_23_02_16`.`images`.`created_on` AS `created_on` from ((`germinate_template_4_23_02_16`.`images` left join `germinate_template_4_23_02_16`.`imagetypes` on((`germinate_template_4_23_02_16`.`imagetypes`.`id` = `germinate_template_4_23_02_16`.`images`.`imagetype_id`))) left join `germinate_template_4_23_02_16`.`germinatebase` on((`germinate_template_4_23_02_16`.`germinatebase`.`id` = `germinate_template_4_23_02_16`.`images`.`foreign_id`))) where (`germinate_template_4_23_02_16`.`imagetypes`.`reference_table` like 'germinatebase') union select `germinate_template_4_23_02_16`.`images`.`id` AS `image_id`,`germinate_template_4_23_02_16`.`images`.`description` AS `image_description`,`germinate_template_4_23_02_16`.`images`.`foreign_id` AS `image_foreign_id`,`germinate_template_4_23_02_16`.`images`.`path` AS `image_path`,`germinate_template_4_23_02_16`.`images`.`exif` AS `image_exif`,`germinate_template_4_23_02_16`.`imagetypes`.`description` AS `image_type`,`germinate_template_4_23_02_16`.`imagetypes`.`reference_table` AS `image_ref_table`,`germinate_template_4_23_02_16`.`phenotypes`.`name` AS `reference_name`,`germinate_template_4_23_02_16`.`images`.`created_on` AS `created_on` from ((`germinate_template_4_23_02_16`.`images` left join `germinate_template_4_23_02_16`.`imagetypes` on((`germinate_template_4_23_02_16`.`imagetypes`.`id` = `germinate_template_4_23_02_16`.`images`.`imagetype_id`))) left join `germinate_template_4_23_02_16`.`phenotypes` on((`germinate_template_4_23_02_16`.`phenotypes`.`id` = `germinate_template_4_23_02_16`.`images`.`foreign_id`))) where (`germinate_template_4_23_02_16`.`imagetypes`.`reference_table` like 'phenotypes')) `images`"));
    }

    /**
     * Create an aliased <code>germinate_db.view_table_images</code> table
     * reference
     */
    public ViewTableImages(String alias) {
        this(DSL.name(alias), VIEW_TABLE_IMAGES);
    }

    /**
     * Create an aliased <code>germinate_db.view_table_images</code> table
     * reference
     */
    public ViewTableImages(Name alias) {
        this(alias, VIEW_TABLE_IMAGES);
    }

    /**
     * Create a <code>germinate_db.view_table_images</code> table reference
     */
    public ViewTableImages() {
        this(DSL.name("view_table_images"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : GerminateDb.GERMINATE_DB;
    }

    @Override
    public ViewTableImages as(String alias) {
        return new ViewTableImages(DSL.name(alias), this);
    }

    @Override
    public ViewTableImages as(Name alias) {
        return new ViewTableImages(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewTableImages rename(String name) {
        return new ViewTableImages(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewTableImages rename(Name name) {
        return new ViewTableImages(name, null);
    }

    // -------------------------------------------------------------------------
    // Row10 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row10<Integer, String, Integer, String, Exif, String, String, String, Timestamp, ImageTag[]> fieldsRow() {
        return (Row10) super.fieldsRow();
    }
    // @formatter:on
}
