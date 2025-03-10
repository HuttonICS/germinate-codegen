/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables.pojos;


import java.io.Serializable;
import java.util.Arrays;

import jhi.germinate.server.database.codegen.enums.ViewTableTraitsDataType;
import jhi.germinate.server.database.pojo.TraitRestrictions;


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
public class ViewTableTraits implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer                 traitId;
    private String                  traitName;
    private String                  traitNameShort;
    private String                  traitDescription;
    private ViewTableTraitsDataType dataType;
    private TraitRestrictions       traitRestrictions;
    private Integer                 traitSetSize;
    private Boolean                 traitIsTimeseries;
    private Integer                 categoryId;
    private String                  categoryName;
    private String                  categoryDescription;
    private Integer                 unitId;
    private String                  unitName;
    private String                  unitDescription;
    private String                  unitAbbreviation;
    private String[]                synonyms;
    private Integer[]               datasetIds;
    private Long                    count;

    public ViewTableTraits() {}

    public ViewTableTraits(ViewTableTraits value) {
        this.traitId = value.traitId;
        this.traitName = value.traitName;
        this.traitNameShort = value.traitNameShort;
        this.traitDescription = value.traitDescription;
        this.dataType = value.dataType;
        this.traitRestrictions = value.traitRestrictions;
        this.traitSetSize = value.traitSetSize;
        this.traitIsTimeseries = value.traitIsTimeseries;
        this.categoryId = value.categoryId;
        this.categoryName = value.categoryName;
        this.categoryDescription = value.categoryDescription;
        this.unitId = value.unitId;
        this.unitName = value.unitName;
        this.unitDescription = value.unitDescription;
        this.unitAbbreviation = value.unitAbbreviation;
        this.synonyms = value.synonyms;
        this.datasetIds = value.datasetIds;
        this.count = value.count;
    }

    public ViewTableTraits(
        Integer                 traitId,
        String                  traitName,
        String                  traitNameShort,
        String                  traitDescription,
        ViewTableTraitsDataType dataType,
        TraitRestrictions       traitRestrictions,
        Integer                 traitSetSize,
        Boolean                 traitIsTimeseries,
        Integer                 categoryId,
        String                  categoryName,
        String                  categoryDescription,
        Integer                 unitId,
        String                  unitName,
        String                  unitDescription,
        String                  unitAbbreviation,
        String[]                synonyms,
        Integer[]               datasetIds,
        Long                    count
    ) {
        this.traitId = traitId;
        this.traitName = traitName;
        this.traitNameShort = traitNameShort;
        this.traitDescription = traitDescription;
        this.dataType = dataType;
        this.traitRestrictions = traitRestrictions;
        this.traitSetSize = traitSetSize;
        this.traitIsTimeseries = traitIsTimeseries;
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.categoryDescription = categoryDescription;
        this.unitId = unitId;
        this.unitName = unitName;
        this.unitDescription = unitDescription;
        this.unitAbbreviation = unitAbbreviation;
        this.synonyms = synonyms;
        this.datasetIds = datasetIds;
        this.count = count;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ViewTableTraits (");

        sb.append(traitId);
        sb.append(", ").append(traitName);
        sb.append(", ").append(traitNameShort);
        sb.append(", ").append(traitDescription);
        sb.append(", ").append(dataType);
        sb.append(", ").append(traitRestrictions);
        sb.append(", ").append(traitSetSize);
        sb.append(", ").append(traitIsTimeseries);
        sb.append(", ").append(categoryId);
        sb.append(", ").append(categoryName);
        sb.append(", ").append(categoryDescription);
        sb.append(", ").append(unitId);
        sb.append(", ").append(unitName);
        sb.append(", ").append(unitDescription);
        sb.append(", ").append(unitAbbreviation);
        sb.append(", ").append(Arrays.toString(synonyms));
        sb.append(", ").append(Arrays.toString(datasetIds));
        sb.append(", ").append(count);

        sb.append(")");
        return sb.toString();
    }
    // @formatter:on
}
