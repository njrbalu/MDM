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
 * IBM-MDMWB-1.0-[d58fb2ca5e71990706a984e80688e61b]
 */

package com.test.additions.interfaces;


import com.dwl.tcrm.common.ITCRMController;



import com.dwl.base.DWLResponse;

import com.dwl.base.exception.DWLBaseException;

import com.test.additions.component.CreditInfoBObj;

/**
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 *
 * Controller level interface for Additions persistent transactions.
 * @generated
 */
public interface AdditionsTxn extends ITCRMController {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * Executes the transaction addCreditInfo.
     *
     * @generated
     **/
    public DWLResponse addCreditInfo(CreditInfoBObj theBObj) throws DWLBaseException;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * Executes the transaction updateCreditInfo.
     *
     * @generated
     **/
    public DWLResponse updateCreditInfo(CreditInfoBObj theBObj) throws DWLBaseException;

}

