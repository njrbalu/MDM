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
 * IBM-MDMWB-1.0-[3f2037d5451020e0823e925e9ae26d60]
 */

package com.test.additions.controller;


import com.dwl.base.DWLControl;
import com.dwl.base.IDWLErrorMessage;
import com.dwl.base.constant.DWLControlKeys;
import com.dwl.base.requestHandler.DWLTransaction;
import com.dwl.base.requestHandler.DWLTransactionInquiry;
import com.dwl.tcrm.common.TCRMCommonComponent;
import com.dwl.tcrm.common.TCRMErrorCode;
import com.dwl.base.DWLResponse;
import com.dwl.base.exception.DWLBaseException;
import com.dwl.tcrm.utilities.TCRMClassFactory;
import com.ibm.mdm.annotations.Controller;
import com.ibm.mdm.annotations.TxMetadata;


import com.dwl.base.error.DWLStatus;

import com.dwl.base.util.DWLExceptionUtils;

import com.test.additions.constant.AdditionsComponentID;
import com.test.additions.constant.AdditionsErrorReasonCode;
import com.test.additions.constant.AdditionsPropertyKeys;

import com.test.additions.interfaces.Additions;
import com.test.additions.interfaces.AdditionsFinder;

import java.util.Vector;

/**
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 *
 * Controller class to handle inquiry requests.
 * @generated
 */
 @Controller(errorComponentID = AdditionsComponentID.ADDITIONS_CONTROLLER)
public class AdditionsFinderImpl extends TCRMCommonComponent implements AdditionsFinder {

    private IDWLErrorMessage errHandler;
	/**
    * <!-- begin-user-doc -->
	  * <!-- end-user-doc -->
    * @generated 
    */
	 private final static com.dwl.base.logging.IDWLLogger logger = com.dwl.base.logging.DWLLoggerManager.getLogger(AdditionsFinderImpl.class);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * Default constructor.
     * @generated
     */
    public AdditionsFinderImpl() {
        super();
        errHandler = TCRMClassFactory.getErrorHandler();
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
       txErrorReasonCode = AdditionsErrorReasonCode.GETCREDITINFO_FAILED)
     public DWLResponse getCreditInfo(String CreditInfopkId,  DWLControl control) throws DWLBaseException {
    logger.finest("ENTER getCreditInfo(String CreditInfopkId,  DWLControl control)");
        Vector params = new Vector();
        params.add(CreditInfopkId);
        DWLTransaction txObj = new DWLTransactionInquiry("getCreditInfo", params, control);
        DWLResponse retObj = null;
        if (logger.isFinestEnabled()) {
      String infoForLogging="Before finder transaction execution for getCreditInfo";
      logger.finest("getCreditInfo(String CreditInfopkId,  DWLControl control) " + infoForLogging);
        }
        retObj = executeTx(txObj);
        if (logger.isFinestEnabled()) {
       		String infoForLogging="After finder transaction execution for getCreditInfo";
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
     * Performs the business logic for transaction getCreditInfo.
     * 
     * @param CreditInfopkId
     * @return com.dwl.base.DWLResponse
     * @exception Exception
     * @generated
     */
    public DWLResponse  handleGetCreditInfo(String CreditInfopkId,  DWLControl control) throws Exception {

        DWLResponse response = new DWLResponse();

    Additions comp = 
      (Additions)TCRMClassFactory.getTCRMComponent(AdditionsPropertyKeys.ADDITIONS_COMPONENT);
      
        response = comp.getCreditInfo(CreditInfopkId,  control);
        if (response.getData() == null) {
            String[] params = new String[] { CreditInfopkId };
            DWLExceptionUtils.addErrorToStatus(response.getStatus(), DWLStatus.FATAL,
          AdditionsComponentID.ADDITIONS_CONTROLLER,
          TCRMErrorCode.READ_RECORD_ERROR,
          AdditionsErrorReasonCode.GETCREDITINFO_FAILED,
          control, params, errHandler);					
        }
        return response;
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
       txErrorReasonCode = AdditionsErrorReasonCode.GETCREDITINFOBYPARTYID_FAILED)
     public DWLResponse getCreditInfobyPartyId(String PartyId,  DWLControl control) throws DWLBaseException {
    logger.finest("ENTER getCreditInfobyPartyId(String PartyId,  DWLControl control)");
        Vector params = new Vector();
        params.add(PartyId);
        DWLTransaction txObj = new DWLTransactionInquiry("getCreditInfobyPartyId", params, control);
        DWLResponse retObj = null;
        if (logger.isFinestEnabled()) {
      String infoForLogging="Before finder transaction execution for getCreditInfobyPartyId";
      logger.finest("getCreditInfobyPartyId(String PartyId,  DWLControl control) " + infoForLogging);
        }
        retObj = executeTx(txObj);
        if (logger.isFinestEnabled()) {
       		String infoForLogging="After finder transaction execution for getCreditInfobyPartyId";
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
     * Performs the business logic for transaction getCreditInfobyPartyId.
     * 
     * @param PartyId
     * @return com.dwl.base.DWLResponse
     * @exception Exception
     * @generated
     */
    public DWLResponse  handleGetCreditInfobyPartyId(String PartyId,  DWLControl control) throws Exception {

        DWLResponse response = new DWLResponse();

    Additions comp = 
      (Additions)TCRMClassFactory.getTCRMComponent(AdditionsPropertyKeys.ADDITIONS_COMPONENT);
      
        response = comp.getCreditInfobyPartyId(PartyId,  control);
        if (response.getData() == null) {
            String[] params = new String[] { PartyId };
            DWLExceptionUtils.addErrorToStatus(response.getStatus(), DWLStatus.FATAL,
          AdditionsComponentID.ADDITIONS_CONTROLLER,
          TCRMErrorCode.READ_RECORD_ERROR,
          AdditionsErrorReasonCode.GETCREDITINFOBYPARTYID_FAILED,
          control, params, errHandler);					
        }
        return response;
    }
    

}

