
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
 * IBM-MDMWB-1.0-[cd060f631a4f06b51aa370fac585bd9d]
 */

package com.test.component;

import com.dwl.base.DWLControl;
import com.dwl.base.DWLResponse;
import com.dwl.base.error.DWLStatus;
import com.dwl.base.exception.DWLBaseException;
import com.dwl.base.util.DWLClassFactory;
import com.dwl.tcrm.common.IExtension;
import com.dwl.tcrm.common.ITCRMValidation;
import com.dwl.tcrm.coreParty.component.TCRMPersonBObj;
import com.test.additions.component.CreditInfoBObj;
import com.test.additions.interfaces.Additions;


/**
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 *
 * This class provides the implementation of the business object
 * <code>XPersonBObjExt</code>.
 * 
 * @see com.dwl.tcrm.common.TCRMCommon
 * @generated
 */
 
public class XPersonBObjExt extends TCRMPersonBObj implements IExtension {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected CreditInfoBObj theCreditInfoBObj;
	/**
	  * <!-- begin-user-doc -->
	  * <!-- end-user-doc -->
	  * @generated 
	  */
	 private final static com.dwl.base.logging.IDWLLogger logger = com.dwl.base.logging.DWLLoggerManager.getLogger(XPersonBObjExt.class);
		
 


    public CreditInfoBObj getCreditInfoBObj() {
		return theCreditInfoBObj;
	}


	public void setCreditInfoBObj(CreditInfoBObj creditInfoBObj) {
		theCreditInfoBObj = creditInfoBObj;
	}


	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public XPersonBObjExt() {
        super();
        init();
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

            
        }

        if (level == ITCRMValidation.COMPONENT_LEVEL_VALIDATION){
            // MDM_TODO: Add any common component-level custom validation logic to be
            // executed for this object during either "add" or "update"
            // transactions

           
        }
        
        if (logger.isFinestEnabled()) {
            String returnValue = status.toString();
			logger.finest("RETURN getValidationStatus(int level, DWLStatus status) " + returnValue);
        }
		
        return status;
    }
    







    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * Adds a record to the extension table.
     *
     * @throws DWLBaseException
     * @generated
     */
    public void addRecord() throws DWLBaseException {
		logger.finest("ENTER addRecord()");
		
		try {
			Additions add = (Additions) DWLClassFactory.getDWLComponent("additions_component");
			CreditInfoBObj inputCreditBObj = this.getCreditInfoBObj();
			if(inputCreditBObj != null){
				inputCreditBObj.setPartyId(this.getPartyId());
				DWLResponse addResponse = add.addCreditInfo(inputCreditBObj);
				this.setCreditInfoBObj((CreditInfoBObj) addResponse.getData());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		logger.finest("RETURN addRecord()");
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * Deletes a record from the extension table.
     *
     * @see com.dwl.base.DWLCommon#deleteRecord()
     * @generated
     */
    public void deleteRecord() throws DWLBaseException {
		logger.finest("ENTER deleteRecord()");
        logger.finest("RETURN deleteRecord()");
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * Updates a record in the extension table.
     *
     * @throws DWLBaseException
     * @generated
     */
    public void updateRecord() throws DWLBaseException {
		logger.finest("ENTER updateRecord()");
		try {
			Additions add = (Additions) DWLClassFactory.getDWLComponent("additions_component");
			CreditInfoBObj updateCreditBObj = getCreditInfoBObj();
			if(updateCreditBObj != null){
				DWLResponse getResponse = add.getCreditInfobyPartyId(this.getPartyId(), getControl());
				CreditInfoBObj dbCreditInfo = (CreditInfoBObj) getResponse.getData();
				if(dbCreditInfo == null){
					DWLResponse addResponse = add.addCreditInfo(updateCreditBObj);
					this.setCreditInfoBObj((CreditInfoBObj) addResponse.getData());
				}else{
					//Check if party id is null or not. If not null check if it same with the base entity
					updateCreditBObj.setPartyId(this.getPartyId());
					//Check if the creditinfoIdpk is null or not. If null then populate idpk and lastupdate date.
					updateCreditBObj.setCreditInfopkId(dbCreditInfo.getCreditInfopkId());
					//If creditInfoIdpk is not null then last update date should not be null.
					updateCreditBObj.setCreditInfoLastUpdateDate(dbCreditInfo.getCreditInfoLastUpdateDate());
					//Check the response status. If required throw error.
					DWLResponse updateResponse = add.updateCreditInfo(updateCreditBObj);
					this.setCreditInfoBObj((CreditInfoBObj) updateResponse.getData());
				}		
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		logger.finest("RETURN updateRecord()");
    
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * Gets a record from the extension table.
     *
     * @throws DWLBaseException
     * @generated
     */
    public void getRecord() throws DWLBaseException {
		logger.finest("ENTER getRecord()");
		try {
			Additions add = (Additions) DWLClassFactory.getDWLComponent("additions_component");
			DWLResponse getResponse = add.getCreditInfobyPartyId(this.getPartyId(), getControl());
			theCreditInfoBObj = (CreditInfoBObj) getResponse.getData();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		logger.finest("RETURN getRecord()");
	}


}

