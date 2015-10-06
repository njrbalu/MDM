
/*
 * The following source code ("Code") may only be used in accordance with the terms
 * and conditions of the license agreement you have with IBM Corporation. The Code 
 * is provided to you on an "AS IS" basis, without warranty of any kind.  
 * SUBJECT TO ANY STATUTORY WARRANTIES WHICH CAN NOT BE EXCLUDED, IBM MAKES NO 
 * WARRANTIES OR CONDITIONS EITHER EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED 
 * TO, THE IMPLIED WARRANTIES OR CONDITIONS OF MERCHANTABILITY, FITNESS FOR A 
 * PARTICULAR PURPOSE, AND NON-INFRINGEMENT, REGARDING THE CODE. IN NO EVENT WILL 
 * IBM BE LIABLE TO YOU OR ANY PARTY FOR ANY DIRECT, INDIRECT, SPECIAL OR OTHER 
 * CONSEQUENTIAL DAMAGES FOR ANY USE OF THE CODE, INCLUDING, WITHOUT LIMITATION, 
 * LOSS OF, OR DAMAGE TO, DATA, OR LOST PROFITS, BUSINESS, REVENUE, GOODWILL, OR 
 * ANTICIPATED SAVINGS, EVEN IF IBM HAS BEEN ADVISED OF THE POSSIBILITY OF SUCH 
 * DAMAGES. SOME JURISDICTIONS DO NOT ALLOW THE EXCLUSION OR LIMITATION OF 
 * INCIDENTAL OR CONSEQUENTIAL DAMAGES, SO THE ABOVE LIMITATION OR EXCLUSION MAY 
 * NOT APPLY TO YOU.
 */

/*
 * IBM-MDMWB-1.0-[3275d1eb5b534bd83e7b7f0c82c988e9]
 */

package com.test.additions.component;

import com.dwl.base.error.DWLError;
import com.dwl.base.error.DWLErrorCode;
import com.dwl.base.error.DWLStatus;
import com.dwl.base.exception.DWLBaseException;
import com.dwl.base.util.DWLFunctionUtils;
import com.dwl.tcrm.common.ITCRMValidation;
import com.dwl.tcrm.common.TCRMErrorCode;
import com.dwl.base.DWLControl;

import com.dwl.tcrm.common.TCRMCommon;



import com.dwl.base.constant.DWLUtilErrorReasonCode;

import com.dwl.base.exception.DWLUpdateException;

import com.dwl.base.util.DWLExceptionUtils;

import com.dwl.tcrm.utilities.TCRMClassFactory;

import com.test.additions.constant.AdditionsComponentID;
import com.test.additions.constant.AdditionsErrorReasonCode;
import com.test.additions.constant.AdditionsPropertyKeys;

import com.test.additions.entityObject.EObjCreditInfo;

import com.test.additions.interfaces.Additions;

/**
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 *
 * This class provides the implementation of the business object
 * <code>CreditInfoBObj</code>.
 * 
 * @see com.dwl.tcrm.common.TCRMCommon
 * @generated
 */
 
