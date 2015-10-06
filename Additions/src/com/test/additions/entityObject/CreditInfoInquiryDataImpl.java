package com.test.additions.entityObject;

import com.ibm.pdq.runtime.generator.BaseData;
import java.sql.PreparedStatement;
import com.ibm.pdq.runtime.statement.SqlStatementType;
import com.ibm.pdq.runtime.generator.BaseRowHandler;
import java.sql.Types;
import java.sql.SQLException;
import java.util.Iterator;
import com.ibm.mdm.base.db.ResultQueue1;
import com.ibm.pdq.runtime.statement.StatementDescriptor;
import com.ibm.pdq.annotation.Metadata;
import com.ibm.mdm.base.db.EntityMapping;
import com.ibm.pdq.runtime.generator.BaseParameterHandler;
import com.test.additions.entityObject.EObjCreditInfo;


/**
 * <!-- begin-user-doc -->
 * 
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class CreditInfoInquiryDataImpl  extends BaseData implements CreditInfoInquiryData
{

  /**
   * @generated
   */
  public static final String generatorVersion = "3.200.73";

  /**
   * @generated
   */
  public static final String identifier = "CreditInfoInquiryData";

  /**
   * @generated
   */
  public static final long generationTime = 0x0000015006ad5fefL;

  /**
   * @generated
   */
  public static final String collection = "NULLID";

  /**
   * @generated
   */
  public static final String packageVersion = null;

  /**
   * @generated
   */
  public static final boolean forceSingleBindIsolation = false;

  /**
   * @generated
   */
  public CreditInfoInquiryDataImpl()
  {
    super();
  } 

  /**
   * @generated
   */
  public String getGeneratorVersion()
  {
    return generatorVersion;
  }

  /**
   * @Select( sql="SELECT r.Credit_Infopk_Id Credit_Infopk_Id, r.CONT_ID CONT_ID, r.CREDIT_SCORE CREDIT_SCORE, r.CREDIT_CLASS CREDIT_CLASS, r.CREDIT_STATUS CREDIT_STATUS, r.LAST_UPDATE_DT LAST_UPDATE_DT, r.LAST_UPDATE_USER LAST_UPDATE_USER, r.LAST_UPDATE_TX_ID LAST_UPDATE_TX_ID FROM CREDITINFO r WHERE r.Credit_Infopk_Id = ? ", pattern="tableAlias (CREDITINFO => com.test.additions.entityObject.EObjCreditInfo, H_CREDITINFO => com.test.additions.entityObject.EObjCreditInfo)" )
   * 
   * @generated
   */
  public Iterator<ResultQueue1<EObjCreditInfo>> getCreditInfo (Object[] parameters)
  {
    return queryIterator (getCreditInfoStatementDescriptor, parameters);
  }

  /**
   * @generated
   */
  @Metadata ()
  public static final StatementDescriptor getCreditInfoStatementDescriptor = createStatementDescriptor (
    "getCreditInfo(Object[])",
    "SELECT r.Credit_Infopk_Id Credit_Infopk_Id, r.CONT_ID CONT_ID, r.CREDIT_SCORE CREDIT_SCORE, r.CREDIT_CLASS CREDIT_CLASS, r.CREDIT_STATUS CREDIT_STATUS, r.LAST_UPDATE_DT LAST_UPDATE_DT, r.LAST_UPDATE_USER LAST_UPDATE_USER, r.LAST_UPDATE_TX_ID LAST_UPDATE_TX_ID FROM CREDITINFO r WHERE r.Credit_Infopk_Id = ? ",
    new int[] {SINGLE_ROW_PARAMETERS, MULTI_ROW_RESULT, java.sql.ResultSet.CONCUR_READ_ONLY, java.sql.ResultSet.CLOSE_CURSORS_AT_COMMIT, java.sql.ResultSet.TYPE_FORWARD_ONLY, DISALLOW_STATIC_ROWSET_CURSORS},
    SqlStatementType.QUERY,
    new String[]{"credit_infopk_id", "cont_id", "credit_score", "credit_class", "credit_status", "last_update_dt", "last_update_user", "last_update_tx_id"},
    new GetCreditInfoParameterHandler (),
    new int[][]{{Types.BIGINT}, {19}, {0}, {1}},
    null,
    new GetCreditInfoRowHandler (),
    new int[][]{ {Types.BIGINT, Types.BIGINT, Types.INTEGER, Types.VARCHAR, Types.VARCHAR, Types.TIMESTAMP, Types.VARCHAR, Types.BIGINT}, {19, 19, 10, 30, 20, 0, 20, 19}, {0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0}},
    null,
    identifier,
    generationTime,
    collection,
    forceSingleBindIsolation,
    null,
    1);

  /**
   * @generated
   */
  public static class GetCreditInfoParameterHandler extends BaseParameterHandler 
  {
    /**
     * @generated
     */
    public void handleParameters (PreparedStatement stmt, Object... parameters) throws SQLException
    {
      setObject (stmt, 1, Types.BIGINT, parameters[0], 0);
    }
  }

  /**
   * @generated
   */
  public static class GetCreditInfoRowHandler extends BaseRowHandler<ResultQueue1<EObjCreditInfo>>
  {
    /**
     * @generated
     */
    public ResultQueue1<EObjCreditInfo> handle (java.sql.ResultSet rs, ResultQueue1<EObjCreditInfo> returnObject) throws java.sql.SQLException
    {
      returnObject = new ResultQueue1<EObjCreditInfo> ();

      EObjCreditInfo returnObject1 = new EObjCreditInfo ();
      returnObject1.setCreditInfopkId(getLongObject (rs, 1)); 
      returnObject1.setPartyId(getLongObject (rs, 2)); 
      returnObject1.setCreditScore(getIntObject (rs, 3)); 
      returnObject1.setCreditClass(getString (rs, 4)); 
      returnObject1.setCreditStatus(getString (rs, 5)); 
      returnObject1.setLastUpdateDt(getTimestamp (rs, 6)); 
      returnObject1.setLastUpdateUser(getString (rs, 7)); 
      returnObject1.setLastUpdateTxId(getLongObject (rs, 8)); 
      returnObject.add (returnObject1);

    
      return returnObject;
    }
  }

  /**
   * @Select( sql="SELECT r.H_Credit_Infopk_Id hist_id_pk, r.H_ACTION_CODE h_action_code, r.H_CREATED_BY h_created_by, r.H_CREATE_DT h_create_dt, r.H_END_DT h_end_dt, r.Credit_Infopk_Id Credit_Infopk_Id, r.CONT_ID CONT_ID, r.CREDIT_SCORE CREDIT_SCORE, r.CREDIT_CLASS CREDIT_CLASS, r.CREDIT_STATUS CREDIT_STATUS, r.LAST_UPDATE_DT LAST_UPDATE_DT, r.LAST_UPDATE_USER LAST_UPDATE_USER, r.LAST_UPDATE_TX_ID LAST_UPDATE_TX_ID FROM H_CREDITINFO r WHERE r.H_Credit_Infopk_Id = ?  AND (( ? BETWEEN r.H_CREATE_DT AND r.H_END_DT ) OR ( ? >= r.H_CREATE_DT AND r.H_END_DT IS NULL ))", pattern="tableAlias (CREDITINFO => com.test.additions.entityObject.EObjCreditInfo, H_CREDITINFO => com.test.additions.entityObject.EObjCreditInfo)" )
   * 
   * @generated
   */
  public Iterator<ResultQueue1<EObjCreditInfo>> getCreditInfoHistory (Object[] parameters)
  {
    return queryIterator (getCreditInfoHistoryStatementDescriptor, parameters);
  }

  /**
   * @generated
   */
  @Metadata ()
  public static final StatementDescriptor getCreditInfoHistoryStatementDescriptor = createStatementDescriptor (
    "getCreditInfoHistory(Object[])",
    "SELECT r.H_Credit_Infopk_Id hist_id_pk, r.H_ACTION_CODE h_action_code, r.H_CREATED_BY h_created_by, r.H_CREATE_DT h_create_dt, r.H_END_DT h_end_dt, r.Credit_Infopk_Id Credit_Infopk_Id, r.CONT_ID CONT_ID, r.CREDIT_SCORE CREDIT_SCORE, r.CREDIT_CLASS CREDIT_CLASS, r.CREDIT_STATUS CREDIT_STATUS, r.LAST_UPDATE_DT LAST_UPDATE_DT, r.LAST_UPDATE_USER LAST_UPDATE_USER, r.LAST_UPDATE_TX_ID LAST_UPDATE_TX_ID FROM H_CREDITINFO r WHERE r.H_Credit_Infopk_Id = ?  AND (( ? BETWEEN r.H_CREATE_DT AND r.H_END_DT ) OR ( ? >= r.H_CREATE_DT AND r.H_END_DT IS NULL ))",
    new int[] {SINGLE_ROW_PARAMETERS, MULTI_ROW_RESULT, java.sql.ResultSet.CONCUR_READ_ONLY, java.sql.ResultSet.CLOSE_CURSORS_AT_COMMIT, java.sql.ResultSet.TYPE_FORWARD_ONLY, DISALLOW_STATIC_ROWSET_CURSORS},
    SqlStatementType.QUERY,
    new String[]{"historyidpk", "h_action_code", "h_created_by", "h_create_dt", "h_end_dt", "credit_infopk_id", "cont_id", "credit_score", "credit_class", "credit_status", "last_update_dt", "last_update_user", "last_update_tx_id"},
    new GetCreditInfoHistoryParameterHandler (),
    new int[][]{{Types.BIGINT, Types.TIMESTAMP, Types.TIMESTAMP}, {19, 0, 0}, {0, 0, 0}, {1, 1, 1}},
    null,
    new GetCreditInfoHistoryRowHandler (),
    new int[][]{ {Types.BIGINT, Types.CHAR, Types.VARCHAR, Types.TIMESTAMP, Types.TIMESTAMP, Types.BIGINT, Types.BIGINT, Types.INTEGER, Types.VARCHAR, Types.VARCHAR, Types.TIMESTAMP, Types.VARCHAR, Types.BIGINT}, {19, 1, 20, 0, 0, 19, 19, 10, 30, 20, 0, 20, 19}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}},
    null,
    identifier,
    generationTime,
    collection,
    forceSingleBindIsolation,
    null,
    2);

  /**
   * @generated
   */
  public static class GetCreditInfoHistoryParameterHandler extends BaseParameterHandler 
  {
    /**
     * @generated
     */
    public void handleParameters (PreparedStatement stmt, Object... parameters) throws SQLException
    {
      setObject (stmt, 1, Types.BIGINT, parameters[0], 0);
      setObject (stmt, 2, Types.TIMESTAMP, parameters[1], 0);
      setObject (stmt, 3, Types.TIMESTAMP, parameters[2], 0);
    }
  }

  /**
   * @generated
   */
  public static class GetCreditInfoHistoryRowHandler extends BaseRowHandler<ResultQueue1<EObjCreditInfo>>
  {
    /**
     * @generated
     */
    public ResultQueue1<EObjCreditInfo> handle (java.sql.ResultSet rs, ResultQueue1<EObjCreditInfo> returnObject) throws java.sql.SQLException
    {
      returnObject = new ResultQueue1<EObjCreditInfo> ();

      EObjCreditInfo returnObject1 = new EObjCreditInfo ();
      returnObject1.setHistoryIdPK(getLongObject (rs, 1)); 
      returnObject1.setHistActionCode(getString (rs, 2)); 
      returnObject1.setHistCreatedBy(getString (rs, 3)); 
      returnObject1.setHistCreateDt(getTimestamp (rs, 4)); 
      returnObject1.setHistEndDt(getTimestamp (rs, 5)); 
      returnObject1.setCreditInfopkId(getLongObject (rs, 6)); 
      returnObject1.setPartyId(getLongObject (rs, 7)); 
      returnObject1.setCreditScore(getIntObject (rs, 8)); 
      returnObject1.setCreditClass(getString (rs, 9)); 
      returnObject1.setCreditStatus(getString (rs, 10)); 
      returnObject1.setLastUpdateDt(getTimestamp (rs, 11)); 
      returnObject1.setLastUpdateUser(getString (rs, 12)); 
      returnObject1.setLastUpdateTxId(getLongObject (rs, 13)); 
      returnObject.add (returnObject1);

    
      return returnObject;
    }
  }

  /**
   * @Select( sql="SELECT r.Credit_Infopk_Id Credit_Infopk_Id, r.CONT_ID CONT_ID, r.CREDIT_SCORE CREDIT_SCORE, r.CREDIT_CLASS CREDIT_CLASS, r.CREDIT_STATUS CREDIT_STATUS, r.LAST_UPDATE_DT LAST_UPDATE_DT, r.LAST_UPDATE_USER LAST_UPDATE_USER, r.LAST_UPDATE_TX_ID LAST_UPDATE_TX_ID FROM CREDITINFO r WHERE r.CONT_ID = ? ", pattern="tableAlias (CREDITINFO => com.test.additions.entityObject.EObjCreditInfo, H_CREDITINFO => com.test.additions.entityObject.EObjCreditInfo)" )
   * 
   * @generated
   */
  public Iterator<ResultQueue1<EObjCreditInfo>> getCreditInfobyPartyId (Object[] parameters)
  {
    return queryIterator (getCreditInfobyPartyIdStatementDescriptor, parameters);
  }

  /**
   * @generated
   */
  @Metadata ()
  public static final StatementDescriptor getCreditInfobyPartyIdStatementDescriptor = createStatementDescriptor (
    "getCreditInfobyPartyId(Object[])",
    "SELECT r.Credit_Infopk_Id Credit_Infopk_Id, r.CONT_ID CONT_ID, r.CREDIT_SCORE CREDIT_SCORE, r.CREDIT_CLASS CREDIT_CLASS, r.CREDIT_STATUS CREDIT_STATUS, r.LAST_UPDATE_DT LAST_UPDATE_DT, r.LAST_UPDATE_USER LAST_UPDATE_USER, r.LAST_UPDATE_TX_ID LAST_UPDATE_TX_ID FROM CREDITINFO r WHERE r.CONT_ID = ? ",
    new int[] {SINGLE_ROW_PARAMETERS, MULTI_ROW_RESULT, java.sql.ResultSet.CONCUR_READ_ONLY, java.sql.ResultSet.CLOSE_CURSORS_AT_COMMIT, java.sql.ResultSet.TYPE_FORWARD_ONLY, DISALLOW_STATIC_ROWSET_CURSORS},
    SqlStatementType.QUERY,
    new String[]{"credit_infopk_id", "cont_id", "credit_score", "credit_class", "credit_status", "last_update_dt", "last_update_user", "last_update_tx_id"},
    new GetCreditInfobyPartyIdParameterHandler (),
    new int[][]{{Types.BIGINT}, {19}, {0}, {1}},
    null,
    new GetCreditInfobyPartyIdRowHandler (),
    new int[][]{ {Types.BIGINT, Types.BIGINT, Types.INTEGER, Types.VARCHAR, Types.VARCHAR, Types.TIMESTAMP, Types.VARCHAR, Types.BIGINT}, {19, 19, 10, 30, 20, 0, 20, 19}, {0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0}},
    null,
    identifier,
    generationTime,
    collection,
    forceSingleBindIsolation,
    null,
    3);

  /**
   * @generated
   */
  public static class GetCreditInfobyPartyIdParameterHandler extends BaseParameterHandler 
  {
    /**
     * @generated
     */
    public void handleParameters (PreparedStatement stmt, Object... parameters) throws SQLException
    {
      setObject (stmt, 1, Types.BIGINT, parameters[0], 0);
    }
  }

  /**
   * @generated
   */
  public static class GetCreditInfobyPartyIdRowHandler extends BaseRowHandler<ResultQueue1<EObjCreditInfo>>
  {
    /**
     * @generated
     */
    public ResultQueue1<EObjCreditInfo> handle (java.sql.ResultSet rs, ResultQueue1<EObjCreditInfo> returnObject) throws java.sql.SQLException
    {
      returnObject = new ResultQueue1<EObjCreditInfo> ();

      EObjCreditInfo returnObject1 = new EObjCreditInfo ();
      returnObject1.setCreditInfopkId(getLongObject (rs, 1)); 
      returnObject1.setPartyId(getLongObject (rs, 2)); 
      returnObject1.setCreditScore(getIntObject (rs, 3)); 
      returnObject1.setCreditClass(getString (rs, 4)); 
      returnObject1.setCreditStatus(getString (rs, 5)); 
      returnObject1.setLastUpdateDt(getTimestamp (rs, 6)); 
      returnObject1.setLastUpdateUser(getString (rs, 7)); 
      returnObject1.setLastUpdateTxId(getLongObject (rs, 8)); 
      returnObject.add (returnObject1);

    
      return returnObject;
    }
  }

  /**
   * @Select( sql="SELECT r.H_Credit_Infopk_Id hist_id_pk, r.H_ACTION_CODE h_action_code, r.H_CREATED_BY h_created_by, r.H_CREATE_DT h_create_dt, r.H_END_DT h_end_dt, r.Credit_Infopk_Id Credit_Infopk_Id, r.CONT_ID CONT_ID, r.CREDIT_SCORE CREDIT_SCORE, r.CREDIT_CLASS CREDIT_CLASS, r.CREDIT_STATUS CREDIT_STATUS, r.LAST_UPDATE_DT LAST_UPDATE_DT, r.LAST_UPDATE_USER LAST_UPDATE_USER, r.LAST_UPDATE_TX_ID LAST_UPDATE_TX_ID FROM H_CREDITINFO r WHERE r.CONT_ID = ?  AND (( ? BETWEEN r.H_CREATE_DT AND r.H_END_DT ) OR ( ? >= r.H_CREATE_DT AND r.H_END_DT IS NULL ))", pattern="tableAlias (CREDITINFO => com.test.additions.entityObject.EObjCreditInfo, H_CREDITINFO => com.test.additions.entityObject.EObjCreditInfo)" )
   * 
   * @generated
   */
  public Iterator<ResultQueue1<EObjCreditInfo>> getCreditInfobyPartyIdHistory (Object[] parameters)
  {
    return queryIterator (getCreditInfobyPartyIdHistoryStatementDescriptor, parameters);
  }

  /**
   * @generated
   */
  @Metadata ()
  public static final StatementDescriptor getCreditInfobyPartyIdHistoryStatementDescriptor = createStatementDescriptor (
    "getCreditInfobyPartyIdHistory(Object[])",
    "SELECT r.H_Credit_Infopk_Id hist_id_pk, r.H_ACTION_CODE h_action_code, r.H_CREATED_BY h_created_by, r.H_CREATE_DT h_create_dt, r.H_END_DT h_end_dt, r.Credit_Infopk_Id Credit_Infopk_Id, r.CONT_ID CONT_ID, r.CREDIT_SCORE CREDIT_SCORE, r.CREDIT_CLASS CREDIT_CLASS, r.CREDIT_STATUS CREDIT_STATUS, r.LAST_UPDATE_DT LAST_UPDATE_DT, r.LAST_UPDATE_USER LAST_UPDATE_USER, r.LAST_UPDATE_TX_ID LAST_UPDATE_TX_ID FROM H_CREDITINFO r WHERE r.CONT_ID = ?  AND (( ? BETWEEN r.H_CREATE_DT AND r.H_END_DT ) OR ( ? >= r.H_CREATE_DT AND r.H_END_DT IS NULL ))",
    new int[] {SINGLE_ROW_PARAMETERS, MULTI_ROW_RESULT, java.sql.ResultSet.CONCUR_READ_ONLY, java.sql.ResultSet.CLOSE_CURSORS_AT_COMMIT, java.sql.ResultSet.TYPE_FORWARD_ONLY, DISALLOW_STATIC_ROWSET_CURSORS},
    SqlStatementType.QUERY,
    new String[]{"historyidpk", "h_action_code", "h_created_by", "h_create_dt", "h_end_dt", "credit_infopk_id", "cont_id", "credit_score", "credit_class", "credit_status", "last_update_dt", "last_update_user", "last_update_tx_id"},
    new GetCreditInfobyPartyIdHistoryParameterHandler (),
    new int[][]{{Types.BIGINT, Types.TIMESTAMP, Types.TIMESTAMP}, {19, 0, 0}, {0, 0, 0}, {1, 1, 1}},
    null,
    new GetCreditInfobyPartyIdHistoryRowHandler (),
    new int[][]{ {Types.BIGINT, Types.CHAR, Types.VARCHAR, Types.TIMESTAMP, Types.TIMESTAMP, Types.BIGINT, Types.BIGINT, Types.INTEGER, Types.VARCHAR, Types.VARCHAR, Types.TIMESTAMP, Types.VARCHAR, Types.BIGINT}, {19, 1, 20, 0, 0, 19, 19, 10, 30, 20, 0, 20, 19}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}},
    null,
    identifier,
    generationTime,
    collection,
    forceSingleBindIsolation,
    null,
    4);

  /**
   * @generated
   */
  public static class GetCreditInfobyPartyIdHistoryParameterHandler extends BaseParameterHandler 
  {
    /**
     * @generated
     */
    public void handleParameters (PreparedStatement stmt, Object... parameters) throws SQLException
    {
      setObject (stmt, 1, Types.BIGINT, parameters[0], 0);
      setObject (stmt, 2, Types.TIMESTAMP, parameters[1], 0);
      setObject (stmt, 3, Types.TIMESTAMP, parameters[2], 0);
    }
  }

  /**
   * @generated
   */
  public static class GetCreditInfobyPartyIdHistoryRowHandler extends BaseRowHandler<ResultQueue1<EObjCreditInfo>>
  {
    /**
     * @generated
     */
    public ResultQueue1<EObjCreditInfo> handle (java.sql.ResultSet rs, ResultQueue1<EObjCreditInfo> returnObject) throws java.sql.SQLException
    {
      returnObject = new ResultQueue1<EObjCreditInfo> ();

      EObjCreditInfo returnObject1 = new EObjCreditInfo ();
      returnObject1.setHistoryIdPK(getLongObject (rs, 1)); 
      returnObject1.setHistActionCode(getString (rs, 2)); 
      returnObject1.setHistCreatedBy(getString (rs, 3)); 
      returnObject1.setHistCreateDt(getTimestamp (rs, 4)); 
      returnObject1.setHistEndDt(getTimestamp (rs, 5)); 
      returnObject1.setCreditInfopkId(getLongObject (rs, 6)); 
      returnObject1.setPartyId(getLongObject (rs, 7)); 
      returnObject1.setCreditScore(getIntObject (rs, 8)); 
      returnObject1.setCreditClass(getString (rs, 9)); 
      returnObject1.setCreditStatus(getString (rs, 10)); 
      returnObject1.setLastUpdateDt(getTimestamp (rs, 11)); 
      returnObject1.setLastUpdateUser(getString (rs, 12)); 
      returnObject1.setLastUpdateTxId(getLongObject (rs, 13)); 
      returnObject.add (returnObject1);

    
      return returnObject;
    }
  }

}
