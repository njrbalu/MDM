
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
-- 			sqlplus userid/password@host @Additions_SETUP_ORACLE.sql
-- 			sqlplus userid/password@host @Additions_TRIGGERS_ORACLE.sql
-- 			sqlplus userid/password@host @Additions_CONSTRAINTS_ORACLE.sql
-- 			sqlplus userid/password@host @Additions_MetaData_ORACLE.sql
-- 			sqlplus userid/password@host CONFIG_XMLSERVICES_RESPONSE_ORACLE.sql
-- 			sqlplus userid/password@host @Additions_CODETABLES_ORACLE.sql
----------------------------------------------
-- Component type
----------------------------------------------

INSERT INTO DB2ADMIN.COMPONENTTYPE (COMPONENT_TYPE_ID, DWL_PROD_TP_CD, COMPON_TYPE_VALUE, COMPON_LONG_DESC, LAST_UPDATE_DT, COMPONENT_CLASS ) 
   VALUES ( 1000035, 1, 'AdditionsController', null, CURRENT_TIMESTAMP, null);
INSERT INTO DB2ADMIN.COMPONENTTYPE (COMPONENT_TYPE_ID, DWL_PROD_TP_CD, COMPON_TYPE_VALUE, COMPON_LONG_DESC, LAST_UPDATE_DT, COMPONENT_CLASS ) 
   VALUES ( 1000037, 1, 'AdditionsComponent', null, CURRENT_TIMESTAMP, 'com.test.additions.component.AdditionsComponent');
INSERT INTO DB2ADMIN.COMPONENTTYPE (COMPONENT_TYPE_ID, DWL_PROD_TP_CD, COMPON_TYPE_VALUE, COMPON_LONG_DESC, LAST_UPDATE_DT, COMPONENT_CLASS ) 
   VALUES ( 1000027, 1, 'CreditInfoBObj', null, CURRENT_TIMESTAMP, null);

----------------------------------------------
-- Error messages
----------------------------------------------

-- For locale: 100 / default
INSERT INTO DB2ADMIN.CDERRMESSAGETP (LANG_TP_CD, ERR_MESSAGE_TP_CD, ERR_MESSAGE, COMMENTS, LAST_UPDATE_DT) 
   VALUES (100, 1000004, 'The following is required: CreditInfopkId', 'The following is required: CreditInfopkId', CURRENT_TIMESTAMP);
INSERT INTO DB2ADMIN.CDERRMESSAGETP (LANG_TP_CD, ERR_MESSAGE_TP_CD, ERR_MESSAGE, COMMENTS, LAST_UPDATE_DT) 
   VALUES (100, 1000016, 'The following is required: PartyId', 'The following is required: PartyId', CURRENT_TIMESTAMP);
INSERT INTO DB2ADMIN.CDERRMESSAGETP (LANG_TP_CD, ERR_MESSAGE_TP_CD, ERR_MESSAGE, COMMENTS, LAST_UPDATE_DT) 
   VALUES (100, 1000018, 'The following is required: CreditScore', 'The following is required: CreditScore', CURRENT_TIMESTAMP);
INSERT INTO DB2ADMIN.CDERRMESSAGETP (LANG_TP_CD, ERR_MESSAGE_TP_CD, ERR_MESSAGE, COMMENTS, LAST_UPDATE_DT) 
   VALUES (100, 1000020, 'The following is required: CreditClass', 'The following is required: CreditClass', CURRENT_TIMESTAMP);
INSERT INTO DB2ADMIN.CDERRMESSAGETP (LANG_TP_CD, ERR_MESSAGE_TP_CD, ERR_MESSAGE, COMMENTS, LAST_UPDATE_DT) 
   VALUES (100, 1000022, 'The following is required: CreditStatus', 'The following is required: CreditStatus', CURRENT_TIMESTAMP);
INSERT INTO DB2ADMIN.CDERRMESSAGETP (LANG_TP_CD, ERR_MESSAGE_TP_CD, ERR_MESSAGE, COMMENTS, LAST_UPDATE_DT) 
   VALUES (100, 1000005, 'The before image for the following is empty: CreditInfo.', 'The before image of CreditInfo is empty.', CURRENT_TIMESTAMP);
INSERT INTO DB2ADMIN.CDERRMESSAGETP (LANG_TP_CD, ERR_MESSAGE_TP_CD, ERR_MESSAGE, COMMENTS, LAST_UPDATE_DT) 
   VALUES (100, 1000009, 'Read of the following record failed: CreditInfo.', 'An attempt to read the CreditInfo failed.', CURRENT_TIMESTAMP);
INSERT INTO DB2ADMIN.CDERRMESSAGETP (LANG_TP_CD, ERR_MESSAGE_TP_CD, ERR_MESSAGE, COMMENTS, LAST_UPDATE_DT) 
   VALUES (100, 1000010, 'The following is incorrect: id is null.', 'The id is null.', CURRENT_TIMESTAMP);
INSERT INTO DB2ADMIN.CDERRMESSAGETP (LANG_TP_CD, ERR_MESSAGE_TP_CD, ERR_MESSAGE, COMMENTS, LAST_UPDATE_DT) 
   VALUES (100, 1000011, 'The format of the following is not correct: inquireAsOfDate.', 'The format of inquireAsOfDate is not correct.', CURRENT_TIMESTAMP);
INSERT INTO DB2ADMIN.CDERRMESSAGETP (LANG_TP_CD, ERR_MESSAGE_TP_CD, ERR_MESSAGE, COMMENTS, LAST_UPDATE_DT) 
   VALUES (100, 1000024, 'Read of the following record failed: CreditInfo.', 'An attempt to read the CreditInfo failed.', CURRENT_TIMESTAMP);
INSERT INTO DB2ADMIN.CDERRMESSAGETP (LANG_TP_CD, ERR_MESSAGE_TP_CD, ERR_MESSAGE, COMMENTS, LAST_UPDATE_DT) 
   VALUES (100, 1000025, 'The following is incorrect: id is null.', 'The id is null.', CURRENT_TIMESTAMP);
INSERT INTO DB2ADMIN.CDERRMESSAGETP (LANG_TP_CD, ERR_MESSAGE_TP_CD, ERR_MESSAGE, COMMENTS, LAST_UPDATE_DT) 
   VALUES (100, 1000026, 'The format of the following is not correct: inquireAsOfDate.', 'The format of inquireAsOfDate is not correct.', CURRENT_TIMESTAMP);
INSERT INTO DB2ADMIN.CDERRMESSAGETP (LANG_TP_CD, ERR_MESSAGE_TP_CD, ERR_MESSAGE, COMMENTS, LAST_UPDATE_DT) 
   VALUES (100, 1000012, 'Insert of the following failed: CreditInfo.', 'CreditInfo insert failed.', CURRENT_TIMESTAMP);
INSERT INTO DB2ADMIN.CDERRMESSAGETP (LANG_TP_CD, ERR_MESSAGE_TP_CD, ERR_MESSAGE, COMMENTS, LAST_UPDATE_DT) 
   VALUES (100, 1000013, 'Duplicate primary key already exists.', 'Duplicate primary key already exists.', CURRENT_TIMESTAMP);