public class CreditInfoBObj extends TCRMCommon  {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected EObjCreditInfo eObjCreditInfo;
	/**
    * <!-- begin-user-doc -->
	  * <!-- end-user-doc -->
    * @generated 
    */
	 private final static com.dwl.base.logging.IDWLLogger logger = com.dwl.base.logging.DWLLoggerManager.getLogger(CreditInfoBObj.class);
		
 


    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public CreditInfoBObj() {
        super();
        init();
        eObjCreditInfo = new EObjCreditInfo();
        setComponentID(AdditionsComponentID.CREDIT_INFO_BOBJ);
    }


    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * Initializes the fields required to populate the metaDataMap. Each key is
     * an element-level field of the business object.
     *
     * @generated
     */
    private void init() {
        metaDataMap.put("CreditInfopkId", null);
        metaDataMap.put("PartyId", null);
        metaDataMap.put("CreditScore", null);
        metaDataMap.put("CreditClass", null);
        metaDataMap.put("CreditStatus", null);
        metaDataMap.put("CreditInfoHistActionCode", null);
        metaDataMap.put("CreditInfoHistCreateDate", null);
        metaDataMap.put("CreditInfoHistCreatedBy", null);
        metaDataMap.put("CreditInfoHistEndDate", null);
        metaDataMap.put("CreditInfoHistoryIdPK", null);
        metaDataMap.put("CreditInfoLastUpdateDate", null);
        metaDataMap.put("CreditInfoLastUpdateTxId", null);
        metaDataMap.put("CreditInfoLastUpdateUser", null);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * Refreshes all the attributes this business object supports.
     *
     * @see com.dwl.base.DWLCommon#refreshMap()
     * @generated
     */
    public void refreshMap() {

        if (bRequireMapRefresh) {
            super.refreshMap();
            metaDataMap.put("CreditInfopkId", getCreditInfopkId());
            metaDataMap.put("PartyId", getPartyId());
            metaDataMap.put("CreditScore", getCreditScore());
            metaDataMap.put("CreditClass", getCreditClass());
            metaDataMap.put("CreditStatus", getCreditStatus());
            metaDataMap.put("CreditInfoHistActionCode", getCreditInfoHistActionCode());
            metaDataMap.put("CreditInfoHistCreateDate", getCreditInfoHistCreateDate());
            metaDataMap.put("CreditInfoHistCreatedBy", getCreditInfoHistCreatedBy());
            metaDataMap.put("CreditInfoHistEndDate", getCreditInfoHistEndDate());
            metaDataMap.put("CreditInfoHistoryIdPK", getCreditInfoHistoryIdPK());
            metaDataMap.put("CreditInfoLastUpdateDate", getCreditInfoLastUpdateDate());
            metaDataMap.put("CreditInfoLastUpdateTxId", getCreditInfoLastUpdateTxId());
            metaDataMap.put("CreditInfoLastUpdateUser", getCreditInfoLastUpdateUser());
            bRequireMapRefresh = false;
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * Sets the control object on this business object.
     *
     * @see com.dwl.base.DWLCommon#setControl(DWLControl)
     * @generated
     */
    public void setControl(DWLControl newDWLControl) {
        super.setControl(newDWLControl);

        if (eObjCreditInfo != null) {
            eObjCreditInfo.setControl(newDWLControl);
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * Gets the entity object associated with this business object.
     *
     * @generated
     */
    public EObjCreditInfo getEObjCreditInfo() {
        bRequireMapRefresh = true;
        return eObjCreditInfo;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * Sets the entity object associated with this business object.
     *
     * @param eObjCreditInfo
     *            The eObjCreditInfo to set.
     * @generated
     */
    public void setEObjCreditInfo(EObjCreditInfo eObjCreditInfo) {
        bRequireMapRefresh = true;
        this.eObjCreditInfo = eObjCreditInfo;
        if (this.eObjCreditInfo != null && this.eObjCreditInfo.getControl() == null) {
            DWLControl control = this.getControl();
            if (control != null) {
                this.eObjCreditInfo.setControl(control);
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * Gets the creditInfopkId attribute.
     * 
     * @generated
     */
    public String getCreditInfopkId (){
   
        return DWLFunctionUtils.getStringFromLong(eObjCreditInfo.getCreditInfopkId());
    }
    

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * Sets the creditInfopkId attribute.
     * 
     * @param newCreditInfopkId
     *     The new value of creditInfopkId.
     * @generated
     */
    public void setCreditInfopkId( String newCreditInfopkId ) throws Exception {
        metaDataMap.put("CreditInfopkId", newCreditInfopkId);

        if (newCreditInfopkId == null || newCreditInfopkId.equals("")) {
            newCreditInfopkId = null;


        }
        eObjCreditInfo.setCreditInfopkId( DWLFunctionUtils.getLongFromString(newCreditInfopkId) );
     }
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * Gets the partyId attribute.
     * 
     * @generated
     */
    public String getPartyId (){
   
        return DWLFunctionUtils.getStringFromLong(eObjCreditInfo.getPartyId());
    }
    

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * Sets the partyId attribute.
     * 
     * @param newPartyId
     *     The new value of partyId.
     * @generated
     */
    public void setPartyId( String newPartyId ) throws Exception {
        metaDataMap.put("PartyId", newPartyId);

        if (newPartyId == null || newPartyId.equals("")) {
            newPartyId = null;


        }
        eObjCreditInfo.setPartyId( DWLFunctionUtils.getLongFromString(newPartyId) );
     }
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * Gets the creditScore attribute.
     * 
     * @generated
     */
    public String getCreditScore (){
   
        return DWLFunctionUtils.getStringFromInteger(eObjCreditInfo.getCreditScore());
    }
    

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * Sets the creditScore attribute.
     * 
     * @param newCreditScore
     *     The new value of creditScore.
     * @generated
     */
    public void setCreditScore( String newCreditScore ) throws Exception {
        metaDataMap.put("CreditScore", newCreditScore);

        if (newCreditScore == null || newCreditScore.equals("")) {
            newCreditScore = null;


        }
        eObjCreditInfo.setCreditScore( DWLFunctionUtils.getIntegerFromString(newCreditScore) );
     }
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * Gets the creditClass attribute.
     * 
     * @generated
     */
    public String getCreditClass (){
   
        return eObjCreditInfo.getCreditClass();
    }
    

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * Sets the creditClass attribute.
     * 
     * @param newCreditClass
     *     The new value of creditClass.
     * @generated
     */
    public void setCreditClass( String newCreditClass ) throws Exception {
        metaDataMap.put("CreditClass", newCreditClass);

        if (newCreditClass == null || newCreditClass.equals("")) {
            newCreditClass = null;


        }
        eObjCreditInfo.setCreditClass( newCreditClass );
     }
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * Gets the creditStatus attribute.
     * 
     * @generated
     */
    public String getCreditStatus (){
   
        return eObjCreditInfo.getCreditStatus();
    }
    

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * Sets the creditStatus attribute.
     * 
     * @param newCreditStatus
     *     The new value of creditStatus.
     * @generated
     */
    public void setCreditStatus( String newCreditStatus ) throws Exception {
        metaDataMap.put("CreditStatus", newCreditStatus);

        if (newCreditStatus == null || newCreditStatus.equals("")) {
            newCreditStatus = null;


        }
        eObjCreditInfo.setCreditStatus( newCreditStatus );
     }
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * Gets the LastUpdateTxId attribute.
     *
     * @generated
     */
    public String getCreditInfoLastUpdateTxId() {
        return DWLFunctionUtils.getStringFromLong(eObjCreditInfo.getLastUpdateTxId());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * Gets the LastUpdateUser attribute.
     *
     * @generated
     */
    public String getCreditInfoLastUpdateUser() {
        return eObjCreditInfo.getLastUpdateUser();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * Gets the LastUpdateDt attribute.
     *
     * @generated
     */
    public String getCreditInfoLastUpdateDate() {
        return DWLFunctionUtils.getStringFromTimestamp(eObjCreditInfo.getLastUpdateDt());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * Sets the LastUpdateTxId attribute.
     *
     * @param newLastUpdateTxId
     *     The new value of LastUpdateTxId.
     * @generated
     */
    public void setCreditInfoLastUpdateTxId(String newLastUpdateTxId) {
        metaDataMap.put("CreditInfoLastUpdateTxId", newLastUpdateTxId);

        if ((newLastUpdateTxId == null) || newLastUpdateTxId.equals("")) {
            newLastUpdateTxId = null;
        }
        eObjCreditInfo.setLastUpdateTxId(DWLFunctionUtils.getLongFromString(newLastUpdateTxId));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * Sets the LastUpdateUser attribute.
     *
     * @param newLastUpdateUser
     *     The new value of LastUpdateUser.
     * @generated
     */
    public void setCreditInfoLastUpdateUser(String newLastUpdateUser) {
        metaDataMap.put("CreditInfoLastUpdateUser", newLastUpdateUser);

        if ((newLastUpdateUser == null) || newLastUpdateUser.equals("")) {
            newLastUpdateUser = null;
        }
        eObjCreditInfo.setLastUpdateUser(newLastUpdateUser);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * Sets the LastUpdateDt attribute.
     *
     * @param newLastUpdateDt
     *     The new value of LastUpdateDt.
     * @throws Exception
     * @generated
     */
    public void setCreditInfoLastUpdateDate(String newLastUpdateDt) throws Exception {
        metaDataMap.put("CreditInfoLastUpdateDate", newLastUpdateDt);

        if ((newLastUpdateDt == null) || newLastUpdateDt.equals("")) {
            newLastUpdateDt = null;
        }

        eObjCreditInfo.setLastUpdateDt(DWLFunctionUtils.getTimestampFromTimestampString(newLastUpdateDt));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * Gets the CreditInfoHistActionCode history attribute.
     *
     * @generated
     */
    public String getCreditInfoHistActionCode() {
        return eObjCreditInfo.getHistActionCode();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * Sets the CreditInfoHistActionCode history attribute.
     *
     * @param aCreditInfoHistActionCode
     *     The new value of CreditInfoHistActionCode.
     * @generated
     */
    public void setCreditInfoHistActionCode(String aCreditInfoHistActionCode) {
        metaDataMap.put("CreditInfoHistActionCode", aCreditInfoHistActionCode);

        if ((aCreditInfoHistActionCode == null) || aCreditInfoHistActionCode.equals("")) {
            aCreditInfoHistActionCode = null;
        }
        eObjCreditInfo.setHistActionCode(aCreditInfoHistActionCode);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * Gets the CreditInfoHistCreateDate history attribute.
     *
     * @generated
     */
    public String getCreditInfoHistCreateDate() {
        return DWLFunctionUtils.getStringFromTimestamp(eObjCreditInfo.getHistCreateDt());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * Sets the CreditInfoHistCreateDate history attribute.
     *
     * @param aCreditInfoHistCreateDate
     *     The new value of CreditInfoHistCreateDate.
     * @generated
     */
    public void setCreditInfoHistCreateDate(String aCreditInfoHistCreateDate) throws Exception{
        metaDataMap.put("CreditInfoHistCreateDate", aCreditInfoHistCreateDate);

        if ((aCreditInfoHistCreateDate == null) || aCreditInfoHistCreateDate.equals("")) {
            aCreditInfoHistCreateDate = null;
        }

        eObjCreditInfo.setHistCreateDt(DWLFunctionUtils.getTimestampFromTimestampString(aCreditInfoHistCreateDate));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * Gets the CreditInfoHistCreatedBy history attribute.
     *
     * @generated
     */
    public String getCreditInfoHistCreatedBy() {
        return eObjCreditInfo.getHistCreatedBy();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * Sets the CreditInfoHistCreatedBy history attribute.
     *
     * @param aCreditInfoHistCreatedBy
     *     The new value of CreditInfoHistCreatedBy.
     * @generated
     */
    public void setCreditInfoHistCreatedBy(String aCreditInfoHistCreatedBy) {
        metaDataMap.put("CreditInfoHistCreatedBy", aCreditInfoHistCreatedBy);

        if ((aCreditInfoHistCreatedBy == null) || aCreditInfoHistCreatedBy.equals("")) {
            aCreditInfoHistCreatedBy = null;
        }

        eObjCreditInfo.setHistCreatedBy(aCreditInfoHistCreatedBy);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * Gets the CreditInfoHistEndDate history attribute.
     *
     * @generated
     */
    public String getCreditInfoHistEndDate() {
        return DWLFunctionUtils.getStringFromTimestamp(eObjCreditInfo.getHistEndDt());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * Sets the CreditInfoHistEndDate history attribute.
     *
     * @param aCreditInfoHistEndDate
     *     The new value of CreditInfoHistEndDate.
     * @generated
     */
    public void setCreditInfoHistEndDate(String aCreditInfoHistEndDate) throws Exception{
        metaDataMap.put("CreditInfoHistEndDate", aCreditInfoHistEndDate);

        if ((aCreditInfoHistEndDate == null) || aCreditInfoHistEndDate.equals("")) {
            aCreditInfoHistEndDate = null;
        }
        eObjCreditInfo.setHistEndDt(DWLFunctionUtils.getTimestampFromTimestampString(aCreditInfoHistEndDate));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * Gets the CreditInfoHistoryIdPK history attribute.
     *
     * @generated
     */
    public String getCreditInfoHistoryIdPK() {
        return DWLFunctionUtils.getStringFromLong(eObjCreditInfo.getHistoryIdPK());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * Sets the CreditInfoHistoryIdPK history attribute.
     *
     * @param aCreditInfoHistoryIdPK
     *     The new value of CreditInfoHistoryIdPK.
     * @generated
     */
    public void setCreditInfoHistoryIdPK(String aCreditInfoHistoryIdPK) {
        metaDataMap.put("CreditInfoHistoryIdPK", aCreditInfoHistoryIdPK);

        if ((aCreditInfoHistoryIdPK == null) || aCreditInfoHistoryIdPK.equals("")) {
            aCreditInfoHistoryIdPK = null;
        }
        eObjCreditInfo.setHistoryIdPK(DWLFunctionUtils.getLongFromString(aCreditInfoHistoryIdPK));
    }
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * Perform validation during an add transaction.
     *
     * @generated
     */
    public DWLStatus validateAdd(int level, DWLStatus status) throws Exception {

        status = super.validateAdd(level, status);
        if (level == ITCRMValidation.CONTROLLER_LEVEL_VALIDATION) {
            // MDM_TODO: Add any controller-level custom validation logic to be executed
            // for this object during an "add" transaction

        }

        if (level == ITCRMValidation.COMPONENT_LEVEL_VALIDATION){
            // MDM_TODO: Add any component-level custom validation logic to be executed
            // for this object during an "add" transaction
        }
        status = getValidationStatus(level, status);
        return status;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * Perform validation during an update transaction.
     *
     * @generated
     */
    public DWLStatus validateUpdate(int level, DWLStatus status) throws Exception {
    logger.finest("ENTER validateUpdate(int level, DWLStatus status)");

        status = super.validateUpdate(level, status);
        if (level == ITCRMValidation.CONTROLLER_LEVEL_VALIDATION) {
            // MDM_TODO: Add any controller-level custom validation logic to be executed
            // for this object during an "update" transaction

            if (eObjCreditInfo.getCreditInfopkId() == null) {
                DWLError err = new DWLError();
                err.setComponentType(new Long(AdditionsComponentID.CREDIT_INFO_BOBJ).longValue());
                err.setReasonCode(new Long(AdditionsErrorReasonCode.CREDITINFO_CREDITINFOPKID_NULL).longValue());
                err.setErrorType(DWLErrorCode.FIELD_VALIDATION_ERROR);
                if (logger.isFinestEnabled()) {
                	String infoForLogging="Error: Validation error occured for update. No primary key for entity CreditInfo, component type " +err.getComponentType() + " ReasonCode " +err.getReasonCode() + "  ";
      logger.finest("validateUpdate(int level, DWLStatus status) " + infoForLogging);
                }
                status.addError(err);
            }
            if (eObjCreditInfo.getLastUpdateDt() == null) {
                DWLError err = new DWLError();
                err.setComponentType(new Long(AdditionsComponentID.CREDIT_INFO_BOBJ).longValue());
                err.setReasonCode(new Long(DWLUtilErrorReasonCode.LAST_UPDATED_DATE_NULL).longValue());
                err.setErrorType(DWLErrorCode.FIELD_VALIDATION_ERROR);
                if (logger.isFinestEnabled()) {
                	String infoForLogging="Error: Validation error occured for update. No last update date for entity CreditInfo, component type " +err.getComponentType() + " ReasonCode " +err.getReasonCode() + "  ";
      logger.finest("validateUpdate(int level, DWLStatus status) " + infoForLogging);
                }
                status.addError(err);
            }
        }

        if (level == ITCRMValidation.COMPONENT_LEVEL_VALIDATION){
            assignBeforeImageValues(metaDataMap);
            
            // MDM_TODO: Add any component-level custom validation logic to be executed
            // for this object during an "update" transaction
        }
        status = getValidationStatus(level, status);
        if (logger.isFinestEnabled()) {
        	String returnValue = status.toString();
      logger.finest("RETURN validateUpdate(int level, DWLStatus status) " + returnValue);
    }
        return status;
    }


    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * Populate the before image of this business object.
     *
     * @see com.dwl.base.DWLCommon#populateBeforeImage()
     * @generated
     */
    public void populateBeforeImage() throws DWLBaseException {
    logger.finest("ENTER populateBeforeImage()");

        Additions comp = null;
        try {
        
      comp = (Additions)TCRMClassFactory.getTCRMComponent(AdditionsPropertyKeys.ADDITIONS_COMPONENT);
        	
        } catch (Exception e) {
        	if (logger.isFinestEnabled()) {
        String infoForLogging="Error: Fatal error while updating record " + e.getMessage();
      logger.finest("populateBeforeImage() " + infoForLogging);
            }
            DWLExceptionUtils.throwDWLBaseException(e, 
            									new DWLUpdateException(e.getMessage()), 
            									this.getStatus(), DWLStatus.FATAL,
                                  AdditionsComponentID.CREDIT_INFO_BOBJ, 
                                  "DIERR",
                                  AdditionsErrorReasonCode.CREDITINFO_BEFORE_IMAGE_NOT_POPULATED, 
                                  this.getControl());
        }
        
        comp.loadBeforeImage(this);
    logger.finest("RETURN populateBeforeImage()");
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * Perform validation common to both add and update transactions.
     *
     * @generated
     */
     
    private DWLStatus getValidationStatus(int level, DWLStatus status) throws Exception {
    logger.finest("ENTER getValidationStatus(int level, DWLStatus status)");

        if (level == ITCRMValidation.CONTROLLER_LEVEL_VALIDATION) {
            // MDM_TODO: Add any common controller-level custom validation logic to be
            // executed for this object during either "add" or "update"
            // transactions

            boolean isCreditInfopkIdNull = (eObjCreditInfo.getCreditInfopkId() == null);
            boolean isPartyIdNull = (eObjCreditInfo.getPartyId() == null);
            boolean isCreditScoreNull = (eObjCreditInfo.getCreditScore() == null);
                
            boolean isCreditClassNull = false;
            if (eObjCreditInfo.getCreditClass() == null || eObjCreditInfo.getCreditClass().trim().equals("")) {
                isCreditClassNull = true;
            }
                
            boolean isCreditStatusNull = false;
            if (eObjCreditInfo.getCreditStatus() == null || eObjCreditInfo.getCreditStatus().trim().equals("")) {
                isCreditStatusNull = true;
            }
        }

        if (level == ITCRMValidation.COMPONENT_LEVEL_VALIDATION){
            // MDM_TODO: Add any common component-level custom validation logic to be
            // executed for this object during either "add" or "update"
            // transactions

            boolean isCreditInfopkIdNull = (eObjCreditInfo.getCreditInfopkId() == null);
            boolean isPartyIdNull = (eObjCreditInfo.getPartyId() == null);
            if( isPartyIdNull){
                DWLError err = new DWLError();
                err.setComponentType(new Long(AdditionsComponentID.CREDIT_INFO_BOBJ).longValue());
                err.setReasonCode(new Long(AdditionsErrorReasonCode.CREDITINFO_PARTYID_NULL).longValue());
                err.setErrorType(DWLErrorCode.FIELD_VALIDATION_ERROR);
                if (logger.isFinestEnabled()) {
                    String infoForLogging="Error: Validation error occured. Property PartyId is null, in entity CreditInfo, component type " +err.getComponentType() + " ReasonCode " +err.getReasonCode() + "  ";
      logger.finest("getValidationStatus(int level, DWLStatus status) " + infoForLogging);
                }
                status.addError(err);
            }
            boolean isCreditScoreNull = (eObjCreditInfo.getCreditScore() == null);
            if( isCreditScoreNull){
                DWLError err = new DWLError();
                err.setComponentType(new Long(AdditionsComponentID.CREDIT_INFO_BOBJ).longValue());
                err.setReasonCode(new Long(AdditionsErrorReasonCode.CREDITINFO_CREDITSCORE_NULL).longValue());
                err.setErrorType(DWLErrorCode.FIELD_VALIDATION_ERROR);
                if (logger.isFinestEnabled()) {
                    String infoForLogging="Error: Validation error occured. Property CreditScore is null, in entity CreditInfo, component type " +err.getComponentType() + " ReasonCode " +err.getReasonCode() + "  ";
      logger.finest("getValidationStatus(int level, DWLStatus status) " + infoForLogging);
                }
                status.addError(err);
            }
            boolean isCreditClassNull = false;
            if (eObjCreditInfo.getCreditClass() == null || eObjCreditInfo.getCreditClass().trim().equals("")) {
                isCreditClassNull = true;
            }
            if( isCreditClassNull){
                DWLError err = new DWLError();
                err.setComponentType(new Long(AdditionsComponentID.CREDIT_INFO_BOBJ).longValue());
                err.setReasonCode(new Long(AdditionsErrorReasonCode.CREDITINFO_CREDITCLASS_NULL).longValue());
                err.setErrorType(DWLErrorCode.FIELD_VALIDATION_ERROR);
                if (logger.isFinestEnabled()) {
                    String infoForLogging="Error: Validation error occured. Property CreditClass is null, in entity CreditInfo, component type " +err.getComponentType() + " ReasonCode " +err.getReasonCode() + "  ";
      logger.finest("getValidationStatus(int level, DWLStatus status) " + infoForLogging);
                }
                status.addError(err);
            }
            boolean isCreditStatusNull = false;
            if (eObjCreditInfo.getCreditStatus() == null || eObjCreditInfo.getCreditStatus().trim().equals("")) {
                isCreditStatusNull = true;
            }
            if( isCreditStatusNull){
                DWLError err = new DWLError();
                err.setComponentType(new Long(AdditionsComponentID.CREDIT_INFO_BOBJ).longValue());
                err.setReasonCode(new Long(AdditionsErrorReasonCode.CREDITINFO_CREDITSTATUS_NULL).longValue());
                err.setErrorType(DWLErrorCode.FIELD_VALIDATION_ERROR);
                if (logger.isFinestEnabled()) {
                    String infoForLogging="Error: Validation error occured. Property CreditStatus is null, in entity CreditInfo, component type " +err.getComponentType() + " ReasonCode " +err.getReasonCode() + "  ";
      logger.finest("getValidationStatus(int level, DWLStatus status) " + infoForLogging);
                }
                status.addError(err);
            }
        }
        
        if (logger.isFinestEnabled()) {
            String returnValue = status.toString();
      logger.finest("RETURN getValidationStatus(int level, DWLStatus status) " + returnValue);
        }
    
        return status;
    }
    



}

