/* _______________________________________________________ {COPYRIGHT-TOP} _____
* Licensed Materials - Property of IBM
* Restricted Materials of IBM
*
* 5725-E59
*
* (C) Copyright IBM Corp. 2011, 2013  All Rights Reserved.
*
* US Government Users Restricted Rights - Use, duplication, or
* disclosure restricted by GSA ADP Schedule Contract with IBM Corp.
* ________________________________________________________ {COPYRIGHT-END} _____*/
package com.test.pme.extrules;

import java.util.Vector;

import com.dwl.base.DWLCommon;
import com.dwl.base.IDWLErrorMessage;
import com.dwl.base.error.DWLStatus;
import com.dwl.base.logging.DWLLoggerManager;
import com.dwl.base.logging.IDWLLogger;
import com.dwl.base.util.StringUtils;
import com.dwl.tcrm.common.TCRMErrorCode;
import com.dwl.tcrm.coreParty.component.ProbabilisticPersonSearchBObj;
import com.dwl.tcrm.coreParty.component.TCRMAddressBObj;
import com.dwl.tcrm.coreParty.component.TCRMContactMethodBObj;
import com.dwl.tcrm.coreParty.component.TCRMPartyAddressBObj;
import com.dwl.tcrm.coreParty.component.TCRMPartyBankAccountBObj;
import com.dwl.tcrm.coreParty.component.TCRMPartyChargeCardBObj;
import com.dwl.tcrm.coreParty.component.TCRMPartyContactMethodBObj;
import com.dwl.tcrm.coreParty.component.TCRMPartyIdentificationBObj;
import com.dwl.tcrm.coreParty.component.TCRMPartyRelationshipBObj;
import com.dwl.tcrm.coreParty.component.TCRMPersonBObj;
import com.dwl.tcrm.coreParty.component.TCRMPersonNameBObj;
import com.dwl.tcrm.coreParty.constant.TCRMCoreComponentID;
import com.dwl.tcrm.coreParty.constant.TCRMCoreErrorReasonCode;
import com.dwl.tcrm.exception.TCRMDataInvalidException;
import com.dwl.tcrm.utilities.DateFormatter;
import com.dwl.tcrm.utilities.TCRMClassFactory;
import com.dwl.tcrm.utilities.TCRMExceptionUtils;
import com.ibm.mdm.common.util.PropertyManager;
import com.ibm.mdm.eme.metadata.CriticalData;
import com.ibm.mdm.mds.pme.api.bean.Attribute;
import com.ibm.mdm.mds.pme.api.bean.Record;
import com.ibm.mdm.mds.pme.api.bean.RecordId;

/**
 * The PersonDerivedDataConverter provides an implementation of the IConverter
 * interface. Used to convert the TCRMPersonBObj to EME Record Object.
 * 
 * @since EVERETT
 * @see com.ibm.mdm.eme.converters.IConverter
 */
public class PersonDerivedDataConverter extends PartyDerivedDataConverter {
    public static final String copyright =  "Licensed Materials -- Property of IBM\n(c) Copyright IBM Corp. 2011, 2013\nUS Government Users Restricted Rights - Use, duplication or disclosure restricted by GSA ADP Schedule Contract with IBM Corp.";



	private Record personRecord = null;

	private static final String BIRTH_DATE_MDM_ATTRIBUTE_NAME = "BirthDate";

	private static final String GENDER_TYPE_MDM_ATTRIBUTE_NAME = "GenderType";
	
	private static final String DECEASED_DATE_MDM_ATTRIBUTE_NAME = "DeceasedDate";

	private static final String GIVEN_NAME_ONE_MDM_ATTRIBUTE_NAME = "GivenNameOne";

	private static final String GIVEN_NAME_TWO_MDM_ATTRIBUTE_NAME = "GivenNameTwo";
	
	private static final String GIVEN_NAME_THREE_MDM_ATTRIBUTE_NAME = "GivenNameThree";

	private static final String GENERATION_VALUE_MDM_ATTRIBUTE_NAME = "GenerationValue";
	