INSERT INTO DB2ADMIN.CDERRMESSAGETP (LANG_TP_CD, ERR_MESSAGE_TP_CD, ERR_MESSAGE, COMMENTS, LAST_UPDATE_DT) 
   VALUES (100, 1000014, 'Update of the following failed: CreditInfo.', 'CreditInfo update failed.', CURRENT_TIMESTAMP);

   
INSERT INTO DB2ADMIN.ERRREASON (ERR_REASON_TP_CD, COMPONENT_TYPE_ID, ERR_TYPE_CD, ERR_MESSAGE_TP_CD, LAST_UPDATE_DT) 
   VALUES (1000036, 1000035, 'READERR', 1000009, CURRENT_TIMESTAMP);
   
INSERT INTO DB2ADMIN.ERRREASON (ERR_REASON_TP_CD, COMPONENT_TYPE_ID, ERR_TYPE_CD, ERR_MESSAGE_TP_CD, LAST_UPDATE_DT) 
   VALUES (1000041, 1000035, 'READERR', 1000024, CURRENT_TIMESTAMP);
   
INSERT INTO DB2ADMIN.ERRREASON (ERR_REASON_TP_CD, COMPONENT_TYPE_ID, ERR_TYPE_CD, ERR_MESSAGE_TP_CD, LAST_UPDATE_DT) 
   VALUES (1000045, 1000035, 'INSERR', 1000012, CURRENT_TIMESTAMP);
   
INSERT INTO DB2ADMIN.ERRREASON (ERR_REASON_TP_CD, COMPONENT_TYPE_ID, ERR_TYPE_CD, ERR_MESSAGE_TP_CD, LAST_UPDATE_DT) 
   VALUES (1000048, 1000035, 'UPDERR', 1000014, CURRENT_TIMESTAMP);
   
INSERT INTO DB2ADMIN.ERRREASON (ERR_REASON_TP_CD, COMPONENT_TYPE_ID, ERR_TYPE_CD, ERR_MESSAGE_TP_CD, LAST_UPDATE_DT) 
   VALUES (1000038, 1000037, 'READERR', 1000009, CURRENT_TIMESTAMP);
   
INSERT INTO DB2ADMIN.ERRREASON (ERR_REASON_TP_CD, COMPONENT_TYPE_ID, ERR_TYPE_CD, ERR_MESSAGE_TP_CD, LAST_UPDATE_DT) 
   VALUES (1000039, 1000037, 'READERR', 1000010, CURRENT_TIMESTAMP);
   
INSERT INTO DB2ADMIN.ERRREASON (ERR_REASON_TP_CD, COMPONENT_TYPE_ID, ERR_TYPE_CD, ERR_MESSAGE_TP_CD, LAST_UPDATE_DT) 
   VALUES (1000040, 1000037, 'READERR', 1000011, CURRENT_TIMESTAMP);
   
INSERT INTO DB2ADMIN.ERRREASON (ERR_REASON_TP_CD, COMPONENT_TYPE_ID, ERR_TYPE_CD, ERR_MESSAGE_TP_CD, LAST_UPDATE_DT) 
   VALUES (1000042, 1000037, 'READERR', 1000024, CURRENT_TIMESTAMP);
   
INSERT INTO DB2ADMIN.ERRREASON (ERR_REASON_TP_CD, COMPONENT_TYPE_ID, ERR_TYPE_CD, ERR_MESSAGE_TP_CD, LAST_UPDATE_DT) 
   VALUES (1000043, 1000037, 'READERR', 1000025, CURRENT_TIMESTAMP);
   
INSERT INTO DB2ADMIN.ERRREASON (ERR_REASON_TP_CD, COMPONENT_TYPE_ID, ERR_TYPE_CD, ERR_MESSAGE_TP_CD, LAST_UPDATE_DT) 
   VALUES (1000044, 1000037, 'READERR', 1000026, CURRENT_TIMESTAMP);
   
INSERT INTO DB2ADMIN.ERRREASON (ERR_REASON_TP_CD, COMPONENT_TYPE_ID, ERR_TYPE_CD, ERR_MESSAGE_TP_CD, LAST_UPDATE_DT) 
   VALUES (1000046, 1000037, 'INSERR', 1000012, CURRENT_TIMESTAMP);
   
INSERT INTO DB2ADMIN.ERRREASON (ERR_REASON_TP_CD, COMPONENT_TYPE_ID, ERR_TYPE_CD, ERR_MESSAGE_TP_CD, LAST_UPDATE_DT) 
   VALUES (1000047, 1000037, 'DKERR', 1000013, CURRENT_TIMESTAMP);
   
INSERT INTO DB2ADMIN.ERRREASON (ERR_REASON_TP_CD, COMPONENT_TYPE_ID, ERR_TYPE_CD, ERR_MESSAGE_TP_CD, LAST_UPDATE_DT) 
   VALUES (1000049, 1000037, 'UPDERR', 1000014, CURRENT_TIMESTAMP);
   
INSERT INTO DB2ADMIN.ERRREASON (ERR_REASON_TP_CD, COMPONENT_TYPE_ID, ERR_TYPE_CD, ERR_MESSAGE_TP_CD, LAST_UPDATE_DT) 
   VALUES (1000028, 1000027, 'FVERR', 20, CURRENT_TIMESTAMP);
   
INSERT INTO DB2ADMIN.ERRREASON (ERR_REASON_TP_CD, COMPONENT_TYPE_ID, ERR_TYPE_CD, ERR_MESSAGE_TP_CD, LAST_UPDATE_DT) 
   VALUES (1000029, 1000027, 'FVERR', 1000004, CURRENT_TIMESTAMP);
   
INSERT INTO DB2ADMIN.ERRREASON (ERR_REASON_TP_CD, COMPONENT_TYPE_ID, ERR_TYPE_CD, ERR_MESSAGE_TP_CD, LAST_UPDATE_DT) 
   VALUES (1000030, 1000027, 'FVERR', 1000016, CURRENT_TIMESTAMP);
   
INSERT INTO DB2ADMIN.ERRREASON (ERR_REASON_TP_CD, COMPONENT_TYPE_ID, ERR_TYPE_CD, ERR_MESSAGE_TP_CD, LAST_UPDATE_DT) 
   VALUES (1000031, 1000027, 'FVERR', 1000018, CURRENT_TIMESTAMP);
   
INSERT INTO DB2ADMIN.ERRREASON (ERR_REASON_TP_CD, COMPONENT_TYPE_ID, ERR_TYPE_CD, ERR_MESSAGE_TP_CD, LAST_UPDATE_DT) 
   VALUES (1000032, 1000027, 'FVERR', 1000020, CURRENT_TIMESTAMP);
   
INSERT INTO DB2ADMIN.ERRREASON (ERR_REASON_TP_CD, COMPONENT_TYPE_ID, ERR_TYPE_CD, ERR_MESSAGE_TP_CD, LAST_UPDATE_DT) 
   VALUES (1000033, 1000027, 'FVERR', 1000022, CURRENT_TIMESTAMP);
   
