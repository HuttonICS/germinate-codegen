/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import jhi.germinate.server.database.codegen.tables.Collaborators;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;


// @formatter:off
/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CollaboratorsRecord extends UpdatableRecordImpl<CollaboratorsRecord> implements Record8<Integer, String, String, String, String, Integer, Timestamp, Timestamp> {

    private static final long serialVersionUID = 1418511284;

    /**
     * Setter for <code>germinate_db.collaborators.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>germinate_db.collaborators.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>germinate_db.collaborators.first_name</code>. Last name (surname) of the author(s), researcher(s), scientist(s), student(s) responsible for producing the information product.
     */
    public void setFirstName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>germinate_db.collaborators.first_name</code>. Last name (surname) of the author(s), researcher(s), scientist(s), student(s) responsible for producing the information product.
     */
    public String getFirstName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>germinate_db.collaborators.last_name</code>. First name (and middle name if available) of the author(s), researcher(s), scientist(s), student(s) responsible for producing the information product.
     */
    public void setLastName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>germinate_db.collaborators.last_name</code>. First name (and middle name if available) of the author(s), researcher(s), scientist(s), student(s) responsible for producing the information product.
     */
    public String getLastName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>germinate_db.collaborators.email</code>. E-mail address of the author(s), researcher(s), scientist(s), student(s) responsible for producing the information product.
     */
    public void setEmail(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>germinate_db.collaborators.email</code>. E-mail address of the author(s), researcher(s), scientist(s), student(s) responsible for producing the information product.
     */
    public String getEmail() {
        return (String) get(3);
    }

    /**
     * Setter for <code>germinate_db.collaborators.phone</code>. Phone number of the author(s), researcher(s), scientist(s), student(s) responsible for producing the information product.
     */
    public void setPhone(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>germinate_db.collaborators.phone</code>. Phone number of the author(s), researcher(s), scientist(s), student(s) responsible for producing the information product.
     */
    public String getPhone() {
        return (String) get(4);
    }

    /**
     * Setter for <code>germinate_db.collaborators.institution_id</code>. Author's affiliation when the resource was created. Foreign key to 'institutions'
     */
    public void setInstitutionId(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>germinate_db.collaborators.institution_id</code>. Author's affiliation when the resource was created. Foreign key to 'institutions'
     */
    public Integer getInstitutionId() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>germinate_db.collaborators.created_on</code>. When the record was created.
     */
    public void setCreatedOn(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>germinate_db.collaborators.created_on</code>. When the record was created.
     */
    public Timestamp getCreatedOn() {
        return (Timestamp) get(6);
    }

    /**
     * Setter for <code>germinate_db.collaborators.updated_on</code>. When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.
     */
    public void setUpdatedOn(Timestamp value) {
        set(7, value);
    }

    /**
     * Getter for <code>germinate_db.collaborators.updated_on</code>. When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.
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
    public Row8<Integer, String, String, String, String, Integer, Timestamp, Timestamp> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, String, String, String, String, Integer, Timestamp, Timestamp> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Collaborators.COLLABORATORS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Collaborators.COLLABORATORS.FIRST_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Collaborators.COLLABORATORS.LAST_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Collaborators.COLLABORATORS.EMAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Collaborators.COLLABORATORS.PHONE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return Collaborators.COLLABORATORS.INSTITUTION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return Collaborators.COLLABORATORS.CREATED_ON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return Collaborators.COLLABORATORS.UPDATED_ON;
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
    public String component2() {
        return getFirstName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getLastName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getPhone();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getInstitutionId();
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
    public String value2() {
        return getFirstName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getLastName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getPhone();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getInstitutionId();
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
    public CollaboratorsRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CollaboratorsRecord value2(String value) {
        setFirstName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CollaboratorsRecord value3(String value) {
        setLastName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CollaboratorsRecord value4(String value) {
        setEmail(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CollaboratorsRecord value5(String value) {
        setPhone(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CollaboratorsRecord value6(Integer value) {
        setInstitutionId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CollaboratorsRecord value7(Timestamp value) {
        setCreatedOn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CollaboratorsRecord value8(Timestamp value) {
        setUpdatedOn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CollaboratorsRecord values(Integer value1, String value2, String value3, String value4, String value5, Integer value6, Timestamp value7, Timestamp value8) {
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
     * Create a detached CollaboratorsRecord
     */
    public CollaboratorsRecord() {
        super(Collaborators.COLLABORATORS);
    }

    /**
     * Create a detached, initialised CollaboratorsRecord
     */
    public CollaboratorsRecord(Integer id, String firstName, String lastName, String email, String phone, Integer institutionId, Timestamp createdOn, Timestamp updatedOn) {
        super(Collaborators.COLLABORATORS);

        set(0, id);
        set(1, firstName);
        set(2, lastName);
        set(3, email);
        set(4, phone);
        set(5, institutionId);
        set(6, createdOn);
        set(7, updatedOn);
    }
// @formatter:on
}