	private static final String PREFIX_VALUE_MDM_ATTRIBUTE_NAME = "PrefixValue";

	private static final String LAST_NAME_MDM_ATTRIBUTE_NAME = "LastName";
	
	private static final String PERSON_PERSONNAME_NAMEUSAGETYPE_PREFIX = "Person.PersonName.NameUsageType.";
	
	private static final String PERSON_PARTYADDRESS_ADDRESSUSAGETYPE_PREFIX = "Person.PartyAddress.AddressUsageType.";
	
	private static final String PERSON_PARTYIDENTIFICATION_IDENTIFICATIONTYPE_PREFIX = "Person.PartyIdentification.IdentificationType.";
	
	private static final String PERSON_PARTYCONTACTMETHOD_CONTACTMETHODUSAGETYPE_PREFIX = "Person.PartyContactMethod.ContactMethodUsageType.";

	private static final String BANK_NUMBER_MDM_ATTRIBUTE_NAME = "BankNumber";

	private static final String BRANCH_NUMBER_MDM_ATTRIBUTE_NAME = "BranchNumber";

	private static final String ACCOUNT_NUMBER_MDM_ATTRIBUTE_NAME = "AccountNumber";

	private static final String PERSON_PARTYBANKACCOUNT_ACCOUNTTYPE_PREFIX = "Person.PartyBankAccount.AccountType.";

	private static final String CARD_NUMBER_MDM_ATTRIBUTE_NAME = "CardNumber";
	
	private static final String PERSON_ORG_RELATIONSHIP = "PartyRelationship";

	private static final String PERSON_PARTYCHARGECARD_CARDTYPE_PREFIX = "Person.PartyChargeCard.CardType.";

	private static final Object CONTACTMETHOD_USAGETYPE_MDM_ATTRIBUTE_NAME = "ContactMethodUsageType";

	private static final Object PERSON_GROUP_NAME = "Person";
	
	private static final Object PERSON_ORG_RELATIONSHIPTYPE_PREFIX = "Person.Org.RelationshipType";
	
	//Flag to indicate if this called from probabilistic search
	boolean probabilisticSearch = false;
	
	private static final IDWLLogger logger = DWLLoggerManager.getLogger(PersonDerivedDataConverter.class);
	
	private static IDWLErrorMessage errHandler;
	
	/**
	 * Builds an attribute with attrCode,elementName,elementValue and
	 * activeIndicator.
	 * 
	 * @param attrCode
	 * @param elementName
	 * @param elementValue
	 * @param activeInd
	 * @return
	 */
	private Attribute buildAttribute(String attrCode, String elementName,
			Object elementValue) {
		Attribute personAttrs = new Attribute(attrCode);
		personAttrs.setField(elementName, elementValue);
		return personAttrs;
	}

