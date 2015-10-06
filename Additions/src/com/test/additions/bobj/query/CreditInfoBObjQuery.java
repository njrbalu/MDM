
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
 * IBM-MDMWB-1.0-[026b60246f69441c9b88953062eab568]
 */
package com.test.additions.bobj.query;




import com.dwl.base.DWLControl;
import com.dwl.bobj.query.BObjQueryException;
import com.dwl.base.DWLCommon;

import com.dwl.base.db.DataAccessFactory;


import com.dwl.base.error.DWLErrorCode;
import com.dwl.base.error.DWLStatus;

import com.dwl.base.exception.DWLDuplicateKeyException;

import com.dwl.base.interfaces.IGenericResultSetProcessor;

import com.dwl.base.util.DWLClassFactory;
import com.dwl.base.util.DWLExceptionUtils;

import com.test.additions.component.CreditInfoBObj;
import com.test.additions.component.CreditInfoResultSetProcessor;

import com.test.additions.constant.AdditionsComponentID;
import com.test.additions.constant.AdditionsErrorReasonCode;

import com.test.additions.entityObject.CreditInfoInquiryData;
import com.test.additions.entityObject.EObjCreditInfoData;


/**
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 *
 * This class provides query information for the business object
 * <code>CreditInfoBObj</code>.
 *
 * @generated
 */
public class CreditInfoBObjQuery  extends com.dwl.bobj.query.GenericBObjQuery {

     /**
      * <!-- begin-user-doc -->
      * <!-- end-user-doc -->
      *
      * @generated
      */
     public static final String CREDIT_INFO_QUERY = "getCreditInfo(Object[])";

     /**
      * <!-- begin-user-doc -->
      * <!-- end-user-doc -->
      *
      * @generated
      */
     public static final String CREDIT_INFO_HISTORY_QUERY = "getCreditInfoHistory(Object[])";

	/**
      * <!-- begin-user-doc -->
      * <!-- end-user-doc -->
      *
      * @generated
      */
     public static final String CREDIT_INFOBY_PARTY_ID_QUERY = "getCreditInfobyPartyId(Object[])";

    /**
      * <!-- begin-user-doc -->
      * <!-- end-user-doc -->
      *
      * @generated
      */
     public static final String CREDIT_INFOBY_PARTY_ID_HISTORY_QUERY = "getCreditInfobyPartyIdHistory(Object[])";

  /**
    * <!-- begin-user-doc -->
	  * <!-- end-user-doc -->
    * @generated 
    */
	 private final static com.dwl.base.logging.IDWLLogger logger = com.dwl.base.logging.DWLLoggerManager.getLogger(CreditInfoBObjQuery.class);
     /**
      * <!-- begin-user-doc -->
      * <!-- end-user-doc -->
      *
      * @generated
      */
     public static final String CREDIT_INFO_ADD = "CREDIT_INFO_ADD";

     /**
      * <!-- begin-user-doc -->
      * <!-- end-user-doc -->
      *
      * @generated
      */
     public static final String CREDIT_INFO_DELETE = "CREDIT_INFO_DELETE";

