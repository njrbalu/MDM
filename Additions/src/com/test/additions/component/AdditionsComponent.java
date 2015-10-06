
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
 * IBM-MDMWB-1.0-[fd45cc17b5dae0df690b961aa88d98d2]
 */

package com.test.additions.component;

import com.dwl.base.DWLControl;
import com.dwl.common.globalization.util.ResourceBundleHelper;
import com.dwl.base.DWLResponse;
import com.dwl.base.constant.DWLControlKeys;
import com.dwl.base.error.DWLStatus;
import com.dwl.base.exception.DWLBaseException;
import com.dwl.base.requestHandler.DWLTransaction;
import com.dwl.base.util.DWLFunctionUtils;
import com.dwl.tcrm.common.TCRMErrorCode;
import com.dwl.tcrm.utilities.TCRMClassFactory;
import com.dwl.base.util.DWLClassFactory;
import com.ibm.mdm.annotations.Component;
import com.ibm.mdm.annotations.TxMetadata;


import com.dwl.base.IDWLErrorMessage;

import com.dwl.base.exception.DWLUpdateException;

import com.dwl.base.requestHandler.DWLTransactionInquiry;
import com.dwl.base.requestHandler.DWLTransactionPersistent;

import com.dwl.base.util.DWLExceptionUtils;

import com.dwl.bobj.query.BObjQuery;
import com.dwl.bobj.query.BObjQueryException;
import com.dwl.bobj.query.Persistence;

import com.dwl.tcrm.common.TCRMCommonComponent;

import com.dwl.tcrm.exception.TCRMInsertException;
import com.dwl.tcrm.exception.TCRMReadException;

import com.dwl.tcrm.utilities.FunctionUtils;
import com.dwl.tcrm.utilities.StringUtils;
import com.dwl.tcrm.utilities.TCRMExceptionUtils;

import com.ibm.mdm.common.brokers.BObjPersistenceFactoryBroker;
import com.ibm.mdm.common.brokers.BObjQueryFactoryBroker;

import com.test.additions.bobj.query.AdditionsModuleBObjPersistenceFactory;
import com.test.additions.bobj.query.AdditionsModuleBObjQueryFactory;
import com.test.additions.bobj.query.CreditInfoBObjQuery;

import com.test.additions.component.CreditInfoBObj;

import com.test.additions.constant.AdditionsComponentID;
import com.test.additions.constant.AdditionsErrorReasonCode;
import com.test.additions.constant.ResourceBundleNames;

import com.test.additions.interfaces.Additions;

import java.sql.Timestamp;

import java.util.Vector;

/**
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 *
 * Business component class for handling Additions related transactions and
 * inquiries.
 * @generated
 */
 @Component(errorComponentID = AdditionsComponentID.ADDITIONS_COMPONENT)
public class AdditionsComponent extends TCRMCommonComponent implements Additions {
	
	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
	private final static String EXCEPTION_DUPLICATE_KEY = "Exception_Shared_DuplicateKey";