	/**
	 * Builds all person name attributes for a person
	 * 
	 * @param vecPersonName
	 * @throws Exception
	 */
	private void buildPersonNameAttributes(
			Vector<TCRMPersonNameBObj> vecPersonName) throws Exception {

		if (vecPersonName != null && vecPersonName.size() > 0) {
			Vector<CriticalData> vecCritVectorForPersonName = getCriticalDataElementsOfChildObjectOfPerson(vecPersonName
					.firstElement());

			for (TCRMPersonNameBObj persNameBObj : vecPersonName) {
				String nameUsageTp = persNameBObj.getNameUsageType();

				
				if (probabilisticSearch && nameUsageTp==null)
				 {
					 //Default name usage type is 1 if not provided in the request
					 nameUsageTp = "1";
				 }

				String attrCode = PropertyManager.getOptionalProperty(PERSON_PERSONNAME_NAMEUSAGETYPE_PREFIX+nameUsageTp, null);

				if(attrCode!=null){
				Attribute newAttr = new Attribute(attrCode);

				for (CriticalData criticalData : vecCritVectorForPersonName) {
					String instancePK = criticalData.getInstancePK();
					if(instancePK == null || instancePK.equals(nameUsageTp)) {
						String fieldName = criticalData.getElementName();
						if (StringUtils.isNonBlank(persNameBObj.getGivenNameOne())
								&& fieldName
								.equalsIgnoreCase(GIVEN_NAME_ONE_MDM_ATTRIBUTE_NAME)) {
							newAttr.setField("givenname1", persNameBObj
									.getGivenNameOne());
						} else if (StringUtils.isNonBlank(persNameBObj
								.getGivenNameTwo())
								&& fieldName
								.equalsIgnoreCase(GIVEN_NAME_TWO_MDM_ATTRIBUTE_NAME)) {
							newAttr.setField("givenname2", persNameBObj
									.getGivenNameTwo());
						} else if (StringUtils.isNonBlank(persNameBObj
								.getGivenNameThree())
								&& fieldName
								.equalsIgnoreCase(GIVEN_NAME_THREE_MDM_ATTRIBUTE_NAME)) {
							newAttr.setField("givenname3", persNameBObj
									.getGivenNameThree());
						}else if (StringUtils.isNonBlank(persNameBObj
								.getGenerationValue())
								&& fieldName
								.equalsIgnoreCase(GENERATION_VALUE_MDM_ATTRIBUTE_NAME)) {
							newAttr.setField("generation", persNameBObj
									.getGenerationValue());
						} else if (StringUtils.isNonBlank(persNameBObj
								.getPrefixValue())
								&& fieldName
								.equalsIgnoreCase(PREFIX_VALUE_MDM_ATTRIBUTE_NAME)) {
							newAttr.setField("prefix", persNameBObj
									.getPrefixValue());
						}else if (StringUtils.isNonBlank(persNameBObj
								.getLastName())
								&& fieldName
								.equalsIgnoreCase(LAST_NAME_MDM_ATTRIBUTE_NAME)) {
							newAttr
							.setField("lastname", persNameBObj
									.getLastName());
						}
					}
				}
				if (newAttr.getFieldNames().size() > 0) {
					
					boolean isPersonNameActive = checkIfActiveObject(persNameBObj.getEObjPersonName().getEndDt(), persNameBObj.getControl());
					newAttr.setActive(isPersonNameActive);
					
					personRecord.addAttribute(newAttr);
					}
				}
			}
		}

	}

