	
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
 * IBM-MDMWB-1.0-[ffd939313b5fd0b7f9c794fe59c7cb69]
 */

package com.test.additions.controller;

import com.dwl.base.requestHandler.DWLTransaction;
import com.dwl.base.requestHandler.DWLTransactionPersistent;
import com.dwl.tcrm.common.TCRMCommonComponent;
import com.dwl.tcrm.common.TCRMControlKeys;
import com.dwl.tcrm.common.TCRMErrorCode;
import com.dwl.tcrm.utilities.TCRMClassFactory;
import com.dwl.base.DWLResponse;
import com.dwl.base.exception.DWLBaseException;
import com.ibm.mdm.annotations.Controller;
import com.ibm.mdm.annotations.TxMetadata;


import com.test.additions.component.CreditInfoBObj;

import com.test.additions.constant.AdditionsComponentID;
import com.test.additions.constant.AdditionsErrorReasonCode;
import com.test.additions.constant.AdditionsPropertyKeys;

import com.test.additions.interfaces.Additions;
import com.test.additions.interfaces.AdditionsTxn;

/**
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 *
 * Controller implementation for all persistent Additions services.
 * @generated
 */
@Controller(errorComponentID = AdditionsComponentID.ADDITIONS_CONTROLLER)
public class AdditionsTxnBean  extends TCRMCommonComponent implements AdditionsTxn {

	/**
    * <!-- begin-user-doc -->
	  * <!-- end-user-doc -->
    * @generated 
    */
	 private final static com.dwl.base.logging.IDWLLogger logger = com.dwl.base.logging.DWLLoggerManager.getLogger(AdditionsTxnBean.class);
    

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * Performs the business logic for transaction handleAddCreditInfo.
     *
     * @return DWLResponse containing the added 
     * @throws DWLBaseException
     * @see #handleaddCreditInfo
     *
     * @ejb.interface-method
     *    view-type="both"
     *
     * @generated
     */
     @TxMetadata(actionCategory=TCRMControlKeys.ADD_ACTION_CATEGORY,
       txErrorCode=TCRMErrorCode.INSERT_RECORD_ERROR, 
       txErrorReasonCode = AdditionsErrorReasonCode.ADDCREDITINFO_FAILED)
    public DWLResponse addCreditInfo(CreditInfoBObj theBObj) throws DWLBaseException {
    logger.finest("ENTER addCreditInfo(CreditInfoBObj theBObj)");
        DWLTransaction txObj = new DWLTransactionPersistent("addCreditInfo", theBObj, theBObj.getControl());
        DWLResponse retObj = null;
        if (logger.isFinestEnabled()) {
        	String infoForLogging="Before transaction addCreditInfo execution";
      logger.finest("addCreditInfo(CreditInfoBObj theBObj) " + infoForLogging);
        }
        retObj = executeTx(txObj);
        if (logger.isFinestEnabled()) {
        	String infoForLogging="After transaction addCreditInfo execution";
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
     * Performs the business logic for transaction addCreditInfo.
     * 
     * @return DWLResponse containing the added 
     * @throws Exception
     * @see #addCreditInfo
     *
     * @generated
     */
    public DWLResponse handleAddCreditInfo(CreditInfoBObj theBObj) throws Exception {
    logger.finest("ENTER handleAddCreditInfo(CreditInfoBObj theBObj)");
        DWLResponse response = new DWLResponse();
        Additions aAdditionsComponent = (Additions) TCRMClassFactory
      .getTCRMComponent(AdditionsPropertyKeys.ADDITIONS_COMPONENT);
        response = aAdditionsComponent.addCreditInfo(theBObj);
    logger.finest("RETURN handleAddCreditInfo(CreditInfoBObj theBObj)");
        return response;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * Performs the business logic for transaction handleUpdateCreditInfo.
     *
     * @return DWLResponse containing the added 
     * @throws DWLBaseException
     * @see #handleupdateCreditInfo
     *
     * @ejb.interface-method
     *    view-type="both"
     *
     * @generated
     */
     @TxMetadata(actionCategory=TCRMControlKeys.UPDATE_ACTION_CATEGORY,
       txErrorCode=TCRMErrorCode.UPDATE_RECORD_ERROR, 
       txErrorReasonCode = AdditionsErrorReasonCode.UPDATECREDITINFO_FAILED)
    public DWLResponse updateCreditInfo(CreditInfoBObj theBObj) throws DWLBaseException {
    logger.finest("ENTER updateCreditInfo(CreditInfoBObj theBObj)");
        DWLTransaction txObj = new DWLTransactionPersistent("updateCreditInfo", theBObj, theBObj.getControl());
        DWLResponse retObj = null;
        if (logger.isFinestEnabled()) {
        	String infoForLogging="Before transaction updateCreditInfo execution";
      logger.finest("updateCreditInfo(CreditInfoBObj theBObj) " + infoForLogging);
        }
        retObj = executeTx(txObj);
        if (logger.isFinestEnabled()) {
        	String infoForLogging="After transaction updateCreditInfo execution";
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
     * Performs the business logic for transaction updateCreditInfo.
     * 
     * @return DWLResponse containing the added 
     * @throws Exception
     * @see #updateCreditInfo
     *
     * @generated
     */
    public DWLResponse handleUpdateCreditInfo(CreditInfoBObj theBObj) throws Exception {
    logger.finest("ENTER handleUpdateCreditInfo(CreditInfoBObj theBObj)");
        DWLResponse response = new DWLResponse();
        Additions aAdditionsComponent = (Additions) TCRMClassFactory
      .getTCRMComponent(AdditionsPropertyKeys.ADDITIONS_COMPONENT);
        response = aAdditionsComponent.updateCreditInfo(theBObj);
    logger.finest("RETURN handleUpdateCreditInfo(CreditInfoBObj theBObj)");
        return response;
    }
}


