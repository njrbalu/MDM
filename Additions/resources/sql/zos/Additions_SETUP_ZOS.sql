
-- @SqlSnippetPriority 100

-- The following source code ("Code") may only be used in accordance with the terms
-- and conditions of the license agreement you have with IBM Corporation. The Code 
-- is provided to you on an "AS IS" basis, without warranty of any kind.  
-- SUBJECT TO ANY STATUTORY WARRANTIES WHICH CAN NOT BE EXCLUDED, IBM MAKES NO 
-- WARRANTIES OR CONDITIONS EITHER EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED 
-- TO, THE IMPLIED WARRANTIES OR CONDITIONS OF MERCHANTABILITY, FITNESS FOR A 
-- PARTICULAR PURPOSE, AND NON-INFRINGEMENT, REGARDING THE CODE. IN NO EVENT WILL 
-- IBM BE LIABLE TO YOU OR ANY PARTY FOR ANY DIRECT, INDIRECT, SPECIAL OR OTHER 
-- CONSEQUENTIAL DAMAGES FOR ANY USE OF THE CODE, INCLUDING, WITHOUT LIMITATION, 
-- LOSS OF, OR DAMAGE TO, DATA, OR LOST PROFITS, BUSINESS, REVENUE, GOODWILL, OR 
-- ANTICIPATED SAVINGS, EVEN IF IBM HAS BEEN ADVISED OF THE POSSIBILITY OF SUCH 
-- DAMAGES. SOME JURISDICTIONS DO NOT ALLOW THE EXCLUSION OR LIMITATION OF 
-- INCIDENTAL OR CONSEQUENTIAL DAMAGES, SO THE ABOVE LIMITATION OR EXCLUSION MAY 
-- NOT APPLY TO YOU.

-- MDM_TODO: Replace <DBNAME> with the database name.
-- MDM_TODO: Replace <TABLESPACENAME> with the table space name.
-- MDM_TODO: Replace <H_DBNAME> with the history database name.
-- MDM_TODO: Replace <H_TABLESPACENAME> with the history table space name.

-- Notes
-- MDM_TODO:  statements are placed in the generated SQL file when user changes are required.
-- 1. Edit the following SQL files following any associated instructions.
-- 2. Connect to the database.
-- 3. Run each SQL file as shown below and in the same order.
-- 			db2 -vf Additions_SETUP_ZOS.sql
-- 			db2 -vf Additions_TRIGGERS_ZOS.sql
-- 			db2 -vf Additions_CONSTRAINTS_ZOS.sql
-- 			db2 -vf Additions_MetaData_ZOS.sql
-- 			db2 -vf CONFIG_XMLSERVICES_RESPONSE_ZOS.sql
-- 			db2 -vf Additions_CODETABLES_ZOS.sql
--#SET TERMINATOR ;


CREATE TABLE DB2ADMIN.CREDITINFO (  
	Credit_Infopk_Id DECIMAL(19)  NOT NULL  , 
	CONT_ID DECIMAL(19)  NOT NULL  , 
	CREDIT_SCORE DECIMAL(19)  NOT NULL  , 
	CREDIT_CLASS VARCHAR(30)  NOT NULL  , 
	CREDIT_STATUS VARCHAR(20)  NOT NULL  , 
	LAST_UPDATE_DT TIMESTAMP  NOT NULL   DEFAULT, 
	LAST_UPDATE_TX_ID DECIMAL(19)   , 
	LAST_UPDATE_USER VARCHAR(20)   , 
	CONSTRAINT P_CREDITINFO PRIMARY KEY (
	 Credit_Infopk_Id
	 )
  ) IN <DBNAME>.<TABLESPACENAME>;

CREATE UNIQUE INDEX  U1_CREDITINFO
  ON DB2ADMIN.CREDITINFO (
	 Credit_Infopk_Id
  );


CREATE TABLE DB2ADMIN.H_CREDITINFO (
	h_Credit_Infopk_Id DECIMAL(19)  NOT NULL  ,
	h_action_code                                    CHAR(1)         NOT NULL,
	h_created_by                                     VARCHAR(20)     NOT NULL,
	h_create_dt                                      TIMESTAMP       NOT NULL   DEFAULT,
	h_end_dt                                         TIMESTAMP,
	Credit_Infopk_Id DECIMAL(19)  NOT NULL  , 
	CONT_ID DECIMAL(19)  NOT NULL  , 
	CREDIT_SCORE DECIMAL(19)  NOT NULL  , 
	CREDIT_CLASS VARCHAR(30)  NOT NULL  , 
	CREDIT_STATUS VARCHAR(20)  NOT NULL  , 
	LAST_UPDATE_DT TIMESTAMP  NOT NULL   DEFAULT, 
	LAST_UPDATE_TX_ID DECIMAL(19)   , 
	LAST_UPDATE_USER VARCHAR(20)   , 
	CONSTRAINT P_H_CREDITINFO PRIMARY KEY (
	 h_Credit_Infopk_Id,
	 h_create_dt
	 )
  ) IN <H_DBNAME>.<H_TABLESPACENAME>;

CREATE UNIQUE INDEX  U1_H_CREDITINFO
  ON DB2ADMIN.H_CREDITINFO
  (
	 h_Credit_Infopk_Id,
	 h_create_dt
  );


