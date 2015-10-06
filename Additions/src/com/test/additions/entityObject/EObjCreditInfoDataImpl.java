package com.test.additions.entityObject;

import com.ibm.pdq.runtime.generator.BaseData;
import java.sql.PreparedStatement;
import com.ibm.pdq.runtime.statement.SqlStatementType;
import com.ibm.pdq.runtime.generator.BaseRowHandler;
import java.sql.Types;
import java.sql.SQLException;
import java.util.Iterator;
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
public class EObjCreditInfoDataImpl  extends BaseData implements EObjCreditInfoData
{

  /**
   * @generated
   */
  public static final String generatorVersion = "3.200.73";

  /**
   * @generated
   */
  public static final String identifier = "EObjCreditInfoData";

  /**
   * @generated
   */
  public static final long generationTime = 0x0000015006ad605cL;

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
  public EObjCreditInfoDataImpl()
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
   * @Select( sql="select Credit_Infopk_Id, CONT_ID, CREDIT_SCORE, CREDIT_CLASS, CREDIT_STATUS, LAST_UPDATE_DT, LAST_UPDATE_USER, LAST_UPDATE_TX_ID from CREDITINFO where Credit_Infopk_Id = ? " )
   * 
   * @generated
   */
  public Iterator<EObjCreditInfo> getEObjCreditInfo (Long creditInfopkId)
  {
    return queryIterator (getEObjCreditInfoStatementDescriptor, creditInfopkId);
  }

