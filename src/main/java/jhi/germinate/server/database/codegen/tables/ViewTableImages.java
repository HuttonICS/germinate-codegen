/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables;


import java.sql.Timestamp;

import javax.annotation.Generated;

import jhi.germinate.server.database.binding.ImageTagBinding;
import jhi.germinate.server.database.codegen.GerminateDb;
import jhi.germinate.server.database.codegen.tables.records.ViewTableImagesRecord;
import jhi.germinate.server.database.pojo.ImageTag;

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
public class ViewTableImages extends TableImpl<ViewTableImagesRecord> {

    private static final long serialVersionUID = 132828194;

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
    public final TableField<ViewTableImagesRecord, Integer> IMAGE_ID = createField("image_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>germinate_db.view_table_images.image_description</code>.
     */
    public final TableField<ViewTableImagesRecord, String> IMAGE_DESCRIPTION = createField("image_description", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>germinate_db.view_table_images.image_foreign_id</code>.
     */
    public final TableField<ViewTableImagesRecord, Integer> IMAGE_FOREIGN_ID = createField("image_foreign_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>germinate_db.view_table_images.image_path</code>.
     */
    public final TableField<ViewTableImagesRecord, String> IMAGE_PATH = createField("image_path", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>germinate_db.view_table_images.image_type</code>.
     */
    public final TableField<ViewTableImagesRecord, String> IMAGE_TYPE = createField("image_type", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>germinate_db.view_table_images.image_ref_table</code>.
     */
    public final TableField<ViewTableImagesRecord, String> IMAGE_REF_TABLE = createField("image_ref_table", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>germinate_db.view_table_images.reference_name</code>.
     */
    public final TableField<ViewTableImagesRecord, String> REFERENCE_NAME = createField("reference_name", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>germinate_db.view_table_images.created_on</code>.
     */
    public final TableField<ViewTableImagesRecord, Timestamp> CREATED_ON = createField("created_on", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>germinate_db.view_table_images.tags</code>.
     */
    public final TableField<ViewTableImagesRecord, ImageTag[]> TAGS = createField("tags", org.jooq.impl.DefaultDataType.getDefaultDataType("\"germinate_template_4_21_08_19\".\"view_table_images_tags\""), this, "", new ImageTagBinding());

    /**
     * Create a <code>germinate_db.view_table_images</code> table reference
     */
    public ViewTableImages() {
        this(DSL.name("view_table_images"), null);
    }

    /**
     * Create an aliased <code>germinate_db.view_table_images</code> table reference
     */
    public ViewTableImages(String alias) {
        this(DSL.name(alias), VIEW_TABLE_IMAGES);
    }

    /**
     * Create an aliased <code>germinate_db.view_table_images</code> table reference
     */
    public ViewTableImages(Name alias) {
        this(alias, VIEW_TABLE_IMAGES);
    }

    private ViewTableImages(Name alias, Table<ViewTableImagesRecord> aliased) {
        this(alias, aliased, null);
    }

    private ViewTableImages(Name alias, Table<ViewTableImagesRecord> aliased, Field<?>[] parameters) {
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
    public ViewTableImages as(String alias) {
        return new ViewTableImages(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
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
// @formatter:on
}
