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
 * Germinatebase is the Germinate base table which contains passport and other
 * germplasm definition data.
 */
@Getter
@Setter
@Accessors(chain = true)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Germinatebase implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer   id;
    private String    generalIdentifier;
    private String    number;
    private String    name;
    private String    displayName;
    private String    bankNumber;
    private Integer   taxonomyId;
    private String    plantPassport;
    private Integer   locationId;
    private Integer   entitytypeId;
    private Integer   entityparentId;
    private Double    pdci;
    private Timestamp createdOn;
    private Timestamp updatedOn;

    public Germinatebase() {}

    public Germinatebase(Germinatebase value) {
        this.id = value.id;
        this.generalIdentifier = value.generalIdentifier;
        this.number = value.number;
        this.name = value.name;
        this.displayName = value.displayName;
        this.bankNumber = value.bankNumber;
        this.taxonomyId = value.taxonomyId;
        this.plantPassport = value.plantPassport;
        this.locationId = value.locationId;
        this.entitytypeId = value.entitytypeId;
        this.entityparentId = value.entityparentId;
        this.pdci = value.pdci;
        this.createdOn = value.createdOn;
        this.updatedOn = value.updatedOn;
    }

    public Germinatebase(
        Integer   id,
        String    generalIdentifier,
        String    number,
        String    name,
        String    displayName,
        String    bankNumber,
        Integer   taxonomyId,
        String    plantPassport,
        Integer   locationId,
        Integer   entitytypeId,
        Integer   entityparentId,
        Double    pdci,
        Timestamp createdOn,
        Timestamp updatedOn
    ) {
        this.id = id;
        this.generalIdentifier = generalIdentifier;
        this.number = number;
        this.name = name;
        this.displayName = displayName;
        this.bankNumber = bankNumber;
        this.taxonomyId = taxonomyId;
        this.plantPassport = plantPassport;
        this.locationId = locationId;
        this.entitytypeId = entitytypeId;
        this.entityparentId = entityparentId;
        this.pdci = pdci;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Germinatebase (");

        sb.append(id);
        sb.append(", ").append(generalIdentifier);
        sb.append(", ").append(number);
        sb.append(", ").append(name);
        sb.append(", ").append(displayName);
        sb.append(", ").append(bankNumber);
        sb.append(", ").append(taxonomyId);
        sb.append(", ").append(plantPassport);
        sb.append(", ").append(locationId);
        sb.append(", ").append(entitytypeId);
        sb.append(", ").append(entityparentId);
        sb.append(", ").append(pdci);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(updatedOn);

        sb.append(")");
        return sb.toString();
    }
    // @formatter:on
}
