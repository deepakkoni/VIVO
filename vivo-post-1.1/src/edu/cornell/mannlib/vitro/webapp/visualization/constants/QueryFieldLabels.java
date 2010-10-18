/* $This file is distributed under the terms of the license in /doc/license.txt$ */

package edu.cornell.mannlib.vitro.webapp.visualization.constants;

/**
 * Thsi contains the sparql fields which are used to capture data for the value objects.  
 * @author cdtank
 */
public class QueryFieldLabels {
	
	/*
	 * Generic Query related field labels 
	 * */
	public static final String PREDICATE = "predicateLit";
	public static final String OBJECT = "objectLit";
	
	
	/*
	 * Document related field labels 
	 * */
	public static final String DOCUMENT_URL = "documentLit";
	public static final String DOCUMENT_MONIKER = "documentMonikerLit";
	public static final String DOCUMENT_LABEL = "documentLabelLit";
	public static final String DOCUMENT_BLURB = "documentBlurbLit";
	public static final String DOCUMENT_DESCRIPTION = "documentDescriptionLit";
	public static final String DOCUMENT_PUBLICATION_YEAR = "publicationYearLit";
	public static final String DOCUMENT_PUBLICATION_YEAR_MONTH = "publicationYearMonthLit";
	public static final String DOCUMENT_PUBLICATION_DATE = "publicationDateLit";
	
	/*
	 * Image related field labels
	 * */
	public static final String THUMBNAIL_LOCATION_URL = "thumbnailDownloadLocationLit";
	public static final String THUMBNAIL_FILENAME = "thumbnailFileNameLit";
	
	/*
	 * Author related field labels
	 * */
	public static final String AUTHOR_URL = "authPersonLit";
	public static final String AUTHOR_LABEL = "authorLabelLit";
	
	/*
	 * Co-Author related field labels
	 * */
	public static final String CO_AUTHOR_URL = "coAuthPersonLit";
	public static final String CO_AUTHOR_LABEL = "coAuthPersonLabelLit";
	
	/*
	 * College related field labels 
	 * */
	public static final String COLLEGE_URL = "collegeLit";
	public static final String COLLEGE_LABEL = "collegeLabelLit";
	

	
	/*
	 * Employee related field labels 
	 * */
	public static final String ACADEMIC_FACULTY_EMPLOYEE_URL = "academicFacultyEmployeeLit";
	public static final String ACADEMIC_STAFF_EMPLOYEE_URL = "academicStaffEmployeeLit";
	
	/*
	 * Person related field Labels
	 */
	public static final String PERSON_URL = "personLit";
	public static final String PERSON_LABEL = "personLabelLit";
	
	
	/*
	 * Position related field labels
	 */
	public static final String SECONDARY_POSITION_LABEL = "SecondaryPositionLabelLit";
	
	/*
	 * start year related field labels
	 */
	public static final String START_YEAR_LABEL = "StartYearLit";
	
	
	/*
	 * Organization related field Labels
	 */
	public static final String ORGANIZATION_URL = "organizationLit";
	public static final String ORGANIZATION_LABEL = "organizationLabelLit";
	
	/*
	 * Sub Organization related field labels
	 */
	public static final String SUBORGANIZATION_URL = "subOrganizationLit";
	public static final String SUBORGANIZATION_LABEL = "subOrganizationLabelLit";
	
	/*
	 * Department related field labels 
	 * */
	public static final String DEPARTMENT_URL = "departmentLit";
	public static final String DEPARTMENT_LABEL = "departmentLabelLit";	

}
