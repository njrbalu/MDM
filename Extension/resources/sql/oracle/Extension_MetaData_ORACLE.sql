
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
-- 			sqlplus userid/password@host @Extension_SETUP_ORACLE.sql
-- 			sqlplus userid/password@host @Extension_TRIGGERS_ORACLE.sql
-- 			sqlplus userid/password@host @Extension_CONSTRAINTS_ORACLE.sql
-- 			sqlplus userid/password@host @Extension_MetaData_ORACLE.sql
-- 			sqlplus userid/password@host CONFIG_XMLSERVICES_RESPONSE_ORACLE.sql
-- 			sqlplus userid/password@host @Extension_CODETABLES_ORACLE.sql
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


CREATE SEQUENCE DB2ADMIN.GROUPDWLTABLE_ID_SEQ START WITH 1010000 INCREMENT BY 1 MINVALUE 1010000 MAXVALUE 1019999 CACHE 10;


DROP SEQUENCE DB2ADMIN.GROUPDWLTABLE_ID_SEQ;

----------------------------------------------
-- V_ELEMENTATTRIBUTE
----------------------------------------------


CREATE SEQUENCE DB2ADMIN.V_ELATTR_ID_SEQ START WITH 1010000 INCREMENT BY 1 MINVALUE 1010000 MAXVALUE 1019999 CACHE 10;

DROP SEQUENCE DB2ADMIN.V_ELATTR_ID_SEQ;

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


