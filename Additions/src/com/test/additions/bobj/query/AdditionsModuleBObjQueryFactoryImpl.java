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
 * IBM-MDMWB-1.0-[ad156fbc8d51719695429b36c01be430]
 */

package com.test.additions.bobj.query;
 
import com.dwl.base.DWLControl;
import com.dwl.bobj.query.BObjQuery;
import com.dwl.base.DWLCommon;
import com.dwl.bobj.query.Persistence;


import com.dwl.common.globalization.util.ResourceBundleHelper;

import com.test.additions.bobj.query.CreditInfoBObjQuery;

import com.test.additions.constant.ResourceBundleNames;

/**
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 *
 * This factory class provides methods to return the BObjQuery instances
 * relating to the relevant business objects.
 *
 * @generated
 */
public class AdditionsModuleBObjQueryFactoryImpl  implements AdditionsModuleBObjQueryFactory, AdditionsModuleBObjPersistenceFactory {

	private final static String EXCEPTION_QUERYNAME_EMPTY = "Exception_AbstractBObjQuery_QueryNameCannotBeEmpty";
	/**
    * <!-- begin-user-doc -->
	  * <!-- end-user-doc -->
    * @generated 
    */
	 private final static com.dwl.base.logging.IDWLLogger logger = com.dwl.base.logging.DWLLoggerManager.getLogger(AdditionsModuleBObjQueryFactoryImpl.class);

    /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   *
     * Default constructor.
     *
     * @generated
     */
    public AdditionsModuleBObjQueryFactoryImpl() {
        super();
    }
    
     /** 
      * <!-- begin-user-doc -->
      * <!-- end-user-doc -->
      *
      * Provides the concrete BObjQuery instance corresponding to the
      * <code>CreditInfoBObj</code> business object.
      *
      * @return 
      * An instance of <code>CreditInfoBObjQuery</code>.
      *
      * @generated
      */
      public BObjQuery createCreditInfoBObjQuery(String queryName, DWLControl dwlControl) {
    logger.finest("ENTER createCreditInfoBObjQuery(String queryName, DWLControl dwlControl)");
        if ((queryName == null) || queryName.trim().equals("")) {
      throw new IllegalArgumentException(ResourceBundleHelper.resolve(
          ResourceBundleNames.COMMON_SERVICES_STRINGS,
          EXCEPTION_QUERYNAME_EMPTY));
        }
    logger.finest("RETURN createCreditInfoBObjQuery(String queryName, DWLControl dwlControl)");
        return new CreditInfoBObjQuery(queryName, dwlControl);
    }
    
     /** 
      * <!-- begin-user-doc -->
      * <!-- end-user-doc -->
      *
      * This method returns an object of type <code>Persistence</code>
      * corresponding to <code>CreditInfoBObj</code> business object.
      *
      * @param persistenceStrategyName
      * The persistence strategy name.  This parameter indicates the type of
      * database action to be taken such as addition, update or deletion of
      * records.
      * @param objectToPersist
      * The business object to be persisted.
      *      
      * @return 
      * An instance of <code>CreditInfoBObjQuery</code>.
      *
      * @generated
      */
      public Persistence createCreditInfoBObjPersistence(String persistenceStrategyName, DWLCommon objectToPersist) {

        return new CreditInfoBObjQuery(persistenceStrategyName, objectToPersist);
      }
      

}

