update javaimpl set java_classname = 'com.test.externalrules.CollapseMultiplePartiesRule', last_update_dt = current timestamp where ext_rule_impl_id = 10119


INSERT INTO CRITICALDATAELEMENT
(CRITICAL_ELEMENT_ID,APPLICATION,GROUP_NAME,ELEMENT_NAME,SYNCPURPOSE_TP_CD,ENTITY_TYPE,INSTANCE_PK,ACTIVE_IND,ULTIMATE_PARENT_GROUP_NAME,LAST_UPDATE_DT)
VALUES
(276,'TCRM','PartyRelationship','RelationshipToPartyId',1,'RelationshipType','1','Y','Person',current timestamp);

INSERT INTO CRITICALDATAELEMENT
(CRITICAL_ELEMENT_ID,APPLICATION,GROUP_NAME,ELEMENT_NAME,SYNCPURPOSE_TP_CD,ENTITY_TYPE,INSTANCE_PK,ACTIVE_IND,ULTIMATE_PARENT_GROUP_NAME,LAST_UPDATE_DT)
VALUES
(277,'TCRM','PartyRelationship','RelationshipToPartyId',2,'RelationshipType','1','Y','Person',current timestamp);