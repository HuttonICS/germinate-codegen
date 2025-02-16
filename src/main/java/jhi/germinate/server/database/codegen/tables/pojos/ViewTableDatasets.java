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
public class ViewTableDatasets implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer                 datasetId;
    private String                  datasetName;
    private String                  datasetDescription;
    private String                  hyperlink;
    private String                  sourceFile;
    private String                  version;
    private String                  datasetType;
    private Integer                 experimentId;
    private String                  experimentName;
    private String                  experimentDescription;
    private Integer                 projectId;
    private String                  projectName;
    private String                  projectDescription;
    private String                  datatype;
    private String                  datasetState;
    private ViewTableLocations[]    locations;
    private ViewTableInstitutions[] institutions;
    private Integer                 licenseId;
    private String                  licenseName;
    private String                  contact;
    private Date                    startDate;
    private Date                    endDate;
    private DublinCore              dublinCore;
    private Timestamp               createdOn;
    private Timestamp               updatedOn;
    private ULong                   dataObjectCount;
    private ULong                   dataPointCount;
    private Boolean                 isExternal;
    private Long                    publications;
    private Integer[]               fileresourceIds;
    private Long                    collaborators;
    private Long                    attributes;
    private Integer[]               acceptedBy;

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
        this.projectId = value.projectId;
        this.projectName = value.projectName;
        this.projectDescription = value.projectDescription;
        this.datatype = value.datatype;
        this.datasetState = value.datasetState;
        this.locations = value.locations;
        this.institutions = value.institutions;
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
        this.fileresourceIds = value.fileresourceIds;
        this.collaborators = value.collaborators;
        this.attributes = value.attributes;
        this.acceptedBy = value.acceptedBy;
    }

    public ViewTableDatasets(
        Integer                 datasetId,
        String                  datasetName,
        String                  datasetDescription,
        String                  hyperlink,
        String                  sourceFile,
        String                  version,
        String                  datasetType,
        Integer                 experimentId,
        String                  experimentName,
        String                  experimentDescription,
        Integer                 projectId,
        String                  projectName,
        String                  projectDescription,
        String                  datatype,
        String                  datasetState,
        ViewTableLocations[]    locations,
        ViewTableInstitutions[] institutions,
        Integer                 licenseId,
        String                  licenseName,
        String                  contact,
        Date                    startDate,
        Date                    endDate,
        DublinCore              dublinCore,
        Timestamp               createdOn,
        Timestamp               updatedOn,
        ULong                   dataObjectCount,
        ULong                   dataPointCount,
        Boolean                 isExternal,
        Long                    publications,
        Integer[]               fileresourceIds,
        Long                    collaborators,
        Long                    attributes,
        Integer[]               acceptedBy
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
        this.projectId = projectId;
        this.projectName = projectName;
        this.projectDescription = projectDescription;
        this.datatype = datatype;
        this.datasetState = datasetState;
        this.locations = locations;
        this.institutions = institutions;
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
        this.fileresourceIds = fileresourceIds;
        this.collaborators = collaborators;
        this.attributes = attributes;
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
        sb.append(", ").append(projectId);
        sb.append(", ").append(projectName);
        sb.append(", ").append(projectDescription);
        sb.append(", ").append(datatype);
        sb.append(", ").append(datasetState);
        sb.append(", ").append(Arrays.toString(locations));
        sb.append(", ").append(Arrays.toString(institutions));
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
        sb.append(", ").append(Arrays.toString(fileresourceIds));
        sb.append(", ").append(collaborators);
        sb.append(", ").append(attributes);
        sb.append(", ").append(Arrays.toString(acceptedBy));

        sb.append(")");
        return sb.toString();
    }
    // @formatter:on
}
