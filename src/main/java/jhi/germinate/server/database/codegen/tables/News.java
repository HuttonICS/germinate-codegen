/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables;


import java.sql.Timestamp;

import jhi.germinate.server.database.codegen.GerminateDb;
import jhi.germinate.server.database.codegen.enums.NewsImageFit;
import jhi.germinate.server.database.codegen.tables.records.NewsRecord;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Row10;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


// @formatter:off
/**
 * Holds news items that are displayed within Germinate.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class News extends TableImpl<NewsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>germinate_db.news</code>
     */
    public static final News NEWS = new News();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<NewsRecord> getRecordType() {
        return NewsRecord.class;
    }

    /**
     * The column <code>germinate_db.news.id</code>. Primary id for this table.
     * This uniquely identifies the row.
     */
    public final TableField<NewsRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "Primary id for this table. This uniquely identifies the row.");

    /**
     * The column <code>germinate_db.news.newstype_id</code>. Foreign key
     * newstypes (newstypes.id).
     */
    public final TableField<NewsRecord, Integer> NEWSTYPE_ID = createField(DSL.name("newstype_id"), SQLDataType.INTEGER.nullable(false), this, "Foreign key newstypes (newstypes.id).");

    /**
     * The column <code>germinate_db.news.title</code>. A title which is used to
     * name this news item. This appears in the Germinate user interface if
     * used.
     */
    public final TableField<NewsRecord, String> TITLE = createField(DSL.name("title"), SQLDataType.VARCHAR(255), this, "A title which is used to name this news item. This appears in the Germinate user interface if used.");

    /**
     * The column <code>germinate_db.news.content</code>. The textual content of
     * this news item.
     */
    public final TableField<NewsRecord, String> CONTENT = createField(DSL.name("content"), SQLDataType.CLOB, this, "The textual content of this news item.");

    /**
     * The column <code>germinate_db.news.image</code>. Image to use with this
     * news item.
     */
    public final TableField<NewsRecord, String> IMAGE = createField(DSL.name("image"), SQLDataType.VARCHAR(255), this, "Image to use with this news item.");

    /**
     * The column <code>germinate_db.news.image_fit</code>. Determines the css
     * property of the news item image.
     */
    public final TableField<NewsRecord, NewsImageFit> IMAGE_FIT = createField(DSL.name("image_fit"), SQLDataType.VARCHAR(7).nullable(false).defaultValue(DSL.inline("cover", SQLDataType.VARCHAR)).asEnumDataType(jhi.germinate.server.database.codegen.enums.NewsImageFit.class), this, "Determines the css property of the news item image.");

    /**
     * The column <code>germinate_db.news.hyperlink</code>. HTML hyperlink to
     * use for this news item. This can be a link to another source which
     * contains more information or a link to the original source.
     */
    public final TableField<NewsRecord, String> HYPERLINK = createField(DSL.name("hyperlink"), SQLDataType.VARCHAR(255), this, "HTML hyperlink to use for this news item. This can be a link to another source which contains more information or a link to the original source.");

    /**
     * The column <code>germinate_db.news.user_id</code>. Foreign key users
     * (users.id).
     */
    public final TableField<NewsRecord, Integer> USER_ID = createField(DSL.name("user_id"), SQLDataType.INTEGER, this, "Foreign key users (users.id).");

    /**
     * The column <code>germinate_db.news.created_on</code>. When the record was
     * created.
     */
    public final TableField<NewsRecord, Timestamp> CREATED_ON = createField(DSL.name("created_on"), SQLDataType.TIMESTAMP(0).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.TIMESTAMP)), this, "When the record was created.");

    /**
     * The column <code>germinate_db.news.updated_on</code>. When the record was
     * updated. This may be different from the created on date if subsequent
     * changes have been made to the underlying record.
     */
    public final TableField<NewsRecord, Timestamp> UPDATED_ON = createField(DSL.name("updated_on"), SQLDataType.TIMESTAMP(0).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.TIMESTAMP)), this, "When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.");

    private News(Name alias, Table<NewsRecord> aliased) {
        this(alias, aliased, null);
    }

    private News(Name alias, Table<NewsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Holds news items that are displayed within Germinate."), TableOptions.table());
    }

    /**
     * Create an aliased <code>germinate_db.news</code> table reference
     */
    public News(String alias) {
        this(DSL.name(alias), NEWS);
    }

    /**
     * Create an aliased <code>germinate_db.news</code> table reference
     */
    public News(Name alias) {
        this(alias, NEWS);
    }

    /**
     * Create a <code>germinate_db.news</code> table reference
     */
    public News() {
        this(DSL.name("news"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : GerminateDb.GERMINATE_DB;
    }

    @Override
    public Identity<NewsRecord, Integer> getIdentity() {
        return (Identity<NewsRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<NewsRecord> getPrimaryKey() {
        return Internal.createUniqueKey(News.NEWS, DSL.name("KEY_news_PRIMARY"), new TableField[] { News.NEWS.ID }, true);
    }

    @Override
    public News as(String alias) {
        return new News(DSL.name(alias), this);
    }

    @Override
    public News as(Name alias) {
        return new News(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public News rename(String name) {
        return new News(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public News rename(Name name) {
        return new News(name, null);
    }

    // -------------------------------------------------------------------------
    // Row10 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row10<Integer, Integer, String, String, String, NewsImageFit, String, Integer, Timestamp, Timestamp> fieldsRow() {
        return (Row10) super.fieldsRow();
    }
    // @formatter:on
}
