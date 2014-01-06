package com.smartsheet.api.internal;

import java.util.List;

import com.smartsheet.api.SheetRowResources;
import com.smartsheet.api.internal.*;
import com.smartsheet.api.models.*;

/**
 * This is the implementation of the SheetRowResources.
 * 
 * Thread Safety:
 * This class is thread safe because it is immutable and its base class is thread safe.
 */
public class SheetRowResourcesImpl implements SheetRowResources {
    /**
     * Constructor.
     * 
     * Parameters:
     * - smartsheet : the SmartsheetImpl
     * 
     * Exceptions:
     * - IllegalArgumentException : if any argument is null
     * 
     * Implementation:
     * super(smartsheet);
     * @param smartsheet 
     */
    public SheetRowResourcesImpl(SmartsheetImpl smartsheet) {
    }

    /**
     * Insert rows to a sheet.
     * 
     * It mirrors to the following Smartsheet REST API method:
     * POST /sheet/{id}/rows
     * 
     * Parameters:
     * - sheetId : the ID of the sheet
     * - rowWrapper : the RowWrapper object, one of the following attributes should be specified:
     * * toTop : Inserts the rows at the top of the sheet.
     * * toBottom : Inserts the rows at the bottom of the sheet
     * * parentId : Inserts the rows as the first child row of the parent. toBottom=true can also be set to add the row as the last child of the parent.
     * * siblingId : Inserts the row as the next sibling of the row ID provided.
     * 
     * Returns:
     * the created rows
     * 
     * Exceptions:
     * - IllegalArgumentException : if any argument is null
     * - InvalidRequestException : if there is any problem with the REST API request
     * - AuthorizationException : if there is any problem with the REST API authorization(access token)
     * - ResourceNotFoundException : if the resource can not be found
     * - ServiceUnavailableException : if the REST API service is not available (possibly due to rate limiting)
     * - SmartsheetRestException : if there is any other REST API related error occurred during the operation
     * - SmartsheetException : if there is any other error occurred during the operation
     * 
     * Implementation:
     * return this.postAndReceiveList("sheet/" + sheetId + "/rows", rowWrapper, Row.class);
     * @param sheetId 
     * @param rowWrapper 
     * @return 
     */
    public List<Row> insertRows(long sheetId, RowWrapper rowWrapper) {
        return null;
    }

    /**
     * Get a row.
     * 
     * It mirrors to the following Smartsheet REST API method:
     * GET /sheet/{id}/row/{number}
     * 
     * Parameters:
     * - sheetId : the ID of the sheet
     * - rowNumber : the row number
     * 
     * Returns:
     * the row (note that if there is no such resource, this method will throw ResourceNotFoundException rather than returning null).
     * 
     * Exceptions:
     * - InvalidRequestException : if there is any problem with the REST API request
     * - AuthorizationException : if there is any problem with the REST API authorization(access token)
     * - ResourceNotFoundException : if the resource can not be found
     * - ServiceUnavailableException : if the REST API service is not available (possibly due to rate limiting)
     * - SmartsheetRestException : if there is any other REST API related error occurred during the operation
     * - SmartsheetException : if there is any other error occurred during the operation
     * 
     * Implementation:
     * return this.getResource("sheet/" + sheetId + "/row/" + rowNumber, Row.class);
     * @param id 
     * @param rowNumber 
     * @return 
     */
    public Row getRow(long id, int rowNumber) {
        return null;
    }
}

