/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables.pojos;


import com.google.gson.JsonArray;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


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
public class ViewTableMarkers implements Serializable {

    private static final long serialVersionUID = -1217835040;

    private Integer   markerId;
    private String    markerName;
    private String    markerType;
    private JsonArray markerSynonyms;
    private Timestamp createdOn;
    private Timestamp updatedOn;

    public ViewTableMarkers() {}

    public ViewTableMarkers(ViewTableMarkers value) {
        this.markerId = value.markerId;
        this.markerName = value.markerName;
        this.markerType = value.markerType;
        this.markerSynonyms = value.markerSynonyms;
        this.createdOn = value.createdOn;
        this.updatedOn = value.updatedOn;
    }

    public ViewTableMarkers(
        Integer   markerId,
        String    markerName,
        String    markerType,
        JsonArray markerSynonyms,
        Timestamp createdOn,
        Timestamp updatedOn
    ) {
        this.markerId = markerId;
        this.markerName = markerName;
        this.markerType = markerType;
        this.markerSynonyms = markerSynonyms;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
    }

    public Integer getMarkerId() {
        return this.markerId;
    }

    public void setMarkerId(Integer markerId) {
        this.markerId = markerId;
    }

    public String getMarkerName() {
        return this.markerName;
    }

    public void setMarkerName(String markerName) {
        this.markerName = markerName;
    }

    public String getMarkerType() {
        return this.markerType;
    }

    public void setMarkerType(String markerType) {
        this.markerType = markerType;
    }

    public JsonArray getMarkerSynonyms() {
        return this.markerSynonyms;
    }

    public void setMarkerSynonyms(JsonArray markerSynonyms) {
        this.markerSynonyms = markerSynonyms;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ViewTableMarkers (");

        sb.append(markerId);
        sb.append(", ").append(markerName);
        sb.append(", ").append(markerType);
        sb.append(", ").append(markerSynonyms);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(updatedOn);

        sb.append(")");
        return sb.toString();
    }
// @formatter:on
}
