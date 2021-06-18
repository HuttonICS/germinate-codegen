/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables.pojos;


import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Arrays;

import javax.annotation.Generated;

import jhi.germinate.server.database.pojo.DublinCore;

import org.jooq.types.ULong;


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
public class ViewTableDatasets implements Serializable {

    private static final long serialVersionUID = 249499348;

    private Integer              datasetId;
    private String               datasetName;
    private String               datasetDescription;
    private String               hyperlink;
    private String               sourceFile;
    private String               version;
    private String               datasetType;
    private Integer              experimentId;
    private String               experimentName;
    private String               experimentDescription;
    private String               datatype;
    private String               datasetState;
    private ViewTableLocations[] locations;
    private Integer              licenseId;
    private String               licenseName;
    private String               contact;
    private Date                 startDate;
    private Date                 endDate;
    private DublinCore           dublinCore;
    private Timestamp            createdOn;
    private Timestamp            updatedOn;
    private ULong                dataObjectCount;
    private ULong                dataPointCount;
    private Boolean              isExternal;
    private Long                 collaborators;
    private Long                 attributes;
    private Integer[]            acceptedBy;

    public ViewTableDatasets() {}

    public ViewTableDatasets(ViewTableDatasets value) {
        this.datasetId = value.datasetId;
        this.datasetName = value.datasetName;
        this.datasetDescription = value.datasetDescription;
        this.hyperlink = value.hyperlink;
        this.sourceFile = value.sourceFile;
        this.version = value.version;
        this.datasetType = value.datasetType;
        this.experimentId = value.experimentId;
        this.experimentName = value.experimentName;
        this.experimentDescription = value.experimentDescription;
        this.datatype = value.datatype;
        this.datasetState = value.datasetState;
        this.locations = value.locations;
        this.licenseId = value.licenseId;
        this.licenseName = value.licenseName;
        this.contact = value.contact;
        this.startDate = value.startDate;
        this.endDate = value.endDate;
        this.dublinCore = value.dublinCore;
        this.createdOn = value.createdOn;
        this.updatedOn = value.updatedOn;
        this.dataObjectCount = value.dataObjectCount;
        this.dataPointCount = value.dataPointCount;
        this.isExternal = value.isExternal;
        this.collaborators = value.collaborators;
        this.attributes = value.attributes;
        this.acceptedBy = value.acceptedBy;
    }

    public ViewTableDatasets(
        Integer              datasetId,
        String               datasetName,
        String               datasetDescription,
        String               hyperlink,
        String               sourceFile,
        String               version,
        String               datasetType,
        Integer              experimentId,
        String               experimentName,
        String               experimentDescription,
        String               datatype,
        String               datasetState,
        ViewTableLocations[] locations,
        Integer              licenseId,
        String               licenseName,
        String               contact,
        Date                 startDate,
        Date                 endDate,
        DublinCore           dublinCore,
        Timestamp            createdOn,
        Timestamp            updatedOn,
        ULong                dataObjectCount,
        ULong                dataPointCount,
        Boolean              isExternal,
        Long                 collaborators,
        Long                 attributes,
        Integer[]            acceptedBy
    ) {
        this.datasetId = datasetId;
        this.datasetName = datasetName;
        this.datasetDescription = datasetDescription;
        this.hyperlink = hyperlink;
        this.sourceFile = sourceFile;
        this.version = version;
        this.datasetType = datasetType;
        this.experimentId = experimentId;
        this.experimentName = experimentName;
        this.experimentDescription = experimentDescription;
        this.datatype = datatype;
        this.datasetState = datasetState;
        this.locations = locations;
        this.licenseId = licenseId;
        this.licenseName = licenseName;
        this.contact = contact;
        this.startDate = startDate;
        this.endDate = endDate;
        this.dublinCore = dublinCore;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
        this.dataObjectCount = dataObjectCount;
        this.dataPointCount = dataPointCount;
        this.isExternal = isExternal;
        this.collaborators = collaborators;
        this.attributes = attributes;
        this.acceptedBy = acceptedBy;
    }

    public Integer getDatasetId() {
        return this.datasetId;
    }

    public void setDatasetId(Integer datasetId) {
        this.datasetId = datasetId;
    }

    public String getDatasetName() {
        return this.datasetName;
    }

    public void setDatasetName(String datasetName) {
        this.datasetName = datasetName;
    }

    public String getDatasetDescription() {
        return this.datasetDescription;
    }