INSERT INTO DB2ADMIN.ERRREASON (ERR_REASON_TP_CD, COMPONENT_TYPE_ID, ERR_TYPE_CD, ERR_MESSAGE_TP_CD, LAST_UPDATE_DT) 
   VALUES (1000034, 1000027, 'DIERR', 1000005, CURRENT_TIMESTAMP);

---------------------------------------------
-- Metadata setup
---------------------------------------------

----------------------------------------------
-- Add record for the database table for CreditInfo
----------------------------------------------

INSERT INTO DB2ADMIN.CDDWLTABLETP (DWLTABLE_TP_CD, TABLE_NAME, DESCRIPTION, LAST_UPDATE_DT, EXPIRY_DT, CODE_TYPE_IND, DWL_PROD_TP_CD)
VALUES (1000051, 'CREDITINFO', null, CURRENT_TIMESTAMP, null, 'Y', 1);

INSERT INTO DB2ADMIN.CDDWLTABLETP (DWLTABLE_TP_CD, TABLE_NAME, DESCRIPTION, LAST_UPDATE_DT, EXPIRY_DT, CODE_TYPE_IND, DWL_PROD_TP_CD)
VALUES (1000052, 'H_CREDITINFO', null, CURRENT_TIMESTAMP, null, 'Y', 1);

----------------------------------------------
-- Add records for the table columns for CreditInfo
----------------------------------------------


INSERT INTO DB2ADMIN.CDDWLCOLUMNTP (DWLCOLUMN_TP_CD, DWLTABLE_TP_CD, COLUMN_NAME, EXPIRY_DT, LAST_UPDATE_DT, DESCRIPTION, LOCALE_SENSITIVE)
VALUES (1000054, 1000051, 'Credit_Infopk_Id', null, CURRENT_TIMESTAMP, null, 'N');

INSERT INTO DB2ADMIN.CDDWLCOLUMNTP (DWLCOLUMN_TP_CD, DWLTABLE_TP_CD, COLUMN_NAME, EXPIRY_DT, LAST_UPDATE_DT, DESCRIPTION, LOCALE_SENSITIVE)
VALUES (1000057, 1000051, 'CONT_ID', null, CURRENT_TIMESTAMP, null, 'N');

INSERT INTO DB2ADMIN.CDDWLCOLUMNTP (DWLCOLUMN_TP_CD, DWLTABLE_TP_CD, COLUMN_NAME, EXPIRY_DT, LAST_UPDATE_DT, DESCRIPTION, LOCALE_SENSITIVE)
VALUES (1000060, 1000051, 'CREDIT_SCORE', null, CURRENT_TIMESTAMP, null, 'N');

INSERT INTO DB2ADMIN.CDDWLCOLUMNTP (DWLCOLUMN_TP_CD, DWLTABLE_TP_CD, COLUMN_NAME, EXPIRY_DT, LAST_UPDATE_DT, DESCRIPTION, LOCALE_SENSITIVE)
VALUES (1000063, 1000051, 'CREDIT_CLASS', null, CURRENT_TIMESTAMP, null, 'N');

INSERT INTO DB2ADMIN.CDDWLCOLUMNTP (DWLCOLUMN_TP_CD, DWLTABLE_TP_CD, COLUMN_NAME, EXPIRY_DT, LAST_UPDATE_DT, DESCRIPTION, LOCALE_SENSITIVE)
VALUES (1000066, 1000051, 'CREDIT_STATUS', null, CURRENT_TIMESTAMP, null, 'N');

INSERT INTO DB2ADMIN.CDDWLCOLUMNTP (DWLCOLUMN_TP_CD, DWLTABLE_TP_CD, COLUMN_NAME, EXPIRY_DT, LAST_UPDATE_DT, DESCRIPTION, LOCALE_SENSITIVE)
VALUES (1000069, 1000051, 'LAST_UPDATE_DT', null, CURRENT_TIMESTAMP, null, 'N');

INSERT INTO DB2ADMIN.CDDWLCOLUMNTP (DWLCOLUMN_TP_CD, DWLTABLE_TP_CD, COLUMN_NAME, EXPIRY_DT, LAST_UPDATE_DT, DESCRIPTION, LOCALE_SENSITIVE)
VALUES (1000071, 1000051, 'LAST_UPDATE_TX_ID', null, CURRENT_TIMESTAMP, null, 'N');

INSERT INTO DB2ADMIN.CDDWLCOLUMNTP (DWLCOLUMN_TP_CD, DWLTABLE_TP_CD, COLUMN_NAME, EXPIRY_DT, LAST_UPDATE_DT, DESCRIPTION, LOCALE_SENSITIVE)
VALUES (1000073, 1000051, 'LAST_UPDATE_USER', null, CURRENT_TIMESTAMP, null, 'N');

INSERT INTO DB2ADMIN.CDDWLCOLUMNTP (DWLCOLUMN_TP_CD, DWLTABLE_TP_CD, COLUMN_NAME, EXPIRY_DT, LAST_UPDATE_DT, DESCRIPTION, LOCALE_SENSITIVE)
VALUES (1000055, 1000052, 'Credit_Infopk_Id', null, CURRENT_TIMESTAMP, null, 'N');

INSERT INTO DB2ADMIN.CDDWLCOLUMNTP (DWLCOLUMN_TP_CD, DWLTABLE_TP_CD, COLUMN_NAME, EXPIRY_DT, LAST_UPDATE_DT, DESCRIPTION, LOCALE_SENSITIVE)
VALUES (1000058, 1000052, 'CONT_ID', null, CURRENT_TIMESTAMP, null, 'N');

INSERT INTO DB2ADMIN.CDDWLCOLUMNTP (DWLCOLUMN_TP_CD, DWLTABLE_TP_CD, COLUMN_NAME, EXPIRY_DT, LAST_UPDATE_DT, DESCRIPTION, LOCALE_SENSITIVE)
VALUES (1000061, 1000052, 'CREDIT_SCORE', null, CURRENT_TIMESTAMP, null, 'N');

INSERT INTO DB2ADMIN.CDDWLCOLUMNTP (DWLCOLUMN_TP_CD, DWLTABLE_TP_CD, COLUMN_NAME, EXPIRY_DT, LAST_UPDATE_DT, DESCRIPTION, LOCALE_SENSITIVE)
VALUES (1000064, 1000052, 'CREDIT_CLASS', null, CURRENT_TIMESTAMP, null, 'N');

INSERT INTO DB2ADMIN.CDDWLCOLUMNTP (DWLCOLUMN_TP_CD, DWLTABLE_TP_CD, COLUMN_NAME, EXPIRY_DT, LAST_UPDATE_DT, DESCRIPTION, LOCALE_SENSITIVE)
VALUES (1000067, 1000052, 'CREDIT_STATUS', null, CURRENT_TIMESTAMP, null, 'N');