  /**
   * @generated
   */
  @Metadata ()
  public static final StatementDescriptor getEObjCreditInfoStatementDescriptor = createStatementDescriptor (
    "getEObjCreditInfo(Long)",
    "select Credit_Infopk_Id, CONT_ID, CREDIT_SCORE, CREDIT_CLASS, CREDIT_STATUS, LAST_UPDATE_DT, LAST_UPDATE_USER, LAST_UPDATE_TX_ID from CREDITINFO where Credit_Infopk_Id = ? ",
    new int[] {SINGLE_ROW_PARAMETERS, MULTI_ROW_RESULT, java.sql.ResultSet.CONCUR_READ_ONLY, java.sql.ResultSet.CLOSE_CURSORS_AT_COMMIT, java.sql.ResultSet.TYPE_FORWARD_ONLY, DISALLOW_STATIC_ROWSET_CURSORS},
    SqlStatementType.QUERY,
    new String[]{"credit_infopk_id", "cont_id", "credit_score", "credit_class", "credit_status", "last_update_dt", "last_update_user", "last_update_tx_id"},
    new GetEObjCreditInfoParameterHandler (),
    new int[][]{{Types.BIGINT}, {19}, {0}, {1}},
    null,
    new GetEObjCreditInfoRowHandler (),
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
  public static class GetEObjCreditInfoParameterHandler extends BaseParameterHandler 
  {
    /**
     * @generated
     */
    public void handleParameters (PreparedStatement stmt, Object... parameters) throws SQLException
    {
      setLong (stmt, 1, Types.BIGINT, (Long)parameters[0]);
    }
  }

  /**
   * @generated
   */
  public static class GetEObjCreditInfoRowHandler extends BaseRowHandler<EObjCreditInfo>
  {
    /**
     * @generated
     */
    public EObjCreditInfo handle (java.sql.ResultSet rs, EObjCreditInfo returnObject) throws java.sql.SQLException
    {
      returnObject = new EObjCreditInfo ();
      returnObject.setCreditInfopkId(getLongObject (rs, 1)); 
      returnObject.setPartyId(getLongObject (rs, 2)); 
      returnObject.setCreditScore(getIntObject (rs, 3)); 
      returnObject.setCreditClass(getString (rs, 4)); 
      returnObject.setCreditStatus(getString (rs, 5)); 
      returnObject.setLastUpdateDt(getTimestamp (rs, 6)); 
      returnObject.setLastUpdateUser(getString (rs, 7)); 
      returnObject.setLastUpdateTxId(getLongObject (rs, 8)); 
    
      return returnObject;
    }
  }

  /**
   * @Update( sql="insert into CREDITINFO (Credit_Infopk_Id, CONT_ID, CREDIT_SCORE, CREDIT_CLASS, CREDIT_STATUS, LAST_UPDATE_DT, LAST_UPDATE_USER, LAST_UPDATE_TX_ID) values( :creditInfopkId, :partyId, :creditScore, :creditClass, :creditStatus, :lastUpdateDt, :lastUpdateUser, :lastUpdateTxId)" )
   * 
   * @generated
   */
  public int createEObjCreditInfo (EObjCreditInfo e)
  {
    return update (createEObjCreditInfoStatementDescriptor, e);
  }

  /**
   * @generated
   */
  @Metadata ()
  public static final StatementDescriptor createEObjCreditInfoStatementDescriptor = createStatementDescriptor (
    "createEObjCreditInfo(com.test.additions.entityObject.EObjCreditInfo)",
    "insert into CREDITINFO (Credit_Infopk_Id, CONT_ID, CREDIT_SCORE, CREDIT_CLASS, CREDIT_STATUS, LAST_UPDATE_DT, LAST_UPDATE_USER, LAST_UPDATE_TX_ID) values(  ? ,  ? ,  ? ,  ? ,  ? ,  ? ,  ? ,  ? )",
    new int[] {SINGLE_ROW_PARAMETERS},
    SqlStatementType.INSERT,
    null,
    new CreateEObjCreditInfoParameterHandler (),
    new int[][]{{Types.BIGINT, Types.BIGINT, Types.INTEGER, Types.VARCHAR, Types.VARCHAR, Types.TIMESTAMP, Types.VARCHAR, Types.BIGINT}, {19, 19, 10, 30, 20, 0, 0, 19}, {0, 0, 0, 0, 0, 0, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1}},
    null,
    null,
    null,
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
  public static class CreateEObjCreditInfoParameterHandler extends BaseParameterHandler 
  {
    /**
     * @generated
     */
    public void handleParameters (PreparedStatement stmt, Object... parameters) throws SQLException
    {
      EObjCreditInfo bean0 = (EObjCreditInfo) parameters[0];
      setLong (stmt, 1, Types.BIGINT, (Long)bean0.getCreditInfopkId());
      setLong (stmt, 2, Types.BIGINT, (Long)bean0.getPartyId());
      setInteger (stmt, 3, Types.INTEGER, (Integer)bean0.getCreditScore());
      setString (stmt, 4, Types.VARCHAR, (String)bean0.getCreditClass());
      setString (stmt, 5, Types.VARCHAR, (String)bean0.getCreditStatus());
      setTimestamp (stmt, 6, Types.TIMESTAMP, (java.sql.Timestamp)bean0.getLastUpdateDt());
      setString (stmt, 7, Types.VARCHAR, (String)bean0.getLastUpdateUser());
      setLong (stmt, 8, Types.BIGINT, (Long)bean0.getLastUpdateTxId());
    }
  }

  /**
   * @Update( sql="update CREDITINFO set CONT_ID = :partyId, CREDIT_SCORE = :creditScore, CREDIT_CLASS = :creditClass, CREDIT_STATUS = :creditStatus, LAST_UPDATE_DT = :lastUpdateDt, LAST_UPDATE_USER = :lastUpdateUser, LAST_UPDATE_TX_ID = :lastUpdateTxId where Credit_Infopk_Id= :creditInfopkId and LAST_UPDATE_DT = :oldLastUpdateDt" )
   * 
   * @generated
   */
  public int updateEObjCreditInfo (EObjCreditInfo e)
  {
    return update (updateEObjCreditInfoStatementDescriptor, e);
  }

  /**
   * @generated
   */
  @Metadata ()
  public static final StatementDescriptor updateEObjCreditInfoStatementDescriptor = createStatementDescriptor (
    "updateEObjCreditInfo(com.test.additions.entityObject.EObjCreditInfo)",
    "update CREDITINFO set CONT_ID =  ? , CREDIT_SCORE =  ? , CREDIT_CLASS =  ? , CREDIT_STATUS =  ? , LAST_UPDATE_DT =  ? , LAST_UPDATE_USER =  ? , LAST_UPDATE_TX_ID =  ?  where Credit_Infopk_Id=  ?  and LAST_UPDATE_DT =  ? ",
    new int[] {SINGLE_ROW_PARAMETERS},
    SqlStatementType.UPDATE,
    null,
    new UpdateEObjCreditInfoParameterHandler (),
    new int[][]{{Types.BIGINT, Types.INTEGER, Types.VARCHAR, Types.VARCHAR, Types.TIMESTAMP, Types.VARCHAR, Types.BIGINT, Types.BIGINT, Types.TIMESTAMP}, {19, 10, 30, 20, 0, 0, 19, 19, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 1}},
    null,
    null,
    null,
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
  public static class UpdateEObjCreditInfoParameterHandler extends BaseParameterHandler 
  {
    /**
     * @generated
     */
    public void handleParameters (PreparedStatement stmt, Object... parameters) throws SQLException
    {
      EObjCreditInfo bean0 = (EObjCreditInfo) parameters[0];
      setLong (stmt, 1, Types.BIGINT, (Long)bean0.getPartyId());
      setInteger (stmt, 2, Types.INTEGER, (Integer)bean0.getCreditScore());
      setString (stmt, 3, Types.VARCHAR, (String)bean0.getCreditClass());
      setString (stmt, 4, Types.VARCHAR, (String)bean0.getCreditStatus());
      setTimestamp (stmt, 5, Types.TIMESTAMP, (java.sql.Timestamp)bean0.getLastUpdateDt());
      setString (stmt, 6, Types.VARCHAR, (String)bean0.getLastUpdateUser());
      setLong (stmt, 7, Types.BIGINT, (Long)bean0.getLastUpdateTxId());
      setLong (stmt, 8, Types.BIGINT, (Long)bean0.getCreditInfopkId());
      setTimestamp (stmt, 9, Types.TIMESTAMP, (java.sql.Timestamp)bean0.getOldLastUpdateDt());
    }
  }

  /**
   * @Update( sql="delete from CREDITINFO where Credit_Infopk_Id = ?" )
   * 
   * @generated
   */
  public int deleteEObjCreditInfo (Long creditInfopkId)
  {
    return update (deleteEObjCreditInfoStatementDescriptor, creditInfopkId);
  }

  /**
   * @generated
   */
  @Metadata ()
  public static final StatementDescriptor deleteEObjCreditInfoStatementDescriptor = createStatementDescriptor (
    "deleteEObjCreditInfo(Long)",
    "delete from CREDITINFO where Credit_Infopk_Id = ?",
    new int[] {SINGLE_ROW_PARAMETERS},
    SqlStatementType.DELETE,
    null,
    new DeleteEObjCreditInfoParameterHandler (),
    new int[][]{{Types.BIGINT}, {19}, {0}, {1}},
    null,
    null,
    null,
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
  public static class DeleteEObjCreditInfoParameterHandler extends BaseParameterHandler 
  {
    /**
     * @generated
     */
    public void handleParameters (PreparedStatement stmt, Object... parameters) throws SQLException
    {
      setLong (stmt, 1, Types.BIGINT, (Long)parameters[0]);
    }
  }

}
