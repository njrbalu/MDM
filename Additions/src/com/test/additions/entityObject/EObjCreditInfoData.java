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
 * IBM-MDMWB-1.0-[84982138d7d65c90622a23c58a1efb7f]
 */


package com.test.additions.entityObject;

import java.util.Iterator;
import com.ibm.mdm.base.db.EntityMapping;
import com.ibm.pdq.annotation.Select;
import com.ibm.pdq.annotation.Update;


/**
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 *
 * @generated
 */
public interface EObjCreditInfoData {


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  public static final String getEObjCreditInfoSql = "select Credit_Infopk_Id, CONT_ID, CREDIT_SCORE, CREDIT_CLASS, CREDIT_STATUS, LAST_UPDATE_DT, LAST_UPDATE_USER, LAST_UPDATE_TX_ID from CREDITINFO where Credit_Infopk_Id = ? ";

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  public static final String createEObjCreditInfoSql = "insert into CREDITINFO (Credit_Infopk_Id, CONT_ID, CREDIT_SCORE, CREDIT_CLASS, CREDIT_STATUS, LAST_UPDATE_DT, LAST_UPDATE_USER, LAST_UPDATE_TX_ID) values( :creditInfopkId, :partyId, :creditScore, :creditClass, :creditStatus, :lastUpdateDt, :lastUpdateUser, :lastUpdateTxId)";

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  public static final String updateEObjCreditInfoSql = "update CREDITINFO set CONT_ID = :partyId, CREDIT_SCORE = :creditScore, CREDIT_CLASS = :creditClass, CREDIT_STATUS = :creditStatus, LAST_UPDATE_DT = :lastUpdateDt, LAST_UPDATE_USER = :lastUpdateUser, LAST_UPDATE_TX_ID = :lastUpdateTxId where Credit_Infopk_Id= :creditInfopkId and LAST_UPDATE_DT = :oldLastUpdateDt";

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  public static final String deleteEObjCreditInfoSql = "delete from CREDITINFO where Credit_Infopk_Id = ?";

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  public static final String EObjCreditInfoKeyField = "EObjCreditInfo.creditInfopkId";

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  public static final String EObjCreditInfoGetFields =
    "EObjCreditInfo.creditInfopkId," +
    "EObjCreditInfo.partyId," +
    "EObjCreditInfo.creditScore," +
    "EObjCreditInfo.creditClass," +
    "EObjCreditInfo.creditStatus," +
    "EObjCreditInfo.lastUpdateDt," +
    "EObjCreditInfo.lastUpdateUser," +
    "EObjCreditInfo.lastUpdateTxId";

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  public static final String EObjCreditInfoAllFields =
    "EObjCreditInfo.creditInfopkId," +
    "EObjCreditInfo.partyId," +
    "EObjCreditInfo.creditScore," +
    "EObjCreditInfo.creditClass," +
    "EObjCreditInfo.creditStatus," +
    "EObjCreditInfo.lastUpdateDt," +
    "EObjCreditInfo.lastUpdateUser," +
    "EObjCreditInfo.lastUpdateTxId";

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  public static final String EObjCreditInfoUpdateFields =
    "EObjCreditInfo.partyId," +
    "EObjCreditInfo.creditScore," +
    "EObjCreditInfo.creditClass," +
    "EObjCreditInfo.creditStatus," +
    "EObjCreditInfo.lastUpdateDt," +
    "EObjCreditInfo.lastUpdateUser," +
    "EObjCreditInfo.lastUpdateTxId," +
    "EObjCreditInfo.creditInfopkId," +
    "EObjCreditInfo.oldLastUpdateDt";

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
    * Select CreditInfo by parameters.
   * @generated
   */
  @Select(sql=getEObjCreditInfoSql)
  @EntityMapping(parameters=EObjCreditInfoKeyField, results=EObjCreditInfoGetFields)
  Iterator<EObjCreditInfo> getEObjCreditInfo(Long creditInfopkId);  
   
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
    * Create CreditInfo by EObjCreditInfo Object.
   * @generated
   */
  @Update(sql=createEObjCreditInfoSql)
  @EntityMapping(parameters=EObjCreditInfoAllFields)
  int createEObjCreditInfo(EObjCreditInfo e);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
    * Update one CreditInfo by EObjCreditInfo object.
   * @generated
   */
  @Update(sql=updateEObjCreditInfoSql)
  @EntityMapping(parameters=EObjCreditInfoUpdateFields)
  int updateEObjCreditInfo(EObjCreditInfo e);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
    * Delete CreditInfo by parameters.
   * @generated
   */
  @Update(sql=deleteEObjCreditInfoSql)
  @EntityMapping(parameters=EObjCreditInfoKeyField)
  int deleteEObjCreditInfo(Long creditInfopkId);
  
}
