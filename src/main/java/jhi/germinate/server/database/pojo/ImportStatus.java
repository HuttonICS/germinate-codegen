package jhi.germinate.server.database.pojo;

public enum ImportStatus
{
	GENERIC_DUPLICATE_COLUMN,
	GENERIC_IO_ERROR,
	GENERIC_MISSING_EXCEL_SHEET,
	GENERIC_MISSING_COLUMN,
	GENERIC_MISSING_REQUIRED_VALUE,
	GENERIC_MISSING_DB_ITEM_UPDATE,
	GENERIC_VALUE_TOO_LONG,
	GENERIC_INVALID_COUNTRY_CODE,
	GENERIC_INVALID_NUMBER,
	GENERIC_INVALID_DATE,
	GENERIC_INVALID_MARKER,
	GENERIC_INVALID_LOCATION,
	GENERIC_INVALID_GERMPLASM,
	GROUP_INVALID_GROUP_VISIBILITY,
	GROUP_INVALID_CELL_VALUE,
	GROUP_HEADER_MISMATCH,
	MCPD_DUPLICATE_ACCENUMB,
	MCPD_MISSING_FIELD,
	MCPD_INVALID_SAMPSTAT,
	MCPD_INVALID_COLLSRC,
	MCPD_INVALID_STORAGE,
	MCPD_INVALID_ENTITY_TYPE,
	MCPD_INVALID_ENTITY_PARENT_ACCENUMB,
	MCPD_MISSING_ACCENUMB,
	TRIALS_INVALID_TRAIT_DATATYPE,
	TRIALS_INVALID_TRAIT_CATEGORIES,
	TRIALS_MISSING_TRAIT_DECLARATION,
	TRIALS_DATA_DATE_HEADER_MISMATCH,
	TRIALS_DATA_DATE_IDENTIFIER_MISMATCH,
	TRIALS_DATA_VIOLATES_RESTRICTION,
	COMPOUND_DATA_DATE_HEADER_MISMATCH,
	COMPOUND_DATA_DATE_IDENTIFIER_MISMATCH,
	COMPOUND_MISSING_COMPOUND_DECLARATION,
	GENOTYPE_MISSING_ROW,
	GENOTYPE_HEADER_LENGTH_MISMATCH;

	private ImportStatus()
	{
	}
}