INSERT INTO DB2ADMIN.CDDWLCOLUMNTP (DWLCOLUMN_TP_CD, DWLTABLE_TP_CD, COLUMN_NAME, EXPIRY_DT, LAST_UPDATE_DT, DESCRIPTION, LOCALE_SENSITIVE)
VALUES (1000075, 1000052, 'h_action_code', null, CURRENT_TIMESTAMP, null, 'N');

INSERT INTO DB2ADMIN.CDDWLCOLUMNTP (DWLCOLUMN_TP_CD, DWLTABLE_TP_CD, COLUMN_NAME, EXPIRY_DT, LAST_UPDATE_DT, DESCRIPTION, LOCALE_SENSITIVE)
VALUES (1000077, 1000052, 'h_create_dt', null, CURRENT_TIMESTAMP, null, 'N');

INSERT INTO DB2ADMIN.CDDWLCOLUMNTP (DWLCOLUMN_TP_CD, DWLTABLE_TP_CD, COLUMN_NAME, EXPIRY_DT, LAST_UPDATE_DT, DESCRIPTION, LOCALE_SENSITIVE)
VALUES (1000079, 1000052, 'h_created_by', null, CURRENT_TIMESTAMP, null, 'N');

INSERT INTO DB2ADMIN.CDDWLCOLUMNTP (DWLCOLUMN_TP_CD, DWLTABLE_TP_CD, COLUMN_NAME, EXPIRY_DT, LAST_UPDATE_DT, DESCRIPTION, LOCALE_SENSITIVE)
VALUES (1000081, 1000052, 'h_end_dt', null, CURRENT_TIMESTAMP, null, 'N');

INSERT INTO DB2ADMIN.CDDWLCOLUMNTP (DWLCOLUMN_TP_CD, DWLTABLE_TP_CD, COLUMN_NAME, EXPIRY_DT, LAST_UPDATE_DT, DESCRIPTION, LOCALE_SENSITIVE)
VALUES (1000083, 1000052, 'H_Credit_Infopk_Id', null, CURRENT_TIMESTAMP, null, 'N');

----------------------------------------------
-- V_GROUP
----------------------------------------------

INSERT INTO DB2ADMIN.V_GROUP (GROUP_NAME, APPLICATION, OBJECT_NAME, LAST_UPDATE_DT, SORTBY, ALIAS_NAME, PARENT_GRP_NAME ) 
  VALUES ('CreditInfoBObj', 'TCRM', 'com.test.additions.component.CreditInfoBObj', CURRENT_TIMESTAMP, 'LAST_UPDATE_DT', 'CREDITINFO', null);

CREATE SEQUENCE DB2ADMIN.GROUPDWLTABLE_ID_SEQ START WITH 1000000 INCREMENT BY 1 MINVALUE 1000000 MAXVALUE 1009999 CACHE 10;

----------------------------------------------
-- Connect V_GROUP record with CDDWLTABLETP
----------------------------------------------

INSERT INTO DB2ADMIN.GROUPDWLTABLE (GROUP_DWLTABLE_ID, APPLICATION, GROUP_NAME, DWLTABLE_TP_CD, LAST_UPDATE_USER, LAST_UPDATE_DT)
VALUES (DB2ADMIN.GROUPDWLTABLE_ID_SEQ.nextval, 'TCRM', 'CreditInfoBObj', 1000051, 'cusadmin', CURRENT_TIMESTAMP);

----------------------------------------------
-- Add attributes for entity type CreditInfo to V_ELEMENT table
----------------------------------------------

INSERT INTO DB2ADMIN.V_ELEMENT (ELEMENT_NAME, GROUP_NAME, APPLICATION, ATTRIBUTE_NAME, LAST_UPDATE_DT, RESPONSE_ORDER, ELEMENTAPPNAME, ELEMENTGROUPNAME, DWLCOLUMN_TP_CD, CARDINALITY_TP_CD) 
   VALUES ('CreditInfopkId', 'CreditInfoBObj', 'TCRM', 'CreditInfopkId', CURRENT_TIMESTAMP, 10, null,  null, 1000054, 1);
INSERT INTO DB2ADMIN.V_ELEMENT (ELEMENT_NAME, GROUP_NAME, APPLICATION, ATTRIBUTE_NAME, LAST_UPDATE_DT, RESPONSE_ORDER, ELEMENTAPPNAME, ELEMENTGROUPNAME, DWLCOLUMN_TP_CD, CARDINALITY_TP_CD) 
   VALUES ('PartyId', 'CreditInfoBObj', 'TCRM', 'PartyId', CURRENT_TIMESTAMP, 20, null,  null, 1000057, 1);
INSERT INTO DB2ADMIN.V_ELEMENT (ELEMENT_NAME, GROUP_NAME, APPLICATION, ATTRIBUTE_NAME, LAST_UPDATE_DT, RESPONSE_ORDER, ELEMENTAPPNAME, ELEMENTGROUPNAME, DWLCOLUMN_TP_CD, CARDINALITY_TP_CD) 
   VALUES ('CreditScore', 'CreditInfoBObj', 'TCRM', 'CreditScore', CURRENT_TIMESTAMP, 30, null,  null, 1000060, 1);
INSERT INTO DB2ADMIN.V_ELEMENT (ELEMENT_NAME, GROUP_NAME, APPLICATION, ATTRIBUTE_NAME, LAST_UPDATE_DT, RESPONSE_ORDER, ELEMENTAPPNAME, ELEMENTGROUPNAME, DWLCOLUMN_TP_CD, CARDINALITY_TP_CD) 
   VALUES ('CreditClass', 'CreditInfoBObj', 'TCRM', 'CreditClass', CURRENT_TIMESTAMP, 40, null,  null, 1000063, 1);
INSERT INTO DB2ADMIN.V_ELEMENT (ELEMENT_NAME, GROUP_NAME, APPLICATION, ATTRIBUTE_NAME, LAST_UPDATE_DT, RESPONSE_ORDER, ELEMENTAPPNAME, ELEMENTGROUPNAME, DWLCOLUMN_TP_CD, CARDINALITY_TP_CD) 
   VALUES ('CreditStatus', 'CreditInfoBObj', 'TCRM', 'CreditStatus', CURRENT_TIMESTAMP, 50, null,  null, 1000066, 1);
INSERT INTO DB2ADMIN.V_ELEMENT (ELEMENT_NAME, GROUP_NAME, APPLICATION, ATTRIBUTE_NAME, LAST_UPDATE_DT, RESPONSE_ORDER, ELEMENTAPPNAME, ELEMENTGROUPNAME, DWLCOLUMN_TP_CD, CARDINALITY_TP_CD) 
   VALUES ('CreditInfoLastUpdateDate', 'CreditInfoBObj', 'TCRM', 'CreditInfoLastUpdateDate', CURRENT_TIMESTAMP, 60, null,  null, 1000069, 1);
INSERT INTO DB2ADMIN.V_ELEMENT (ELEMENT_NAME, GROUP_NAME, APPLICATION, ATTRIBUTE_NAME, LAST_UPDATE_DT, RESPONSE_ORDER, ELEMENTAPPNAME, ELEMENTGROUPNAME, DWLCOLUMN_TP_CD, CARDINALITY_TP_CD) 
   VALUES ('CreditInfoLastUpdateTxId', 'CreditInfoBObj', 'TCRM', 'CreditInfoLastUpdateTxId', CURRENT_TIMESTAMP, 70, null,  null, 1000071, 1);