	/**
    * <!-- begin-user-doc -->
	  * <!-- end-user-doc -->
    * @generated 
    */
	 private final static com.dwl.base.logging.IDWLLogger logger = com.dwl.base.logging.DWLLoggerManager.getLogger(AdditionsComponent.class);
			
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    private IDWLErrorMessage errHandler;
    

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * Default constructor.
     *
     * @generated
     */
    public AdditionsComponent() {
        super();
        errHandler = TCRMClassFactory.getErrorHandler();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * Gets the BObjQuery factory class from the configuration.
     * @generated
     **/
    private AdditionsModuleBObjQueryFactory getBObjQueryFactory() throws BObjQueryException{
        return (AdditionsModuleBObjQueryFactory) BObjQueryFactoryBroker.getBObjQueryFactory(AdditionsModuleBObjQueryFactory.class.getName());
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * Gets the BObjPersistenceFactory class from the configuration.
     * @generated
     **/
    private AdditionsModuleBObjPersistenceFactory getBObjPersistenceFactory() throws BObjQueryException {
        return (AdditionsModuleBObjPersistenceFactory) BObjPersistenceFactoryBroker.getBObjPersistenceFactory(AdditionsModuleBObjPersistenceFactory.class.getName());
    }




	
	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * Executes the transaction getCreditInfo.
     *
     * @param CreditInfopkId
     * @return com.dwl.base.DWLResponse
     * @exception DWLBaseException
     * @see #handleGetCreditInfo
     * @generated
     */
     @TxMetadata(actionCategory=DWLControlKeys.VIEW_ACTION_CATEGORY,
       txErrorCode=TCRMErrorCode.READ_RECORD_ERROR,
       txErrorReasonCode = AdditionsErrorReasonCode.GETCREDITINFO_FAILED,
       beforePreExecuteMethod = "beforePreExecuteGetCreditInfo"
    )
     public DWLResponse getCreditInfo(String CreditInfopkId,  DWLControl control) throws DWLBaseException {
    logger.finest("ENTER getCreditInfo(String CreditInfopkId,  DWLControl control)");
        Vector params = new Vector();
        params.add(CreditInfopkId);
        DWLTransaction txObj = new  DWLTransactionInquiry("getCreditInfo", params, control);
        DWLResponse retObj = null;
        if (logger.isFinestEnabled()) {
        	String infoForLogging="Before execution of transaction getCreditInfo.";
      logger.finest("getCreditInfo(String CreditInfopkId,  DWLControl control) " + infoForLogging);
        }
        retObj = executeTx(txObj);
        if (logger.isFinestEnabled()) {
        	String infoForLogging="After execution of transaction getCreditInfo.";
      logger.finest("getCreditInfo(String CreditInfopkId,  DWLControl control) " + infoForLogging);
        	String returnValue=retObj.toString();
      logger.finest("RETURN getCreditInfo(String CreditInfopkId,  DWLControl control) " + returnValue);
        }
        return retObj;
    }
    
    
     
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * Gets a CreditInfo from the database.
     * 
     * @generated
     */
    public DWLResponse handleGetCreditInfo(String CreditInfopkId,  DWLControl control) throws Exception {
        DWLStatus status = new DWLStatus();
        DWLResponse response = createDWLResponse();
        
        BObjQuery bObjQuery = null;
           
        String asOfDate = (String) control.get(DWLControl.INQUIRE_AS_OF_DATE);

        // History data inquiry: if inquireAsOfDate field has value in request xml 
        if (StringUtils.isNonBlank(asOfDate)) {
            Timestamp tsAsOfDate = getPITHistoryDate(asOfDate, AdditionsComponentID.ADDITIONS_COMPONENT,
                                                     AdditionsErrorReasonCode.GETCREDITINFO_INVALID_INQUIRE_AS_OF_DATE_FORMAT,
                                                     status, control);

            bObjQuery = getBObjQueryFactory().createCreditInfoBObjQuery(CreditInfoBObjQuery.CREDIT_INFO_HISTORY_QUERY,
                		control);
            bObjQuery.setParameter(0, DWLFunctionUtils.getLongFromString(CreditInfopkId));
            bObjQuery.setParameter(1, tsAsOfDate);
            bObjQuery.setParameter(2, tsAsOfDate);
        } else {
            bObjQuery = getBObjQueryFactory().createCreditInfoBObjQuery(CreditInfoBObjQuery.CREDIT_INFO_QUERY,
                		control);
            bObjQuery.setParameter(0, DWLFunctionUtils.getLongFromString(CreditInfopkId));
        }


        CreditInfoBObj o = (CreditInfoBObj) bObjQuery.getSingleResult();
        if( o == null ){
        	return null;
        } 
          
        if (o.getStatus()==null) {
            o.setStatus(status);
        }
        response.addStatus(o.getStatus());
        response.setData(o);

      return response;
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public void beforePreExecuteGetCreditInfo(DWLTransaction transaction) throws DWLBaseException{
        // Check if the parameters are valid.
        Object[] arguments = getInquiryArgumentType((DWLTransactionInquiry)transaction);
        String pk = null;
        if (arguments!=null && arguments.length>0) {
            pk = (String)arguments[0];
        }
        // Check if the parameter passed in exists.
        if ((pk == null) || (pk.trim().length() == 0)) {
            TCRMExceptionUtils.throwTCRMException(null, new TCRMReadException(), transaction.getStatus(), DWLStatus.FATAL,
                AdditionsComponentID.CREDIT_INFO_BOBJ,
                TCRMErrorCode.FIELD_VALIDATION_ERROR,
                AdditionsErrorReasonCode.CREDITINFO_CREDITINFOPKID_NULL,
                transaction.getTxnControl(), errHandler);
        }
    }

	
	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * Executes the transaction getCreditInfobyPartyId.
     *
     * @param PartyId
     * @return com.dwl.base.DWLResponse
     * @exception DWLBaseException
     * @see #handleGetCreditInfobyPartyId
     * @generated
     */
     @TxMetadata(actionCategory=DWLControlKeys.VIEW_ACTION_CATEGORY,
       txErrorCode=TCRMErrorCode.READ_RECORD_ERROR,
       txErrorReasonCode = AdditionsErrorReasonCode.GETCREDITINFOBYPARTYID_FAILED,
       beforePreExecuteMethod = "beforePreExecuteGetCreditInfobyPartyId"
    )
     public DWLResponse getCreditInfobyPartyId(String PartyId,  DWLControl control) throws DWLBaseException {
    logger.finest("ENTER getCreditInfobyPartyId(String PartyId,  DWLControl control)");
        Vector params = new Vector();
        params.add(PartyId);
        DWLTransaction txObj = new  DWLTransactionInquiry("getCreditInfobyPartyId", params, control);
        DWLResponse retObj = null;
        if (logger.isFinestEnabled()) {
        	String infoForLogging="Before execution of transaction getCreditInfobyPartyId.";
      logger.finest("getCreditInfobyPartyId(String PartyId,  DWLControl control) " + infoForLogging);
        }
        retObj = executeTx(txObj);
        if (logger.isFinestEnabled()) {
        	String infoForLogging="After execution of transaction getCreditInfobyPartyId.";
      logger.finest("getCreditInfobyPartyId(String PartyId,  DWLControl control) " + infoForLogging);
        	String returnValue=retObj.toString();
      logger.finest("RETURN getCreditInfobyPartyId(String PartyId,  DWLControl control) " + returnValue);
        }
        return retObj;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * Gets a CreditInfo from the database.
     * 
     * @generated
     */
    public DWLResponse handleGetCreditInfobyPartyId(String PartyId,  DWLControl control) throws Exception {
        DWLStatus status = new DWLStatus();
        DWLResponse response = createDWLResponse();
        
        BObjQuery bObjQuery = null;
           
        String asOfDate = (String) control.get(DWLControl.INQUIRE_AS_OF_DATE);

        // History data inquiry: if inquireAsOfDate field has value in request xml 
        if (StringUtils.isNonBlank(asOfDate)) {
            Timestamp tsAsOfDate = getPITHistoryDate(asOfDate, AdditionsComponentID.ADDITIONS_COMPONENT,
                                                     AdditionsErrorReasonCode.GETCREDITINFOBYPARTYID_INVALID_INQUIRE_AS_OF_DATE_FORMAT,
                                                     status, control);

            bObjQuery = getBObjQueryFactory().createCreditInfoBObjQuery(CreditInfoBObjQuery.CREDIT_INFOBY_PARTY_ID_HISTORY_QUERY,
                		control);
            bObjQuery.setParameter(0, DWLFunctionUtils.getLongFromString(PartyId));
            bObjQuery.setParameter(1, tsAsOfDate);
            bObjQuery.setParameter(2, tsAsOfDate);
        } else {
            bObjQuery = getBObjQueryFactory().createCreditInfoBObjQuery(CreditInfoBObjQuery.CREDIT_INFOBY_PARTY_ID_QUERY,
                		control);
            bObjQuery.setParameter(0, DWLFunctionUtils.getLongFromString(PartyId));
        }


        CreditInfoBObj o = (CreditInfoBObj) bObjQuery.getSingleResult();
        if( o == null ){
        	return null;
        } 
          
        if (o.getStatus()==null) {
            o.setStatus(status);
        }
        response.addStatus(o.getStatus());
        response.setData(o);

      return response;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public void beforePreExecuteGetCreditInfobyPartyId(DWLTransaction transaction) throws DWLBaseException{
        // Check if the parameters are valid.
        Object[] arguments = getInquiryArgumentType((DWLTransactionInquiry)transaction);

        // MDM_TODO: Add argument validation logic
    }

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * Executes the transaction addCreditInfo.
     *
     * @param theBObj
     * @return com.dwl.base.DWLResponse
     * @exception DWLBaseException
     * @see #handleAddCreditInfo
     * @generated
     */
     @TxMetadata(actionCategory=DWLControlKeys.ADD_ACTION_CATEGORY,
       txErrorCode=TCRMErrorCode.INSERT_RECORD_ERROR,
       txErrorReasonCode = AdditionsErrorReasonCode.ADDCREDITINFO_FAILED
    )
     public DWLResponse addCreditInfo(CreditInfoBObj theBObj) throws DWLBaseException {
    logger.finest("ENTER addCreditInfo(CreditInfoBObj theBObj)");
        DWLTransaction txObj = new DWLTransactionPersistent("addCreditInfo", theBObj, theBObj.getControl());
        DWLResponse retObj = null;
        if (logger.isFinestEnabled()) {
        	String infoForLogging="Before execution of transaction addCreditInfo.";
      logger.finest("addCreditInfo(CreditInfoBObj theBObj) " + infoForLogging);
        }
        retObj = executeTx(txObj);
        if (logger.isFinestEnabled()) {
        	String infoForLogging="After execution of transaction addCreditInfo.";
      logger.finest("addCreditInfo(CreditInfoBObj theBObj) " + infoForLogging);
        	String returnValue=retObj.toString();
      logger.finest("RETURN addCreditInfo(CreditInfoBObj theBObj) " + returnValue);
        }
        return retObj;
    }
    
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * Adds a CreditInfo to the database.
     *
     * @param theCreditInfoBObj
     *     The object that contains CreditInfo attribute values.
     * @return
     *     DWLResponse containing a CreditInfoBObj object.
     * @exception Exception
     * @generated
     */
    public DWLResponse handleAddCreditInfo(CreditInfoBObj theCreditInfoBObj) throws Exception {
        DWLResponse response = null;
        DWLStatus status = theCreditInfoBObj.getStatus();
        if (status == null) {
            status = new DWLStatus();
            theCreditInfoBObj.setStatus(status);
        }

        String strPluggableID = null;

        try {
            // Pluggable Key Structure implementation
            strPluggableID = getSuppliedIdPKFromBObj(theCreditInfoBObj);

            if ((strPluggableID != null) && (strPluggableID.length() > 0)) {
                theCreditInfoBObj.getEObjCreditInfo().setCreditInfopkId(FunctionUtils.getLongFromString(strPluggableID));
            } else {
                strPluggableID = null;
                theCreditInfoBObj.getEObjCreditInfo().setCreditInfopkId(null);
            }
         Persistence theCreditInfoBObjPersistence = getBObjPersistenceFactory().createCreditInfoBObjPersistence(CreditInfoBObjQuery.CREDIT_INFO_ADD, theCreditInfoBObj);
         theCreditInfoBObjPersistence.persistAdd();
       
            response = new DWLResponse();
            response.setData(theCreditInfoBObj);
            response.setStatus(theCreditInfoBObj.getStatus());
    } catch (Exception ex) {
 				TCRMExceptionUtils.throwTCRMException(ex, new TCRMInsertException(ex.getMessage()), status,
                    DWLStatus.FATAL, AdditionsComponentID.ADDITIONS_COMPONENT, TCRMErrorCode.INSERT_RECORD_ERROR,
                    AdditionsErrorReasonCode.ADDCREDITINFO_FAILED, theCreditInfoBObj.getControl(), errHandler);
        }
        
        return response;
    }

    

	
	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * Executes the transaction updateCreditInfo.
     *
     * @param theBObj
     * @return com.dwl.base.DWLResponse
     * @exception DWLBaseException
     * @see #handleUpdateCreditInfo
     * @generated
     */
     @TxMetadata(actionCategory=DWLControlKeys.UPDATE_ACTION_CATEGORY,
       txErrorCode=TCRMErrorCode.UPDATE_RECORD_ERROR,
       txErrorReasonCode = AdditionsErrorReasonCode.UPDATECREDITINFO_FAILED
    )
     public DWLResponse updateCreditInfo(CreditInfoBObj theBObj) throws DWLBaseException {
    logger.finest("ENTER updateCreditInfo(CreditInfoBObj theBObj)");
        DWLTransaction txObj = new DWLTransactionPersistent("updateCreditInfo", theBObj, theBObj.getControl());
        DWLResponse retObj = null;
        if (logger.isFinestEnabled()) {
        	String infoForLogging="Before execution of transaction updateCreditInfo.";
      logger.finest("updateCreditInfo(CreditInfoBObj theBObj) " + infoForLogging);
        }
        retObj = executeTx(txObj);
        if (logger.isFinestEnabled()) {
        	String infoForLogging="After execution of transaction updateCreditInfo.";
      logger.finest("updateCreditInfo(CreditInfoBObj theBObj) " + infoForLogging);
        	String returnValue=retObj.toString();
      logger.finest("RETURN updateCreditInfo(CreditInfoBObj theBObj) " + returnValue);
        }
        return retObj;
    }
    
    

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * Updates the specified CreditInfo with new attribute values.
     *
     * @param theCreditInfoBObj
     *     The object that contains CreditInfo attribute values to be updated
     * @return
     *     DWLResponse containing a CreditInfoBObj of the updated object.
     * @exception Exception
     * @generated
     */
    public DWLResponse handleUpdateCreditInfo(CreditInfoBObj theCreditInfoBObj) throws Exception {

        DWLStatus status = theCreditInfoBObj.getStatus();

        if (status == null) {
            status = new DWLStatus();
            theCreditInfoBObj.setStatus(status);
        }
        
            // set lastupdatetxid with txnid from dwlcontrol
            theCreditInfoBObj.getEObjCreditInfo().setLastUpdateTxId(new Long(theCreditInfoBObj.getControl().getTxnId()));
         Persistence theCreditInfoBObjPersistence = getBObjPersistenceFactory().createCreditInfoBObjPersistence(CreditInfoBObjQuery.CREDIT_INFO_UPDATE, theCreditInfoBObj);
         theCreditInfoBObjPersistence.persistUpdate();

        DWLResponse response = createDWLResponse();
        response.setData(theCreditInfoBObj);
        response.setStatus(theCreditInfoBObj.getStatus());

        return response;
    }



    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     **/
    public void loadBeforeImage(CreditInfoBObj bObj) throws DWLBaseException {
    logger.finest("ENTER loadBeforeImage(CreditInfoBObj bObj)");
    	if( bObj.BeforeImage() == null ){
    	
    		CreditInfoBObj beforeImage = null;
    		DWLResponse response = null;
    		
    		try {
    			response = getCreditInfo( bObj.getCreditInfopkId(), bObj.getControl());
    			beforeImage = (CreditInfoBObj)response.getData();
    			
    		} catch( Exception e){
    			if (logger.isFinestEnabled()) {
    				String infoForLogging="Error: Exception " + e.getMessage() + " while updating a record ";
      logger.finest("loadBeforeImage(CreditInfoBObj bObj) " + infoForLogging);
              }
              DWLExceptionUtils.throwDWLBaseException(e, 
            									new DWLUpdateException(e.getMessage()), 
            									bObj.getStatus(), DWLStatus.FATAL,
                                  AdditionsComponentID.CREDIT_INFO_BOBJ, 
                                  "DIERR",
                                  AdditionsErrorReasonCode.CREDITINFO_BEFORE_IMAGE_NOT_POPULATED, 
                                  bObj.getControl(), errHandler);
    		}
    		
    		if( beforeImage == null ){
    		    if (logger.isFinestEnabled()) {
    		    	String infoForLogging="Error: Before image for updating a record is null ";
      logger.finest("loadBeforeImage(CreditInfoBObj bObj) " + infoForLogging);
          	}
              DWLExceptionUtils.throwDWLBaseException( new DWLUpdateException(), 
            									bObj.getStatus(), DWLStatus.FATAL,
                                  AdditionsComponentID.CREDIT_INFO_BOBJ, 
                                  "DIERR",
                                  AdditionsErrorReasonCode.CREDITINFO_BEFORE_IMAGE_NOT_POPULATED, 
                                  bObj.getControl(), errHandler);
    		}
    		
    		bObj.setBeforeImage(beforeImage);
    		
    	}
    logger.finest("RETURN loadBeforeImage(CreditInfoBObj bObj)");
    }
	 


    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * Builds duplicated key throwable message. There are only two elements in
     * the vector, one is the primary key, and the other is the class name.
     * @generated
     **/
    private String buildDupThrowableMessage(String[] errParams) {
    return ResourceBundleHelper.resolve(
        ResourceBundleNames.COMMON_SERVICES_STRINGS,
        EXCEPTION_DUPLICATE_KEY, errParams);

    }
  

}

