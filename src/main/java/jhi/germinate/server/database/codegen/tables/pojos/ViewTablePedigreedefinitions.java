/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;


import lombok.*;
import lombok.experimental.Accessors;

// @formatter:off
/**
 * VIEW
 */
@Getter
@Setter
@Accessors(chain = true)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ViewTablePedigreedefinitions implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer   germplasmId;
    private String    germplasmName;
    private String    germplasmDisplayName;
    private String    pedigreeNotationName;
    private String    pedigreeNotationDescription;
    private String    pedigreeNotationUrl;
    private Integer   datasetId;
    private String    datasetName;
    private Integer   definitionId;
    private String    definition;
    private String    pedigreeDescriptionName;
    private String    pedigreeDescriptionDescription;
    private String    pedigreeDescriptionAuthor;
    private Timestamp createdOn;

    public ViewTablePedigreedefinitions() {}

    public ViewTablePedigreedefinitions(ViewTablePedigreedefinitions value) {
        this.germplasmId = value.germplasmId;
        this.germplasmName = value.germplasmName;
        this.germplasmDisplayName = value.germplasmDisplayName;
        this.pedigreeNotationName = value.pedigreeNotationName;
        this.pedigreeNotationDescription = value.pedigreeNotationDescription;
        this.pedigreeNotationUrl = value.pedigreeNotationUrl;
        this.datasetId = value.datasetId;
        this.datasetName = value.datasetName;
        this.definitionId = value.definitionId;
        this.definition = value.definition;
        this.pedigreeDescriptionName = value.pedigreeDescriptionName;
        this.pedigreeDescriptionDescription = value.pedigreeDescriptionDescription;
        this.pedigreeDescriptionAuthor = value.pedigreeDescriptionAuthor;
        this.createdOn = value.createdOn;
    }

    public ViewTablePedigreedefinitions(
        Integer   germplasmId,
        String    germplasmName,
        String    germplasmDisplayName,
        String    pedigreeNotationName,
        String    pedigreeNotationDescription,
        String    pedigreeNotationUrl,
        Integer   datasetId,
        String    datasetName,
        Integer   definitionId,
        String    definition,
        String    pedigreeDescriptionName,
        String    pedigreeDescriptionDescription,
        String    pedigreeDescriptionAuthor,
        Timestamp createdOn
    ) {
        this.germplasmId = germplasmId;
        this.germplasmName = germplasmName;
        this.germplasmDisplayName = germplasmDisplayName;
        this.pedigreeNotationName = pedigreeNotationName;
        this.pedigreeNotationDescription = pedigreeNotationDescription;
        this.pedigreeNotationUrl = pedigreeNotationUrl;
        this.datasetId = datasetId;
        this.datasetName = datasetName;
        this.definitionId = definitionId;
        this.definition = definition;
        this.pedigreeDescriptionName = pedigreeDescriptionName;
        this.pedigreeDescriptionDescription = pedigreeDescriptionDescription;
        this.pedigreeDescriptionAuthor = pedigreeDescriptionAuthor;
        this.createdOn = createdOn;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ViewTablePedigreedefinitions (");

        sb.append(germplasmId);
        sb.append(", ").append(germplasmName);
        sb.append(", ").append(germplasmDisplayName);
        sb.append(", ").append(pedigreeNotationName);
        sb.append(", ").append(pedigreeNotationDescription);
        sb.append(", ").append(pedigreeNotationUrl);
        sb.append(", ").append(datasetId);
        sb.append(", ").append(datasetName);
        sb.append(", ").append(definitionId);
        sb.append(", ").append(definition);
        sb.append(", ").append(pedigreeDescriptionName);
        sb.append(", ").append(pedigreeDescriptionDescription);
        sb.append(", ").append(pedigreeDescriptionAuthor);
        sb.append(", ").append(createdOn);

        sb.append(")");
        return sb.toString();
    }
    // @formatter:on
}