	/**
	 * Builds all person address attributes for a person
	 * 
	 * @param vecPersonAddress
	 * @throws Exception
	 */
	private void buildPersonAddressAttributes(
			Vector<TCRMPartyAddressBObj> vecPersonAddress) throws Exception {

		if (vecPersonAddress != null && vecPersonAddress.size() > 0) {
			Vector<CriticalData> vecPartyAddress = getCriticalDataElementsOfChildObjectOfPerson(vecPersonAddress.firstElement());
			Vector<CriticalData> vecCritVectorForAddr = getCriticalDataElementsOfChildObjectOfPerson(vecPersonAddress
					.firstElement().getTCRMAddressBObj());
			for (TCRMPartyAddressBObj prtyAddressBobj : vecPersonAddress) {
				TCRMAddressBObj tcrmAddBObj = prtyAddressBobj
				.getTCRMAddressBObj();

				String addressUsageType = prtyAddressBobj.getAddressUsageType();
				
				if (probabilisticSearch && addressUsageType==null)
				 {
					 //default address usage type to 1 if not provided in the request
					addressUsageType = "1";
				 }
				String attrCode = null;
				for (CriticalData partyAddressCriticalData : vecPartyAddress) {
					if (StringUtils.isBlank(attrCode)) {
						String instancePK = partyAddressCriticalData.getInstancePK();
						if (instancePK == null || instancePK.equals(addressUsageType))  {
							attrCode = PropertyManager.getOptionalProperty(PERSON_PARTYADDRESS_ADDRESSUSAGETYPE_PREFIX+addressUsageType, null);

							if(attrCode!=null){

								Attribute personAddrAttr = new Attribute(attrCode);
								for (CriticalData criticalData : vecCritVectorForAddr) {

									String fieldName = criticalData.getElementName();
									if (StringUtils.isNonBlank(tcrmAddBObj.getCity())
											&& fieldName
											.equalsIgnoreCase(CITY_MDM_ATTRIBUTE_NAME)) {
										personAddrAttr.setField("city", tcrmAddBObj.getCity());
									} else if (StringUtils.isNonBlank(tcrmAddBObj
											.getResidenceNumber())
											&& fieldName
											.equalsIgnoreCase(RESIDENCE_NUMBER_MDM_ATTRIBUTE_NAME)) {
										personAddrAttr.setField("residencenum", tcrmAddBObj
												.getResidenceNumber());
									} else if (StringUtils.isNonBlank(tcrmAddBObj
											.getProvinceStateType())
											&& fieldName
											.equalsIgnoreCase(PROVINCE_STATE_MDM_ATTRIBUTE_NAME)) {
										personAddrAttr.setField("provstate", tcrmAddBObj
												.getProvinceStateType());
									} else if (StringUtils.isNonBlank(tcrmAddBObj
											.getAddressLineOne())
											&& fieldName
											.equalsIgnoreCase(ADDRESS_LINE_ONE_MDM_ATTRIBUTE_NAME)) {
										personAddrAttr.setField("addrline1", tcrmAddBObj
												.getAddressLineOne());
									} else if (StringUtils.isNonBlank(tcrmAddBObj
											.getAddressLineTwo())
											&& fieldName
											.equalsIgnoreCase(ADDRESS_LINE_TWO_MDM_ATTRIBUTE_NAME)) {
										personAddrAttr.setField("addrline2", tcrmAddBObj
												.getAddressLineTwo());
									} else if (StringUtils.isNonBlank(tcrmAddBObj
											.getAddressLineThree())
											&& fieldName
											.equalsIgnoreCase(ADDRESS_LINE_THREE_MDM_ATTRIBUTE_NAME)) {
										personAddrAttr.setField("addrline3", tcrmAddBObj
												.getAddressLineThree());
									} else if (StringUtils.isNonBlank(tcrmAddBObj
											.getZipPostalCode())
											&& fieldName
											.equalsIgnoreCase(ZIP_POSTAL_CODE_MDM_ATTRIBUTE_NAME)) {
										personAddrAttr.setField("postalcode", tcrmAddBObj
												.getZipPostalCode());
									}

								}
								if (personAddrAttr.getFieldNames().size() > 0) {
									boolean isPersonAddrActive = checkIfActiveObject(prtyAddressBobj.getEObjLocationGroup().getEndDt(), prtyAddressBobj.getControl());
									personAddrAttr.setActive(isPersonAddrActive);

									personRecord.addAttribute(personAddrAttr);
								}
							}
						}
					}
				}
			}
		}
	}

	/**
	 * Builds all person identification attributes for a person
	 * 
	 * @param vecPersonIdentification
	 * @throws Exception
	 */
	private void buildPersonIdentificationAttributes(
			Vector<TCRMPartyIdentificationBObj> vecPersonIdentification)
			throws Exception {
		if (vecPersonIdentification != null
				&& vecPersonIdentification.size() > 0) {
			Vector<CriticalData> vecCritVectorForPersonIdentification = getCriticalDataElementsOfChildObjectOfPerson(vecPersonIdentification
					.firstElement());

			for (TCRMPartyIdentificationBObj prtyIdentBobj : vecPersonIdentification) {
				String identUsageType = prtyIdentBobj.getIdentificationType();
				String attrCode = PropertyManager.getOptionalProperty(PERSON_PARTYIDENTIFICATION_IDENTIFICATIONTYPE_PREFIX+identUsageType, null);

				if(attrCode!=null){

					for (CriticalData criticalData : vecCritVectorForPersonIdentification) {
						String instancePK = criticalData.getInstancePK();
						if (instancePK == null || instancePK.equals(identUsageType)) {
							String fieldName = criticalData.getElementName();

							if (StringUtils.isNonBlank(prtyIdentBobj
									.getIdentificationNumber())
									&& fieldName
									.equalsIgnoreCase(IDENTIFICATION_NUMBER_MDM_ATTRIBUTE_NAME)) {
								Attribute personIdentAttr = new Attribute(attrCode);
								personIdentAttr.setField("idnum", prtyIdentBobj
										.getIdentificationNumber());

								boolean isPersonIdentificationActive = checkIfActiveObject(prtyIdentBobj.getEObjIdentifier().getEndDt(), prtyIdentBobj.getControl());
								personIdentAttr.setActive(isPersonIdentificationActive);
								
								personRecord.addAttribute(personIdentAttr);
							}
							}
						}
					}
				}
			}
		
	}

