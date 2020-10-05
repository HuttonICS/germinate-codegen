/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.enums;


import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.EnumType;
import org.jooq.Schema;


// @formatter:off
/**
 * Defines the datatype which can be FLOAT, INT or CHAR type.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public enum ViewTableClimatesDataType implements EnumType {

    float_("float"),

    int_("int"),

    char_("char");

    private final String literal;

    private ViewTableClimatesDataType(String literal) {
        this.literal = literal;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getName() {
        return "view_table_climates_data_type";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getLiteral() {
        return literal;
    }
// @formatter:on
}