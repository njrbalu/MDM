package com.test.collapse.helper;

import java.util.Iterator;
import java.util.Vector;

import com.dwl.tcrm.coreParty.component.TCRMPartyBObj;
import com.test.additions.component.CreditInfoBObj;
import com.test.component.XPersonBObjExt;
import com.test.utils.UtilityClass;

public class PersonCollapseHelper {
	
	public TCRMPartyBObj collapsePersonDetails(XPersonBObjExt collapsedPartyBObj,Vector vecParties){
		collapsedPartyBObj.setCreditInfoBObj(collapseCreditInfo(vecParties));
		collapsedPartyBObj.setPersonPartyId(null);
		collapsedPartyBObj.setPartyId(null);
		return collapsedPartyBObj;
	}
	
	private CreditInfoBObj collapseCreditInfo(Vector vecParties) {
		CreditInfoBObj latestcreditInfoBObj = null;
		for(Iterator partyIterator = vecParties.iterator();partyIterator.hasNext();){
			XPersonBObjExt curObj = (XPersonBObjExt) partyIterator.next();
			if(curObj.getCreditInfoBObj() != null){
				CreditInfoBObj curcreditInfoBObj = curObj.getCreditInfoBObj();
						if(latestcreditInfoBObj == null){
							latestcreditInfoBObj = curcreditInfoBObj;
						}else{
							int retcode = UtilityClass.compareLUD(curcreditInfoBObj.getCreditInfoLastUpdateDate(),latestcreditInfoBObj.getCreditInfoLastUpdateDate());
							if(retcode > 0){
								latestcreditInfoBObj = curcreditInfoBObj;
							}
						}
			}
			
		}
		try {
			latestcreditInfoBObj.setPartyId(null);
			latestcreditInfoBObj.setCreditInfopkId(null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return latestcreditInfoBObj;
	}

}