INSERT INTO DB2ADMIN.V_ELEMENT (ELEMENT_NAME, GROUP_NAME, APPLICATION, ATTRIBUTE_NAME, LAST_UPDATE_DT, RESPONSE_ORDER, ELEMENTAPPNAME, ELEMENTGROUPNAME, DWLCOLUMN_TP_CD, CARDINALITY_TP_CD) 
   VALUES ('CreditInfoLastUpdateUser', 'CreditInfoBObj', 'TCRM', 'CreditInfoLastUpdateUser', CURRENT_TIMESTAMP, 80, null,  null, 1000073, 1);
INSERT INTO DB2ADMIN.V_ELEMENT (ELEMENT_NAME, GROUP_NAME, APPLICATION, ATTRIBUTE_NAME, LAST_UPDATE_DT, RESPONSE_ORDER, ELEMENTAPPNAME, ELEMENTGROUPNAME, DWLCOLUMN_TP_CD, CARDINALITY_TP_CD) 
   VALUES ('CreditInfoHistActionCode', 'CreditInfoBObj', 'TCRM', 'CreditInfoHistActionCode', CURRENT_TIMESTAMP, 90, null,  null, 1000075, 1);
INSERT INTO DB2ADMIN.V_ELEMENT (ELEMENT_NAME, GROUP_NAME, APPLICATION, ATTRIBUTE_NAME, LAST_UPDATE_DT, RESPONSE_ORDER, ELEMENTAPPNAME, ELEMENTGROUPNAME, DWLCOLUMN_TP_CD, CARDINALITY_TP_CD) 
   VALUES ('CreditInfoHistCreateDate', 'CreditInfoBObj', 'TCRM', 'CreditInfoHistCreateDate', CURRENT_TIMESTAMP, 100, null,  null, 1000077, 1);
INSERT INTO DB2ADMIN.V_ELEMENT (ELEMENT_NAME, GROUP_NAME, APPLICATION, ATTRIBUTE_NAME, LAST_UPDATE_DT, RESPONSE_ORDER, ELEMENTAPPNAME, ELEMENTGROUPNAME, DWLCOLUMN_TP_CD, CARDINALITY_TP_CD) 
   VALUES ('CreditInfoHistCreatedBy', 'CreditInfoBObj', 'TCRM', 'CreditInfoHistCreatedBy', CURRENT_TIMESTAMP, 110, null,  null, 1000079, 1);
INSERT INTO DB2ADMIN.V_ELEMENT (ELEMENT_NAME, GROUP_NAME, APPLICATION, ATTRIBUTE_NAME, LAST_UPDATE_DT, RESPONSE_ORDER, ELEMENTAPPNAME, ELEMENTGROUPNAME, DWLCOLUMN_TP_CD, CARDINALITY_TP_CD) 
   VALUES ('CreditInfoHistEndDate', 'CreditInfoBObj', 'TCRM', 'CreditInfoHistEndDate', CURRENT_TIMESTAMP, 120, null,  null, 1000081, 1);
INSERT INTO DB2ADMIN.V_ELEMENT (ELEMENT_NAME, GROUP_NAME, APPLICATION, ATTRIBUTE_NAME, LAST_UPDATE_DT, RESPONSE_ORDER, ELEMENTAPPNAME, ELEMENTGROUPNAME, DWLCOLUMN_TP_CD, CARDINALITY_TP_CD) 
   VALUES ('CreditInfoHistoryIdPK', 'CreditInfoBObj', 'TCRM', 'CreditInfoHistoryIdPK', CURRENT_TIMESTAMP, 130, null,  null, 1000083, 1);

DROP SEQUENCE DB2ADMIN.GROUPDWLTABLE_ID_SEQ;

----------------------------------------------
-- V_ELEMENTATTRIBUTE
----------------------------------------------


CREATE SEQUENCE DB2ADMIN.V_ELATTR_ID_SEQ START WITH 1000000 INCREMENT BY 1 MINVALUE 1000000 MAXVALUE 1009999 CACHE 10;

INSERT INTO DB2ADMIN.V_ELEMENTATTRIBUTE (V_ELEMENT_ATTRB_ID, ATTRIBUTE_TP_CD, APPLICATION, GROUP_NAME, ELEMENT_NAME, LAST_UPDATE_DT) 
   VALUES (DB2ADMIN.V_ELATTR_ID_SEQ.nextval, 4, 'TCRM', 'CreditInfoBObj', 'CreditInfopkId', CURRENT_TIMESTAMP);
INSERT INTO DB2ADMIN.V_ELEMENTATTRIBUTE (V_ELEMENT_ATTRB_ID, ATTRIBUTE_TP_CD, APPLICATION, GROUP_NAME, ELEMENT_NAME, LAST_UPDATE_DT) 
   VALUES (DB2ADMIN.V_ELATTR_ID_SEQ.nextval, 101, 'TCRM', 'CreditInfoBObj', 'CreditInfoLastUpdateDate', CURRENT_TIMESTAMP);
INSERT INTO DB2ADMIN.V_ELEMENTATTRIBUTE (V_ELEMENT_ATTRB_ID, ATTRIBUTE_TP_CD, APPLICATION, GROUP_NAME, ELEMENT_NAME, LAST_UPDATE_DT) 
   VALUES (DB2ADMIN.V_ELATTR_ID_SEQ.nextval, 101, 'TCRM', 'CreditInfoBObj', 'CreditInfoHistCreateDate', CURRENT_TIMESTAMP);
INSERT INTO DB2ADMIN.V_ELEMENTATTRIBUTE (V_ELEMENT_ATTRB_ID, ATTRIBUTE_TP_CD, APPLICATION, GROUP_NAME, ELEMENT_NAME, LAST_UPDATE_DT) 
   VALUES (DB2ADMIN.V_ELATTR_ID_SEQ.nextval, 101, 'TCRM', 'CreditInfoBObj', 'CreditInfoHistEndDate', CURRENT_TIMESTAMP);
DROP SEQUENCE DB2ADMIN.V_ELATTR_ID_SEQ;

----------------------------------------------
-- Transactions
----------------------------------------------


----------------------------------------------
-- CDBUSINESSTXTP
----------------------------------------------


INSERT INTO DB2ADMIN.CDBUSINESSTXTP (BUSINESS_TX_TP_CD, NAME, DESCRIPTION, EXPIRY_DT, LAST_UPDATE_DT, TX_LOG_IND, TX_OBJECT_TP, DEPRECATED_SINCE, DWL_PROD_TP_CD, PARENT_BUSINESS_TX_TP_CD) 
   VALUES (1000006, 'getCreditInfo', null, null, CURRENT_TIMESTAMP, 'N', 'I', null, 1, null);

