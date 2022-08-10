/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables.pojos;


import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Arrays;

import jhi.germinate.server.database.pojo.DublinCore;

import org.jooq.types.ULong;


// @formatter:off
/**
 * VIEW
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ViewTableDatasets implements Serializable {

    private static final long serialVersionUID = 1L;

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
    private Long                 publications;
    private Long                 fileresources;
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
        this.publications = value.publications;
        this.fileresources = value.fileresources;
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
        Long                 publications,
        Long                 fileresources,
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
        this.publications = publications;
        this.fileresources = fileresources;
        this.collaborators = collaborators;
        this.attributes = attributes;
        this.acceptedBy = acceptedBy;
    }

    /**
     * Getter for <code>germinate_db.view_table_datasets.dataset_id</code>.
     * Primary id for this table. This uniquely identifies the row.
     */
    public Integer getDatasetId() {
        return this.datasetId;
    }

    /**
     * Setter for <code>germinate_db.view_table_datasets.dataset_id</code>.
     * Primary id for this table. This uniquely identifies the row.
     */
    public void setDatasetId(Integer datasetId) {
        this.datasetId = datasetId;
    }

    /**
     * Getter for <code>germinate_db.view_table_datasets.dataset_name</code>.
     * Describes the dataset.
     */
    public String getDatasetName() {
        return this.datasetName;
    }

    /**
     * Setter for <code>germinate_db.view_table_datasets.dataset_name</code>.
     * Describes the dataset.
     */
    public void setDatasetName(String datasetName) {
        this.datasetName = datasetName;
    }

    /**
     * Getter for
     * <code>germinate_db.view_table_datasets.dataset_description</code>. The
     * name of this dataset.
     */
    public String getDatasetDescription() {
        return this.datasetDescription;
    }

    /**
     * Setter for
     * <code>germinate_db.view_table_datasets.dataset_description</code>. The
     * name of this dataset.
     */
    public void setDatasetDescription(String datasetDescription) {
        this.datasetDescription = datasetDescription;
    }

    /**
     * Getter for <code>germinate_db.view_table_datasets.hyperlink</code>. Link
     * to access the external dasets.
     */
    public String getHyperlink() {
        return this.hyperlink;
    }

    /**
     * Setter for <code>germinate_db.view_table_datasets.hyperlink</code>. Link
     * to access the external dasets.
     */
    public void setHyperlink(String hyperlink) {
        this.hyperlink = hyperlink;
    }

    /**
     * Getter for <code>germinate_db.view_table_datasets.source_file</code>.
     */
    public String getSourceFile() {
        return this.sourceFile;
    }

    /**
     * Setter for <code>germinate_db.view_table_datasets.source_file</code>.
     */
    public void setSourceFile(String sourceFile) {
        this.sourceFile = sourceFile;
    }

    /**
     * Getter for <code>germinate_db.view_table_datasets.version</code>. Dataset
     * version if this exists.
     */
    public String getVersion() {
        return this.version;
    }

    /**
     * Setter for <code>germinate_db.view_table_datasets.version</code>. Dataset
     * version if this exists.
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * Getter for <code>germinate_db.view_table_datasets.dataset_type</code>.
     * Describes the experiment type.
     */
    public String getDatasetType() {
        return this.datasetType;
    }

    /**
     * Setter for <code>germinate_db.view_table_datasets.dataset_type</code>.
     * Describes the experiment type.
     */
    public void setDatasetType(String datasetType) {
        this.datasetType = datasetType;
    }

    /**
     * Getter for <code>germinate_db.view_table_datasets.experiment_id</code>.
     * Primary id for this table. This uniquely identifies the row.
     */
    public Integer getExperimentId() {
        return this.experimentId;
    }

    /**
     * Setter for <code>germinate_db.view_table_datasets.experiment_id</code>.
     * Primary id for this table. This uniquely identifies the row.
     */
    public void setExperimentId(Integer experimentId) {
        this.experimentId = experimentId;
    }

    /**
     * Getter for <code>germinate_db.view_table_datasets.experiment_name</code>.
     * The name of the experiment.
     */
    public String getExperimentName() {
        return this.experimentName;
    }

    /**
     * Setter for <code>germinate_db.view_table_datasets.experiment_name</code>.
     * The name of the experiment.
     */
    public void setExperimentName(String experimentName) {
        this.experimentName = experimentName;
    }

    /**
     * Getter for
     * <code>germinate_db.view_table_datasets.experiment_description</code>.
     * Describes the experiment.
     */
    public String getExperimentDescription() {
        return this.experimentDescription;
    }

    /**
     * Setter for
     * <code>germinate_db.view_table_datasets.experiment_description</code>.
     * Describes the experiment.
     */
    public void setExperimentDescription(String experimentDescription) {
        this.experimentDescription = experimentDescription;
    }

    /**
     * Getter for <code>germinate_db.view_table_datasets.datatype</code>. A
     * description of the data type of the contained data. Examples might be:
     * "raw data", "BLUPs", etc.
     */
    public String getDatatype() {
        return this.datatype;
    }

    /**
     * Setter for <code>germinate_db.view_table_datasets.datatype</code>. A
     * description of the data type of the contained data. Examples might be:
     * "raw data", "BLUPs", etc.
     */
    public void setDatatype(String datatype) {
        this.datatype = datatype;
    }

    /**
     * Getter for <code>germinate_db.view_table_datasets.dataset_state</code>.
     * Defines the datasetstate.
     */
    public String getDatasetState() {
        return this.datasetState;
    }

    /**
     * Setter for <code>germinate_db.view_table_datasets.dataset_state</code>.
     * Defines the datasetstate.
     */
    public void setDatasetState(String datasetState) {
        this.datasetState = datasetState;
    }

    /**
     * Getter for <code>germinate_db.view_table_datasets.locations</code>.
     */
    public ViewTableLocations[] getLocations() {
        return this.locations;
    }

    /**
     * Setter for <code>germinate_db.view_table_datasets.locations</code>.
     */
    public void setLocations(ViewTableLocations[] locations) {
        this.locations = locations;
    }

    /**
     * Getter for <code>germinate_db.view_table_datasets.license_id</code>.
     */
    public Integer getLicenseId() {
        return this.licenseId;
    }

    /**
     * Setter for <code>germinate_db.view_table_datasets.license_id</code>.
     */
    public void setLicenseId(Integer licenseId) {
        this.licenseId = licenseId;
    }

    /**
     * Getter for <code>germinate_db.view_table_datasets.license_name</code>.
     */
    public String getLicenseName() {
        return this.licenseName;
    }

    /**
     * Setter for <code>germinate_db.view_table_datasets.license_name</code>.
     */
    public void setLicenseName(String licenseName) {
        this.licenseName = licenseName;
    }

    /**
     * Getter for <code>germinate_db.view_table_datasets.contact</code>. The
     * contact to get more information about this dataset.
     */
    public String getContact() {
        return this.contact;
    }

    /**
     * Setter for <code>germinate_db.view_table_datasets.contact</code>. The
     * contact to get more information about this dataset.
     */
    public void setContact(String contact) {
        this.contact = contact;
    }

    /**
     * Getter for <code>germinate_db.view_table_datasets.start_date</code>. Date
     * that the dataset was generated.
     */
    public Date getStartDate() {
        return this.startDate;
    }

    /**
     * Setter for <code>germinate_db.view_table_datasets.start_date</code>. Date
     * that the dataset was generated.
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * Getter for <code>germinate_db.view_table_datasets.end_date</code>. Date
     * at which the dataset recording ended.
     */
    public Date getEndDate() {
        return this.endDate;
    }

    /**
     * Setter for <code>germinate_db.view_table_datasets.end_date</code>. Date
     * at which the dataset recording ended.
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    /**
     * Getter for <code>germinate_db.view_table_datasets.dublin_core</code>.
     */
    public DublinCore getDublinCore() {
        return this.dublinCore;
    }

    /**
     * Setter for <code>germinate_db.view_table_datasets.dublin_core</code>.
     */
    public void setDublinCore(DublinCore dublinCore) {
        this.dublinCore = dublinCore;
    }

    /**
     * Getter for <code>germinate_db.view_table_datasets.created_on</code>. When
     * the record was created.

     */
    public Timestamp getCreatedOn() {
        return this.createdOn;
    }

    /**
     * Setter for <code>germinate_db.view_table_datasets.created_on</code>. When
     * the record was created.

     */
    public void setCreatedOn(Timestamp createdOn) {
        this.createdOn = createdOn;
    }

    /**
     * Getter for <code>germinate_db.view_table_datasets.updated_on</code>. When
     * the record was updated. This may be different from the created on date if
     * subsequent changes have been made to the underlying record.
     */
    public Timestamp getUpdatedOn() {
        return this.updatedOn;
    }

    /**
     * Setter for <code>germinate_db.view_table_datasets.updated_on</code>. When
     * the record was updated. This may be different from the created on date if
     * subsequent changes have been made to the underlying record.
     */
    public void setUpdatedOn(Timestamp updatedOn) {
        this.updatedOn = updatedOn;
    }

    /**
     * Getter for
     * <code>germinate_db.view_table_datasets.data_object_count</code>. The
     * number of data objects contained in this dataset.
     */
    public ULong getDataObjectCount() {
        return this.dataObjectCount;
    }

    /**
     * Setter for
     * <code>germinate_db.view_table_datasets.data_object_count</code>. The
     * number of data objects contained in this dataset.
     */
    public void setDataObjectCount(ULong dataObjectCount) {
        this.dataObjectCount = dataObjectCount;
    }

    /**
     * Getter for
     * <code>germinate_db.view_table_datasets.data_point_count</code>. The
     * number of individual data points contained in this dataset.
     */
    public ULong getDataPointCount() {
        return this.dataPointCount;
    }

    /**
     * Setter for
     * <code>germinate_db.view_table_datasets.data_point_count</code>. The
     * number of individual data points contained in this dataset.
     */
    public void setDataPointCount(ULong dataPointCount) {
        this.dataPointCount = dataPointCount;
    }

    /**
     * Getter for <code>germinate_db.view_table_datasets.is_external</code>.
     * Defines if the dataset is contained within Germinate or from an external
     * source and not stored in the database.
     */
    public Boolean getIsExternal() {
        return this.isExternal;
    }

    /**
     * Setter for <code>germinate_db.view_table_datasets.is_external</code>.
     * Defines if the dataset is contained within Germinate or from an external
     * source and not stored in the database.
     */
    public void setIsExternal(Boolean isExternal) {
        this.isExternal = isExternal;
    }

    /**
     * Getter for <code>germinate_db.view_table_datasets.publications</code>.
     */
    public Long getPublications() {
        return this.publications;
    }

    /**
     * Setter for <code>germinate_db.view_table_datasets.publications</code>.
     */
    public void setPublications(Long publications) {
        this.publications = publications;
    }

    /**
     * Getter for <code>germinate_db.view_table_datasets.fileresources</code>.
     */
    public Long getFileresources() {
        return this.fileresources;
    }

    /**
     * Setter for <code>germinate_db.view_table_datasets.fileresources</code>.
     */
    public void setFileresources(Long fileresources) {
        this.fileresources = fileresources;
    }

    /**
     * Getter for <code>germinate_db.view_table_datasets.collaborators</code>.
     */
    public Long getCollaborators() {
        return this.collaborators;
    }

    /**
     * Setter for <code>germinate_db.view_table_datasets.collaborators</code>.
     */
    public void setCollaborators(Long collaborators) {
        this.collaborators = collaborators;
    }

    /**
     * Getter for <code>germinate_db.view_table_datasets.attributes</code>.
     */
    public Long getAttributes() {
        return this.attributes;
    }

    /**
     * Setter for <code>germinate_db.view_table_datasets.attributes</code>.
     */
    public void setAttributes(Long attributes) {
        this.attributes = attributes;
    }

    /**
     * Getter for <code>germinate_db.view_table_datasets.accepted_by</code>.
     */
    public Integer[] getAcceptedBy() {
        return this.acceptedBy;
    }

    /**
     * Setter for <code>germinate_db.view_table_datasets.accepted_by</code>.
     */
    public void setAcceptedBy(Integer[] acceptedBy) {
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
        sb.append(", ").append(publications);
        sb.append(", ").append(fileresources);
        sb.append(", ").append(collaborators);
        sb.append(", ").append(attributes);
        sb.append(", ").append(Arrays.toString(acceptedBy));

        sb.append(")");
        return sb.toString();
    }
    // @formatter:on
}