     /**
      * <!-- begin-user-doc -->
      * <!-- end-user-doc -->
      *
      * @generated
      */
     public static final String CREDIT_INFO_UPDATE = "CREDIT_INFO_UPDATE";


    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * Default constructor.
     *
     * @param queryName
     * The name of the query.
     * @param control
     * The control object.
     *
     * @generated
     */
    public CreditInfoBObjQuery(String queryName, DWLControl control) {
        super(queryName, control);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * Default constructor.
     *
     * @param persistenceStrategyName
     * The persistence strategy name.  This parameter indicates the type of
     * database action to be taken such as addition, update or deletion of
     * records.
     * @param objectToPersist
     * The business object to be persisted.
     *
     * @generated
     */
    public CreditInfoBObjQuery(String persistenceStrategyName, DWLCommon objectToPersist) {
        super(persistenceStrategyName, objectToPersist);
    }

	 
 	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
	protected void persist() throws Exception{
    logger.finest("ENTER persist()");
   	if (logger.isFinestEnabled()) {
   		String infoForLogging="Persistence strategy is " + persistenceStrategyName;
      logger.finest("persist() " + infoForLogging);
    }
    if (persistenceStrategyName.equals(CREDIT_INFO_ADD)) {
      addCreditInfo();
    }else if(persistenceStrategyName.equals(CREDIT_INFO_UPDATE)) {
      updateCreditInfo();
    }else if(persistenceStrategyName.equals(CREDIT_INFO_DELETE)) {
      deleteCreditInfo();
    }
    logger.finest("RETURN persist()");
  }
  
 	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
      * Inserts creditinfo data by calling
      * <code>EObjCreditInfoData.createEObjCreditInfo</code>
     *
     * @throws Exception
     *
     * @generated
     */
	protected void addCreditInfo() throws Exception{
    logger.finest("ENTER addCreditInfo()");
    
    EObjCreditInfoData theEObjCreditInfoData = (EObjCreditInfoData) DataAccessFactory
      .getQuery(EObjCreditInfoData.class, connection);
    theEObjCreditInfoData.createEObjCreditInfo(((CreditInfoBObj) objectToPersist).getEObjCreditInfo());
    logger.finest("RETURN addCreditInfo()");
  }

 	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
      * Updates creditinfo data by calling
      * <code>EObjCreditInfoData.updateEObjCreditInfo</code>
     *
     * @throws Exception
     *
     * @generated
     */
	protected void updateCreditInfo() throws Exception{
    logger.finest("ENTER updateCreditInfo()");
    EObjCreditInfoData theEObjCreditInfoData = (EObjCreditInfoData) DataAccessFactory
      .getQuery(EObjCreditInfoData.class, connection);
    theEObjCreditInfoData.updateEObjCreditInfo(((CreditInfoBObj) objectToPersist).getEObjCreditInfo());
    logger.finest("RETURN updateCreditInfo()");
  }

 	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
      * Custom implementation should be provided when required.
   *
     * @throws Exception
     *
     * @generated
     */
	protected void deleteCreditInfo() throws Exception{
    logger.finest("ENTER deleteCreditInfo()");
         // MDM_TODO: Write customized business logic for the extension here.
    logger.finest("RETURN deleteCreditInfo()");
  } 
  
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
      * This method is overridden to construct
      * <code>DWLDuplicateKeyException</code> based on CreditInfo component
      * specific values.
     * 
     * @param errParams
     * The values to be substituted in the error message.
   *
     * @throws Exception
     *
     * @generated
     */
    protected void throwDuplicateKeyException(String[] errParams) throws Exception {
    	if (logger.isFinestEnabled()) {
    		StringBuilder errParamsStringBuilder = new StringBuilder("Error: Duplicate key Exception parameters are ");
    		for(int i=0;i<errParams.length;i++) {
    			errParamsStringBuilder .append(errParams[i]);
    			if (i!=errParams.length-1) {
    				errParamsStringBuilder .append(" , ");
    			}
    		}
        		String infoForLogging="Error: Duplicate key Exception parameters are " + errParamsStringBuilder;
      logger.finest("Unknown method " + infoForLogging);
    	}
    	DWLExceptionUtils.throwDWLDuplicateKeyException(
    		new DWLDuplicateKeyException(buildDupThrowableMessage(errParams)),
    		objectToPersist.getStatus(), 
    		DWLStatus.FATAL,
    		AdditionsComponentID.ADDITIONS_COMPONENT,
    		DWLErrorCode.DUPLICATE_KEY_ERROR, 
    		AdditionsErrorReasonCode.DUPLICATE_PRIMARY_KEY_CREDITINFO,
    		objectToPersist.getControl(), 
    		DWLClassFactory.getErrorHandler()
    		);
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * Provides the result set processor that is used to populate the business
     * object.
     *
     * @return
     * An instance of <code>CreditInfoResultSetProcessor</code>.
     *
     * @see com.dwl.bobj.query.AbstractBObjQuery#provideResultSetProcessor()
     * @see com.test.additions.component.CreditInfoResultSetProcessor
     *
     * @generated
     */
    protected IGenericResultSetProcessor provideResultSetProcessor()
            throws BObjQueryException {

        return new CreditInfoResultSetProcessor();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected Class provideQueryInterfaceClass() throws BObjQueryException {
        return CreditInfoInquiryData.class;
    }

}