INSERT INTO DB2ADMIN.EXTERNALTXNKEY (EXTERN_TX_KEY_ID, BUSINESS_TX_TP_CD, APPLICATION, GROUP_NAME, ELEMENT_NAME, LAST_UPDATE_USER, LAST_UPDATE_DT)
   VALUES (1000084, 1000006, 'TCRM', 'CreditInfoBObj', 'CreditInfopkId', null, CURRENT_TIMESTAMP);


INSERT INTO DB2ADMIN.CDBUSINESSTXTP (BUSINESS_TX_TP_CD, NAME, DESCRIPTION, EXPIRY_DT, LAST_UPDATE_DT, TX_LOG_IND, TX_OBJECT_TP, DEPRECATED_SINCE, DWL_PROD_TP_CD, PARENT_BUSINESS_TX_TP_CD) 
   VALUES (1000023, 'getCreditInfobyPartyId', null, null, CURRENT_TIMESTAMP, 'N', 'I', null, 1, null);

INSERT INTO DB2ADMIN.EXTERNALTXNKEY (EXTERN_TX_KEY_ID, BUSINESS_TX_TP_CD, APPLICATION, GROUP_NAME, ELEMENT_NAME, LAST_UPDATE_USER, LAST_UPDATE_DT)
   VALUES (1000085, 1000023, 'TCRM', 'CreditInfoBObj', 'CreditInfopkId', null, CURRENT_TIMESTAMP);


INSERT INTO DB2ADMIN.CDBUSINESSTXTP (BUSINESS_TX_TP_CD, NAME, DESCRIPTION, EXPIRY_DT, LAST_UPDATE_DT, TX_LOG_IND, TX_OBJECT_TP, DEPRECATED_SINCE, DWL_PROD_TP_CD, PARENT_BUSINESS_TX_TP_CD) 
   VALUES (1000007, 'addCreditInfo', null, null, CURRENT_TIMESTAMP, 'N', 'P', null, 1, null);

INSERT INTO DB2ADMIN.EXTERNALTXNKEY (EXTERN_TX_KEY_ID, BUSINESS_TX_TP_CD, APPLICATION, GROUP_NAME, ELEMENT_NAME, LAST_UPDATE_USER, LAST_UPDATE_DT)
   VALUES (1000086, 1000007, 'TCRM', 'CreditInfoBObj', 'CreditInfopkId', null, CURRENT_TIMESTAMP);


INSERT INTO DB2ADMIN.CDBUSINESSTXTP (BUSINESS_TX_TP_CD, NAME, DESCRIPTION, EXPIRY_DT, LAST_UPDATE_DT, TX_LOG_IND, TX_OBJECT_TP, DEPRECATED_SINCE, DWL_PROD_TP_CD, PARENT_BUSINESS_TX_TP_CD) 
   VALUES (1000008, 'updateCreditInfo', null, null, CURRENT_TIMESTAMP, 'N', 'P', null, 1, null);

INSERT INTO DB2ADMIN.EXTERNALTXNKEY (EXTERN_TX_KEY_ID, BUSINESS_TX_TP_CD, APPLICATION, GROUP_NAME, ELEMENT_NAME, LAST_UPDATE_USER, LAST_UPDATE_DT)
   VALUES (1000087, 1000008, 'TCRM', 'CreditInfoBObj', 'CreditInfopkId', null, CURRENT_TIMESTAMP);


----------------------------------------------
-- CDINTERNALTXNTP
----------------------------------------------


INSERT INTO DB2ADMIN.CDINTERNALTXNTP (INTERNAL_BUS_TX_TP, NAME, DESCRIPTION, EXPIRY_DT, LAST_UPDATE_DT, COMPONENT_TYPE_ID, PARENT_INTERNAL_BUS_TX_TP) 
   VALUES (1000088, 'getCreditInfo', null, null, CURRENT_TIMESTAMP, 1000037, null);
 
INSERT INTO DB2ADMIN.INTERNALTXNKEY (INTERN_TX_KEY_ID, INTERNAL_BUS_TX_TP, APPLICATION, GROUP_NAME, ELEMENT_NAME, LAST_UPDATE_USER, LAST_UPDATE_DT)
   VALUES (1000089, 1000088, 'TCRM', 'CreditInfoBObj', 'CreditInfopkId', null, CURRENT_TIMESTAMP);


INSERT INTO DB2ADMIN.CDINTERNALTXNTP (INTERNAL_BUS_TX_TP, NAME, DESCRIPTION, EXPIRY_DT, LAST_UPDATE_DT, COMPONENT_TYPE_ID, PARENT_INTERNAL_BUS_TX_TP) 
   VALUES (1000090, 'getCreditInfobyPartyId', null, null, CURRENT_TIMESTAMP, 1000037, null);
 
INSERT INTO DB2ADMIN.INTERNALTXNKEY (INTERN_TX_KEY_ID, INTERNAL_BUS_TX_TP, APPLICATION, GROUP_NAME, ELEMENT_NAME, LAST_UPDATE_USER, LAST_UPDATE_DT)
   VALUES (1000091, 1000090, 'TCRM', 'CreditInfoBObj', 'CreditInfopkId', null, CURRENT_TIMESTAMP);


INSERT INTO DB2ADMIN.CDINTERNALTXNTP (INTERNAL_BUS_TX_TP, NAME, DESCRIPTION, EXPIRY_DT, LAST_UPDATE_DT, COMPONENT_TYPE_ID, PARENT_INTERNAL_BUS_TX_TP) 
   VALUES (1000092, 'addCreditInfo', null, null, CURRENT_TIMESTAMP, 1000037, null);
 
INSERT INTO DB2ADMIN.INTERNALTXNKEY (INTERN_TX_KEY_ID, INTERNAL_BUS_TX_TP, APPLICATION, GROUP_NAME, ELEMENT_NAME, LAST_UPDATE_USER, LAST_UPDATE_DT)
   VALUES (1000093, 1000092, 'TCRM', 'CreditInfoBObj', 'CreditInfopkId', null, CURRENT_TIMESTAMP);


INSERT INTO DB2ADMIN.CDINTERNALTXNTP (INTERNAL_BUS_TX_TP, NAME, DESCRIPTION, EXPIRY_DT, LAST_UPDATE_DT, COMPONENT_TYPE_ID, PARENT_INTERNAL_BUS_TX_TP) 
   VALUES (1000094, 'updateCreditInfo', null, null, CURRENT_TIMESTAMP, 1000037, null);
 
INSERT INTO DB2ADMIN.INTERNALTXNKEY (INTERN_TX_KEY_ID, INTERNAL_BUS_TX_TP, APPLICATION, GROUP_NAME, ELEMENT_NAME, LAST_UPDATE_USER, LAST_UPDATE_DT)
   VALUES (1000095, 1000094, 'TCRM', 'CreditInfoBObj', 'CreditInfopkId', null, CURRENT_TIMESTAMP);




----------------------------------------------
-- BUSINTERNALTXN
----------------------------------------------
INSERT INTO DB2ADMIN.BUSINTERNALTXN (BUS_INTERN_TXN_ID, BUSINESS_TX_TP_CD, INTERNAL_BUS_TX_TP, INT_TX_LOG_IND, LAST_UPDATE_DT) 
   VALUES (1000096, 1000006, 1000088, 'N', CURRENT_TIMESTAMP);
 