	/**
	 * Builds all person contact method attributes for a person
	 * 
	 * @param vecPersonContMethod
	 * @throws Exception
	 */
	private void buildPersonContactMethodAttributes(
			Vector<TCRMPartyContactMethodBObj> vecPersonContMethod)
			throws Exception {
		if (vecPersonContMethod != null && vecPersonContMethod.size() > 0) {
			Vector<CriticalData> vecCritVectorForPartyContMethod = getCriticalDataElementsOfChildObjectOfPerson(vecPersonContMethod
					.firstElement());
			Vector<CriticalData> vecCritVectorForContMethod = getCriticalDataElementsOfChildObjectOfPerson(vecPersonContMethod
					.firstElement().getTCRMContactMethodBObj());

			for (TCRMPartyContactMethodBObj prtyContBobj : vecPersonContMethod) {
				TCRMContactMethodBObj contMethodBobj = prtyContBobj
						.getTCRMContactMethodBObj();


				String contMethodUsageType = prtyContBobj
						.getContactMethodUsageType();

				if (probabilisticSearch && contMethodUsageType==null)
				 {
					 //default contact method usage type to 1 if none provided in he request
					contMethodUsageType = "1";
				 }
				
				String attrCode = PropertyManager.getOptionalProperty(PERSON_PARTYCONTACTMETHOD_CONTACTMETHODUSAGETYPE_PREFIX+contMethodUsageType, null);

				if(attrCode!=null){

					for (CriticalData partyContMethodcriticalData : vecCritVectorForPartyContMethod) {
						String entityName = partyContMethodcriticalData.getEntityType();
					String instancePK = partyContMethodcriticalData.getInstancePK();
						if(partyContMethodcriticalData.getElementName().equals(CONTACTMETHOD_USAGETYPE_MDM_ATTRIBUTE_NAME)){
						if ((entityName==null && instancePK == null)||( entityName.equals(CONTACTMETHOD_USAGETYPE_MDM_ATTRIBUTE_NAME)&& instancePK.equals(contMethodUsageType))) {
							for (CriticalData contMethodcriticalData : vecCritVectorForContMethod) {
							String fieldName = contMethodcriticalData.getElementName();
						if (StringUtils.isNonBlank(contMethodBobj
								.getReferenceNumber())
								&& fieldName
								.equalsIgnoreCase(REFERENCE_NUMBER_MDM_ATTRIBUTE_NAME)) {
							Attribute personContMethAttr = new Attribute(attrCode);
							personContMethAttr.setField("refnum", contMethodBobj
									.getReferenceNumber());
							
							boolean isPersonContMethActive = checkIfActiveObject(prtyContBobj.getEObjLocationGroup().getEndDt(), prtyContBobj.getControl());
							personContMethAttr.setActive(isPersonContMethActive);
							
							personRecord.addAttribute(personContMethAttr);
							}
						}
						}	
						}		
					}
				}
			}
		}
	}
	
