/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;

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
public class ViewTableLocations implements Serializable {

    private static final long serialVersionUID = -623094097;

    private Integer    locationId;
    private String     locationName;
    private String     locationNameShort;
    private String     locationRegion;
    private String     locationState;
    private String     locationType;
    private BigDecimal locationLatitude;
    private BigDecimal locationLongitude;
    private BigDecimal locationElevation;
    private Integer    locationCoordinateUncertainty;
    private Integer    countryId;
    private String     countryName;
    private String     countryCode2;
    private String     countryCode3;

    public ViewTableLocations() {}

    public ViewTableLocations(ViewTableLocations value) {
        this.locationId = value.locationId;
        this.locationName = value.locationName;
        this.locationNameShort = value.locationNameShort;
        this.locationRegion = value.locationRegion;
        this.locationState = value.locationState;
        this.locationType = value.locationType;
        this.locationLatitude = value.locationLatitude;
        this.locationLongitude = value.locationLongitude;
        this.locationElevation = value.locationElevation;
        this.locationCoordinateUncertainty = value.locationCoordinateUncertainty;
        this.countryId = value.countryId;
        this.countryName = value.countryName;
        this.countryCode2 = value.countryCode2;
        this.countryCode3 = value.countryCode3;
    }

    public ViewTableLocations(
        Integer    locationId,
        String     locationName,
        String     locationNameShort,
        String     locationRegion,
        String     locationState,
        String     locationType,
        BigDecimal locationLatitude,
        BigDecimal locationLongitude,
        BigDecimal locationElevation,
        Integer    locationCoordinateUncertainty,
        Integer    countryId,
        String     countryName,
        String     countryCode2,
        String     countryCode3
    ) {
        this.locationId = locationId;
        this.locationName = locationName;
        this.locationNameShort = locationNameShort;
        this.locationRegion = locationRegion;
        this.locationState = locationState;
        this.locationType = locationType;
        this.locationLatitude = locationLatitude;
        this.locationLongitude = locationLongitude;
        this.locationElevation = locationElevation;
        this.locationCoordinateUncertainty = locationCoordinateUncertainty;
        this.countryId = countryId;
        this.countryName = countryName;
        this.countryCode2 = countryCode2;
        this.countryCode3 = countryCode3;
    }

    public Integer getLocationId() {
        return this.locationId;
    }

    public void setLocationId(Integer locationId) {
        this.locationId = locationId;
    }

    public String getLocationName() {
        return this.locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public String getLocationNameShort() {
        return this.locationNameShort;
    }

    public void setLocationNameShort(String locationNameShort) {
        this.locationNameShort = locationNameShort;
    }

    public String getLocationRegion() {
        return this.locationRegion;
    }

    public void setLocationRegion(String locationRegion) {
        this.locationRegion = locationRegion;
    }

    public String getLocationState() {
        return this.locationState;
    }

    public void setLocationState(String locationState) {
        this.locationState = locationState;
    }

    public String getLocationType() {
        return this.locationType;
    }

    public void setLocationType(String locationType) {
        this.locationType = locationType;
    }

    public BigDecimal getLocationLatitude() {
        return this.locationLatitude;
    }

    public void setLocationLatitude(BigDecimal locationLatitude) {
        this.locationLatitude = locationLatitude;
    }

    public BigDecimal getLocationLongitude() {
        return this.locationLongitude;
    }

    public void setLocationLongitude(BigDecimal locationLongitude) {
        this.locationLongitude = locationLongitude;
    }

    public BigDecimal getLocationElevation() {
        return this.locationElevation;
    }

    public void setLocationElevation(BigDecimal locationElevation) {
        this.locationElevation = locationElevation;
    }

    public Integer getLocationCoordinateUncertainty() {
        return this.locationCoordinateUncertainty;
    }

    public void setLocationCoordinateUncertainty(Integer locationCoordinateUncertainty) {
        this.locationCoordinateUncertainty = locationCoordinateUncertainty;
    }

    public Integer getCountryId() {
        return this.countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public String getCountryName() {
        return this.countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryCode2() {
        return this.countryCode2;
    }

    public void setCountryCode2(String countryCode2) {
        this.countryCode2 = countryCode2;
    }

    public String getCountryCode3() {
        return this.countryCode3;
    }

    public void setCountryCode3(String countryCode3) {
        this.countryCode3 = countryCode3;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ViewTableLocations (");

        sb.append(locationId);
        sb.append(", ").append(locationName);
        sb.append(", ").append(locationNameShort);
        sb.append(", ").append(locationRegion);
        sb.append(", ").append(locationState);
        sb.append(", ").append(locationType);
        sb.append(", ").append(locationLatitude);
        sb.append(", ").append(locationLongitude);
        sb.append(", ").append(locationElevation);
        sb.append(", ").append(locationCoordinateUncertainty);
        sb.append(", ").append(countryId);
        sb.append(", ").append(countryName);
        sb.append(", ").append(countryCode2);
        sb.append(", ").append(countryCode3);

        sb.append(")");
        return sb.toString();
    }
// @formatter:on
}