INSERT INTO DB2ADMIN.BUSINTERNALTXN (BUS_INTERN_TXN_ID, BUSINESS_TX_TP_CD, INTERNAL_BUS_TX_TP, INT_TX_LOG_IND, LAST_UPDATE_DT) 
   VALUES (1000097, 1000023, 1000090, 'N', CURRENT_TIMESTAMP);
 
INSERT INTO DB2ADMIN.BUSINTERNALTXN (BUS_INTERN_TXN_ID, BUSINESS_TX_TP_CD, INTERNAL_BUS_TX_TP, INT_TX_LOG_IND, LAST_UPDATE_DT) 
   VALUES (1000098, 1000007, 1000092, 'N', CURRENT_TIMESTAMP);
 
INSERT INTO DB2ADMIN.BUSINTERNALTXN (BUS_INTERN_TXN_ID, BUSINESS_TX_TP_CD, INTERNAL_BUS_TX_TP, INT_TX_LOG_IND, LAST_UPDATE_DT) 
   VALUES (1000099, 1000008, 1000094, 'N', CURRENT_TIMESTAMP);
 



----------------------------------------------
-- BUSINESSTXREQRESP
----------------------------------------------

INSERT INTO DB2ADMIN.BUSINESSTXREQRESP (BUSTX_REQRESP_ID, BUSINESS_TX_TP_CD, APPLICATION, GROUP_NAME, REQ_RESP_IND, TX_PARAM_TP_CD, PARAM_NAME, PARAM_ORDER, LAST_UPDATE_USER, LAST_UPDATE_DT, COLLECTION_IND)
values (1000100, 1000006, null, null, 'I', 1, 'CreditInfopkId', 1, 'cusadmin', CURRENT_TIMESTAMP, null);

INSERT INTO DB2ADMIN.BUSINESSTXREQRESP (BUSTX_REQRESP_ID, BUSINESS_TX_TP_CD, APPLICATION, GROUP_NAME, REQ_RESP_IND, TX_PARAM_TP_CD, PARAM_NAME, PARAM_ORDER, LAST_UPDATE_USER, LAST_UPDATE_DT, COLLECTION_IND)
values (1000101, 1000006, null, null, 'I', 5, 'aDWLControl', 2, 'cusadmin', CURRENT_TIMESTAMP, null);

INSERT INTO DB2ADMIN.BUSINESSTXREQRESP (BUSTX_REQRESP_ID, BUSINESS_TX_TP_CD, APPLICATION, GROUP_NAME, REQ_RESP_IND, TX_PARAM_TP_CD, PARAM_NAME, PARAM_ORDER, LAST_UPDATE_USER, LAST_UPDATE_DT, COLLECTION_IND)
values (1000102, 1000006, 'TCRM', 'CreditInfoBObj', 'O', null, null, null, 'cusadmin', CURRENT_TIMESTAMP, 'N');

INSERT INTO DB2ADMIN.BUSINESSTXREQRESP (BUSTX_REQRESP_ID, BUSINESS_TX_TP_CD, APPLICATION, GROUP_NAME, REQ_RESP_IND, TX_PARAM_TP_CD, PARAM_NAME, PARAM_ORDER, LAST_UPDATE_USER, LAST_UPDATE_DT, COLLECTION_IND)
values (1000103, 1000023, null, null, 'I', 2, 'PartyId', 1, 'cusadmin', CURRENT_TIMESTAMP, null);

INSERT INTO DB2ADMIN.BUSINESSTXREQRESP (BUSTX_REQRESP_ID, BUSINESS_TX_TP_CD, APPLICATION, GROUP_NAME, REQ_RESP_IND, TX_PARAM_TP_CD, PARAM_NAME, PARAM_ORDER, LAST_UPDATE_USER, LAST_UPDATE_DT, COLLECTION_IND)
values (1000104, 1000023, null, null, 'I', 5, 'aDWLControl', 2, 'cusadmin', CURRENT_TIMESTAMP, null);

INSERT INTO DB2ADMIN.BUSINESSTXREQRESP (BUSTX_REQRESP_ID, BUSINESS_TX_TP_CD, APPLICATION, GROUP_NAME, REQ_RESP_IND, TX_PARAM_TP_CD, PARAM_NAME, PARAM_ORDER, LAST_UPDATE_USER, LAST_UPDATE_DT, COLLECTION_IND)
values (1000105, 1000023, 'TCRM', 'CreditInfoBObj', 'O', null, null, null, 'cusadmin', CURRENT_TIMESTAMP, 'N');


  
INSERT INTO DB2ADMIN.BUSINESSTXREQRESP (BUSTX_REQRESP_ID, BUSINESS_TX_TP_CD, APPLICATION, GROUP_NAME, REQ_RESP_IND, TX_PARAM_TP_CD, PARAM_NAME, PARAM_ORDER, LAST_UPDATE_USER, LAST_UPDATE_DT, COLLECTION_IND)
values (1000106, 1000007, 'TCRM', 'CreditInfoBObj', 'I', null, null, 1, 'cusadmin', CURRENT_TIMESTAMP, null);

INSERT INTO DB2ADMIN.BUSINESSTXREQRESP (BUSTX_REQRESP_ID, BUSINESS_TX_TP_CD, APPLICATION, GROUP_NAME, REQ_RESP_IND, TX_PARAM_TP_CD, PARAM_NAME, PARAM_ORDER, LAST_UPDATE_USER, LAST_UPDATE_DT, COLLECTION_IND)
values (1000107, 1000007, 'TCRM', 'CreditInfoBObj', 'O', null, null, null, 'cusadmin', CURRENT_TIMESTAMP, 'N');
	    

  
INSERT INTO DB2ADMIN.BUSINESSTXREQRESP (BUSTX_REQRESP_ID, BUSINESS_TX_TP_CD, APPLICATION, GROUP_NAME, REQ_RESP_IND, TX_PARAM_TP_CD, PARAM_NAME, PARAM_ORDER, LAST_UPDATE_USER, LAST_UPDATE_DT, COLLECTION_IND)
values (1000108, 1000008, 'TCRM', 'CreditInfoBObj', 'I', null, null, 1, 'cusadmin', CURRENT_TIMESTAMP, null);

INSERT INTO DB2ADMIN.BUSINESSTXREQRESP (BUSTX_REQRESP_ID, BUSINESS_TX_TP_CD, APPLICATION, GROUP_NAME, REQ_RESP_IND, TX_PARAM_TP_CD, PARAM_NAME, PARAM_ORDER, LAST_UPDATE_USER, LAST_UPDATE_DT, COLLECTION_IND)
values (1000109, 1000008, 'TCRM', 'CreditInfoBObj', 'O', null, null, null, 'cusadmin', CURRENT_TIMESTAMP, 'N');
	    


----------------------------------------------
-- INTERNALTXREQRESP
----------------------------------------------

