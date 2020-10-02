/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import jhi.germinate.server.database.codegen.tables.Comments;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;


// @formatter:off
/**
 * Comments can be added to different entries in Germinate such as entries 
 * from germinatebase or markers from the markers table.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CommentsRecord extends UpdatableRecordImpl<CommentsRecord> implements Record8<Integer, Integer, Integer, Boolean, String, Integer, Timestamp, Timestamp> {

    private static final long serialVersionUID = -1906568729;

    /**
     * Setter for <code>germinate_db.comments.id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>germinate_db.comments.id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>germinate_db.comments.commenttype_id</code>. Foreign key to commentypes (commenttypes.id).
     */
    public void setCommenttypeId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>germinate_db.comments.commenttype_id</code>. Foreign key to commentypes (commenttypes.id).
     */
    public Integer getCommenttypeId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>germinate_db.comments.user_id</code>. Foreign key to Gatekeeper users (Gatekeeper users.id).
     */
    public void setUserId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>germinate_db.comments.user_id</code>. Foreign key to Gatekeeper users (Gatekeeper users.id).
     */
    public Integer getUserId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>germinate_db.comments.visibility</code>. Defines if the comment is available or masked (hidden) from the interface.
     */
    public void setVisibility(Boolean value) {
        set(3, value);
    }

    /**
     * Getter for <code>germinate_db.comments.visibility</code>. Defines if the comment is available or masked (hidden) from the interface.
     */
    public Boolean getVisibility() {
        return (Boolean) get(3);
    }

    /**
     * Setter for <code>germinate_db.comments.description</code>. The comment content.
     */
    public void setDescription(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>germinate_db.comments.description</code>. The comment content.
     */
    public String getDescription() {
        return (String) get(4);
    }

    /**
     * Setter for <code>germinate_db.comments.reference_id</code>. Relates to the UID of the table to which the comment relates
     */
    public void setReferenceId(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>germinate_db.comments.reference_id</code>. Relates to the UID of the table to which the comment relates
     */
    public Integer getReferenceId() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>germinate_db.comments.created_on</code>. When the record was created.
     */
    public void setCreatedOn(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>germinate_db.comments.created_on</code>. When the record was created.
     */
    public Timestamp getCreatedOn() {
        return (Timestamp) get(6);
    }

    /**
     * Setter for <code>germinate_db.comments.updated_on</code>. When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.
     */
    public void setUpdatedOn(Timestamp value) {
        set(7, value);
    }

    /**
     * Getter for <code>germinate_db.comments.updated_on</code>. When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.
     */
    public Timestamp getUpdatedOn() {
        return (Timestamp) get(7);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, Integer, Integer, Boolean, String, Integer, Timestamp, Timestamp> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, Integer, Integer, Boolean, String, Integer, Timestamp, Timestamp> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Comments.COMMENTS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Comments.COMMENTS.COMMENTTYPE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return Comments.COMMENTS.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field4() {
        return Comments.COMMENTS.VISIBILITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Comments.COMMENTS.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return Comments.COMMENTS.REFERENCE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return Comments.COMMENTS.CREATED_ON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return Comments.COMMENTS.UPDATED_ON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getCommenttypeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component4() {
        return getVisibility();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getReferenceId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component7() {
        return getCreatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component8() {
        return getUpdatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getCommenttypeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value4() {
        return getVisibility();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getReferenceId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getCreatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value8() {
        return getUpdatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CommentsRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CommentsRecord value2(Integer value) {
        setCommenttypeId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CommentsRecord value3(Integer value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CommentsRecord value4(Boolean value) {
        setVisibility(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CommentsRecord value5(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CommentsRecord value6(Integer value) {
        setReferenceId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CommentsRecord value7(Timestamp value) {
        setCreatedOn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CommentsRecord value8(Timestamp value) {
        setUpdatedOn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CommentsRecord values(Integer value1, Integer value2, Integer value3, Boolean value4, String value5, Integer value6, Timestamp value7, Timestamp value8) {
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
     * Create a detached CommentsRecord
     */
    public CommentsRecord() {
        super(Comments.COMMENTS);
    }

    /**
     * Create a detached, initialised CommentsRecord
     */
    public CommentsRecord(Integer id, Integer commenttypeId, Integer userId, Boolean visibility, String description, Integer referenceId, Timestamp createdOn, Timestamp updatedOn) {
        super(Comments.COMMENTS);

        set(0, id);
        set(1, commenttypeId);
        set(2, userId);
        set(3, visibility);
        set(4, description);
        set(5, referenceId);
        set(6, createdOn);
        set(7, updatedOn);
    }
// @formatter:on
}
