
-- @SqlSnippetPriority 400

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



-- MDM_TODO: Review CDDWLCOLUMNTP LOCALE_SENSITIVE settings 
-- MDM_TODO: You may need to add entries to the INTERNALTXNKEY table for any new transactions


-- Notes
-- MDM_TODO:  statements are placed in the generated SQL file when user changes are required.
-- 1. Edit the following SQL files following any associated instructions.
-- 2. Connect to the database.
-- 3. Run each SQL file as shown below and in the same order.
-- 			db2 -vf Extension_SETUP_DB2.sql
-- 			db2 -vf Extension_TRIGGERS_DB2.sql
-- 			db2 -vf Extension_CONSTRAINTS_DB2.sql
-- 			db2 -vf Extension_MetaData_DB2.sql
-- 			db2 -vf CONFIG_XMLSERVICES_RESPONSE_DB2.sql
-- 			db2 -vf Extension_CODETABLES_DB2.sql
	
	--#SET TERMINATOR ;
	

----------------------------------------------
-- Component type
----------------------------------------------


----------------------------------------------
-- Error messages
----------------------------------------------

-- For locale: 100 / default


---------------------------------------------
-- Metadata setup
---------------------------------------------


----------------------------------------------
-- V_GROUP
----------------------------------------------

INSERT INTO DB2ADMIN.V_GROUP (GROUP_NAME, APPLICATION, OBJECT_NAME, LAST_UPDATE_DT, SORTBY, ALIAS_NAME, PARENT_GRP_NAME ) 
  VALUES ('XPersonBObj', 'TCRM', 'com.test.component.XPersonBObjExt', CURRENT TIMESTAMP, 'LAST_UPDATE_DT', null, null);
  
  
  ----------------------------------------------
-- Add attributes for entity type XFSParty to V_ELEMENT table
----------------------------------------------

INSERT INTO DB2ADMIN.V_ELEMENT (ELEMENT_NAME, GROUP_NAME, APPLICATION, ATTRIBUTE_NAME, LAST_UPDATE_DT, RESPONSE_ORDER, ELEMENTAPPNAME, ELEMENTGROUPNAME, DWLCOLUMN_TP_CD, CARDINALITY_TP_CD) 
   VALUES ('CreditInfoBObj', 'XPersonBObj', 'TCRM', 'CreditInfoBObj', CURRENT TIMESTAMP, 10, 'TCRM',  'CreditInfoBObj', null, 1);

INSERT INTO V_ELEMENT (ELEMENT_NAME, APPLICATION, GROUP_NAME, ATTRIBUTE_NAME, COLUMN_NAME, FIELD_NAME, XML_TAG_NAME, EXPIRY_DT, LAST_UPDATE_DT, RESPONSE_ORDER, ELEMENTAPPNAME, ELEMENTGROUPNAME, DWLCOLUMN_TP_CD, CARDINALITY_TP_CD) 
SELECT ELEMENT_NAME, APPLICATION, 'XPersonBObjExt', ATTRIBUTE_NAME, COLUMN_NAME, FIELD_NAME, XML_TAG_NAME, EXPIRY_DT, CURRENT_TIMESTAMP, RESPONSE_ORDER, ELEMENTAPPNAME, ELEMENTGROUPNAME, DWLCOLUMN_TP_CD, CARDINALITY_TP_CD FROM V_ELEMENT WHERE GROUP_NAME = 'Person'



----------------------------------------------
-- V_ELEMENTATTRIBUTE
----------------------------------------------

CREATE SEQUENCE DB2ADMIN.V_ELATTR_ID_SEQ AS BIGINT START WITH 1010000 INCREMENT BY 1 MINVALUE 1010000 MAXVALUE 1019999 CACHE 10;


INSERT INTO DB2ADMIN.V_ELEMENTATTRIBUTE (V_ELEMENT_ATTRB_ID, ATTRIBUTE_TP_CD, APPLICATION, GROUP_NAME, ELEMENT_NAME, LAST_UPDATE_DT) 
VALUES (NEXTVAL FOR DB2ADMIN.V_ELATTR_ID_SEQ, 102, 'TCRM', 'XPersonBObjExt', 'CreditInfoBObj', CURRENT TIMESTAMP);
   
INSERT INTO V_ELEMENTATTRIBUTE (V_ELEMENT_ATTRB_ID, ATTRIBUTE_TP_CD, APPLICATION, GROUP_NAME, ELEMENT_NAME, EXPIRY_DT, LAST_UPDATE_DT) 
SELECT NEXTVAL FOR DB2ADMIN.V_ELATTR_ID_SEQ, ATTRIBUTE_TP_CD, 'TCRM', 'XPersonBObjExt', ELEMENT_NAME, EXPIRY_DT, CURRENT_TIMESTAMP FROM V_ELEMENTATTRIBUTE WHERE GROUP_NAME = 'Person' AND ATTRIBUTE_TP_CD <> 4


DROP SEQUENCE DB2ADMIN.V_ELATTR_ID_SEQ RESTRICT;


----------------------------------------------
-- Transactions
----------------------------------------------


----------------------------------------------
-- CDBUSINESSTXTP
----------------------------------------------


----------------------------------------------
-- CDINTERNALTXNTP
----------------------------------------------




----------------------------------------------
-- BUSINTERNALTXN
----------------------------------------------



----------------------------------------------
-- BUSINESSTXREQRESP
----------------------------------------------



----------------------------------------------
-- INTERNALTXREQRESP
----------------------------------------------


----------------------------------------------
-- GROUPTXMAP
----------------------------------------------



----------------------------------------------
-- TAIL setup
----------------------------------------------