INSERT INTO DB2ADMIN.INTERNALTXREQRESP (INTERNTX_REQRESP_ID, INTERNAL_BUS_TX_TP, APPLICATION, GROUP_NAME, REQ_RESP_IND, TX_PARAM_TP_CD, PARAM_NAME, PARAM_ORDER, LAST_UPDATE_USER, LAST_UPDATE_DT, COLLECTION_IND)
values (1000110, 1000088, null, null, 'I', 1, 'CreditInfopkId', 1, 'cusadmin', CURRENT_TIMESTAMP, null);

INSERT INTO DB2ADMIN.INTERNALTXREQRESP (INTERNTX_REQRESP_ID, INTERNAL_BUS_TX_TP, APPLICATION, GROUP_NAME, REQ_RESP_IND, TX_PARAM_TP_CD, PARAM_NAME, PARAM_ORDER, LAST_UPDATE_USER, LAST_UPDATE_DT, COLLECTION_IND)
values (1000111, 1000088, null, null, 'I', 5, 'aDWLControl', 2, 'cusadmin', CURRENT_TIMESTAMP, null);

INSERT INTO DB2ADMIN.INTERNALTXREQRESP (INTERNTX_REQRESP_ID, INTERNAL_BUS_TX_TP, APPLICATION, GROUP_NAME, REQ_RESP_IND, TX_PARAM_TP_CD, PARAM_NAME, PARAM_ORDER, LAST_UPDATE_USER, LAST_UPDATE_DT, COLLECTION_IND)
values (1000112, 1000088, 'TCRM', 'CreditInfoBObj', 'O', null, null, null, 'cusadmin', CURRENT_TIMESTAMP, 'N');

INSERT INTO DB2ADMIN.INTERNALTXREQRESP (INTERNTX_REQRESP_ID, INTERNAL_BUS_TX_TP, APPLICATION, GROUP_NAME, REQ_RESP_IND, TX_PARAM_TP_CD, PARAM_NAME, PARAM_ORDER, LAST_UPDATE_USER, LAST_UPDATE_DT, COLLECTION_IND)
values (1000113, 1000090, null, null, 'I', 2, 'PartyId', 1, 'cusadmin', CURRENT_TIMESTAMP, null);

INSERT INTO DB2ADMIN.INTERNALTXREQRESP (INTERNTX_REQRESP_ID, INTERNAL_BUS_TX_TP, APPLICATION, GROUP_NAME, REQ_RESP_IND, TX_PARAM_TP_CD, PARAM_NAME, PARAM_ORDER, LAST_UPDATE_USER, LAST_UPDATE_DT, COLLECTION_IND)
values (1000114, 1000090, null, null, 'I', 5, 'aDWLControl', 2, 'cusadmin', CURRENT_TIMESTAMP, null);

INSERT INTO DB2ADMIN.INTERNALTXREQRESP (INTERNTX_REQRESP_ID, INTERNAL_BUS_TX_TP, APPLICATION, GROUP_NAME, REQ_RESP_IND, TX_PARAM_TP_CD, PARAM_NAME, PARAM_ORDER, LAST_UPDATE_USER, LAST_UPDATE_DT, COLLECTION_IND)
values (1000115, 1000090, 'TCRM', 'CreditInfoBObj', 'O', null, null, null, 'cusadmin', CURRENT_TIMESTAMP, 'N');

  
INSERT INTO DB2ADMIN.INTERNALTXREQRESP (INTERNTX_REQRESP_ID, INTERNAL_BUS_TX_TP, APPLICATION, GROUP_NAME, REQ_RESP_IND, TX_PARAM_TP_CD, PARAM_NAME, PARAM_ORDER, LAST_UPDATE_USER, LAST_UPDATE_DT, COLLECTION_IND)
values (1000116, 1000092, 'TCRM', 'CreditInfoBObj', 'I', null, null, 1, 'cusadmin', CURRENT_TIMESTAMP, null);

INSERT INTO DB2ADMIN.INTERNALTXREQRESP (INTERNTX_REQRESP_ID, INTERNAL_BUS_TX_TP, APPLICATION, GROUP_NAME, REQ_RESP_IND, TX_PARAM_TP_CD, PARAM_NAME, PARAM_ORDER, LAST_UPDATE_USER, LAST_UPDATE_DT, COLLECTION_IND)
values (1000117, 1000092, 'TCRM', 'CreditInfoBObj', 'O', null, null, null, 'cusadmin', CURRENT_TIMESTAMP, 'N');
	    
  
INSERT INTO DB2ADMIN.INTERNALTXREQRESP (INTERNTX_REQRESP_ID, INTERNAL_BUS_TX_TP, APPLICATION, GROUP_NAME, REQ_RESP_IND, TX_PARAM_TP_CD, PARAM_NAME, PARAM_ORDER, LAST_UPDATE_USER, LAST_UPDATE_DT, COLLECTION_IND)
values (1000118, 1000094, 'TCRM', 'CreditInfoBObj', 'I', null, null, 1, 'cusadmin', CURRENT_TIMESTAMP, null);

INSERT INTO DB2ADMIN.INTERNALTXREQRESP (INTERNTX_REQRESP_ID, INTERNAL_BUS_TX_TP, APPLICATION, GROUP_NAME, REQ_RESP_IND, TX_PARAM_TP_CD, PARAM_NAME, PARAM_ORDER, LAST_UPDATE_USER, LAST_UPDATE_DT, COLLECTION_IND)
values (1000119, 1000094, 'TCRM', 'CreditInfoBObj', 'O', null, null, null, 'cusadmin', CURRENT_TIMESTAMP, 'N');
	    

----------------------------------------------
-- GROUPTXMAP
----------------------------------------------

INSERT INTO DB2ADMIN.GROUPTXMAP (ENTITY_TX_MAP_ID, GROUP_NAME, APPLICATION, BUSINESS_TX_TP_CD, LAST_UPDATE_DT ) 
   VALUES (1000120, 'CreditInfoBObj', 'TCRM', 1000006, CURRENT_TIMESTAMP);
 


----------------------------------------------
-- TAIL setup
----------------------------------------------


INSERT INTO DB2ADMIN.ASIDEFINITION (ASI_DEFINITION_ID, ASI_NAME, TRANSFORM_TP_CD, MAPPING_DEFN, ADAPTER_NAME, DESCRIPTION, START_DT, LAST_UPDATE_DT)
	VALUES (1000121, 'http://additions.test.com/Additions/port', 1, 'com.ibm.mdm.asi.transformation.MDMDefaultWSReqTransformation', 'com.ibm.mdm.asi.MDMOperationalServicesRequestAdapter', 'WS request transform for Additions', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
	
INSERT INTO DB2ADMIN.ASIDEFINITION (ASI_DEFINITION_ID, ASI_NAME, TRANSFORM_TP_CD, MAPPING_DEFN, ADAPTER_NAME, DESCRIPTION, START_DT, LAST_UPDATE_DT)
	VALUES (1000122, 'http://additions.test.com/Additions/port', 2, 'com.ibm.mdm.asi.transformation.MDMDefaultWSRespTransformation', 'com.ibm.mdm.asi.MDMResponseAdapter', 'WS response transform for Additions', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
	
