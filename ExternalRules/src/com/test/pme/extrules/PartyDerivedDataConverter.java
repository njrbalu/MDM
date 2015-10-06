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

import java.sql.Timestamp;
import java.util.Vector;

import com.dwl.base.DWLCommon;
import com.dwl.base.DWLControl;
import com.dwl.base.IDWLErrorMessage;
import com.dwl.base.groupelement.engine.Group;
import com.dwl.base.groupelement.engine.GroupElementServiceHelper;
import com.dwl.base.groupelement.engine.IGroupElementService;
import com.dwl.base.util.DWLDateTimeUtilities;
import com.dwl.base.util.DWLFunctionUtils;
import com.dwl.management.config.client.Configuration;
import com.ibm.mdm.common.converter.MDMOutboundConverter;
import com.ibm.mdm.eme.metadata.CriticalData;
import com.ibm.mdm.mds.pme.api.bean.Record;

/**
 * The PartyDerivedDataConverter provides an implementation of the IConverter
 * interface. Used to convert the TCRMPartyBObj to EME Record Object.
 * 
 * @since EVERETT
 * @see com.ibm.mdm.eme.converters.IConverter
 */
public abstract class PartyDerivedDataConverter extends
		MDMOutboundConverter<Record> { 
    public static final String copyright =  "Licensed Materials -- Property of IBM\n(c) Copyright IBM Corp. 2011, 2013\nUS Government Users Restricted Rights - Use, duplication or disclosure restricted by GSA ADP Schedule Contract with IBM Corp.";



	protected static final String CITY_MDM_ATTRIBUTE_NAME = "City";

	protected static final String RESIDENCE_NUMBER_MDM_ATTRIBUTE_NAME = "ResidenceNumber";

	protected static final String PROVINCE_STATE_MDM_ATTRIBUTE_NAME = "ProvinceStateType";

	protected static final String ADDRESS_LINE_ONE_MDM_ATTRIBUTE_NAME = "AddressLineOne";

	protected static final String ADDRESS_LINE_TWO_MDM_ATTRIBUTE_NAME = "AddressLineTwo";

	protected static final String ADDRESS_LINE_THREE_MDM_ATTRIBUTE_NAME = "AddressLineThree";
	
	protected static final String ADDRESS_USAGE_TYPE_MDM_ATTRIBUTE_NAME = "AddressUsageType";
	
	protected static final String IDENTIFICATION_NUMBER_MDM_ATTRIBUTE_NAME = "IdentificationNumber";

	protected static final String REFERENCE_NUMBER_MDM_ATTRIBUTE_NAME = "ReferenceNumber";

	protected static final String ZIP_POSTAL_CODE_MDM_ATTRIBUTE_NAME = "ZipPostalCode";
	
	protected static final String SYNC_PURPOSE_TYPE = "/IBM/DWLCommonServices/DerivedDataSynchronization/PurposeType";

	protected static final String ORG_REC_TYPE="ORG";
	
	protected static final String PERSON_REC_TYPE="PERSON";
	
	IDWLErrorMessage errHandler;
	/**
	 * Returns the vector of active critical data elements for a business object
	 * 
	 * @param bObj
	 * @return
	 * @throws Exception
	 */
	protected Vector<CriticalData> getCriticalDataElementsForGroup(
			DWLCommon bObj) throws Exception {
		IGroupElementService groupElementService = GroupElementServiceHelper
				.getGroupElementService();
		Group group = groupElementService.getGroup(bObj.getClass().getName());
		String purposeType = Configuration
				.getConfiguration()
				.getConfigItem(SYNC_PURPOSE_TYPE,
						bObj.getControl().retrieveConfigContext()).getValue();
		Vector<CriticalData> vecCriticalData = groupElementService
				.getCriticalDataElementsForGroupBySyncTpCd(bObj.getControl(),
						group, purposeType);
		return vecCriticalData;

	}

	/**
	 * Checks if an element of a group is part of the active critical data
	 * elements of that group. This is basically checked to convert these
	 * elements to corresponding EME attributes.
	 * 
	 * @param vecCriticalData
	 * @param elementname
	 * @return
	 */
	protected boolean isCriticalDataElement(
			Vector<CriticalData> vecCriticalData, String elementname) {
		if (vecCriticalData != null) {
			for (CriticalData cdData : vecCriticalData) {
				if (cdData.getElementName().equalsIgnoreCase(elementname)) {
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * Checks if an object is active.
	 * 
	 * @param partyBObj
	 * @return
	 * @throws Exception
	 */
	protected boolean checkIfActiveObject(Timestamp endDate,DWLControl control)
	throws Exception {
		
		Timestamp currentsysTimeInUserTimeZone = DWLFunctionUtils
		.getTimestampFromTimestampString(DWLDateTimeUtilities
				.getCurrentSystemTimeInUserTimeZone(control));
		if (endDate != null
				&& !endDate.after(currentsysTimeInUserTimeZone)) {
			return false;
		}
		
		return true;
	}

}
