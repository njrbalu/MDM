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
 * IBM-MDMWB-1.0-[2e8e310433cfdd9fff1b50830e521104]
 */

package com.test.additions.entityObject;


import java.util.Iterator;
import com.ibm.mdm.base.db.EntityMapping;
import com.ibm.pdq.annotation.Select;


import com.ibm.mdm.base.db.ResultQueue1;
/**
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 *
 * @generated
 */
public interface CreditInfoInquiryData {
  
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  static final String tableAliasString = "tableAlias (" + 
                                            "CREDITINFO => com.test.additions.entityObject.EObjCreditInfo, " +
                                            "H_CREDITINFO => com.test.additions.entityObject.EObjCreditInfo" +
                                            ")";
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  static final String getCreditInfoSql = "SELECT r.Credit_Infopk_Id Credit_Infopk_Id, r.CONT_ID CONT_ID, r.CREDIT_SCORE CREDIT_SCORE, r.CREDIT_CLASS CREDIT_CLASS, r.CREDIT_STATUS CREDIT_STATUS, r.LAST_UPDATE_DT LAST_UPDATE_DT, r.LAST_UPDATE_USER LAST_UPDATE_USER, r.LAST_UPDATE_TX_ID LAST_UPDATE_TX_ID FROM CREDITINFO r WHERE r.Credit_Infopk_Id = ? ";
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  public static final String getCreditInfoParameters =
    "EObjCreditInfo.CreditInfopkId";
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  public static final String getCreditInfoResults =
    "EObjCreditInfo.CreditInfopkId," +
    "EObjCreditInfo.PartyId," +
    "EObjCreditInfo.CreditScore," +
    "EObjCreditInfo.CreditClass," +
    "EObjCreditInfo.CreditStatus," +
    "EObjCreditInfo.lastUpdateDt," +
    "EObjCreditInfo.lastUpdateUser," +
    "EObjCreditInfo.lastUpdateTxId";
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  static final String getCreditInfoHistorySql = "SELECT r.H_Credit_Infopk_Id hist_id_pk, r.H_ACTION_CODE h_action_code, r.H_CREATED_BY h_created_by, r.H_CREATE_DT h_create_dt, r.H_END_DT h_end_dt, r.Credit_Infopk_Id Credit_Infopk_Id, r.CONT_ID CONT_ID, r.CREDIT_SCORE CREDIT_SCORE, r.CREDIT_CLASS CREDIT_CLASS, r.CREDIT_STATUS CREDIT_STATUS, r.LAST_UPDATE_DT LAST_UPDATE_DT, r.LAST_UPDATE_USER LAST_UPDATE_USER, r.LAST_UPDATE_TX_ID LAST_UPDATE_TX_ID FROM H_CREDITINFO r WHERE r.H_Credit_Infopk_Id = ?  AND (( ? BETWEEN r.H_CREATE_DT AND r.H_END_DT ) OR ( ? >= r.H_CREATE_DT AND r.H_END_DT IS NULL ))";
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  public static final String getCreditInfoHistoryParameters =
    "EObjCreditInfo.CreditInfopkId," +
    "EObjCreditInfo.lastUpdateDt," +
    "EObjCreditInfo.lastUpdateDt";
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  public static final String getCreditInfoHistoryResults =
    "EObjCreditInfo.historyIdPK," +
    "EObjCreditInfo.histActionCode," +
    "EObjCreditInfo.histCreatedBy," +
    "EObjCreditInfo.histCreateDt," +
    "EObjCreditInfo.histEndDt," +
    "EObjCreditInfo.CreditInfopkId," +
    "EObjCreditInfo.PartyId," +
    "EObjCreditInfo.CreditScore," +
    "EObjCreditInfo.CreditClass," +
    "EObjCreditInfo.CreditStatus," +
    "EObjCreditInfo.lastUpdateDt," +
    "EObjCreditInfo.lastUpdateUser," +
    "EObjCreditInfo.lastUpdateTxId";

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  static final String getCreditInfobyPartyIdSql = "SELECT r.Credit_Infopk_Id Credit_Infopk_Id, r.CONT_ID CONT_ID, r.CREDIT_SCORE CREDIT_SCORE, r.CREDIT_CLASS CREDIT_CLASS, r.CREDIT_STATUS CREDIT_STATUS, r.LAST_UPDATE_DT LAST_UPDATE_DT, r.LAST_UPDATE_USER LAST_UPDATE_USER, r.LAST_UPDATE_TX_ID LAST_UPDATE_TX_ID FROM CREDITINFO r WHERE r.CONT_ID = ? ";
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  public static final String getCreditInfobyPartyIdParameters =
    "EObjCreditInfo.PartyId";
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  public static final String getCreditInfobyPartyIdResults =
    "EObjCreditInfo.CreditInfopkId," +
    "EObjCreditInfo.PartyId," +
    "EObjCreditInfo.CreditScore," +
    "EObjCreditInfo.CreditClass," +
    "EObjCreditInfo.CreditStatus," +
    "EObjCreditInfo.lastUpdateDt," +
    "EObjCreditInfo.lastUpdateUser," +
    "EObjCreditInfo.lastUpdateTxId";
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  static final String getCreditInfobyPartyIdHistorySql = "SELECT r.H_Credit_Infopk_Id hist_id_pk, r.H_ACTION_CODE h_action_code, r.H_CREATED_BY h_created_by, r.H_CREATE_DT h_create_dt, r.H_END_DT h_end_dt, r.Credit_Infopk_Id Credit_Infopk_Id, r.CONT_ID CONT_ID, r.CREDIT_SCORE CREDIT_SCORE, r.CREDIT_CLASS CREDIT_CLASS, r.CREDIT_STATUS CREDIT_STATUS, r.LAST_UPDATE_DT LAST_UPDATE_DT, r.LAST_UPDATE_USER LAST_UPDATE_USER, r.LAST_UPDATE_TX_ID LAST_UPDATE_TX_ID FROM H_CREDITINFO r WHERE r.CONT_ID = ?  AND (( ? BETWEEN r.H_CREATE_DT AND r.H_END_DT ) OR ( ? >= r.H_CREATE_DT AND r.H_END_DT IS NULL ))";
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  public static final String getCreditInfobyPartyIdHistoryParameters =
    "EObjCreditInfo.PartyId," +
    "EObjCreditInfo.lastUpdateDt," +
    "EObjCreditInfo.lastUpdateDt";
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  public static final String getCreditInfobyPartyIdHistoryResults =
    "EObjCreditInfo.historyIdPK," +
    "EObjCreditInfo.histActionCode," +
    "EObjCreditInfo.histCreatedBy," +
    "EObjCreditInfo.histCreateDt," +
    "EObjCreditInfo.histEndDt," +
    "EObjCreditInfo.CreditInfopkId," +
    "EObjCreditInfo.PartyId," +
    "EObjCreditInfo.CreditScore," +
    "EObjCreditInfo.CreditClass," +
    "EObjCreditInfo.CreditStatus," +
    "EObjCreditInfo.lastUpdateDt," +
    "EObjCreditInfo.lastUpdateUser," +
    "EObjCreditInfo.lastUpdateTxId";

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  @Select(sql=getCreditInfoSql, pattern=tableAliasString)
  @EntityMapping(parameters=getCreditInfoParameters, results=getCreditInfoResults)
  Iterator<ResultQueue1<EObjCreditInfo>> getCreditInfo(Object[] parameters);  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  @Select(sql=getCreditInfoHistorySql, pattern=tableAliasString)
  @EntityMapping(parameters=getCreditInfoHistoryParameters, results=getCreditInfoHistoryResults)
  Iterator<ResultQueue1<EObjCreditInfo>> getCreditInfoHistory(Object[] parameters);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  @Select(sql=getCreditInfobyPartyIdSql, pattern=tableAliasString)
  @EntityMapping(parameters=getCreditInfobyPartyIdParameters, results=getCreditInfobyPartyIdResults)
  Iterator<ResultQueue1<EObjCreditInfo>> getCreditInfobyPartyId(Object[] parameters);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  @Select(sql=getCreditInfobyPartyIdHistorySql, pattern=tableAliasString)
  @EntityMapping(parameters=getCreditInfobyPartyIdHistoryParameters, results=getCreditInfobyPartyIdHistoryResults)
  Iterator<ResultQueue1<EObjCreditInfo>> getCreditInfobyPartyIdHistory(Object[] parameters);  

}

