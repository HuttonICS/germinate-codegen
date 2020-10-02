/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


// @formatter:off
/**
 * Contains phenotypic data which has been collected.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Phenotypedata implements Serializable {

    private static final long serialVersionUID = 967077165;

    private Integer   id;
    private Integer   phenotypeId;
    private Integer   germinatebaseId;
    private String    phenotypeValue;
    private Integer   datasetId;
    private Timestamp recordingDate;
    private Timestamp createdOn;
    private Timestamp updatedOn;
    private Integer   locationId;
    private Integer   treatmentId;
    private Integer   trialseriesId;

    public Phenotypedata() {}

    public Phenotypedata(Phenotypedata value) {
        this.id = value.id;
        this.phenotypeId = value.phenotypeId;
        this.germinatebaseId = value.germinatebaseId;
        this.phenotypeValue = value.phenotypeValue;
        this.datasetId = value.datasetId;
        this.recordingDate = value.recordingDate;
        this.createdOn = value.createdOn;
        this.updatedOn = value.updatedOn;
        this.locationId = value.locationId;
        this.treatmentId = value.treatmentId;
        this.trialseriesId = value.trialseriesId;
    }

    public Phenotypedata(
        Integer   id,
        Integer   phenotypeId,
        Integer   germinatebaseId,
        String    phenotypeValue,
        Integer   datasetId,
        Timestamp recordingDate,
        Timestamp createdOn,
        Timestamp updatedOn,
        Integer   locationId,
        Integer   treatmentId,
        Integer   trialseriesId
    ) {
        this.id = id;
        this.phenotypeId = phenotypeId;
        this.germinatebaseId = germinatebaseId;
        this.phenotypeValue = phenotypeValue;
        this.datasetId = datasetId;
        this.recordingDate = recordingDate;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
        this.locationId = locationId;
        this.treatmentId = treatmentId;
        this.trialseriesId = trialseriesId;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPhenotypeId() {
        return this.phenotypeId;
    }

    public void setPhenotypeId(Integer phenotypeId) {
        this.phenotypeId = phenotypeId;
    }

    public Integer getGerminatebaseId() {
        return this.germinatebaseId;
    }

    public void setGerminatebaseId(Integer germinatebaseId) {
        this.germinatebaseId = germinatebaseId;
    }

    public String getPhenotypeValue() {
        return this.phenotypeValue;
    }

    public void setPhenotypeValue(String phenotypeValue) {
        this.phenotypeValue = phenotypeValue;
    }

    public Integer getDatasetId() {
        return this.datasetId;
    }

    public void setDatasetId(Integer datasetId) {
        this.datasetId = datasetId;
    }

    public Timestamp getRecordingDate() {
        return this.recordingDate;
    }

    public void setRecordingDate(Timestamp recordingDate) {
        this.recordingDate = recordingDate;
    }

    public Timestamp getCreatedOn() {
        return this.createdOn;
    }

    public void setCreatedOn(Timestamp createdOn) {
        this.createdOn = createdOn;
    }

    public Timestamp getUpdatedOn() {
        return this.updatedOn;
    }

    public void setUpdatedOn(Timestamp updatedOn) {
        this.updatedOn = updatedOn;
    }

    public Integer getLocationId() {
        return this.locationId;
    }

    public void setLocationId(Integer locationId) {
        this.locationId = locationId;
    }

    public Integer getTreatmentId() {
        return this.treatmentId;
    }

    public void setTreatmentId(Integer treatmentId) {
        this.treatmentId = treatmentId;
    }

    public Integer getTrialseriesId() {
        return this.trialseriesId;
    }

    public void setTrialseriesId(Integer trialseriesId) {
        this.trialseriesId = trialseriesId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Phenotypedata (");

        sb.append(id);
        sb.append(", ").append(phenotypeId);
        sb.append(", ").append(germinatebaseId);
        sb.append(", ").append(phenotypeValue);
        sb.append(", ").append(datasetId);
        sb.append(", ").append(recordingDate);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(updatedOn);
        sb.append(", ").append(locationId);
        sb.append(", ").append(treatmentId);
        sb.append(", ").append(trialseriesId);

        sb.append(")");
        return sb.toString();
    }
// @formatter:on
}