	/**
	 * Builds all person Bank Account attributes for a person
	 * 
	 * @param vecPersonBankAccount
	 * @throws Exception
	 */
	private void buildPersonBankAccountAttributes(
			Vector<TCRMPartyBankAccountBObj> vecPersonBankAccount) throws Exception {

		if (vecPersonBankAccount != null && vecPersonBankAccount.size() > 0) {
			Vector<CriticalData> vecCritVectorForBankAccount = getCriticalDataElementsOfChildObjectOfPerson(vecPersonBankAccount
					.firstElement());
			for (TCRMPartyBankAccountBObj prtyBankAccountBobj : vecPersonBankAccount) {
				
				String accountType = prtyBankAccountBobj.getAccountType();

				String attrCode = PropertyManager.getOptionalProperty(PERSON_PARTYBANKACCOUNT_ACCOUNTTYPE_PREFIX+accountType, null);

				if(attrCode!=null){

					Attribute personBankAcctAttr = new Attribute(attrCode);
					for (CriticalData criticalData : vecCritVectorForBankAccount) {
						String instancePK = criticalData.getInstancePK();
						if (instancePK == null || instancePK.equals(accountType)) {
							String fieldName = criticalData.getElementName();
							if (StringUtils.isNonBlank(prtyBankAccountBobj.getBankNumber())
									&& fieldName
									.equalsIgnoreCase(BANK_NUMBER_MDM_ATTRIBUTE_NAME)) {
								personBankAcctAttr.setField("banknum", prtyBankAccountBobj.getBankNumber());
							} else if (StringUtils.isNonBlank(prtyBankAccountBobj
									.getBranchNumber())
									&& fieldName
									.equalsIgnoreCase(BRANCH_NUMBER_MDM_ATTRIBUTE_NAME)) {
								personBankAcctAttr.setField("branchnum", prtyBankAccountBobj
										.getBranchNumber());
							} else if (StringUtils.isNonBlank(prtyBankAccountBobj
									.getAccountNumber())
									&& fieldName
									.equalsIgnoreCase(ACCOUNT_NUMBER_MDM_ATTRIBUTE_NAME)) {
								personBankAcctAttr.setField("acctnum", prtyBankAccountBobj
										.getAccountNumber());
							} 
						}
					}
					if (personBankAcctAttr.getFieldNames().size() > 0) {
						boolean isPersonBankAccountActive = checkIfActiveObject(prtyBankAccountBobj.getEObjPaymentSource().getEndDt(), prtyBankAccountBobj.getControl());
						personBankAcctAttr.setActive(isPersonBankAccountActive);

						personRecord.addAttribute(personBankAcctAttr);
					}
				}	
			}
		}
	}
	
	/**
	 * Builds all person Bank Account attributes for a person
	 * 
	 * @param vecPersonBankAccount
	 * @throws Exception
	 */
	private void buildPersonChargeCardAttributes(
			Vector<TCRMPartyChargeCardBObj> vecPersonChargeCard) throws Exception {

		if (vecPersonChargeCard != null && vecPersonChargeCard.size() > 0) {
			Vector<CriticalData> vecCritVectorForChargeCard = getCriticalDataElementsOfChildObjectOfPerson(vecPersonChargeCard
					.firstElement());
			for (TCRMPartyChargeCardBObj prtyChargeCardBobj : vecPersonChargeCard) {
				
				String cardType = prtyChargeCardBobj.getCardType();

				String attrCode = PropertyManager.getOptionalProperty(PERSON_PARTYCHARGECARD_CARDTYPE_PREFIX+cardType, null);

				if(attrCode!=null){

					Attribute personChargeCardAttr = new Attribute(attrCode);
					for (CriticalData criticalData : vecCritVectorForChargeCard) {
						String instancePK = criticalData.getInstancePK();
						if (instancePK == null || instancePK.equals(cardType)) {
							String fieldName = criticalData.getElementName();
							if (StringUtils.isNonBlank(prtyChargeCardBobj.getCardNumber())
									&& fieldName
									.equalsIgnoreCase(CARD_NUMBER_MDM_ATTRIBUTE_NAME)) {
								personChargeCardAttr.setField("cardnum", prtyChargeCardBobj.getCardNumber());
							}  
						}
					}
					if (personChargeCardAttr.getFieldNames().size() > 0) {
						boolean isPersonChargeCardActive = checkIfActiveObject(prtyChargeCardBobj.getEObjPaymentSource().getEndDt(), prtyChargeCardBobj.getControl());
						personChargeCardAttr.setActive(isPersonChargeCardActive);

						personRecord.addAttribute(personChargeCardAttr);
					}
				}
			}
		}
	}
	
