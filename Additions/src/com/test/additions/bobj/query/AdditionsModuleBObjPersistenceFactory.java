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
 * IBM-MDMWB-1.0-[b2173c22df9125910c657ca43172cc46]
 */

package com.test.additions.bobj.query;
 
import com.dwl.base.DWLCommon;
import com.dwl.bobj.query.Persistence;
/**
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 *
 * Interface through which instances of concrete implementation of
 * <code>Persistence</code> can be created for Additions module.
 *
 * @generated
 */
public interface AdditionsModuleBObjPersistenceFactory {

    /** 
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
	public final static String BOBJ_PERSISTENCE_FACTORY = "Additions.BObjPersistenceFactory";

    
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
      * An instance of <code>CreditInfoBObjQuery</code>, which is a concrete
      * implementation of <code>Persistence</code> interface.      
      *
      * @generated
      */
      public Persistence createCreditInfoBObjPersistence(String persistenceStrategyName, DWLCommon objectToPersist);

}
