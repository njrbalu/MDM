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
 * IBM-MDMWB-1.0-[31bbff1f1d63a6125fb92e09dd74bb5b]
 */

package com.test.additions.entityObject;

import com.dwl.base.EObjCommon;
import com.ibm.mdm.base.db.DataType;
import com.ibm.pdq.annotation.Column;
import com.ibm.pdq.annotation.Id;
import com.ibm.pdq.annotation.Table;



/**
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 *
 * The entity object corresponding to the CreditInfo business object. This
 * entity object should include all the attributes as defined by the business
 * object.
 * 
 * @generated
 */
@Table(name=EObjCreditInfo.tableName)
public class EObjCreditInfo extends EObjCommon {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public static final String tableName = "CREDITINFO";
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    private static final String creditInfopkIdColumn = "CREDIT_INFOPK_ID";
  
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    private static final String creditInfopkIdJdbcType = "BIGINT";
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    private static final int    creditInfopkIdPrecision = 19;
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    private static final String partyIdColumn = "CONT_ID";
  
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    private static final String partyIdJdbcType = "BIGINT";
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    private static final int    partyIdPrecision = 19;
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    private static final String creditScoreColumn = "CREDIT_SCORE";
  
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    private static final String creditScoreJdbcType = "INTEGER";
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    private static final String creditClassColumn = "CREDIT_CLASS";
  
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    private static final String creditClassJdbcType = "VARCHAR";
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    private static final int    creditClassPrecision = 30;
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    private static final String creditStatusColumn = "CREDIT_STATUS";
  
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    private static final String creditStatusJdbcType = "VARCHAR";
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    private static final int    creditStatusPrecision = 20;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    protected Long creditInfopkId;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    protected Long partyId;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    protected Integer creditScore;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    protected String creditClass;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    protected String creditStatus;



    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * Default constructor.     
     *
     * @generated
     */
    public EObjCreditInfo() {
        super();
    }


    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * Gets the creditInfopkId attribute. 
     *
     * @generated
     */
    @Id
    @Column(name=creditInfopkIdColumn)
    @DataType(jdbcType=creditInfopkIdJdbcType, precision=creditInfopkIdPrecision)
    public Long getCreditInfopkId (){
        return creditInfopkId;
    }
     
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * Sets the creditInfopkId attribute. 
     *
     * @param creditInfopkId
     *     The new value of CreditInfopkId. 
     * @generated
     */
    public void setCreditInfopkId( Long creditInfopkId ){
        this.creditInfopkId = creditInfopkId;
    
        super.setIdPK(creditInfopkId);
  }
	 
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * Gets the partyId attribute. 
     *
     * @generated
     */
    @Column(name=partyIdColumn)
    @DataType(jdbcType=partyIdJdbcType, precision=partyIdPrecision)
    public Long getPartyId (){
        return partyId;
    }
     
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * Sets the partyId attribute. 
     *
     * @param partyId
     *     The new value of PartyId. 
     * @generated
     */
    public void setPartyId( Long partyId ){
        this.partyId = partyId;
    
  }
	 
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * Gets the creditScore attribute. 
     *
     * @generated
     */
    @Column(name=creditScoreColumn)
    @DataType(jdbcType=creditScoreJdbcType)
    public Integer getCreditScore (){
        return creditScore;
    }
     
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * Sets the creditScore attribute. 
     *
     * @param creditScore
     *     The new value of CreditScore. 
     * @generated
     */
    public void setCreditScore( Integer creditScore ){
        this.creditScore = creditScore;
    
  }
	 
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * Gets the creditClass attribute. 
     *
     * @generated
     */
    @Column(name=creditClassColumn)
    @DataType(jdbcType=creditClassJdbcType, precision=creditClassPrecision)
    public String getCreditClass (){
        return creditClass;
    }
     
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * Sets the creditClass attribute. 
     *
     * @param creditClass
     *     The new value of CreditClass. 
     * @generated
     */
    public void setCreditClass( String creditClass ){
        this.creditClass = creditClass;
    
  }
	 
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * Gets the creditStatus attribute. 
     *
     * @generated
     */
    @Column(name=creditStatusColumn)
    @DataType(jdbcType=creditStatusJdbcType, precision=creditStatusPrecision)
    public String getCreditStatus (){
        return creditStatus;
    }
     
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * Sets the creditStatus attribute. 
     *
     * @param creditStatus
     *     The new value of CreditStatus. 
     * @generated
     */
    public void setCreditStatus( String creditStatus ){
        this.creditStatus = creditStatus;
    
  }
	 
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * Sets the primary key. 
     *
     * @param aUniqueId
     *     The new value of the primary key. 
     * @generated
   */
	public void setPrimaryKey(Object aUniqueId) {
    this.setCreditInfopkId((Long)aUniqueId);
  }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * Gets the primary key.
     *
     * @generated
     */
	public Object getPrimaryKey() {
    return this.getCreditInfopkId();
  }
	 
}