	/** Builds all the person attributes
	 * @param personObj
	 * @throws Exception
	 */
	private void buildPersonAttributes(TCRMPersonBObj personObj) throws Exception	{
		
		Vector<CriticalData> vecCritVectorForPerson = getCriticalDataElementsForGroup(personObj);

		// For each element a check is done if that element belongs to list
		// of active critical data elements of that group,only then it is
		// synchronized to EME.
		for (CriticalData criticalData : vecCritVectorForPerson) {
			
			String fieldName = criticalData.getElementName();
			if (StringUtils.isNonBlank(personObj.getBirthDate())
					&& fieldName
					.equalsIgnoreCase(BIRTH_DATE_MDM_ATTRIBUTE_NAME)) {
				// convert to Date.
				personRecord.addAttribute(buildAttribute("PERBIRTHDATE",
						"val",
						DateFormatter.getDate(personObj.getBirthDate())));
			}  
		}
	}

	public Record convert(DWLCommon rootBObj) throws Exception {

		TCRMPersonBObj personObj;
		RecordId newRecordId;

		// Check if this is used to convert ProbabilisticPersonSearchBObj
		if (rootBObj instanceof ProbabilisticPersonSearchBObj) {
			probabilisticSearch = true;		
			newRecordId = new RecordId("MDMSP", "");
			personRecord = new Record(PERSON_REC_TYPE, newRecordId);
					
			if (((ProbabilisticPersonSearchBObj) rootBObj).getTCRMPersonBObj() != null)
			{
				buildPersonAttributes(((ProbabilisticPersonSearchBObj) rootBObj).getTCRMPersonBObj());
			}

			buildPersonNameAttributes(((ProbabilisticPersonSearchBObj) rootBObj)
						.getItemsTCRMPersonNameBObj());

			buildPersonIdentificationAttributes(((ProbabilisticPersonSearchBObj) rootBObj)
						.getItemsTCRMPartyIdentificationBObj());

			
			buildPersonAddressAttributes(((ProbabilisticPersonSearchBObj) rootBObj)
					.getItemsTCRMPartyAddressBObj());
			
			buildPersonContactMethodAttributes(((ProbabilisticPersonSearchBObj) rootBObj)
					.getItemsTCRMPartyContactMethodBObj());

		}
		 else {
			personObj = (TCRMPersonBObj) rootBObj;
			newRecordId = new RecordId("MDMSP", personObj.getPartyId());

			personRecord = new Record(PERSON_REC_TYPE, newRecordId);
			Vector<CriticalData> vecCritVectorForPerson = getCriticalDataElementsForGroup(personObj);

			buildPersonNameAttributes(personObj.getItemsTCRMPersonNameBObj());

			buildPersonAddressAttributes(personObj.getItemsTCRMPartyAddressBObj());

			buildPersonIdentificationAttributes(personObj
					.getItemsTCRMPartyIdentificationBObj());

			buildPersonContactMethodAttributes(personObj
					.getItemsTCRMPartyContactMethodBObj());

			if(personObj.getTCRMFinancialProfileBObj()!=null){
				buildPersonBankAccountAttributes(personObj
						.getTCRMFinancialProfileBObj().getItemsTCRMPartyBankAccountBObj());

				buildPersonChargeCardAttributes(personObj
						.getTCRMFinancialProfileBObj().getItemsTCRMPartyChargeCardBObj());
			}
			
			buildPersonOrgRelationshipAttributes(personObj
					.getItemsTCRMPartyRelationshipBObj());


			// For each element a check is done if that element belongs to list of
			// active critical data elements of that group,only then it is
			// synchronized to EME.
			for (CriticalData criticalData : vecCritVectorForPerson) {
				String fieldName = criticalData.getElementName();

				if (StringUtils.isNonBlank(personObj.getBirthDate())
						&& fieldName
						.equalsIgnoreCase(BIRTH_DATE_MDM_ATTRIBUTE_NAME)) {				
					//convert to Date.
					personRecord.addAttribute(buildAttribute("PERBIRTHDATE", "val", 
							DateFormatter.getDate(personObj.getBirthDate())));												
				} else if (StringUtils.isNonBlank(personObj.getGenderType())
						&& fieldName
						.equalsIgnoreCase(GENDER_TYPE_MDM_ATTRIBUTE_NAME)) {
					personRecord.addAttribute(buildAttribute("PERGENDER", "gender",
							personObj.getGenderType()));

				} else if (StringUtils.isNonBlank(personObj.getDeceasedDate())
						&& fieldName
						.equalsIgnoreCase(DECEASED_DATE_MDM_ATTRIBUTE_NAME)) {
					// convert to Date.
					personRecord
					.addAttribute(buildAttribute("PERDECEASDTE", "val",
							DateFormatter.getDate(personObj
									.getDeceasedDate())));

				}
			}
		}

		//Check that there are attributes added to the record
		//otherwise return insufficient search criteria error
		if (probabilisticSearch && personRecord.getAttributes().isEmpty())
		{
			DWLStatus status = new DWLStatus();
			errHandler = TCRMClassFactory.getErrorHandler();
			
			TCRMExceptionUtils.throwTCRMException(null,
					new TCRMDataInvalidException(), status,
					DWLStatus.FATAL,
					TCRMCoreComponentID.PROBABILISTIC_PERSON_SEARCH_OBJECT,
					TCRMErrorCode.DATA_INVALID_ERROR,
					TCRMCoreErrorReasonCode.SEARCH_NO_CRITIERIA,
					rootBObj.getControl(), errHandler);
		}
		return personRecord;

	}
	private void buildPersonOrgRelationshipAttributes(
			Vector<TCRMPartyRelationshipBObj> vecPartyRelationships) throws Exception {


		if (vecPartyRelationships != null && vecPartyRelationships.size() > 0) {
			Vector<CriticalData> vecCritVectorForPartyRelationship = getCriticalDataElementsOfChildObjectOfPerson(vecPartyRelationships
					.firstElement());
			for (TCRMPartyRelationshipBObj prtyRelationship : vecPartyRelationships) {
				
				String relationshipType = prtyRelationship.getRelationshipType();

				String attrCode = PropertyManager.getOptionalProperty(PERSON_PARTYCHARGECARD_CARDTYPE_PREFIX+relationshipType, null);

				if(attrCode!=null){

					Attribute personRelationshipAttr = new Attribute(attrCode);
					for (CriticalData criticalData : vecCritVectorForPartyRelationship) {
						String instancePK = criticalData.getInstancePK();
						if (instancePK == null || instancePK.equals(relationshipType)) {
							String fieldName = criticalData.getElementName();
							if (StringUtils.isNonBlank(prtyRelationship.getRelationshipFromPartyId())
									&& fieldName
									.equalsIgnoreCase(PERSON_ORG_RELATIONSHIP)) {
								personRelationshipAttr.setField("partyrel", prtyRelationship.getRelationshipFromPartyId());
							}  
						}
					}
					if (personRelationshipAttr.getFieldNames().size() > 0) {
						personRecord.addAttribute(personRelationshipAttr);
					}
				}
			}
		}
			
	}

	private Vector<CriticalData> getCriticalDataElementsOfChildObjectOfPerson(DWLCommon bObj) throws Exception{
		
		Vector<CriticalData> vecCritDataElemOfIncomingBObj = getCriticalDataElementsForGroup(bObj);
		Vector<CriticalData> vecCritDataElemOfIncomingBObjForPerson = new Vector<CriticalData>();
		for(CriticalData criticalData : vecCritDataElemOfIncomingBObj){
			if(criticalData.getUltimateParentGroupName().equals(PERSON_GROUP_NAME)){
				vecCritDataElemOfIncomingBObjForPerson.add(criticalData);
			}
		}
		return vecCritDataElemOfIncomingBObjForPerson;
		
	}
}