    public void setDatasetDescription(String datasetDescription) {
        this.datasetDescription = datasetDescription;
    }

    public String getHyperlink() {
        return this.hyperlink;
    }

    public void setHyperlink(String hyperlink) {
        this.hyperlink = hyperlink;
    }

    public String getSourceFile() {
        return this.sourceFile;
    }

    public void setSourceFile(String sourceFile) {
        this.sourceFile = sourceFile;
    }

    public String getVersion() {
        return this.version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getDatasetType() {
        return this.datasetType;
    }

    public void setDatasetType(String datasetType) {
        this.datasetType = datasetType;
    }

    public Integer getExperimentId() {
        return this.experimentId;
    }

    public void setExperimentId(Integer experimentId) {
        this.experimentId = experimentId;
    }

    public String getExperimentName() {
        return this.experimentName;
    }

    public void setExperimentName(String experimentName) {
        this.experimentName = experimentName;
    }

    public String getExperimentDescription() {
        return this.experimentDescription;
    }

    public void setExperimentDescription(String experimentDescription) {
        this.experimentDescription = experimentDescription;
    }

    public String getDatatype() {
        return this.datatype;
    }

    public void setDatatype(String datatype) {
        this.datatype = datatype;
    }

    public String getDatasetState() {
        return this.datasetState;
    }

    public void setDatasetState(String datasetState) {
        this.datasetState = datasetState;
    }

    public ViewTableLocations[] getLocations() {
        return this.locations;
    }

    public void setLocations(ViewTableLocations... locations) {
        this.locations = locations;
    }

    public Integer getLicenseId() {
        return this.licenseId;
    }

    public void setLicenseId(Integer licenseId) {
        this.licenseId = licenseId;
    }

    public String getLicenseName() {
        return this.licenseName;
    }

    public void setLicenseName(String licenseName) {
        this.licenseName = licenseName;
    }

    public String getContact() {
        return this.contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public Date getStartDate() {
        return this.startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return this.endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public DublinCore getDublinCore() {
        return this.dublinCore;
    }

    public void setDublinCore(DublinCore dublinCore) {
        this.dublinCore = dublinCore;
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

    public ULong getDataObjectCount() {
        return this.dataObjectCount;
    }

    public void setDataObjectCount(ULong dataObjectCount) {
        this.dataObjectCount = dataObjectCount;
    }

    public ULong getDataPointCount() {
        return this.dataPointCount;
    }

    public void setDataPointCount(ULong dataPointCount) {
        this.dataPointCount = dataPointCount;
    }

    public Boolean getIsExternal() {
        return this.isExternal;
    }

    public void setIsExternal(Boolean isExternal) {
        this.isExternal = isExternal;
    }

    public Long getCollaborators() {
        return this.collaborators;
    }

    public void setCollaborators(Long collaborators) {
        this.collaborators = collaborators;
    }

    public Long getAttributes() {
        return this.attributes;
    }

    public void setAttributes(Long attributes) {
        this.attributes = attributes;
    }

    public Integer[] getAcceptedBy() {
        return this.acceptedBy;
    }

    public void setAcceptedBy(Integer... acceptedBy) {
        this.acceptedBy = acceptedBy;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ViewTableDatasets (");

        sb.append(datasetId);
        sb.append(", ").append(datasetName);
        sb.append(", ").append(datasetDescription);
        sb.append(", ").append(hyperlink);
        sb.append(", ").append(sourceFile);
        sb.append(", ").append(version);
        sb.append(", ").append(datasetType);
        sb.append(", ").append(experimentId);
        sb.append(", ").append(experimentName);
        sb.append(", ").append(experimentDescription);
        sb.append(", ").append(datatype);
        sb.append(", ").append(datasetState);
        sb.append(", ").append(Arrays.toString(locations));
        sb.append(", ").append(licenseId);
        sb.append(", ").append(licenseName);
        sb.append(", ").append(contact);
        sb.append(", ").append(startDate);
        sb.append(", ").append(endDate);
        sb.append(", ").append(dublinCore);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(updatedOn);
        sb.append(", ").append(dataObjectCount);
        sb.append(", ").append(dataPointCount);
        sb.append(", ").append(isExternal);
        sb.append(", ").append(collaborators);
        sb.append(", ").append(attributes);
        sb.append(", ").append(Arrays.toString(acceptedBy));

        sb.append(")");
        return sb.toString();
    }
// @formatter:on
}
