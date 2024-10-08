/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.enums;


import org.jooq.Catalog;
import org.jooq.EnumType;
import org.jooq.Schema;


// @formatter:off
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public enum ProjectcollaboratorsRole implements EnumType {

    principal_investigator("principal_investigator"),

    data_submitter("data_submitter"),

    data_curator("data_curator"),

    data_collector("data_collector"),

    corresponding_author("corresponding_author"),

    author("author");

    private final String literal;

    private ProjectcollaboratorsRole(String literal) {
        this.literal = literal;
    }

    @Override
    public Catalog getCatalog() {
        return null;
    }

    @Override
    public Schema getSchema() {
        return null;
    }

    @Override
    public String getName() {
        return "projectcollaborators_role";
    }

    @Override
    public String getLiteral() {
        return literal;
    }

    /**
     * Lookup a value of this EnumType by its literal
     */
    public static ProjectcollaboratorsRole lookupLiteral(String literal) {
        return EnumType.lookupLiteral(ProjectcollaboratorsRole.class, literal);
    }
    // @formatter:on
}
