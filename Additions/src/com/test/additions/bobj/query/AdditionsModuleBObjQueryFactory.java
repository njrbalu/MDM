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
 * IBM-MDMWB-1.0-[5e5ddca5200a98af6a9da7cb5950e112]
 */

package com.test.additions.bobj.query;
 
import com.dwl.base.DWLControl;
import com.dwl.bobj.query.BObjQuery;
/**
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 *
 * Interface through which BObjQuery instances may be created for the Additions
 * module.
 *
 * @generated
 */
public interface AdditionsModuleBObjQueryFactory {

    /** 
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
	public final static String BOBJ_QUERY_FACTORY = "Additions.BObjQueryFactory";

    
     /** 
      * <!-- begin-user-doc -->
      * <!-- end-user-doc -->
      *
      * Provides the concrete BObjQuery instance corresponding to the
      * <code>CreditInfoBObjQuery</code> business object.
      *
      * @return 
      * An instance of <code>CreditInfoBObjQuery</code>.      
      *
      * @generated
      */
      public BObjQuery createCreditInfoBObjQuery(String queryName, DWLControl dwlControl);

}

